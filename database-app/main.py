from sqlalchemy import create_engine
from sqlalchemy.orm import sessionmaker
from models import create_tables, MarketState, Action, Reward, Experience, Portfolio
import os
# Database connection string
CONNECTION = os.environ.get("DATABASE_URL")
engine = create_engine(CONNECTION)

# Create tables in the database
create_tables(engine)

# Create a session to interact with the database
Session = sessionmaker(bind=engine)
session = Session()

# Example function to add a market state
def add_market_state(price, volume, sma_50, sma_200, rsi):
    market_state = MarketState(price=price, volume=volume, sma_50=sma_50, sma_200=sma_200, rsi=rsi)
    session.add(market_state)
    session.commit()
    print(f"Added market state: {market_state}")

# Example function to add an action
def add_action(action_type, position_change):
    action = Action(action_type=action_type, position_change=position_change)
    session.add(action)
    session.commit()
    print(f"Added action: {action}")

# Example function to add a reward
def add_reward(action_id, reward_value):
    reward = Reward(action_id=action_id, reward_value=reward_value)
    session.add(reward)
    session.commit()
    print(f"Added reward: {reward}")

# Example function to add an experience
def add_experience(state_id, action_id, reward_value, next_state_id, done):
    experience = Experience(state_id=state_id, action_id=action_id, reward_value=reward_value, next_state_id=next_state_id, done=done)
    session.add(experience)
    session.commit()
    print(f"Added experience: {experience}")

# Example function to add a portfolio
def add_portfolio(balance, positions, value):
    portfolio = Portfolio(balance=balance, positions=positions, value=value)
    session.add(portfolio)
    session.commit()
    print(f"Added portfolio: {portfolio}")

# Example usage
if __name__ == "__main__":
    # Add a new market state
    add_market_state(95000, 1000, 45000, 46000, 50)
    
    # Add a new action
    add_action("Buy", 1)

    # Add a reward
    add_reward(1, 100)

    # Add an experience
    add_experience(1, 1, 100, 2, False)

    # Add portfolio data
    add_portfolio(10000, 2, 20000)

from sqlalchemy import create_engine, Column, Integer, Float, String, DateTime, Boolean, ForeignKey
from sqlalchemy.ext.declarative import declarative_base
from sqlalchemy.orm import relationship
from sqlalchemy.sql import func

Base = declarative_base()

class MarketState(Base):
    __tablename__ = 'market_states'
    id = Column(Integer, primary_key=True)
    timestamp = Column(DateTime, default=func.now(), index=True)
    price = Column(Float)
    volume = Column(Integer)
    sma_50 = Column(Float)  # Simple Moving Average 50
    sma_200 = Column(Float)  # Simple Moving Average 200
    rsi = Column(Float)  # Relative Strength Index
    # Additional indicators can be added here

    def __repr__(self):
        return f"<MarketState(id={self.id}, timestamp={self.timestamp}, price={self.price}, volume={self.volume})>"

class Action(Base):
    __tablename__ = 'actions'
    id = Column(Integer, primary_key=True)
    action_type = Column(String)  # Buy, Sell, Hold
    position_change = Column(Integer)  # How much of the asset is bought or sold
    timestamp = Column(DateTime, default=func.now())

    def __repr__(self):
        return f"<Action(id={self.id}, action_type={self.action_type}, position_change={self.position_change})>"

class Reward(Base):
    __tablename__ = 'rewards'
    id = Column(Integer, primary_key=True)
    action_id = Column(Integer, ForeignKey('actions.id'))
    reward_value = Column(Float)  # e.g., profit/loss from the action
    timestamp = Column(DateTime, default=func.now())
    action = relationship("Action", back_populates="rewards")

    def __repr__(self):
        return f"<Reward(id={self.id}, action_id={self.action_id}, reward_value={self.reward_value})>"

class Experience(Base):
    __tablename__ = 'experiences'
    id = Column(Integer, primary_key=True)
    state_id = Column(Integer, ForeignKey('market_states.id'))
    action_id = Column(Integer, ForeignKey('actions.id'))
    reward_value = Column(Float)
    next_state_id = Column(Integer, ForeignKey('market_states.id'))
    done = Column(Boolean)
    timestamp = Column(DateTime, default=func.now())

    state = relationship("MarketState", foreign_keys=[state_id])
    next_state = relationship("MarketState", foreign_keys=[next_state_id])
    action = relationship("Action")

    def __repr__(self):
        return f"<Experience(id={self.id}, state_id={self.state_id}, action_id={self.action_id}, reward_value={self.reward_value})>"

class Portfolio(Base):
    __tablename__ = 'portfolios'
    id = Column(Integer, primary_key=True)
    balance = Column(Float)  # Cash balance
    positions = Column(Float)  # Number of assets owned
    value = Column(Float)  # Value of the assets
    timestamp = Column(DateTime, default=func.now())

    def __repr__(self):
        return f"<Portfolio(id={self.id}, balance={self.balance}, positions={self.positions}, value={self.value})>"

# Create the database tables
def create_tables(engine):
    Base.metadata.create_all(engine)

// Sample configuration for BitMEX-Delta-Server.
// Copy me to config.js to use custom settings.

module.exports = {
  port: 4444,

  // If false, will connect to live exchange.
  // Testnet is https://testnet.bitmex.com
  testnet: true,

  // Symbols to watch. Add any/all symbols you are going to poll here.
  symbols: ["XBTUSD"],

  // Available streams:
  // Public:
  // ["instrument","orderBookL2","quote","trade"]
  // Private:

  streams: [
    "instrument",
    "orderBookL2",
    "quote",
    "trade",
    "execution",
    "margin",
    "order",
    "position",
  ],

  // If you want to use any of the above "private" streams, you must authenticate with an API Key.
  apiKeyID: "Xrl20o9DSh51vVRK0DF9aeYF",
  apiKeySecret: "scKT9HfMsjlq22s_VUg9_w4c4EUCkTjMQkVaENwZgBm7tlAX",

  // This prevents memory usage from getting out of control. Tweak to your needs.
  maxTableLen: 10000,
};

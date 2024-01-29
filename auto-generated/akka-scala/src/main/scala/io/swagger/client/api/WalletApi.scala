/**
 * BitMEX API
 * ## REST API for the BitMEX Trading Platform  _If you are building automated tools, please subscribe to the_ _[BitMEX API RSS Feed](https://blog.bitmex.com/api_announcement/feed/) for changes. The feed will be updated_ _regularly and is the most reliable way to get downtime and update announcements._  [View Changelog](/app/apiChangelog)  -  #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  _All_ table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  _This is only a small subset of what is available, to get you started._  Fill in the parameters and click the `Try it out!` button to try any of these queries.  - [Pricing Data](#!/Quote/Quote_get)  - [Trade Data](#!/Trade/Trade_get)  - [OrderBook Data](#!/OrderBook/OrderBook_getL2)  - [Settlement Data](#!/Settlement/Settlement_get)  - [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger JSON](swagger.json)  -  ## All API Endpoints  Click to expand a section. 
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.api

import io.swagger.client.model.AssetsConfig
import io.swagger.client.model.Error
import io.swagger.client.model.NetworksConfig
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object WalletApi {

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : Seq[AssetsConfig] (Request was successful)
   *   code 400 : Error (Parameter Error)
   *   code 401 : Error (Unauthorized)
   *   code 403 : Error (Access Denied)
   *   code 404 : Error (Not Found)
   */
  def wallet.getAssetsConfig(): ApiRequest[Seq[AssetsConfig]] =
    ApiRequest[Seq[AssetsConfig]](ApiMethods.GET, "https://www.bitmex.com/api/v1", "/wallet/assets", "application/json")
      .withSuccessResponse[Seq[AssetsConfig]](200)
      .withErrorResponse[Error](400)
      .withErrorResponse[Error](401)
      .withErrorResponse[Error](403)
      .withErrorResponse[Error](404)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : Seq[NetworksConfig] (Request was successful)
   *   code 400 : Error (Parameter Error)
   *   code 401 : Error (Unauthorized)
   *   code 403 : Error (Access Denied)
   *   code 404 : Error (Not Found)
   */
  def wallet.getNetworksConfig(): ApiRequest[Seq[NetworksConfig]] =
    ApiRequest[Seq[NetworksConfig]](ApiMethods.GET, "https://www.bitmex.com/api/v1", "/wallet/networks", "application/json")
      .withSuccessResponse[Seq[NetworksConfig]](200)
      .withErrorResponse[Error](400)
      .withErrorResponse[Error](401)
      .withErrorResponse[Error](403)
      .withErrorResponse[Error](404)
      

}

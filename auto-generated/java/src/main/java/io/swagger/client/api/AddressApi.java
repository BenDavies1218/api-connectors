/*
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


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.Address;
import io.swagger.client.model.Error;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressApi {
    private ApiClient apiClient;

    public AddressApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AddressApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addressGet
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addressGetCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/address";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiExpires", "apiKey", "apiSignature" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addressGetValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = addressGetCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get your addresses.
     * 
     * @return List&lt;Address&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Address> addressGet() throws ApiException {
        ApiResponse<List<Address>> resp = addressGetWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get your addresses.
     * 
     * @return ApiResponse&lt;List&lt;Address&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Address>> addressGetWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = addressGetValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<Address>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get your addresses. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addressGetAsync(final ApiCallback<List<Address>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addressGetValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Address>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for addressNew
     * @param currency Currency of the address. Options: &#x60;XBt&#x60;, &#x60;USDt&#x60; (required)
     * @param network Selected network. (required)
     * @param address Destination Address. (required)
     * @param name Name of the entry, eg. &#39;Hardware wallet&#39;. (required)
     * @param note Optional annotation. (optional)
     * @param skipConfirm Skip e-mail confirmations for transfers to this address. Will require an email confirmation after creation. (optional, default to false)
     * @param skip2FA Skip 2FA confirmations for transfers to this address. Will require an email confirmation after creation. (optional, default to false)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addressNewCall(String currency, String network, String address, String name, String note, Boolean skipConfirm, Boolean skip2FA, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/address";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (currency != null)
        localVarFormParams.put("currency", currency);
        if (network != null)
        localVarFormParams.put("network", network);
        if (address != null)
        localVarFormParams.put("address", address);
        if (name != null)
        localVarFormParams.put("name", name);
        if (note != null)
        localVarFormParams.put("note", note);
        if (skipConfirm != null)
        localVarFormParams.put("skipConfirm", skipConfirm);
        if (skip2FA != null)
        localVarFormParams.put("skip2FA", skip2FA);

        final String[] localVarAccepts = {
            "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiExpires", "apiKey", "apiSignature" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addressNewValidateBeforeCall(String currency, String network, String address, String name, String note, Boolean skipConfirm, Boolean skip2FA, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'currency' is set
        if (currency == null) {
            throw new ApiException("Missing the required parameter 'currency' when calling addressNew(Async)");
        }
        
        // verify the required parameter 'network' is set
        if (network == null) {
            throw new ApiException("Missing the required parameter 'network' when calling addressNew(Async)");
        }
        
        // verify the required parameter 'address' is set
        if (address == null) {
            throw new ApiException("Missing the required parameter 'address' when calling addressNew(Async)");
        }
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling addressNew(Async)");
        }
        

        com.squareup.okhttp.Call call = addressNewCall(currency, network, address, name, note, skipConfirm, skip2FA, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates a new saved address.
     * 
     * @param currency Currency of the address. Options: &#x60;XBt&#x60;, &#x60;USDt&#x60; (required)
     * @param network Selected network. (required)
     * @param address Destination Address. (required)
     * @param name Name of the entry, eg. &#39;Hardware wallet&#39;. (required)
     * @param note Optional annotation. (optional)
     * @param skipConfirm Skip e-mail confirmations for transfers to this address. Will require an email confirmation after creation. (optional, default to false)
     * @param skip2FA Skip 2FA confirmations for transfers to this address. Will require an email confirmation after creation. (optional, default to false)
     * @return Address
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Address addressNew(String currency, String network, String address, String name, String note, Boolean skipConfirm, Boolean skip2FA) throws ApiException {
        ApiResponse<Address> resp = addressNewWithHttpInfo(currency, network, address, name, note, skipConfirm, skip2FA);
        return resp.getData();
    }

    /**
     * Creates a new saved address.
     * 
     * @param currency Currency of the address. Options: &#x60;XBt&#x60;, &#x60;USDt&#x60; (required)
     * @param network Selected network. (required)
     * @param address Destination Address. (required)
     * @param name Name of the entry, eg. &#39;Hardware wallet&#39;. (required)
     * @param note Optional annotation. (optional)
     * @param skipConfirm Skip e-mail confirmations for transfers to this address. Will require an email confirmation after creation. (optional, default to false)
     * @param skip2FA Skip 2FA confirmations for transfers to this address. Will require an email confirmation after creation. (optional, default to false)
     * @return ApiResponse&lt;Address&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Address> addressNewWithHttpInfo(String currency, String network, String address, String name, String note, Boolean skipConfirm, Boolean skip2FA) throws ApiException {
        com.squareup.okhttp.Call call = addressNewValidateBeforeCall(currency, network, address, name, note, skipConfirm, skip2FA, null, null);
        Type localVarReturnType = new TypeToken<Address>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates a new saved address. (asynchronously)
     * 
     * @param currency Currency of the address. Options: &#x60;XBt&#x60;, &#x60;USDt&#x60; (required)
     * @param network Selected network. (required)
     * @param address Destination Address. (required)
     * @param name Name of the entry, eg. &#39;Hardware wallet&#39;. (required)
     * @param note Optional annotation. (optional)
     * @param skipConfirm Skip e-mail confirmations for transfers to this address. Will require an email confirmation after creation. (optional, default to false)
     * @param skip2FA Skip 2FA confirmations for transfers to this address. Will require an email confirmation after creation. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addressNewAsync(String currency, String network, String address, String name, String note, Boolean skipConfirm, Boolean skip2FA, final ApiCallback<Address> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addressNewValidateBeforeCall(currency, network, address, name, note, skipConfirm, skip2FA, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Address>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
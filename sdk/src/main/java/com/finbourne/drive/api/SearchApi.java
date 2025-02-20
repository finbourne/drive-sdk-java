/*
 * FINBOURNE Drive API
 *
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.finbourne.drive.api;

import com.finbourne.drive.ApiCallback;
import com.finbourne.drive.ApiClient;
import com.finbourne.drive.ApiException;
import com.finbourne.drive.ApiResponse;
import com.finbourne.drive.Configuration;
import com.finbourne.drive.Pair;
import com.finbourne.drive.ProgressRequestBody;
import com.finbourne.drive.ProgressResponseBody;
import com.finbourne.drive.extensions.ConfigurationOptions;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.finbourne.drive.model.LusidProblemDetails;
import com.finbourne.drive.model.LusidValidationProblemDetails;
import com.finbourne.drive.model.PagedResourceListOfStorageObject;
import com.finbourne.drive.model.SearchBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SearchApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SearchApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call searchCall(SearchBody searchBody, String page, List<String> sortBy, Integer limit, String filter, final ApiCallback _callback) throws ApiException {
        return searchCall(searchBody, page, sortBy, limit, filter,  _callback, new ConfigurationOptions());
    }

    private okhttp3.Call searchCall(SearchBody searchBody, String page, List<String> sortBy, Integer limit, String filter, final ApiCallback _callback, ConfigurationOptions opts) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = searchBody;

        // create path and map variables
        String localVarPath = "/api/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (sortBy != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "sortBy", sortBy));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback, opts);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call searchValidateBeforeCall(SearchBody searchBody, String page, List<String> sortBy, Integer limit, String filter, final ApiCallback _callback, ConfigurationOptions opts) throws ApiException {
        // verify the required parameter 'searchBody' is set
        if (searchBody == null) {
            throw new ApiException("Missing the required parameter 'searchBody' when calling search(Async)");
        }

        return searchCall(searchBody, page, sortBy, limit, filter, _callback, opts);

    }


    private ApiResponse<PagedResourceListOfStorageObject> searchWithHttpInfo(SearchBody searchBody, String page, List<String> sortBy, Integer limit, String filter) throws ApiException {
        okhttp3.Call localVarCall = searchValidateBeforeCall(searchBody, page, sortBy, limit, filter, null, new ConfigurationOptions());
        Type localVarReturnType = new TypeToken<PagedResourceListOfStorageObject>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private ApiResponse<PagedResourceListOfStorageObject> searchWithHttpInfo(SearchBody searchBody, String page, List<String> sortBy, Integer limit, String filter, ConfigurationOptions opts) throws ApiException {
        okhttp3.Call localVarCall = searchValidateBeforeCall(searchBody, page, sortBy, limit, filter, null, opts);
        Type localVarReturnType = new TypeToken<PagedResourceListOfStorageObject>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call searchAsync(SearchBody searchBody, String page, List<String> sortBy, Integer limit, String filter, final ApiCallback<PagedResourceListOfStorageObject> _callback) throws ApiException {

        okhttp3.Call localVarCall = searchValidateBeforeCall(searchBody, page, sortBy, limit, filter, _callback, new ConfigurationOptions());
        Type localVarReturnType = new TypeToken<PagedResourceListOfStorageObject>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    private okhttp3.Call searchAsync(SearchBody searchBody, String page, List<String> sortBy, Integer limit, String filter, final ApiCallback<PagedResourceListOfStorageObject> _callback, ConfigurationOptions opts) throws ApiException {

        okhttp3.Call localVarCall = searchValidateBeforeCall(searchBody, page, sortBy, limit, filter, _callback, opts);
        Type localVarReturnType = new TypeToken<PagedResourceListOfStorageObject>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIsearchRequest {
        private final SearchBody searchBody;
        private String page;
        private List<String> sortBy;
        private Integer limit;
        private String filter;

        private APIsearchRequest(SearchBody searchBody) {
            this.searchBody = searchBody;
        }

        /**
         * Set page
         * @param page  (optional)
         * @return APIsearchRequest
         */
        public APIsearchRequest page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Set sortBy
         * @param sortBy  (optional)
         * @return APIsearchRequest
         */
        public APIsearchRequest sortBy(List<String> sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Set limit
         * @param limit  (optional)
         * @return APIsearchRequest
         */
        public APIsearchRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set filter
         * @param filter  (optional, default to )
         * @return APIsearchRequest
         */
        public APIsearchRequest filter(String filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Build call for search
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return searchCall(searchBody, page, sortBy, limit, filter, _callback);
        }

        /**
         * Execute search request
         * @return PagedResourceListOfStorageObject
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public PagedResourceListOfStorageObject execute() throws ApiException {
            ApiResponse<PagedResourceListOfStorageObject> localVarResp = searchWithHttpInfo(searchBody, page, sortBy, limit, filter);
            return localVarResp.getData();
        }

        /**
         * Execute search request. Use any specified configuration options to override any other configuration for this request only.
         * @return PagedResourceListOfStorageObject
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public PagedResourceListOfStorageObject execute(ConfigurationOptions opts) throws ApiException {
            ApiResponse<PagedResourceListOfStorageObject> localVarResp = searchWithHttpInfo(searchBody, page, sortBy, limit, filter, opts);
            return localVarResp.getData();
        }

        /**
         * Execute search request with HTTP info returned
         * @return ApiResponse&lt;PagedResourceListOfStorageObject&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PagedResourceListOfStorageObject> executeWithHttpInfo() throws ApiException {
            return searchWithHttpInfo(searchBody, page, sortBy, limit, filter);
        }

        /**
         * Execute search request with HTTP info returned. Use any specified configuration options to override any other configuration for this request only.
         * @return ApiResponse&lt;PagedResourceListOfStorageObject&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<PagedResourceListOfStorageObject> executeWithHttpInfo(ConfigurationOptions opts) throws ApiException {
            return searchWithHttpInfo(searchBody, page, sortBy, limit, filter, opts);
        }

        /**
         * Execute search request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PagedResourceListOfStorageObject> _callback) throws ApiException {
            return searchAsync(searchBody, page, sortBy, limit, filter, _callback);
        }

        /**
         * Execute search request (asynchronously). Use any specified configuration options to override any other configuration for this request only.
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
            <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<PagedResourceListOfStorageObject> _callback, ConfigurationOptions opts) throws ApiException {
            return searchAsync(searchBody, page, sortBy, limit, filter, _callback, opts);
        }
    }

    /**
     * [EARLY ACCESS] Search: Search for a file or folder with a given name and path
     * 
     * @param searchBody Search parameters (required)
     * @return APIsearchRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public APIsearchRequest search(SearchBody searchBody) {
        return new APIsearchRequest(searchBody);
    }
}

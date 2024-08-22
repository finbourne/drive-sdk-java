# SearchApi

All URIs are relative to *https://fbn-prd.lusid.com/drive*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**search**](SearchApi.md#search) | **POST** /api/search | [EARLY ACCESS] Search: Search for a file or folder with a given name and path |



## search

> PagedResourceListOfStorageObject search(searchBody, page, sortBy, limit, filter)

[EARLY ACCESS] Search: Search for a file or folder with a given name and path

### Example

```java
import com.finbourne.drive.model.*;
import com.finbourne.drive.api.SearchApi;
import com.finbourne.drive.extensions.ApiConfigurationException;
import com.finbourne.drive.extensions.ApiFactoryBuilder;
import com.finbourne.drive.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class SearchApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"driveUrl\": \"https://<your-domain>.lusid.com/drive\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        // uncomment the below to use configuration overrides
        // ConfigurationOptions opts = new ConfigurationOptions();
        // opts.setTotalTimeoutMs(2000);
        
        // uncomment the below to use an api factory with overrides
        // ApiFactory apiFactory = ApiFactoryBuilder.build(fileName, opts);
        // SearchApi apiInstance = apiFactory.build(SearchApi.class);

        SearchApi apiInstance = ApiFactoryBuilder.build(fileName).build(SearchApi.class);
        SearchBody searchBody = new SearchBody(); // SearchBody | Search parameters
        String page = "page_example"; // String | 
        List<String> sortBy = Arrays.asList(); // List<String> | 
        Integer limit = 56; // Integer | 
        String filter = ""; // String | 
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfStorageObject result = apiInstance.search(searchBody, page, sortBy, limit, filter).execute(opts);

            PagedResourceListOfStorageObject result = apiInstance.search(searchBody, page, sortBy, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#search");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **searchBody** | [**SearchBody**](SearchBody.md)| Search parameters | |
| **page** | **String**|  | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **limit** | **Integer**|  | [optional] |
| **filter** | **String**|  | [optional] [default to ] |

### Return type

[**PagedResourceListOfStorageObject**](PagedResourceListOfStorageObject.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


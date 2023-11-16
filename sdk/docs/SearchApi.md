# SearchApi

All URIs are relative to *https://fbn-prd.lusid.com/drive*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**search**](SearchApi.md#search) | **POST** /api/search | [EARLY ACCESS] Search: Search for a file or folder with a given name and path |


<a id="search"></a>
# **search**
> PagedResourceListOfStorageObject search(searchBody).page(page).sortBy(sortBy).limit(limit).filter(filter).execute();

[EARLY ACCESS] Search: Search for a file or folder with a given name and path

### Example
```java
// Import classes:
import com.finbourne.drive.ApiClient;
import com.finbourne.drive.ApiException;
import com.finbourne.drive.Configuration;
import com.finbourne.drive.auth.*;
import com.finbourne.drive.models.*;
import com.finbourne.drive.api.SearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://fbn-prd.lusid.com/drive");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SearchApi apiInstance = new SearchApi(defaultClient);
    SearchBody searchBody = new SearchBody(); // SearchBody | Search parameters
    String page = "page_example"; // String | 
    List<String> sortBy = Arrays.asList(); // List<String> | 
    Integer limit = 56; // Integer | 
    String filter = ""; // String | 
    try {
      PagedResourceListOfStorageObject result = apiInstance.search(searchBody)
            .page(page)
            .sortBy(sortBy)
            .limit(limit)
            .filter(filter)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#search");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
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

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |


# FoldersApi

All URIs are relative to *https://fbn-prd.lusid.com/drive*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFolder**](FoldersApi.md#createFolder) | **POST** /api/folders | [EARLY ACCESS] CreateFolder: Create a new folder in LUSID Drive |
| [**deleteFolder**](FoldersApi.md#deleteFolder) | **DELETE** /api/folders/{id} | [EARLY ACCESS] DeleteFolder: Delete a specified folder and all subfolders |
| [**getFolder**](FoldersApi.md#getFolder) | **GET** /api/folders/{id} | [EARLY ACCESS] GetFolder: Get metadata of folder |
| [**getFolderContents**](FoldersApi.md#getFolderContents) | **GET** /api/folders/{id}/contents | [EARLY ACCESS] GetFolderContents: List contents of a folder |
| [**getRootFolder**](FoldersApi.md#getRootFolder) | **GET** /api/folders | [EARLY ACCESS] GetRootFolder: List contents of root folder |
| [**moveFolder**](FoldersApi.md#moveFolder) | **POST** /api/folders/{id} | [EARLY ACCESS] MoveFolder: Move files to specified folder |
| [**updateFolder**](FoldersApi.md#updateFolder) | **PUT** /api/folders/{id} | [EARLY ACCESS] UpdateFolder: Update an existing folder&#39;s name, path |



## createFolder

> StorageObject createFolder(createFolder)

[EARLY ACCESS] CreateFolder: Create a new folder in LUSID Drive

### Example

```java
import com.finbourne.drive.model.*;
import com.finbourne.drive.api.FoldersApi;
import com.finbourne.drive.extensions.ApiConfigurationException;
import com.finbourne.drive.extensions.ApiFactoryBuilder;
import com.finbourne.drive.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FoldersApiExample {

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
        // FoldersApi apiInstance = apiFactory.build(FoldersApi.class);

        FoldersApi apiInstance = ApiFactoryBuilder.build(fileName).build(FoldersApi.class);
        CreateFolder createFolder = new CreateFolder(); // CreateFolder | A CreateFolder object that defines the name and path of the new folder
        try {
            // uncomment the below to set overrides at the request level
            // StorageObject result = apiInstance.createFolder(createFolder).execute(opts);

            StorageObject result = apiInstance.createFolder(createFolder).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#createFolder");
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
| **createFolder** | [**CreateFolder**](CreateFolder.md)| A CreateFolder object that defines the name and path of the new folder | |

### Return type

[**StorageObject**](StorageObject.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteFolder

> deleteFolder(id)

[EARLY ACCESS] DeleteFolder: Delete a specified folder and all subfolders

### Example

```java
import com.finbourne.drive.model.*;
import com.finbourne.drive.api.FoldersApi;
import com.finbourne.drive.extensions.ApiConfigurationException;
import com.finbourne.drive.extensions.ApiFactoryBuilder;
import com.finbourne.drive.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FoldersApiExample {

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
        // FoldersApi apiInstance = apiFactory.build(FoldersApi.class);

        FoldersApi apiInstance = ApiFactoryBuilder.build(fileName).build(FoldersApi.class);
        String id = "id_example"; // String | Unique ID of the folder
        try {
            // uncomment the below to set overrides at the request level
            // apiInstance.deleteFolder(id).execute(opts);

            apiInstance.deleteFolder(id).execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#deleteFolder");
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
| **id** | **String**| Unique ID of the folder | |

### Return type

null (empty response body)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | No folder with this Id exists |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getFolder

> StorageObject getFolder(id)

[EARLY ACCESS] GetFolder: Get metadata of folder

### Example

```java
import com.finbourne.drive.model.*;
import com.finbourne.drive.api.FoldersApi;
import com.finbourne.drive.extensions.ApiConfigurationException;
import com.finbourne.drive.extensions.ApiFactoryBuilder;
import com.finbourne.drive.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FoldersApiExample {

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
        // FoldersApi apiInstance = apiFactory.build(FoldersApi.class);

        FoldersApi apiInstance = ApiFactoryBuilder.build(fileName).build(FoldersApi.class);
        String id = "id_example"; // String | Unique ID of the folder
        try {
            // uncomment the below to set overrides at the request level
            // StorageObject result = apiInstance.getFolder(id).execute(opts);

            StorageObject result = apiInstance.getFolder(id).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#getFolder");
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
| **id** | **String**| Unique ID of the folder | |

### Return type

[**StorageObject**](StorageObject.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | No folder with this Id exists |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getFolderContents

> PagedResourceListOfStorageObject getFolderContents(id, page, sortBy, start, limit, filter)

[EARLY ACCESS] GetFolderContents: List contents of a folder

### Example

```java
import com.finbourne.drive.model.*;
import com.finbourne.drive.api.FoldersApi;
import com.finbourne.drive.extensions.ApiConfigurationException;
import com.finbourne.drive.extensions.ApiFactoryBuilder;
import com.finbourne.drive.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FoldersApiExample {

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
        // FoldersApi apiInstance = apiFactory.build(FoldersApi.class);

        FoldersApi apiInstance = ApiFactoryBuilder.build(fileName).build(FoldersApi.class);
        String id = "id_example"; // String | Unique ID of the folder
        String page = "page_example"; // String | The pagination token to use to continue listing contents from a previous call to list contents.   This value is returned from the previous call. If a pagination token is provided the sortBy and filter fields   must not have changed since the original request. Also, if set, a start value cannot be provided.
        List<String> sortBy = Arrays.asList(); // List<String> | Order the results by these fields. Use use the '-' sign to denote descending order.
        Integer start = 56; // Integer | When paginating, skip this number of results.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
        String filter = ""; // String | Expression to filter the result set.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfStorageObject result = apiInstance.getFolderContents(id, page, sortBy, start, limit, filter).execute(opts);

            PagedResourceListOfStorageObject result = apiInstance.getFolderContents(id, page, sortBy, start, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#getFolderContents");
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
| **id** | **String**| Unique ID of the folder | |
| **page** | **String**| The pagination token to use to continue listing contents from a previous call to list contents.   This value is returned from the previous call. If a pagination token is provided the sortBy and filter fields   must not have changed since the original request. Also, if set, a start value cannot be provided. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order. | [optional] |
| **start** | **Integer**| When paginating, skip this number of results. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Expression to filter the result set. | [optional] [default to ] |

### Return type

[**PagedResourceListOfStorageObject**](PagedResourceListOfStorageObject.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | No folder with this Id exists |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getRootFolder

> PagedResourceListOfStorageObject getRootFolder(page, sortBy, start, limit, filter)

[EARLY ACCESS] GetRootFolder: List contents of root folder

### Example

```java
import com.finbourne.drive.model.*;
import com.finbourne.drive.api.FoldersApi;
import com.finbourne.drive.extensions.ApiConfigurationException;
import com.finbourne.drive.extensions.ApiFactoryBuilder;
import com.finbourne.drive.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FoldersApiExample {

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
        // FoldersApi apiInstance = apiFactory.build(FoldersApi.class);

        FoldersApi apiInstance = ApiFactoryBuilder.build(fileName).build(FoldersApi.class);
        String page = "page_example"; // String | The pagination token to use to continue listing contents from a previous call to list contents.   This value is returned from the previous call. If a pagination token is provided the sortBy and filter fields   must not have changed since the original request. Also, if set, a start value cannot be provided.
        List<String> sortBy = Arrays.asList(); // List<String> | Order the results by these fields. Use use the '-' sign to denote descending order.
        Integer start = 56; // Integer | When paginating, skip this number of results.
        Integer limit = 56; // Integer | When paginating, limit the number of returned results to this many.
        String filter = "true"; // String | Expression to filter the result set.
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfStorageObject result = apiInstance.getRootFolder(page, sortBy, start, limit, filter).execute(opts);

            PagedResourceListOfStorageObject result = apiInstance.getRootFolder(page, sortBy, start, limit, filter).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#getRootFolder");
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
| **page** | **String**| The pagination token to use to continue listing contents from a previous call to list contents.   This value is returned from the previous call. If a pagination token is provided the sortBy and filter fields   must not have changed since the original request. Also, if set, a start value cannot be provided. | [optional] |
| **sortBy** | [**List&lt;String&gt;**](String.md)| Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order. | [optional] |
| **start** | **Integer**| When paginating, skip this number of results. | [optional] |
| **limit** | **Integer**| When paginating, limit the number of returned results to this many. | [optional] |
| **filter** | **String**| Expression to filter the result set. | [optional] [default to true] |

### Return type

[**PagedResourceListOfStorageObject**](PagedResourceListOfStorageObject.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## moveFolder

> PagedResourceListOfStorageObject moveFolder(id, requestBody, overwrite, deleteSource)

[EARLY ACCESS] MoveFolder: Move files to specified folder

### Example

```java
import com.finbourne.drive.model.*;
import com.finbourne.drive.api.FoldersApi;
import com.finbourne.drive.extensions.ApiConfigurationException;
import com.finbourne.drive.extensions.ApiFactoryBuilder;
import com.finbourne.drive.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FoldersApiExample {

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
        // FoldersApi apiInstance = apiFactory.build(FoldersApi.class);

        FoldersApi apiInstance = ApiFactoryBuilder.build(fileName).build(FoldersApi.class);
        String id = "id_example"; // String | Unique ID of the folder where the files should be moved
        List<String> requestBody = ["FolderID1","FolderID2","FolderID3"]; // List<String> | Enumerable of unique IDs of files that should be moved
        Boolean overwrite = false; // Boolean | True if the destination has file with same name if should be overwritten
        Boolean deleteSource = false; // Boolean | If true after moving the original file is deleted
        try {
            // uncomment the below to set overrides at the request level
            // PagedResourceListOfStorageObject result = apiInstance.moveFolder(id, requestBody, overwrite, deleteSource).execute(opts);

            PagedResourceListOfStorageObject result = apiInstance.moveFolder(id, requestBody, overwrite, deleteSource).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#moveFolder");
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
| **id** | **String**| Unique ID of the folder where the files should be moved | |
| **requestBody** | [**List&lt;String&gt;**](String.md)| Enumerable of unique IDs of files that should be moved | |
| **overwrite** | **Boolean**| True if the destination has file with same name if should be overwritten | [optional] [default to false] |
| **deleteSource** | **Boolean**| If true after moving the original file is deleted | [optional] [default to false] |

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
| **404** | No folder or file with the supplied Id exists |  -  |
| **409** | There is already a file with the same name at this location |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateFolder

> StorageObject updateFolder(id, updateFolder)

[EARLY ACCESS] UpdateFolder: Update an existing folder&#39;s name, path

### Example

```java
import com.finbourne.drive.model.*;
import com.finbourne.drive.api.FoldersApi;
import com.finbourne.drive.extensions.ApiConfigurationException;
import com.finbourne.drive.extensions.ApiFactoryBuilder;
import com.finbourne.drive.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FoldersApiExample {

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
        // FoldersApi apiInstance = apiFactory.build(FoldersApi.class);

        FoldersApi apiInstance = ApiFactoryBuilder.build(fileName).build(FoldersApi.class);
        String id = "id_example"; // String | Unique ID of the folder
        UpdateFolder updateFolder = new UpdateFolder(); // UpdateFolder | An UpdateFolder object that defines the new name or path of the folder
        try {
            // uncomment the below to set overrides at the request level
            // StorageObject result = apiInstance.updateFolder(id, updateFolder).execute(opts);

            StorageObject result = apiInstance.updateFolder(id, updateFolder).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FoldersApi#updateFolder");
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
| **id** | **String**| Unique ID of the folder | |
| **updateFolder** | [**UpdateFolder**](UpdateFolder.md)| An UpdateFolder object that defines the new name or path of the folder | |

### Return type

[**StorageObject**](StorageObject.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | No folder with this Id exists |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


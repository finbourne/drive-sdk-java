# FilesApi

All URIs are relative to *https://fbn-prd.lusid.com/drive*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFile**](FilesApi.md#createFile) | **POST** /api/files | CreateFile: Uploads a file to Lusid Drive. If using an SDK, consider using the UploadAsStreamAsync function for larger files instead. |
| [**deleteFile**](FilesApi.md#deleteFile) | **DELETE** /api/files/{id} | [EARLY ACCESS] DeleteFile: Deletes a file from Drive. |
| [**downloadFile**](FilesApi.md#downloadFile) | **GET** /api/files/{id}/contents | DownloadFile: Download the file from Drive. |
| [**getFile**](FilesApi.md#getFile) | **GET** /api/files/{id} | [EARLY ACCESS] GetFile: Get a file stored in Drive. |
| [**updateFileContents**](FilesApi.md#updateFileContents) | **PUT** /api/files/{id}/contents | [EARLY ACCESS] UpdateFileContents: Updates contents of a file in Drive. |
| [**updateFileMetadata**](FilesApi.md#updateFileMetadata) | **PUT** /api/files/{id} | [EARLY ACCESS] UpdateFileMetadata: Updates metadata for a file in Drive. |



## createFile

> StorageObject createFile(xLusidDriveFilename, xLusidDrivePath, contentLength, body)

CreateFile: Uploads a file to Lusid Drive. If using an SDK, consider using the UploadAsStreamAsync function for larger files instead.

### Example

```java
import com.finbourne.drive.model.*;
import com.finbourne.drive.api.FilesApi;
import com.finbourne.drive.extensions.ApiConfigurationException;
import com.finbourne.drive.extensions.ApiFactoryBuilder;
import com.finbourne.drive.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FilesApiExample {

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
        // FilesApi apiInstance = apiFactory.build(FilesApi.class);

        FilesApi apiInstance = ApiFactoryBuilder.build(fileName).build(FilesApi.class);
        String xLusidDriveFilename = "xLusidDriveFilename_example"; // String | File name.
        String xLusidDrivePath = "xLusidDrivePath_example"; // String | File path.
        Integer contentLength = 56; // Integer | The size in bytes of the file to be uploaded
        byte[] body = null; // byte[] | 
        try {
            // uncomment the below to set overrides at the request level
            // StorageObject result = apiInstance.createFile(xLusidDriveFilename, xLusidDrivePath, contentLength, body).execute(opts);

            StorageObject result = apiInstance.createFile(xLusidDriveFilename, xLusidDrivePath, contentLength, body).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#createFile");
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
| **xLusidDriveFilename** | **String**| File name. | |
| **xLusidDrivePath** | **String**| File path. | |
| **contentLength** | **Integer**| The size in bytes of the file to be uploaded | |
| **body** | **byte[]**|  | |

### Return type

[**StorageObject**](StorageObject.md)

### HTTP request headers

- **Content-Type**: application/octet-stream
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteFile

> deleteFile(id)

[EARLY ACCESS] DeleteFile: Deletes a file from Drive.

### Example

```java
import com.finbourne.drive.model.*;
import com.finbourne.drive.api.FilesApi;
import com.finbourne.drive.extensions.ApiConfigurationException;
import com.finbourne.drive.extensions.ApiFactoryBuilder;
import com.finbourne.drive.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FilesApiExample {

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
        // FilesApi apiInstance = apiFactory.build(FilesApi.class);

        FilesApi apiInstance = ApiFactoryBuilder.build(fileName).build(FilesApi.class);
        String id = "id_example"; // String | Identifier of the file to be deleted.
        try {
            // uncomment the below to set overrides at the request level
            // apiInstance.deleteFile(id).execute(opts);

            apiInstance.deleteFile(id).execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#deleteFile");
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
| **id** | **String**| Identifier of the file to be deleted. | |

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
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## downloadFile

> File downloadFile(id)

DownloadFile: Download the file from Drive.

### Example

```java
import com.finbourne.drive.model.*;
import com.finbourne.drive.api.FilesApi;
import com.finbourne.drive.extensions.ApiConfigurationException;
import com.finbourne.drive.extensions.ApiFactoryBuilder;
import com.finbourne.drive.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FilesApiExample {

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
        // FilesApi apiInstance = apiFactory.build(FilesApi.class);

        FilesApi apiInstance = ApiFactoryBuilder.build(fileName).build(FilesApi.class);
        String id = "id_example"; // String | Identifier of the file to be downloaded.
        try {
            // uncomment the below to set overrides at the request level
            // File result = apiInstance.downloadFile(id).execute(opts);

            File result = apiInstance.downloadFile(id).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#downloadFile");
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
| **id** | **String**| Identifier of the file to be downloaded. | |

### Return type

[**File**](File.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **410** | Malware detected, restricted from downloading file. |  -  |
| **423** | Virus scan in progress, restricted from downloading file. |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getFile

> StorageObject getFile(id)

[EARLY ACCESS] GetFile: Get a file stored in Drive.

### Example

```java
import com.finbourne.drive.model.*;
import com.finbourne.drive.api.FilesApi;
import com.finbourne.drive.extensions.ApiConfigurationException;
import com.finbourne.drive.extensions.ApiFactoryBuilder;
import com.finbourne.drive.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FilesApiExample {

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
        // FilesApi apiInstance = apiFactory.build(FilesApi.class);

        FilesApi apiInstance = ApiFactoryBuilder.build(fileName).build(FilesApi.class);
        String id = "id_example"; // String | Identifier of the file to be retrieved.
        try {
            // uncomment the below to set overrides at the request level
            // StorageObject result = apiInstance.getFile(id).execute(opts);

            StorageObject result = apiInstance.getFile(id).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#getFile");
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
| **id** | **String**| Identifier of the file to be retrieved. | |

### Return type

[**StorageObject**](StorageObject.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateFileContents

> StorageObject updateFileContents(id, contentLength, body)

[EARLY ACCESS] UpdateFileContents: Updates contents of a file in Drive.

### Example

```java
import com.finbourne.drive.model.*;
import com.finbourne.drive.api.FilesApi;
import com.finbourne.drive.extensions.ApiConfigurationException;
import com.finbourne.drive.extensions.ApiFactoryBuilder;
import com.finbourne.drive.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FilesApiExample {

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
        // FilesApi apiInstance = apiFactory.build(FilesApi.class);

        FilesApi apiInstance = ApiFactoryBuilder.build(fileName).build(FilesApi.class);
        String id = "id_example"; // String | The unique file identifier
        Integer contentLength = 56; // Integer | The size in bytes of the file to be uploaded
        byte[] body = null; // byte[] | 
        try {
            // uncomment the below to set overrides at the request level
            // StorageObject result = apiInstance.updateFileContents(id, contentLength, body).execute(opts);

            StorageObject result = apiInstance.updateFileContents(id, contentLength, body).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#updateFileContents");
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
| **id** | **String**| The unique file identifier | |
| **contentLength** | **Integer**| The size in bytes of the file to be uploaded | |
| **body** | **byte[]**|  | |

### Return type

[**StorageObject**](StorageObject.md)

### HTTP request headers

- **Content-Type**: application/octet-stream
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateFileMetadata

> StorageObject updateFileMetadata(id, updateFile)

[EARLY ACCESS] UpdateFileMetadata: Updates metadata for a file in Drive.

### Example

```java
import com.finbourne.drive.model.*;
import com.finbourne.drive.api.FilesApi;
import com.finbourne.drive.extensions.ApiConfigurationException;
import com.finbourne.drive.extensions.ApiFactoryBuilder;
import com.finbourne.drive.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FilesApiExample {

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
        // FilesApi apiInstance = apiFactory.build(FilesApi.class);

        FilesApi apiInstance = ApiFactoryBuilder.build(fileName).build(FilesApi.class);
        String id = "id_example"; // String | Identifier of the file to be updated
        UpdateFile updateFile = new UpdateFile(); // UpdateFile | Update to be applied to file
        try {
            // uncomment the below to set overrides at the request level
            // StorageObject result = apiInstance.updateFileMetadata(id, updateFile).execute(opts);

            StorageObject result = apiInstance.updateFileMetadata(id, updateFile).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#updateFileMetadata");
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
| **id** | **String**| Identifier of the file to be updated | |
| **updateFile** | [**UpdateFile**](UpdateFile.md)| Update to be applied to file | |

### Return type

[**StorageObject**](StorageObject.md)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)




# StorageObject

An object representation of a drive file or folder

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | File or folder identifier |  |
|**path** | **String** | Path of the folder or file |  |
|**name** | **String** | Name of the folder or file |  |
|**createdBy** | **String** | Identifier of the user who created the file or folder |  |
|**createdOn** | **OffsetDateTime** | Date of file/folder creation |  |
|**updatedBy** | **String** | Identifier of the last user to modify the file or folder |  |
|**updatedOn** | **OffsetDateTime** | Date of file/folder modification |  |
|**type** | **String** | Type of storage object (file or folder) |  |
|**size** | **Integer** | Size of the file in bytes |  [optional] |
|**status** | **String** | File status corresponding to virus scan status. (Active, Available, Checking, MalwareDetected, Failed) |  [optional] |
|**statusDetail** | **String** | Detailed description describing any negative terminal state of file |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)



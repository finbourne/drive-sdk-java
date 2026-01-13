# com.finbourne.drive.model.StorageObject
An object representation of a drive file or folder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | File or folder identifier | [default to String]
**path** | **String** | Path of the folder or file | [default to String]
**name** | **String** | Name of the folder or file | [default to String]
**createdBy** | **String** | Identifier of the user who created the file or folder | [default to String]
**createdOn** | [**OffsetDateTime**](OffsetDateTime.md) | Date of file/folder creation | [default to OffsetDateTime]
**updatedBy** | **String** | Identifier of the last user to modify the file or folder | [default to String]
**updatedOn** | [**OffsetDateTime**](OffsetDateTime.md) | Date of file/folder modification | [default to OffsetDateTime]
**type** | **String** | Type of storage object (file or folder) | [default to String]
**size** | **Integer** | Size of the file in bytes | [optional] [default to Integer]
**status** | **String** | File status corresponding to virus scan status. (Active, Available, Checking, MalwareDetected, Failed) | [optional] [default to String]
**statusDetail** | **String** | Detailed description describing any negative terminal state of file | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.drive.model.StorageObject;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Id = "example Id";
String Path = "example Path";
String Name = "example Name";
String CreatedBy = "example CreatedBy";
OffsetDateTime CreatedOn = OffsetDateTime.now();
String UpdatedBy = "example UpdatedBy";
OffsetDateTime UpdatedOn = OffsetDateTime.now();
String Type = "example Type";
@jakarta.annotation.Nullable Integer Size = new Integer("100.00");
@jakarta.annotation.Nullable String Status = "example Status";
@jakarta.annotation.Nullable String StatusDetail = "example StatusDetail";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


StorageObject storageObjectInstance = new StorageObject()
    .Id(Id)
    .Path(Path)
    .Name(Name)
    .CreatedBy(CreatedBy)
    .CreatedOn(CreatedOn)
    .UpdatedBy(UpdatedBy)
    .UpdatedOn(UpdatedOn)
    .Type(Type)
    .Size(Size)
    .Status(Status)
    .StatusDetail(StatusDetail)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

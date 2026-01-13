# com.finbourne.drive.model.UpdateFolder
DTO representing the update of the name or path of a file

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**path** | **String** | Path of the updated folder | [default to String]
**name** | **String** | Name of the updated folder | [default to String]

```java
import com.finbourne.drive.model.UpdateFolder;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Path = "example Path";
String Name = "example Name";


UpdateFolder updateFolderInstance = new UpdateFolder()
    .Path(Path)
    .Name(Name);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

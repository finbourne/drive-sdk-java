# com.finbourne.drive.model.UpdateFile
DTO representing the update of the name or path of a file

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**path** | **String** | Path of the updated file | [default to String]
**name** | **String** | Name of the updated file | [default to String]

```java
import com.finbourne.drive.model.UpdateFile;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Path = "example Path";
String Name = "example Name";


UpdateFile updateFileInstance = new UpdateFile()
    .Path(Path)
    .Name(Name);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

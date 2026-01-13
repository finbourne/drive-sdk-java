# com.finbourne.drive.model.SearchBody
DTO representing the search query

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**withPath** | **String** | Optional path field to limit the search to result with a matching (case insensitive) path | [optional] [default to String]
**name** | **String** | Name of the file or folder to be searched | [default to String]

```java
import com.finbourne.drive.model.SearchBody;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String WithPath = "example WithPath";
String Name = "example Name";


SearchBody searchBodyInstance = new SearchBody()
    .WithPath(WithPath)
    .Name(Name);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)

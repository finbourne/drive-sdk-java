<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://fbn-prd.lusid.com/drive*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApplicationMetadataApi* | [**listAccessControlledResources**](docs/ApplicationMetadataApi.md#listaccesscontrolledresources) | **GET** /api/metadata/access/resources | [EARLY ACCESS] ListAccessControlledResources: Get resources available for access control
*FilesApi* | [**createFile**](docs/FilesApi.md#createfile) | **POST** /api/files | CreateFile: Uploads a file to Lusid Drive. If using an SDK, consider using the UploadAsStreamAsync function for larger files instead.
*FilesApi* | [**deleteFile**](docs/FilesApi.md#deletefile) | **DELETE** /api/files/{id} | [EARLY ACCESS] DeleteFile: Deletes a file from Drive.
*FilesApi* | [**downloadFile**](docs/FilesApi.md#downloadfile) | **GET** /api/files/{id}/contents | DownloadFile: Download the file from Drive.
*FilesApi* | [**getFile**](docs/FilesApi.md#getfile) | **GET** /api/files/{id} | [EARLY ACCESS] GetFile: Get a file stored in Drive.
*FilesApi* | [**updateFileContents**](docs/FilesApi.md#updatefilecontents) | **PUT** /api/files/{id}/contents | [EARLY ACCESS] UpdateFileContents: Updates contents of a file in Drive.
*FilesApi* | [**updateFileMetadata**](docs/FilesApi.md#updatefilemetadata) | **PUT** /api/files/{id} | [EARLY ACCESS] UpdateFileMetadata: Updates metadata for a file in Drive.
*FoldersApi* | [**createFolder**](docs/FoldersApi.md#createfolder) | **POST** /api/folders | [EARLY ACCESS] CreateFolder: Create a new folder in LUSID Drive
*FoldersApi* | [**deleteFolder**](docs/FoldersApi.md#deletefolder) | **DELETE** /api/folders/{id} | [EARLY ACCESS] DeleteFolder: Delete a specified folder and all subfolders
*FoldersApi* | [**getFolder**](docs/FoldersApi.md#getfolder) | **GET** /api/folders/{id} | [EARLY ACCESS] GetFolder: Get metadata of folder
*FoldersApi* | [**getFolderContents**](docs/FoldersApi.md#getfoldercontents) | **GET** /api/folders/{id}/contents | GetFolderContents: List contents of a folder
*FoldersApi* | [**getRootFolder**](docs/FoldersApi.md#getrootfolder) | **GET** /api/folders | GetRootFolder: List contents of root folder
*FoldersApi* | [**moveFolder**](docs/FoldersApi.md#movefolder) | **POST** /api/folders/{id} | [EARLY ACCESS] MoveFolder: Move files to specified folder
*FoldersApi* | [**updateFolder**](docs/FoldersApi.md#updatefolder) | **PUT** /api/folders/{id} | [EARLY ACCESS] UpdateFolder: Update an existing folder's name, path
*SearchApi* | [**search**](docs/SearchApi.md#search) | **POST** /api/search | [EARLY ACCESS] Search: Search for a file or folder with a given name and path


<a id="documentation-for-models"></a>
## Documentation for Models

 - [AccessControlledAction](docs/AccessControlledAction.md)
 - [AccessControlledResource](docs/AccessControlledResource.md)
 - [ActionId](docs/ActionId.md)
 - [CreateFolder](docs/CreateFolder.md)
 - [IdSelectorDefinition](docs/IdSelectorDefinition.md)
 - [IdentifierPartSchema](docs/IdentifierPartSchema.md)
 - [Link](docs/Link.md)
 - [LusidProblemDetails](docs/LusidProblemDetails.md)
 - [LusidValidationProblemDetails](docs/LusidValidationProblemDetails.md)
 - [PagedResourceListOfStorageObject](docs/PagedResourceListOfStorageObject.md)
 - [ResourceListOfAccessControlledResource](docs/ResourceListOfAccessControlledResource.md)
 - [SearchBody](docs/SearchBody.md)
 - [StorageObject](docs/StorageObject.md)
 - [UpdateFile](docs/UpdateFile.md)
 - [UpdateFolder](docs/UpdateFolder.md)


/*
 * FINBOURNE Drive API
 *
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.finbourne.drive.model;

import java.util.Objects;
import com.finbourne.drive.model.Link;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.finbourne.drive.JSON;

/**
 * An object representation of a drive file or folder
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StorageObject {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_CREATED_ON = "createdOn";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private OffsetDateTime createdOn;

  public static final String SERIALIZED_NAME_UPDATED_BY = "updatedBy";
  @SerializedName(SERIALIZED_NAME_UPDATED_BY)
  private String updatedBy;

  public static final String SERIALIZED_NAME_UPDATED_ON = "updatedOn";
  @SerializedName(SERIALIZED_NAME_UPDATED_ON)
  private OffsetDateTime updatedOn;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_STATUS_DETAIL = "statusDetail";
  @SerializedName(SERIALIZED_NAME_STATUS_DETAIL)
  private String statusDetail;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links;

  public StorageObject() {
  }

  public StorageObject id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * File or folder identifier
   * @return id
  **/
  @jakarta.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public StorageObject path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Path of the folder or file
   * @return path
  **/
  @jakarta.annotation.Nonnull
  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public StorageObject name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the folder or file
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public StorageObject createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Identifier of the user who created the file or folder
   * @return createdBy
  **/
  @jakarta.annotation.Nonnull
  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public StorageObject createdOn(OffsetDateTime createdOn) {
    
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Date of file/folder creation
   * @return createdOn
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }


  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }


  public StorageObject updatedBy(String updatedBy) {
    
    this.updatedBy = updatedBy;
    return this;
  }

   /**
   * Identifier of the last user to modify the file or folder
   * @return updatedBy
  **/
  @jakarta.annotation.Nonnull
  public String getUpdatedBy() {
    return updatedBy;
  }


  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }


  public StorageObject updatedOn(OffsetDateTime updatedOn) {
    
    this.updatedOn = updatedOn;
    return this;
  }

   /**
   * Date of file/folder modification
   * @return updatedOn
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getUpdatedOn() {
    return updatedOn;
  }


  public void setUpdatedOn(OffsetDateTime updatedOn) {
    this.updatedOn = updatedOn;
  }


  public StorageObject type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of storage object (file or folder)
   * @return type
  **/
  @jakarta.annotation.Nonnull
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public StorageObject size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Size of the file in bytes
   * @return size
  **/
  @jakarta.annotation.Nullable
  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public StorageObject status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * File status corresponding to virus scan status.  (Active, Available, Checking, MalwareDetected, Failed)
   * @return status
  **/
  @jakarta.annotation.Nullable
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public StorageObject statusDetail(String statusDetail) {
    
    this.statusDetail = statusDetail;
    return this;
  }

   /**
   * Detailed description describing any negative terminal state of file
   * @return statusDetail
  **/
  @jakarta.annotation.Nullable
  public String getStatusDetail() {
    return statusDetail;
  }


  public void setStatusDetail(String statusDetail) {
    this.statusDetail = statusDetail;
  }


  public StorageObject links(List<Link> links) {
    
    this.links = links;
    return this;
  }

  public StorageObject addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  public List<Link> getLinks() {
    return links;
  }


  public void setLinks(List<Link> links) {
    this.links = links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageObject storageObject = (StorageObject) o;
    return Objects.equals(this.id, storageObject.id) &&
        Objects.equals(this.path, storageObject.path) &&
        Objects.equals(this.name, storageObject.name) &&
        Objects.equals(this.createdBy, storageObject.createdBy) &&
        Objects.equals(this.createdOn, storageObject.createdOn) &&
        Objects.equals(this.updatedBy, storageObject.updatedBy) &&
        Objects.equals(this.updatedOn, storageObject.updatedOn) &&
        Objects.equals(this.type, storageObject.type) &&
        Objects.equals(this.size, storageObject.size) &&
        Objects.equals(this.status, storageObject.status) &&
        Objects.equals(this.statusDetail, storageObject.statusDetail) &&
        Objects.equals(this.links, storageObject.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, path, name, createdBy, createdOn, updatedBy, updatedOn, type, size, status, statusDetail, links);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageObject {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDetail: ").append(toIndentedString(statusDetail)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("path");
    openapiFields.add("name");
    openapiFields.add("createdBy");
    openapiFields.add("createdOn");
    openapiFields.add("updatedBy");
    openapiFields.add("updatedOn");
    openapiFields.add("type");
    openapiFields.add("size");
    openapiFields.add("status");
    openapiFields.add("statusDetail");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("path");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("createdBy");
    openapiRequiredFields.add("createdOn");
    openapiRequiredFields.add("updatedBy");
    openapiRequiredFields.add("updatedOn");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to StorageObject
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StorageObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StorageObject is not found in the empty JSON string", StorageObject.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StorageObject.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("createdBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdBy").toString()));
      }
      if (!jsonObj.get("updatedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updatedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updatedBy").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("statusDetail") != null && !jsonObj.get("statusDetail").isJsonNull()) && !jsonObj.get("statusDetail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusDetail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusDetail").toString()));
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
        if (jsonArraylinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
          }

          // validate the optional field `links` (array)
          for (int i = 0; i < jsonArraylinks.size(); i++) {
            Link.validateJsonElement(jsonArraylinks.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StorageObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StorageObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StorageObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StorageObject.class));

       return (TypeAdapter<T>) new TypeAdapter<StorageObject>() {
           @Override
           public void write(JsonWriter out, StorageObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StorageObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StorageObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StorageObject
  * @throws IOException if the JSON string is invalid with respect to StorageObject
  */
  public static StorageObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StorageObject.class);
  }

 /**
  * Convert an instance of StorageObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

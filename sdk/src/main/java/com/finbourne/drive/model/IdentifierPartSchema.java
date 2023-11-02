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
 * IdentifierPartSchema
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IdentifierPartSchema {
  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private Boolean required;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links;

  public IdentifierPartSchema() {
  }

  public IdentifierPartSchema index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @jakarta.annotation.Nonnull
  public Integer getIndex() {
    return index;
  }


  public void setIndex(Integer index) {
    this.index = index;
  }


  public IdentifierPartSchema name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public IdentifierPartSchema displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @jakarta.annotation.Nonnull
  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public IdentifierPartSchema description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nonnull
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public IdentifierPartSchema required(Boolean required) {
    
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  @jakarta.annotation.Nonnull
  public Boolean getRequired() {
    return required;
  }


  public void setRequired(Boolean required) {
    this.required = required;
  }


  public IdentifierPartSchema links(List<Link> links) {
    
    this.links = links;
    return this;
  }

  public IdentifierPartSchema addLinksItem(Link linksItem) {
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
    IdentifierPartSchema identifierPartSchema = (IdentifierPartSchema) o;
    return Objects.equals(this.index, identifierPartSchema.index) &&
        Objects.equals(this.name, identifierPartSchema.name) &&
        Objects.equals(this.displayName, identifierPartSchema.displayName) &&
        Objects.equals(this.description, identifierPartSchema.description) &&
        Objects.equals(this.required, identifierPartSchema.required) &&
        Objects.equals(this.links, identifierPartSchema.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, name, displayName, description, required, links);
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
    sb.append("class IdentifierPartSchema {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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
    openapiFields.add("index");
    openapiFields.add("name");
    openapiFields.add("displayName");
    openapiFields.add("description");
    openapiFields.add("required");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("index");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("displayName");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("required");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to IdentifierPartSchema
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IdentifierPartSchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IdentifierPartSchema is not found in the empty JSON string", IdentifierPartSchema.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IdentifierPartSchema.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
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
       if (!IdentifierPartSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IdentifierPartSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IdentifierPartSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IdentifierPartSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<IdentifierPartSchema>() {
           @Override
           public void write(JsonWriter out, IdentifierPartSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IdentifierPartSchema read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IdentifierPartSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IdentifierPartSchema
  * @throws IOException if the JSON string is invalid with respect to IdentifierPartSchema
  */
  public static IdentifierPartSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IdentifierPartSchema.class);
  }

 /**
  * Convert an instance of IdentifierPartSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

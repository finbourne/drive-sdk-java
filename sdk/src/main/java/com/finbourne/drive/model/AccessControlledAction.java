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
import com.finbourne.drive.model.ActionId;
import com.finbourne.drive.model.IdSelectorDefinition;
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
 * AccessControlledAction
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccessControlledAction {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private ActionId action;

  public static final String SERIALIZED_NAME_LIMITED_SET = "limitedSet";
  @SerializedName(SERIALIZED_NAME_LIMITED_SET)
  private List<IdSelectorDefinition> limitedSet;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links;

  public AccessControlledAction() {
  }

  public AccessControlledAction description(String description) {
    
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


  public AccessControlledAction action(ActionId action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @jakarta.annotation.Nonnull
  public ActionId getAction() {
    return action;
  }


  public void setAction(ActionId action) {
    this.action = action;
  }


  public AccessControlledAction limitedSet(List<IdSelectorDefinition> limitedSet) {
    
    this.limitedSet = limitedSet;
    return this;
  }

  public AccessControlledAction addLimitedSetItem(IdSelectorDefinition limitedSetItem) {
    if (this.limitedSet == null) {
      this.limitedSet = new ArrayList<>();
    }
    this.limitedSet.add(limitedSetItem);
    return this;
  }

   /**
   * Get limitedSet
   * @return limitedSet
  **/
  @jakarta.annotation.Nullable
  public List<IdSelectorDefinition> getLimitedSet() {
    return limitedSet;
  }


  public void setLimitedSet(List<IdSelectorDefinition> limitedSet) {
    this.limitedSet = limitedSet;
  }


  public AccessControlledAction links(List<Link> links) {
    
    this.links = links;
    return this;
  }

  public AccessControlledAction addLinksItem(Link linksItem) {
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
    AccessControlledAction accessControlledAction = (AccessControlledAction) o;
    return Objects.equals(this.description, accessControlledAction.description) &&
        Objects.equals(this.action, accessControlledAction.action) &&
        Objects.equals(this.limitedSet, accessControlledAction.limitedSet) &&
        Objects.equals(this.links, accessControlledAction.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, action, limitedSet, links);
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
    sb.append("class AccessControlledAction {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    limitedSet: ").append(toIndentedString(limitedSet)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("action");
    openapiFields.add("limitedSet");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("action");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccessControlledAction
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccessControlledAction.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessControlledAction is not found in the empty JSON string", AccessControlledAction.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AccessControlledAction.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the required field `action`
      ActionId.validateJsonElement(jsonObj.get("action"));
      if (jsonObj.get("limitedSet") != null && !jsonObj.get("limitedSet").isJsonNull()) {
        JsonArray jsonArraylimitedSet = jsonObj.getAsJsonArray("limitedSet");
        if (jsonArraylimitedSet != null) {
          // ensure the json data is an array
          if (!jsonObj.get("limitedSet").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `limitedSet` to be an array in the JSON string but got `%s`", jsonObj.get("limitedSet").toString()));
          }

          // validate the optional field `limitedSet` (array)
          for (int i = 0; i < jsonArraylimitedSet.size(); i++) {
            IdSelectorDefinition.validateJsonElement(jsonArraylimitedSet.get(i));
          };
        }
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
       if (!AccessControlledAction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessControlledAction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessControlledAction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessControlledAction.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessControlledAction>() {
           @Override
           public void write(JsonWriter out, AccessControlledAction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessControlledAction read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccessControlledAction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessControlledAction
  * @throws IOException if the JSON string is invalid with respect to AccessControlledAction
  */
  public static AccessControlledAction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessControlledAction.class);
  }

 /**
  * Convert an instance of AccessControlledAction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

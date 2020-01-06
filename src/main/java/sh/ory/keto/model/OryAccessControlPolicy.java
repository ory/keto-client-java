/*
 * ORY Keto
 * A cloud native access control server providing best-practice patterns (RBAC, ABAC, ACL, AWS IAM Policies, Kubernetes Roles, ...) via REST APIs.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.1
 * Contact: hi@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.keto.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * OryAccessControlPolicy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-06T13:24:57.895323+01:00[Europe/Berlin]")
public class OryAccessControlPolicy {
  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<String> actions = null;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private Map<String, Object> conditions = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EFFECT = "effect";
  @SerializedName(SERIALIZED_NAME_EFFECT)
  private String effect;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private List<String> resources = null;

  public static final String SERIALIZED_NAME_SUBJECTS = "subjects";
  @SerializedName(SERIALIZED_NAME_SUBJECTS)
  private List<String> subjects = null;


  public OryAccessControlPolicy actions(List<String> actions) {
    
    this.actions = actions;
    return this;
  }

  public OryAccessControlPolicy addActionsItem(String actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<String>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Actions is an array representing all the actions this ORY Access Policy applies to.
   * @return actions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Actions is an array representing all the actions this ORY Access Policy applies to.")

  public List<String> getActions() {
    return actions;
  }


  public void setActions(List<String> actions) {
    this.actions = actions;
  }


  public OryAccessControlPolicy conditions(Map<String, Object> conditions) {
    
    this.conditions = conditions;
    return this;
  }

  public OryAccessControlPolicy putConditionsItem(String key, Object conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new HashMap<String, Object>();
    }
    this.conditions.put(key, conditionsItem);
    return this;
  }

   /**
   * Conditions represents a keyed object of conditions under which this ORY Access Policy is active.
   * @return conditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Conditions represents a keyed object of conditions under which this ORY Access Policy is active.")

  public Map<String, Object> getConditions() {
    return conditions;
  }


  public void setConditions(Map<String, Object> conditions) {
    this.conditions = conditions;
  }


  public OryAccessControlPolicy description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description is an optional, human-readable description.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description is an optional, human-readable description.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public OryAccessControlPolicy effect(String effect) {
    
    this.effect = effect;
    return this;
  }

   /**
   * Effect is the effect of this ORY Access Policy. It can be \&quot;allow\&quot; or \&quot;deny\&quot;.
   * @return effect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Effect is the effect of this ORY Access Policy. It can be \"allow\" or \"deny\".")

  public String getEffect() {
    return effect;
  }


  public void setEffect(String effect) {
    this.effect = effect;
  }


  public OryAccessControlPolicy id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID is the unique identifier of the ORY Access Policy. It is used to query, update, and remove the ORY Access Policy.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID is the unique identifier of the ORY Access Policy. It is used to query, update, and remove the ORY Access Policy.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public OryAccessControlPolicy resources(List<String> resources) {
    
    this.resources = resources;
    return this;
  }

  public OryAccessControlPolicy addResourcesItem(String resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<String>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Resources is an array representing all the resources this ORY Access Policy applies to.
   * @return resources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Resources is an array representing all the resources this ORY Access Policy applies to.")

  public List<String> getResources() {
    return resources;
  }


  public void setResources(List<String> resources) {
    this.resources = resources;
  }


  public OryAccessControlPolicy subjects(List<String> subjects) {
    
    this.subjects = subjects;
    return this;
  }

  public OryAccessControlPolicy addSubjectsItem(String subjectsItem) {
    if (this.subjects == null) {
      this.subjects = new ArrayList<String>();
    }
    this.subjects.add(subjectsItem);
    return this;
  }

   /**
   * Subjects is an array representing all the subjects this ORY Access Policy applies to.
   * @return subjects
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subjects is an array representing all the subjects this ORY Access Policy applies to.")

  public List<String> getSubjects() {
    return subjects;
  }


  public void setSubjects(List<String> subjects) {
    this.subjects = subjects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OryAccessControlPolicy oryAccessControlPolicy = (OryAccessControlPolicy) o;
    return Objects.equals(this.actions, oryAccessControlPolicy.actions) &&
        Objects.equals(this.conditions, oryAccessControlPolicy.conditions) &&
        Objects.equals(this.description, oryAccessControlPolicy.description) &&
        Objects.equals(this.effect, oryAccessControlPolicy.effect) &&
        Objects.equals(this.id, oryAccessControlPolicy.id) &&
        Objects.equals(this.resources, oryAccessControlPolicy.resources) &&
        Objects.equals(this.subjects, oryAccessControlPolicy.subjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, conditions, description, effect, id, resources, subjects);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OryAccessControlPolicy {\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    subjects: ").append(toIndentedString(subjects)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


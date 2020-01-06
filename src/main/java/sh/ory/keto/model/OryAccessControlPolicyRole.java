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
import java.util.List;

/**
 * oryAccessControlPolicyRole represents a group of users that share the same role. A role could be an administrator, a moderator, a regular user or some other sort of role.
 */
@ApiModel(description = "oryAccessControlPolicyRole represents a group of users that share the same role. A role could be an administrator, a moderator, a regular user or some other sort of role.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-06T13:24:57.895323+01:00[Europe/Berlin]")
public class OryAccessControlPolicyRole {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MEMBERS = "members";
  @SerializedName(SERIALIZED_NAME_MEMBERS)
  private List<String> members = null;


  public OryAccessControlPolicyRole id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID is the role&#39;s unique id.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID is the role's unique id.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public OryAccessControlPolicyRole members(List<String> members) {
    
    this.members = members;
    return this;
  }

  public OryAccessControlPolicyRole addMembersItem(String membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<String>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * Members is who belongs to the role.
   * @return members
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Members is who belongs to the role.")

  public List<String> getMembers() {
    return members;
  }


  public void setMembers(List<String> members) {
    this.members = members;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OryAccessControlPolicyRole oryAccessControlPolicyRole = (OryAccessControlPolicyRole) o;
    return Objects.equals(this.id, oryAccessControlPolicyRole.id) &&
        Objects.equals(this.members, oryAccessControlPolicyRole.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, members);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OryAccessControlPolicyRole {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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


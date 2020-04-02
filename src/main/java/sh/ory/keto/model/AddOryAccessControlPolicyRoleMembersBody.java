/*
 * ORY Keto
 * Ory Keto is a cloud native access control server providing best-practice patterns (RBAC, ABAC, ACL, AWS IAM Policies, Kubernetes Roles, ...) via REST APIs.
 *
 * The version of the OpenAPI document: Latest
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
 * AddOryAccessControlPolicyRoleMembersBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-02T13:51:36.036762Z[GMT]")
public class AddOryAccessControlPolicyRoleMembersBody {
  public static final String SERIALIZED_NAME_MEMBERS = "members";
  @SerializedName(SERIALIZED_NAME_MEMBERS)
  private List<String> members = null;


  public AddOryAccessControlPolicyRoleMembersBody members(List<String> members) {
    
    this.members = members;
    return this;
  }

  public AddOryAccessControlPolicyRoleMembersBody addMembersItem(String membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<String>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * The members to be added.
   * @return members
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The members to be added.")

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
    AddOryAccessControlPolicyRoleMembersBody addOryAccessControlPolicyRoleMembersBody = (AddOryAccessControlPolicyRoleMembersBody) o;
    return Objects.equals(this.members, addOryAccessControlPolicyRoleMembersBody.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(members);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddOryAccessControlPolicyRoleMembersBody {\n");
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


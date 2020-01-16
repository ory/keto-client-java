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

/**
 * AuthorizationResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-16T09:58:55.261548Z[GMT]")
public class AuthorizationResult {
  public static final String SERIALIZED_NAME_ALLOWED = "allowed";
  @SerializedName(SERIALIZED_NAME_ALLOWED)
  private Boolean allowed;


  public AuthorizationResult allowed(Boolean allowed) {
    
    this.allowed = allowed;
    return this;
  }

   /**
   * Allowed is true if the request should be allowed and false otherwise.
   * @return allowed
  **/
  @ApiModelProperty(required = true, value = "Allowed is true if the request should be allowed and false otherwise.")

  public Boolean getAllowed() {
    return allowed;
  }


  public void setAllowed(Boolean allowed) {
    this.allowed = allowed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizationResult authorizationResult = (AuthorizationResult) o;
    return Objects.equals(this.allowed, authorizationResult.allowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationResult {\n");
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
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


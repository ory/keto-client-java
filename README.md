# keto-client

ORY Keto
- API version: v0.0.0-alpha.58
  - Build date: 2021-01-26T10:29:31.477010682Z[Etc/UTC]

Ory Keto is a cloud native access control server providing best-practice patterns (RBAC, ABAC, ACL, AWS IAM Policies, Kubernetes Roles, ...) via REST APIs.

  For more information, please visit [https://www.ory.sh](https://www.ory.sh)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>sh.ory.keto</groupId>
  <artifactId>keto-client</artifactId>
  <version>v0.0.0-alpha.58</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "sh.ory.keto:keto-client:v0.0.0-alpha.58"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/keto-client-v0.0.0-alpha.58.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import sh.ory.keto.ApiClient;
import sh.ory.keto.ApiException;
import sh.ory.keto.Configuration;
import sh.ory.keto.models.*;
import sh.ory.keto.api.EnginesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EnginesApi apiInstance = new EnginesApi(defaultClient);
    String flavor = "flavor_example"; // String | The ORY Access Control Policy flavor. Can be \"regex\", \"glob\", and \"exact\".
    String id = "id_example"; // String | The ID of the ORY Access Control Policy Role.
    AddOryAccessControlPolicyRoleMembersBody body = new AddOryAccessControlPolicyRoleMembersBody(); // AddOryAccessControlPolicyRoleMembersBody | 
    try {
      OryAccessControlPolicyRole result = apiInstance.addOryAccessControlPolicyRoleMembers(flavor, id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnginesApi#addOryAccessControlPolicyRoleMembers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*EnginesApi* | [**addOryAccessControlPolicyRoleMembers**](docs/EnginesApi.md#addOryAccessControlPolicyRoleMembers) | **PUT** /engines/acp/ory/{flavor}/roles/{id}/members | Add a member to an ORY Access Control Policy Role
*EnginesApi* | [**deleteOryAccessControlPolicy**](docs/EnginesApi.md#deleteOryAccessControlPolicy) | **DELETE** /engines/acp/ory/{flavor}/policies/{id} | 
*EnginesApi* | [**deleteOryAccessControlPolicyRole**](docs/EnginesApi.md#deleteOryAccessControlPolicyRole) | **DELETE** /engines/acp/ory/{flavor}/roles/{id} | Delete an ORY Access Control Policy Role
*EnginesApi* | [**doOryAccessControlPoliciesAllow**](docs/EnginesApi.md#doOryAccessControlPoliciesAllow) | **POST** /engines/acp/ory/{flavor}/allowed | Check if a request is allowed
*EnginesApi* | [**getOryAccessControlPolicy**](docs/EnginesApi.md#getOryAccessControlPolicy) | **GET** /engines/acp/ory/{flavor}/policies/{id} | 
*EnginesApi* | [**getOryAccessControlPolicyRole**](docs/EnginesApi.md#getOryAccessControlPolicyRole) | **GET** /engines/acp/ory/{flavor}/roles/{id} | Get an ORY Access Control Policy Role
*EnginesApi* | [**listOryAccessControlPolicies**](docs/EnginesApi.md#listOryAccessControlPolicies) | **GET** /engines/acp/ory/{flavor}/policies | 
*EnginesApi* | [**listOryAccessControlPolicyRoles**](docs/EnginesApi.md#listOryAccessControlPolicyRoles) | **GET** /engines/acp/ory/{flavor}/roles | List ORY Access Control Policy Roles
*EnginesApi* | [**removeOryAccessControlPolicyRoleMembers**](docs/EnginesApi.md#removeOryAccessControlPolicyRoleMembers) | **DELETE** /engines/acp/ory/{flavor}/roles/{id}/members/{member} | Remove a member from an ORY Access Control Policy Role
*EnginesApi* | [**upsertOryAccessControlPolicy**](docs/EnginesApi.md#upsertOryAccessControlPolicy) | **PUT** /engines/acp/ory/{flavor}/policies | 
*EnginesApi* | [**upsertOryAccessControlPolicyRole**](docs/EnginesApi.md#upsertOryAccessControlPolicyRole) | **PUT** /engines/acp/ory/{flavor}/roles | Upsert an ORY Access Control Policy Role
*HealthApi* | [**isInstanceAlive**](docs/HealthApi.md#isInstanceAlive) | **GET** /health/alive | Check alive status
*HealthApi* | [**isInstanceReady**](docs/HealthApi.md#isInstanceReady) | **GET** /health/ready | Check readiness status
*VersionApi* | [**getVersion**](docs/VersionApi.md#getVersion) | **GET** /version | Get service version


## Documentation for Models

 - [AddOryAccessControlPolicyRoleMembersBody](docs/AddOryAccessControlPolicyRoleMembersBody.md)
 - [AuthorizationResult](docs/AuthorizationResult.md)
 - [HealthNotReadyStatus](docs/HealthNotReadyStatus.md)
 - [HealthStatus](docs/HealthStatus.md)
 - [InlineResponse500](docs/InlineResponse500.md)
 - [OryAccessControlPolicy](docs/OryAccessControlPolicy.md)
 - [OryAccessControlPolicyAllowedInput](docs/OryAccessControlPolicyAllowedInput.md)
 - [OryAccessControlPolicyRole](docs/OryAccessControlPolicyRole.md)
 - [Version](docs/Version.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

hi@ory.sh


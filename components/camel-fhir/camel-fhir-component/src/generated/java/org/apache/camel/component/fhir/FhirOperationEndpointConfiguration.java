
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.fhir;

import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link org.apache.camel.component.fhir.api.FhirOperation}.
 */
@ApiParams(apiName = "operation", 
           description = "API for extended FHIR operations https://www",
           apiMethods = {@ApiMethod(methodName = "onInstance", description="Perform the operation across all versions of a specific resource (by ID and type) on the server", signatures={"org.hl7.fhir.instance.model.api.IBaseResource onInstance(org.hl7.fhir.instance.model.api.IIdType id, String name, org.hl7.fhir.instance.model.api.IBaseParameters parameters, Class<org.hl7.fhir.instance.model.api.IBaseParameters> outputParameterType, boolean useHttpGet, Class<org.hl7.fhir.instance.model.api.IBaseResource> returnType, java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> extraParameters)"}), @ApiMethod(methodName = "onInstanceVersion", description="This operation operates on a specific version of a resource", signatures={"org.hl7.fhir.instance.model.api.IBaseResource onInstanceVersion(org.hl7.fhir.instance.model.api.IIdType id, String name, org.hl7.fhir.instance.model.api.IBaseParameters parameters, Class<org.hl7.fhir.instance.model.api.IBaseParameters> outputParameterType, boolean useHttpGet, Class<org.hl7.fhir.instance.model.api.IBaseResource> returnType, java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> extraParameters)"}), @ApiMethod(methodName = "onServer", description="Perform the operation across all versions of all resources of all types on the server", signatures={"org.hl7.fhir.instance.model.api.IBaseResource onServer(String name, org.hl7.fhir.instance.model.api.IBaseParameters parameters, Class<org.hl7.fhir.instance.model.api.IBaseParameters> outputParameterType, boolean useHttpGet, Class<org.hl7.fhir.instance.model.api.IBaseResource> returnType, java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> extraParameters)"}), @ApiMethod(methodName = "onType", description="Perform the operation across all versions of all resources of the given type on the server", signatures={"org.hl7.fhir.instance.model.api.IBaseResource onType(Class<org.hl7.fhir.instance.model.api.IBaseResource> resourceType, String name, org.hl7.fhir.instance.model.api.IBaseParameters parameters, Class<org.hl7.fhir.instance.model.api.IBaseParameters> outputParameterType, boolean useHttpGet, Class<org.hl7.fhir.instance.model.api.IBaseResource> returnType, java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> extraParameters)"}), @ApiMethod(methodName = "processMessage", description="This operation is called $process-message as defined by the FHIR specification", signatures={"org.hl7.fhir.instance.model.api.IBaseBundle processMessage(String respondToUri, org.hl7.fhir.instance.model.api.IBaseBundle msgBundle, boolean asynchronous, Class<org.hl7.fhir.instance.model.api.IBaseBundle> responseClass, java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> extraParameters)"})}, aliases = {})
@UriParams
@Configurer(extended = true)
public final class FhirOperationEndpointConfiguration extends FhirConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "processMessage", description="Whether to process the message asynchronously or synchronously, defaults to synchronous.")})
    private Boolean asynchronous;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "onInstance", description="See ExtraParameters for a full list of parameters that can be passed, may be NULL"), @ApiMethod(methodName = "onInstanceVersion", description="See ExtraParameters for a full list of parameters that can be passed, may be NULL"), @ApiMethod(methodName = "onServer", description="See ExtraParameters for a full list of parameters that can be passed, may be NULL"), @ApiMethod(methodName = "onType", description="See ExtraParameters for a full list of parameters that can be passed, may be NULL"), @ApiMethod(methodName = "processMessage", description="See ExtraParameters for a full list of parameters that can be passed, may be NULL")})
    private java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> extraParameters;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "onInstance", description="Resource (version will be stripped)"), @ApiMethod(methodName = "onInstanceVersion", description="Resource version")})
    private org.hl7.fhir.instance.model.api.IIdType id;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "processMessage", description="Set the Message Bundle to POST to the messaging server")})
    private org.hl7.fhir.instance.model.api.IBaseBundle msgBundle;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "onInstance", description="Operation name"), @ApiMethod(methodName = "onInstanceVersion", description="Operation name"), @ApiMethod(methodName = "onServer", description="Operation name"), @ApiMethod(methodName = "onType", description="Operation name")})
    private String name;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "onInstance", description="The type to use for the output parameters (this should be set to Parameters.class drawn from the version of the FHIR structures you are using), may be NULL"), @ApiMethod(methodName = "onInstanceVersion", description="The type to use for the output parameters (this should be set to Parameters.class drawn from the version of the FHIR structures you are using), may be NULL"), @ApiMethod(methodName = "onServer", description="The type to use for the output parameters (this should be set to Parameters.class drawn from the version of the FHIR structures you are using), may be NULL"), @ApiMethod(methodName = "onType", description="The type to use for the output parameters (this should be set to Parameters.class drawn from the version of the FHIR structures you are using), may be NULL")})
    private Class<org.hl7.fhir.instance.model.api.IBaseParameters> outputParameterType;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "onInstance", description="The parameters to use as input. May also be null if the operation does not require any input parameters."), @ApiMethod(methodName = "onInstanceVersion", description="The parameters to use as input. May also be null if the operation does not require any input parameters."), @ApiMethod(methodName = "onServer", description="The parameters to use as input. May also be null if the operation does not require any input parameters."), @ApiMethod(methodName = "onType", description="The parameters to use as input. May also be null if the operation does not require any input parameters.")})
    private org.hl7.fhir.instance.model.api.IBaseParameters parameters;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "onType", description="The resource type to operate on")})
    private Class<org.hl7.fhir.instance.model.api.IBaseResource> resourceType;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "processMessage", description="An optional query parameter indicating that responses from the receiving server should be sent to this URI, may be NULL")})
    private String respondToUri;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "processMessage", description="The response class")})
    private Class<org.hl7.fhir.instance.model.api.IBaseBundle> responseClass;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "onInstance", description="If this operation returns a single resource body as its return type instead of a Parameters resource, use this method to specify that resource type. This is useful for certain operations (e.g. Patient/NNN/$everything) which return a bundle instead of a Parameters resource, may be NULL"), @ApiMethod(methodName = "onInstanceVersion", description="If this operation returns a single resource body as its return type instead of a Parameters resource, use this method to specify that resource type. This is useful for certain operations (e.g. Patient/NNN/$everything) which return a bundle instead of a Parameters resource, may be NULL"), @ApiMethod(methodName = "onServer", description="If this operation returns a single resource body as its return type instead of a Parameters resource, use this method to specify that resource type. This is useful for certain operations (e.g. Patient/NNN/$everything) which return a bundle instead of a Parameters resource, may be NULL"), @ApiMethod(methodName = "onType", description="If this operation returns a single resource body as its return type instead of a Parameters resource, use this method to specify that resource type. This is useful for certain operations (e.g. Patient/NNN/$everything) which return a bundle instead of a Parameters resource, may be NULL")})
    private Class<org.hl7.fhir.instance.model.api.IBaseResource> returnType;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "onInstance", description="Use HTTP GET verb"), @ApiMethod(methodName = "onInstanceVersion", description="Use HTTP GET verb"), @ApiMethod(methodName = "onServer", description="Use HTTP GET verb"), @ApiMethod(methodName = "onType", description="Use HTTP GET verb")})
    private Boolean useHttpGet;

    public Boolean getAsynchronous() {
        return asynchronous;
    }

    public void setAsynchronous(Boolean asynchronous) {
        this.asynchronous = asynchronous;
    }

    public java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> getExtraParameters() {
        return extraParameters;
    }

    public void setExtraParameters(java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> extraParameters) {
        this.extraParameters = extraParameters;
    }

    public org.hl7.fhir.instance.model.api.IIdType getId() {
        return id;
    }

    public void setId(org.hl7.fhir.instance.model.api.IIdType id) {
        this.id = id;
    }

    public org.hl7.fhir.instance.model.api.IBaseBundle getMsgBundle() {
        return msgBundle;
    }

    public void setMsgBundle(org.hl7.fhir.instance.model.api.IBaseBundle msgBundle) {
        this.msgBundle = msgBundle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Class<org.hl7.fhir.instance.model.api.IBaseParameters> getOutputParameterType() {
        return outputParameterType;
    }

    public void setOutputParameterType(Class<org.hl7.fhir.instance.model.api.IBaseParameters> outputParameterType) {
        this.outputParameterType = outputParameterType;
    }

    public org.hl7.fhir.instance.model.api.IBaseParameters getParameters() {
        return parameters;
    }

    public void setParameters(org.hl7.fhir.instance.model.api.IBaseParameters parameters) {
        this.parameters = parameters;
    }

    public Class<org.hl7.fhir.instance.model.api.IBaseResource> getResourceType() {
        return resourceType;
    }

    public void setResourceType(Class<org.hl7.fhir.instance.model.api.IBaseResource> resourceType) {
        this.resourceType = resourceType;
    }

    public String getRespondToUri() {
        return respondToUri;
    }

    public void setRespondToUri(String respondToUri) {
        this.respondToUri = respondToUri;
    }

    public Class<org.hl7.fhir.instance.model.api.IBaseBundle> getResponseClass() {
        return responseClass;
    }

    public void setResponseClass(Class<org.hl7.fhir.instance.model.api.IBaseBundle> responseClass) {
        this.responseClass = responseClass;
    }

    public Class<org.hl7.fhir.instance.model.api.IBaseResource> getReturnType() {
        return returnType;
    }

    public void setReturnType(Class<org.hl7.fhir.instance.model.api.IBaseResource> returnType) {
        this.returnType = returnType;
    }

    public Boolean getUseHttpGet() {
        return useHttpGet;
    }

    public void setUseHttpGet(Boolean useHttpGet) {
        this.useHttpGet = useHttpGet;
    }
}

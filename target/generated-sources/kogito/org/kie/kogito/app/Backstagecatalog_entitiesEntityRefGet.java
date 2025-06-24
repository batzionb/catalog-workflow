package org.kie.kogito.app;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped()
public class Backstagecatalog_entitiesEntityRefGet extends org.kie.kogito.serverless.workflow.openapi.OpenApiWorkItemHandler<org.kie.kogito.openapi.backstagecatalog.api.DefaultApi> {

    protected Object internalExecute(org.kie.kogito.openapi.backstagecatalog.api.DefaultApi openApiRef, java.util.Map<java.lang.String, java.lang.Object> parameters) {
        return openApiRef.entitiesEntityRefGet((java.lang.String) parameters.remove("entityRef"));
    }

    protected java.lang.Class<org.kie.kogito.openapi.backstagecatalog.api.DefaultApi> getRestClass() {
        return org.kie.kogito.openapi.backstagecatalog.api.DefaultApi.class;
    }

    public java.lang.String getName() {
        return "backstagecatalog_";
    }
}

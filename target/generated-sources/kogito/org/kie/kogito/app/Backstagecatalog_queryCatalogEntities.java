package org.kie.kogito.app;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped()
public class Backstagecatalog_queryCatalogEntities extends org.kie.kogito.serverless.workflow.openapi.OpenApiWorkItemHandler<org.kie.kogito.openapi.backstagecatalog.api.DefaultApi> {

    protected Object internalExecute(org.kie.kogito.openapi.backstagecatalog.api.DefaultApi openApiRef, java.util.Map<java.lang.String, java.lang.Object> parameters) {
        return openApiRef.queryCatalogEntities((java.util.List<java.lang.String>) parameters.remove("filter"), (java.lang.String) parameters.remove("fields"), (java.lang.Integer) parameters.remove("limit"), (java.lang.Integer) parameters.remove("offset"), (java.lang.String) parameters.remove("orderField"), (java.lang.String) parameters.remove("fullTextFilter"));
    }

    protected java.lang.Class<org.kie.kogito.openapi.backstagecatalog.api.DefaultApi> getRestClass() {
        return org.kie.kogito.openapi.backstagecatalog.api.DefaultApi.class;
    }

    public java.lang.String getName() {
        return "backstagecatalog_Query catalog entities";
    }
}

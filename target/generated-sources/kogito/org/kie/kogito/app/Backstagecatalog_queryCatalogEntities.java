package org.kie.kogito.app;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped()
public class Backstagecatalog_queryCatalogEntities extends org.kie.kogito.serverless.workflow.openapi.OpenApiWorkItemHandler<org.kie.kogito.openapi.backstagecatalog.api.DefaultApi> {

    protected Object internalExecute(org.kie.kogito.openapi.backstagecatalog.api.DefaultApi openApiRef, java.util.Map<java.lang.String, java.lang.Object> parameters) {
        return openApiRef.queryCatalogEntities(safeCast(parameters.remove("filter"), java.util.List.class), safeCast(parameters.remove("fields"), java.lang.String.class), safeCast(parameters.remove("limit"), java.lang.Integer.class), safeCast(parameters.remove("offset"), java.lang.Integer.class), safeCast(parameters.remove("orderField"), java.lang.String.class), safeCast(parameters.remove("fullTextFilter"), java.lang.String.class));
    }

    protected java.lang.Class<org.kie.kogito.openapi.backstagecatalog.api.DefaultApi> getRestClass() {
        return org.kie.kogito.openapi.backstagecatalog.api.DefaultApi.class;
    }

    public java.lang.String getName() {
        return "backstagecatalog_Query catalog entities";
    }
}

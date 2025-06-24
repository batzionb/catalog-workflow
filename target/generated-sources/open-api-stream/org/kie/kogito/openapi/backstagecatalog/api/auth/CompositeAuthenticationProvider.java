package org.kie.kogito.openapi.backstagecatalog.api.auth;

import jakarta.inject.Inject;
import jakarta.annotation.PostConstruct;
import jakarta.ws.rs.Priorities;

import jakarta.annotation.Priority;

import io.quarkiverse.openapi.generator.OpenApiGeneratorConfig;

import io.quarkiverse.openapi.generator.providers.BearerAuthenticationProvider;
import io.quarkiverse.openapi.generator.providers.AbstractCompositeAuthenticationProvider;
import io.quarkiverse.openapi.generator.providers.OperationAuthInfo;

import java.util.Optional;

@Priority(Priorities.AUTHENTICATION)
public class CompositeAuthenticationProvider extends AbstractCompositeAuthenticationProvider {

    @jakarta.inject.Inject
    OpenApiGeneratorConfig generatorConfig;


    @PostConstruct
    public void init() {

        BearerAuthenticationProvider bearerProvider0 = new BearerAuthenticationProvider("backstagecatalog_yaml", sanitizeAuthName("bearerAuth"), "bearer", generatorConfig);
        this.addAuthenticationProvider(bearerProvider0);
        bearerProvider0.addOperation(OperationAuthInfo.builder()
            .withPath("/entities/{entityRef}")
            .withId("entitiesEntityRefGet")
            .withMethod("GET")
            .build());
        bearerProvider0.addOperation(OperationAuthInfo.builder()
            .withPath("/locations")
            .withId("locationsGet")
            .withMethod("GET")
            .build());
        bearerProvider0.addOperation(OperationAuthInfo.builder()
            .withPath("/locations")
            .withId("locationsPost")
            .withMethod("POST")
            .build());
        bearerProvider0.addOperation(OperationAuthInfo.builder()
            .withPath("/api/catalog/entities")
            .withId("queryCatalogEntities")
            .withMethod("GET")
            .build());
    }

}
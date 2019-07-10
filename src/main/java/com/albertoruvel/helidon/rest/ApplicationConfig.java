package com.albertoruvel.helidon.rest;

import io.helidon.common.CollectionsHelper;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Set;

@ApplicationScoped
@ApplicationPath("/")
public class ApplicationConfig extends Application{
    @Override
    public Set<Class<?>> getClasses() {
        return CollectionsHelper.setOf(
                TestResource.class
        );
    }
}

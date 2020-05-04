package de.lui.ws;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class MyJaxRsApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> rrcs = new HashSet<>();
        rrcs.add(UserResources.class);
        return rrcs;
    }
}

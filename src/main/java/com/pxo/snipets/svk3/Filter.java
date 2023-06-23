package com.pxo.snipets.svk3;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.container.ContainerRequestContext;
import org.jboss.resteasy.reactive.server.ServerRequestFilter;

import java.net.URI;

//@ApplicationScoped
public class Filter {

  /*  @ServerRequestFilter(preMatching = true)
    public void preMatchingFilter(ContainerRequestContext requestContext) {
        // make sure we don't lose cheese lovers
        System.out.println(requestContext.getRequest());
        if("yes".equals(requestContext.getHeaderString("Cheese"))) {
            requestContext.setRequestUri(URI.create("/cheese"));
        }
    }*/

}

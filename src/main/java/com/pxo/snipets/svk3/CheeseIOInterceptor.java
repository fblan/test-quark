package com.pxo.snipets.svk3;

import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.ext.*;

import java.io.IOException;
import java.net.URISyntaxException;

//@Provider
public class CheeseIOInterceptor/* implements ReaderInterceptor, WriterInterceptor */{
    URISyntaxException toto;
/*    @Override
    public void aroundWriteTo(WriterInterceptorContext context)
            throws IOException, WebApplicationException {
        System.err.println("Before writing " + context.getEntity());
        context.proceed();
        System.err.println("After writing " + context.getEntity());
    }

    @Override
    public Object aroundReadFrom(ReaderInterceptorContext context)
            throws IOException, WebApplicationException {
        System.err.println("Before reading " + context.getGenericType());
        Object entity = context.proceed();
        System.err.println("After reading " + entity);
        return entity;
    }*/
}

package org.m323.cachet.api.v1.test.util;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.Arrays;

import org.apache.cxf.jaxrs.client.JAXRSClientFactory;

public final class CXFClientUtil {
    private static final String HOST = "https://demo.cachethq.io";

    public static <T> T createJaxRsClient(final Class<T> clientClass) {
        final JacksonJsonProvider jsonProvider = new JacksonJsonProvider();
        return JAXRSClientFactory.create(HOST, clientClass, Arrays.asList(jsonProvider));
    }
}

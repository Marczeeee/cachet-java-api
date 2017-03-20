package org.m323.cachet.api.v1.test.util;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.apache.cxf.jaxrs.client.JAXRSClientFactory;

public final class CXFClientUtil {
    private static final String HOST = "https://demo.cachethq.io";

    public static <T> T createJaxRsClient(final Class<T> clientClass) {
        final JacksonJsonProvider jsonProvider = new JacksonJsonProvider();
        final ObjectMapper om = new ObjectMapper();
        om.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        om.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        jsonProvider.setMapper(om);
        return JAXRSClientFactory.create(HOST, clientClass, Arrays.asList(jsonProvider));
    }
}

package org.m323.cachet.api.v1.test.util;

import org.junit.Assert;
import org.m323.cachet.api.v1.response.PaginationMetadata.PaginationData;

public class TestHelper {
    public static void validatePagination(final PaginationData paginationData) {
        Assert.assertNotNull(paginationData);
        Assert.assertNotNull(paginationData.getCount());
        Assert.assertNotNull(paginationData.getCurrent_page());
        Assert.assertNotNull(paginationData.getPer_page());
        Assert.assertNotNull(paginationData.getTotal());
        Assert.assertNotNull(paginationData.getTotal_pages());
    }
}

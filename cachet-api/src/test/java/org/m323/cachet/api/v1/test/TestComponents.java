package org.m323.cachet.api.v1.test;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.m323.cachet.api.v1.Components;
import org.m323.cachet.api.v1.entity.Component;
import org.m323.cachet.api.v1.response.ComponentResponse;
import org.m323.cachet.api.v1.response.ComponentsResponse;
import org.m323.cachet.api.v1.test.util.CXFClientUtil;
import org.m323.cachet.api.v1.test.util.TestHelper;

/**
 * Tests the Component-related Cachet api functions.
 *
 * @since 0.1
 * @author Marczeeee
 */
public class TestComponents {

    private static Components components;

    @BeforeClass
    public static void beforeClass() {
        components = CXFClientUtil.createJaxRsClient(Components.class);
    }

    @Test
    public void testFindAllComponents() {
        final ComponentsResponse componentsResponse =
                components.findComponents(null, null, null, null, null);
        Assert.assertNotNull(componentsResponse);
        Assert.assertNotNull(componentsResponse.getData());
        Assert.assertNotNull(componentsResponse.getMeta());
        TestHelper.validatePagination(componentsResponse.getMeta().getPagination());
        for (final Component component : componentsResponse.getData()) {
            validateComponent(component);
        }
    }

    @Test
    public void testFindComponentsById() {
        final ComponentsResponse componentsResponse =
                components.findComponents(1L, null, null, null, null);
        Assert.assertNotNull(componentsResponse);
        Assert.assertNotNull(componentsResponse.getData());
        Assert.assertNotNull(componentsResponse.getMeta());
        Assert.assertEquals(1L, componentsResponse.getData().size());
        TestHelper.validatePagination(componentsResponse.getMeta().getPagination());
        for (final Component component : componentsResponse.getData()) {
            validateComponent(component);
        }
    }

    @Test
    public void testReadComponent() {
        final ComponentResponse componentResponse = components.readComponent(1L);
        Assert.assertNotNull(componentResponse);
        validateComponent(componentResponse.getData());
    }

    private void validateComponent(final Component component) {
        Assert.assertNotNull(component);
        Assert.assertNotNull(component.getId());
        Assert.assertTrue(StringUtils.isNotBlank(component.getName()));
        Assert.assertNotNull(component.getCreated_at());
        Assert.assertNotNull(component.getUpdated_at());
    }
}

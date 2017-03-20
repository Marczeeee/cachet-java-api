package org.m323.cachet.api.v1.test;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.m323.cachet.api.v1.ComponentGroups;
import org.m323.cachet.api.v1.entity.Group;
import org.m323.cachet.api.v1.response.GroupResponse;
import org.m323.cachet.api.v1.response.GroupsResponse;
import org.m323.cachet.api.v1.test.util.CXFClientUtil;
import org.m323.cachet.api.v1.test.util.TestHelper;

/**
 * Tests the Group-related Cachet api functions.
 *
 * @since 0.1
 * @author Marczeeee
 */
public class TestComponentGroups {

    private static ComponentGroups componentGroups;

    @BeforeClass
    public static void beforeClass() {
        componentGroups = CXFClientUtil.createJaxRsClient(ComponentGroups.class);
    }

    @Test
    public void testFindAllGroups() {
        final GroupsResponse componentsResponse =
                componentGroups.findGroups(null, null, null, null);
        Assert.assertNotNull(componentsResponse);
        Assert.assertNotNull(componentsResponse.getData());
        Assert.assertNotNull(componentsResponse.getMeta());
        TestHelper.validatePagination(componentsResponse.getMeta().getPagination());
        for (final Group group : componentsResponse.getData()) {
            validateGroup(group);
        }
    }

    @Test
    public void testFindGroupsById() {
        final GroupsResponse groupsResponse = componentGroups.findGroups(1L, null, null, null);
        Assert.assertNotNull(groupsResponse);
        Assert.assertNotNull(groupsResponse.getData());
        Assert.assertNotNull(groupsResponse.getMeta());
        Assert.assertEquals(1L, groupsResponse.getData().size());
        TestHelper.validatePagination(groupsResponse.getMeta().getPagination());
        for (final Group group : groupsResponse.getData()) {
            validateGroup(group);
        }
    }

    @Test
    public void testReadGroup() {
        final GroupResponse groupResponse = componentGroups.readGroup(1L);
        Assert.assertNotNull(groupResponse);
        validateGroup(groupResponse.getData());
    }

    private void validateGroup(final Group component) {
        Assert.assertNotNull(component);
        Assert.assertNotNull(component.getId());
        Assert.assertTrue(StringUtils.isNotBlank(component.getName()));
        Assert.assertNotNull(component.getCreated_at());
        Assert.assertNotNull(component.getUpdated_at());
    }
}

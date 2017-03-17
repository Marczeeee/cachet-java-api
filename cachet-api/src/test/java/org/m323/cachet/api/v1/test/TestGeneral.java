package org.m323.cachet.api.v1.test;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.m323.cachet.api.v1.General;
import org.m323.cachet.api.v1.response.PingResponse;
import org.m323.cachet.api.v1.response.VersionResponse;
import org.m323.cachet.api.v1.test.util.CXFClientUtil;

/**
 * Tests the general Cachet api functions.
 *
 * @since 0.1
 * @author Marczeeee
 */
public class TestGeneral {

    @Test
    public void testPing() {
        final General general = CXFClientUtil.createJaxRsClient(General.class);
        final PingResponse pingResponse = general.ping();
        Assert.assertNotNull(pingResponse);
        Assert.assertEquals("Pong!", pingResponse.getData());
    }

    @Test
    public void testVersion() {
        final General general = CXFClientUtil.createJaxRsClient(General.class);
        final VersionResponse versionResponse = general.version();
        Assert.assertNotNull(versionResponse);
        Assert.assertNotNull(versionResponse.getData());
        Assert.assertTrue(StringUtils.isNotBlank(versionResponse.getData()));
        Assert.assertNotNull(versionResponse.getMeta());
        Assert.assertNotNull(versionResponse.getMeta().getLatest());
        Assert.assertTrue(
                StringUtils.isNotBlank(versionResponse.getMeta().getLatest().getTag_name()));
    }
}

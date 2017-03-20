package org.m323.cachet.api.v1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.m323.cachet.api.v1.response.PingResponse;
import org.m323.cachet.api.v1.response.VersionResponse;

/**
 * Interface of General functions of the Cachet api.
 *
 * @since 0.1
 * @author Marczeeee
 */
@Path("/api/v1")
@Produces(MediaType.APPLICATION_JSON)
public interface General {
    /**
     * Simply pings the Cachet server and returns the textual answer of the server.
     *
     * @return Reponse of the ping request
     */
    @GET
    @Path("/ping")
    PingResponse ping();

    /**
     * Queries the current version info of the Cachet server.
     *
     * @return Response containing Cachet version info
     */
    @GET
    @Path("/version")
    VersionResponse version();
}

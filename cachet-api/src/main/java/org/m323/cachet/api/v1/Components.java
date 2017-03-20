package org.m323.cachet.api.v1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.m323.cachet.api.v1.response.ComponentResponse;
import org.m323.cachet.api.v1.response.ComponentsResponse;

/**
 * Interface of Components related functions of the Cachet api.
 *
 * @author Marczeeee
 * @since 0.1
 *
 */
@Path("/api/v1/components")
@Produces(MediaType.APPLICATION_JSON)
public interface Components {
    /**
     * Find all Components matching the (optional) query parameters.
     *
     * @param id
     *            Optional ID parameter
     * @param name
     *            Optional name parameter
     * @param status
     *            Optional status parameter
     * @param group_id
     *            Optional Group ID parameter
     * @param enabled
     *            Optional enabled flag parameter
     * @return Response containing a (possibly empty) list of Components matching query parameters
     *         and meta data with pagination info.
     */
    @GET
    @Path("/")
    ComponentsResponse findComponents(
            @QueryParam("id") Long id,
            @QueryParam("name") String name,
            @QueryParam("status") String status,
            @QueryParam("group_id") Integer group_id,
            @QueryParam("enabled") Boolean enabled);

    /**
     * Reads one Component by it's unique ID.
     *
     * @param componentId
     *            Mandatory component identifier
     * @return Response containing the Component with the given ID, or contains <code>null</code> if
     *         no matching Component was found.
     */
    @GET
    @Path("/{componentId}")
    ComponentResponse readComponent(@PathParam("componentId") long componentId);
}

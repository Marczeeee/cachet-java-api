package org.m323.cachet.api.v1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.m323.cachet.api.v1.response.GroupResponse;
import org.m323.cachet.api.v1.response.GroupsResponse;

/**
 * Interface of Component Groups related functions of the Cachet api.
 *
 * @author Marczeeee
 * @since 0.1
 *
 */
@Path("/api/v1/components/groups")
@Produces(MediaType.APPLICATION_JSON)
public interface ComponentGroups {
    /**
     * Find all Groups matching the (optional) query parameters.
     * 
     * @param id
     *            Optional group ID parameter
     * @param name
     *            Optional name parameter
     * @param collapsed
     *            Optional collapsed parameter
     * @param visible
     *            Optional visible flag parameter
     * @return Response containing a (possibly empty) list of Groups matching query parameters and
     *         meta data with pagination info.
     */
    @GET
    @Path("/")
    GroupsResponse findGroups(
            @QueryParam("id") Long id,
            @QueryParam("name") String name,
            @QueryParam("collapsed") Integer collapsed,
            @QueryParam("visible") Boolean visible);

    /**
     * Reads one Group by it's unique ID.
     *
     * @param groupId
     *            Mandatory group ID parameter
     * @return Response containing the Group with the given ID, or contains <code>null</code> if no
     *         matching Group was found.
     */
    @GET
    @Path("/{groupId}")
    GroupResponse readGroup(@PathParam("groupId") long groupId);
}

package org.m323.cachet.api.v1.response;

import java.util.List;

import org.m323.cachet.api.v1.entity.Group;

/**
 * Response containing the {@link List} of {@link Group} object along with pagination details.
 *
 * @author Marczeeee
 * @since 0.1
 */
public class GroupsResponse {
    /** Pagination meta data. */
    private PaginationMetadata meta;
    /** {@link List} of resulting {@link Group} objects. */
    private List<Group> data;

    public PaginationMetadata getMeta() {
        return meta;
    }

    public void setMeta(final PaginationMetadata meta) {
        this.meta = meta;
    }

    public List<Group> getData() {
        return data;
    }

    public void setData(final List<Group> data) {
        this.data = data;
    }
}

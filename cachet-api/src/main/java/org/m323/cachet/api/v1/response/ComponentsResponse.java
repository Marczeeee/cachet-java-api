package org.m323.cachet.api.v1.response;

import java.util.List;

import org.m323.cachet.api.v1.entity.Component;

/**
 * Response containing the {@link List} of {@link Component} object along with pagination details.
 *
 * @author Marczeeee
 * @since 0.1
 */
public class ComponentsResponse {
    /** Pagination meta data. */
    private PaginationMetadata meta;
    /** {@link List} of resulting {@link Component} objects. */
    private List<Component> data;

    public PaginationMetadata getMeta() {
        return meta;
    }

    public void setMeta(final PaginationMetadata meta) {
        this.meta = meta;
    }

    public List<Component> getData() {
        return data;
    }

    public void setData(final List<Component> data) {
        this.data = data;
    }
}

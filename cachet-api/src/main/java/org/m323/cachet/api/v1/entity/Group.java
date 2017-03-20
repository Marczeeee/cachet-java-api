package org.m323.cachet.api.v1.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Cachet (component) group entity.
 *
 * @author Marczeeee
 * @since 0.1
 *
 */
public class Group implements Serializable {
    /** Unique group ID value. */
    private long id;
    /** Group name value. */
    private String name;
    /** {@link Date} of creation. */
    private Date created_at;
    /** {@link Date} of last modification. */
    private Date updated_at;
    /** Ordering value. */
    private int order;
    /** Flag indication default collapse status. */
    private int collapsed;

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(final Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(final Date updated_at) {
        this.updated_at = updated_at;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(final int order) {
        this.order = order;
    }

    public int getCollapsed() {
        return collapsed;
    }

    public void setCollapsed(final int collapsed) {
        this.collapsed = collapsed;
    }
}

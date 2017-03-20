package org.m323.cachet.api.v1.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Cachet component entity.
 *
 * @author Marczeeee
 * @since 0.1
 *
 */
public class Component implements Serializable {
    /** Unique component ID. */
    private long id;
    /** Component name value. */
    private String name;
    /** Component description value. */
    private String description;
    /** Web link of the component. */
    private String link;
    /** Current component status. */
    private int status;
    /** Ordering value. */
    private int order;
    /** ID of the group the component belongs to. */
    private int group_id;
    /** {@link Date} of creation. */
    private Date created_at;
    /** {@link Date} of last modification. */
    private Date updated_at;
    /** {@link Date} of deletion. */
    private Date deleted_at;
    /** Name of current status. */
    private String status_name;
    /** Flag indicating if component is enabled or not. */
    private boolean enabled;

    // TODO: Add missing Tags field

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

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(final String link) {
        this.link = link;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(final int status) {
        this.status = status;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(final int order) {
        this.order = order;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(final int group_id) {
        this.group_id = group_id;
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

    public Date getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(final Date deleted_at) {
        this.deleted_at = deleted_at;
    }

    public String getStatus_name() {
        return status_name;
    }

    public void setStatus_name(final String status_name) {
        this.status_name = status_name;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(final boolean enabled) {
        this.enabled = enabled;
    }
}

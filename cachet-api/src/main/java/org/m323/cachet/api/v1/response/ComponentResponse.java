package org.m323.cachet.api.v1.response;

import java.io.Serializable;

import org.m323.cachet.api.v1.entity.Component;

/**
 * Response containing a single Cachet {@link Component}.
 *
 * @author Marczeeee
 * @since 0.1
 */
public class ComponentResponse implements Serializable {
    /** {@link Component} object. */
    private Component data;

    public Component getData() {
        return data;
    }

    public void setData(final Component data) {
        this.data = data;
    }
}

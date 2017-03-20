package org.m323.cachet.api.v1.response;

import java.io.Serializable;

import org.m323.cachet.api.v1.entity.Group;

/**
 * Response containing a single Cachet {@link Group}.
 *
 * @author Marczeeee
 * @since 0.1
 */
public class GroupResponse implements Serializable {
    /** {@link Group} object */
    private Group data;

    public Group getData() {
        return data;
    }

    public void setData(final Group data) {
        this.data = data;
    }
}

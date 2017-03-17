package org.m323.cachet.api.v1.response;

import java.io.Serializable;

/**
 * Response class for the <i>ping</i> command. Contains simply a {@link #data} field.
 *
 * @since 0.1
 * @author Marczeeee
 *
 */
public class PingResponse implements Serializable {
    /** Textual ping response value. */
    private String data;

    public void setData(final String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}

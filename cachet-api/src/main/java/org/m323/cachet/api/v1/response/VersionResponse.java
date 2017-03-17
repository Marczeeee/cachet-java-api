package org.m323.cachet.api.v1.response;

import java.io.Serializable;

/**
 * Reponse class for the <i>version</i> command.
 *
 * @author Marczeeee
 * @since 0.1
 *
 */
public class VersionResponse implements Serializable {
    /** Textual version value. */
    private String data;
    /** Version metadata. */
    private VersionMeta meta;

    public String getData() {
        return data;
    }

    public void setData(final String data) {
        this.data = data;
    }

    public VersionMeta getMeta() {
        return meta;
    }

    public void setMeta(final VersionMeta meta) {
        this.meta = meta;
    }

    /**
     * Contains version metadata information.
     *
     * @author Marczeeee
     * @since 0.1
     *
     */
    public class VersionMeta implements Serializable {
        /** Flag indicating being on the latest version. */
        private boolean on_latest;
        /** Latest version metadata. */
        private LatestVersionInfo latest;

        public VersionMeta() {
            super();
        }

        public boolean isOn_latest() {
            return on_latest;
        }

        public void setOn_latest(final boolean on_latest) {
            this.on_latest = on_latest;
        }

        public LatestVersionInfo getLatest() {
            return latest;
        }

        public void setLatest(final LatestVersionInfo latest) {
            this.latest = latest;
        }

        /**
         * Contains version metadata information of the latest version.
         *
         * @author Marczeeee
         * @since 0.1
         *
         */
        public class LatestVersionInfo implements Serializable {
            /** Tag name of the latest version. */
            private String tag_name;
            /** Flag indicating of pre-release status. */
            private boolean prelease;
            /** Flag indicating of draft status. */
            private boolean draft;

            public LatestVersionInfo() {
                super();
            }

            public String getTag_name() {
                return tag_name;
            }

            public void setTag_name(final String tag_name) {
                this.tag_name = tag_name;
            }

            public boolean isPrelease() {
                return prelease;
            }

            public void setPrelease(final boolean prelease) {
                this.prelease = prelease;
            }

            public boolean isDraft() {
                return draft;
            }

            public void setDraft(final boolean draft) {
                this.draft = draft;
            }
        }
    }
}

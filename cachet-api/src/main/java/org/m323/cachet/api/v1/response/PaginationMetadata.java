package org.m323.cachet.api.v1.response;

import java.io.Serializable;

/**
 * Meta data class containing pagination data.
 *
 * @author Marczeeee
 * @since 0.1
 *
 */
public class PaginationMetadata implements Serializable {
    /** Pagination data object. */
    private PaginationData pagination;

    public PaginationData getPagination() {
        return pagination;
    }

    public void setPagination(final PaginationData pagination) {
        this.pagination = pagination;
    }

    /**
     * Class containing pagination data.
     *
     * @author Marczeeee
     * @since 0.1
     *
     */
    public class PaginationData implements Serializable {
        /** Total number of records. */
        private int total;
        /** Number of counted records */
        private int count;
        /** Records displayed on one page. */
        private int per_page;
        /** Current page number. */
        private int current_page;
        /** Total number of pages. */
        private int total_pages;
        /** {@link Links} object. */
        private Links links;

        /** Ctor. */
        public PaginationData() {
            super();
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(final int total) {
            this.total = total;
        }

        public int getCount() {
            return count;
        }

        public void setCount(final int count) {
            this.count = count;
        }

        public int getPer_page() {
            return per_page;
        }

        public void setPer_page(final int per_page) {
            this.per_page = per_page;
        }

        public int getCurrent_page() {
            return current_page;
        }

        public void setCurrent_page(final int current_page) {
            this.current_page = current_page;
        }

        public int getTotal_pages() {
            return total_pages;
        }

        public void setTotal_pages(final int total_pages) {
            this.total_pages = total_pages;
        }

        public Links getLinks() {
            return links;
        }

        public void setLinks(final Links links) {
            this.links = links;
        }

        /**
         * Class containing pagination links.
         *
         * @author Marczeeee
         * @since 0.1
         */
        public class Links implements Serializable {
            /** Next page number. */
            private Integer next_page;
            /** Previous page number. */
            private Integer previous_page;

            /** Ctor. */
            public Links() {
                super();
            }

            public Integer getNext_page() {
                return next_page;
            }

            public void setNext_page(final Integer next_page) {
                this.next_page = next_page;
            }

            public Integer getPrevious_page() {
                return previous_page;
            }

            public void setPrevious_page(final Integer previous_page) {
                this.previous_page = previous_page;
            }
        }
    }
}

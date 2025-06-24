package org.kie.kogito.openapi.backstagecatalog.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Location  {

    private String id;
    private String type;
    private String target;
    private String presence;

    /**
    * Get id
    * @return id
    **/
    @JsonProperty("id")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Set id
     **/
    public void setId(String id) {
        this.id = id;
    }

    public Location id(String id) {
        this.id = id;
        return this;
    }

    /**
    * Get type
    * @return type
    **/
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Set type
     **/
    public void setType(String type) {
        this.type = type;
    }

    public Location type(String type) {
        this.type = type;
        return this;
    }

    /**
    * Get target
    * @return target
    **/
    @JsonProperty("target")
    public String getTarget() {
        return target;
    }

    /**
     * Set target
     **/
    public void setTarget(String target) {
        this.target = target;
    }

    public Location target(String target) {
        this.target = target;
        return this;
    }

    /**
    * Get presence
    * @return presence
    **/
    @JsonProperty("presence")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public String getPresence() {
        return presence;
    }

    /**
     * Set presence
     **/
    public void setPresence(String presence) {
        this.presence = presence;
    }

    public Location presence(String presence) {
        this.presence = presence;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Location {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    presence: ").append(toIndentedString(presence)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private static String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class LocationQueryParam  {

        @jakarta.ws.rs.QueryParam("id")
        private String id;
        @jakarta.ws.rs.QueryParam("type")
        private String type;
        @jakarta.ws.rs.QueryParam("target")
        private String target;
        @jakarta.ws.rs.QueryParam("presence")
        private String presence;

        /**
        * Get id
        * @return id
        **/
        @JsonProperty("id")
        public String getId() {
            return id;
        }

        /**
         * Set id
         **/
        public void setId(String id) {
            this.id = id;
        }

        public LocationQueryParam id(String id) {
            this.id = id;
            return this;
        }

        /**
        * Get type
        * @return type
        **/
        @JsonProperty("type")
        public String getType() {
            return type;
        }

        /**
         * Set type
         **/
        public void setType(String type) {
            this.type = type;
        }

        public LocationQueryParam type(String type) {
            this.type = type;
            return this;
        }

        /**
        * Get target
        * @return target
        **/
        @JsonProperty("target")
        public String getTarget() {
            return target;
        }

        /**
         * Set target
         **/
        public void setTarget(String target) {
            this.target = target;
        }

        public LocationQueryParam target(String target) {
            this.target = target;
            return this;
        }

        /**
        * Get presence
        * @return presence
        **/
        @JsonProperty("presence")
        public String getPresence() {
            return presence;
        }

        /**
         * Set presence
         **/
        public void setPresence(String presence) {
            this.presence = presence;
        }

        public LocationQueryParam presence(String presence) {
            this.presence = presence;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class LocationQueryParam {\n");

            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    target: ").append(toIndentedString(target)).append("\n");
            sb.append("    presence: ").append(toIndentedString(presence)).append("\n");
            sb.append("}");
            return sb.toString();
        }

        /**
         * Convert the given object to string with each line indented by 4 spaces
         * (except the first line).
         */
        private static String toIndentedString(Object o) {
            if (o == null) {
                return "null";
            }
            return o.toString().replace("\n", "\n    ");
        }
    }
}
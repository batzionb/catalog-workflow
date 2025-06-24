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
public class LocationSpec  {

    private String type;
    private String target;

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

    public LocationSpec type(String type) {
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

    public LocationSpec target(String target) {
        this.target = target;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocationSpec {\n");

        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        
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
    public static class LocationSpecQueryParam  {

        @jakarta.ws.rs.QueryParam("type")
        private String type;
        @jakarta.ws.rs.QueryParam("target")
        private String target;

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

        public LocationSpecQueryParam type(String type) {
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

        public LocationSpecQueryParam target(String target) {
            this.target = target;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class LocationSpecQueryParam {\n");

            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
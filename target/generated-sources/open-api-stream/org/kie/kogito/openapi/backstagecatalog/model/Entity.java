package org.kie.kogito.openapi.backstagecatalog.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Entity  {

    private String apiVersion;
    private String kind;
    private Object metadata;
    private Object spec;
    private List<Object> relations;

    /**
    * Get apiVersion
    * @return apiVersion
    **/
    @JsonProperty("apiVersion")
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * Set apiVersion
     **/
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Entity apiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
    * Get kind
    * @return kind
    **/
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * Set kind
     **/
    public void setKind(String kind) {
        this.kind = kind;
    }

    public Entity kind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
    * Get metadata
    * @return metadata
    **/
    @JsonProperty("metadata")
    public Object getMetadata() {
        return metadata;
    }

    /**
     * Set metadata
     **/
    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    public Entity metadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
    * Get spec
    * @return spec
    **/
    @JsonProperty("spec")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public Object getSpec() {
        return spec;
    }

    /**
     * Set spec
     **/
    public void setSpec(Object spec) {
        this.spec = spec;
    }

    public Entity spec(Object spec) {
        this.spec = spec;
        return this;
    }

    /**
    * Get relations
    * @return relations
    **/
    @JsonProperty("relations")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Object> getRelations() {
        return relations;
    }

    /**
     * Set relations
     **/
    public void setRelations(List<Object> relations) {
        this.relations = relations;
    }

    public Entity relations(List<Object> relations) {
        this.relations = relations;
        return this;
    }
    public Entity addRelationsItem(Object relationsItem) {
        if (this.relations == null){
            relations = new ArrayList<>();
        }
        this.relations.add(relationsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Entity {\n");

        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    relations: ").append(toIndentedString(relations)).append("\n");
        
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
    public static class EntityQueryParam  {

        @jakarta.ws.rs.QueryParam("apiVersion")
        private String apiVersion;
        @jakarta.ws.rs.QueryParam("kind")
        private String kind;
        @jakarta.ws.rs.QueryParam("metadata")
        private Object metadata;
        @jakarta.ws.rs.QueryParam("spec")
        private Object spec;
        @jakarta.ws.rs.QueryParam("relations")
        private List<Object> relations = null;

        /**
        * Get apiVersion
        * @return apiVersion
        **/
        @JsonProperty("apiVersion")
        public String getApiVersion() {
            return apiVersion;
        }

        /**
         * Set apiVersion
         **/
        public void setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
        }

        public EntityQueryParam apiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        /**
        * Get kind
        * @return kind
        **/
        @JsonProperty("kind")
        public String getKind() {
            return kind;
        }

        /**
         * Set kind
         **/
        public void setKind(String kind) {
            this.kind = kind;
        }

        public EntityQueryParam kind(String kind) {
            this.kind = kind;
            return this;
        }

        /**
        * Get metadata
        * @return metadata
        **/
        @JsonProperty("metadata")
        public Object getMetadata() {
            return metadata;
        }

        /**
         * Set metadata
         **/
        public void setMetadata(Object metadata) {
            this.metadata = metadata;
        }

        public EntityQueryParam metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
        * Get spec
        * @return spec
        **/
        @JsonProperty("spec")
        public Object getSpec() {
            return spec;
        }

        /**
         * Set spec
         **/
        public void setSpec(Object spec) {
            this.spec = spec;
        }

        public EntityQueryParam spec(Object spec) {
            this.spec = spec;
            return this;
        }

        /**
        * Get relations
        * @return relations
        **/
        @JsonProperty("relations")
        public List<Object> getRelations() {
            return relations;
        }

        /**
         * Set relations
         **/
        public void setRelations(List<Object> relations) {
            this.relations = relations;
        }

        public EntityQueryParam relations(List<Object> relations) {
            this.relations = relations;
            return this;
        }
        public EntityQueryParam addRelationsItem(Object relationsItem) {
            this.relations.add(relationsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class EntityQueryParam {\n");

            sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
            sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
            sb.append("    relations: ").append(toIndentedString(relations)).append("\n");
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
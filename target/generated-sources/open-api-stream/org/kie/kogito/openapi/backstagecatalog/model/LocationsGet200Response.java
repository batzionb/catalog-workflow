package org.kie.kogito.openapi.backstagecatalog.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.kie.kogito.openapi.backstagecatalog.model.Location;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationsGet200Response  {

    private List<Location> items;

    /**
    * Get items
    * @return items
    **/
    @JsonProperty("items")
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    public List<Location> getItems() {
        return items;
    }

    /**
     * Set items
     **/
    public void setItems(List<Location> items) {
        this.items = items;
    }

    public LocationsGet200Response items(List<Location> items) {
        this.items = items;
        return this;
    }
    public LocationsGet200Response addItemsItem(Location itemsItem) {
        if (this.items == null){
            items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocationsGet200Response {\n");

        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        
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
    public static class LocationsGet200ResponseQueryParam  {

        @jakarta.ws.rs.QueryParam("items")
        private List<Location> items = null;

        /**
        * Get items
        * @return items
        **/
        @JsonProperty("items")
        public List<Location> getItems() {
            return items;
        }

        /**
         * Set items
         **/
        public void setItems(List<Location> items) {
            this.items = items;
        }

        public LocationsGet200ResponseQueryParam items(List<Location> items) {
            this.items = items;
            return this;
        }
        public LocationsGet200ResponseQueryParam addItemsItem(Location itemsItem) {
            this.items.add(itemsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class LocationsGet200ResponseQueryParam {\n");

            sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
//
// Automatically generated.
//
package net.juniper.tungsten.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.tungsten.api.ApiPropertyBase;

public class RouteFilterProperties extends ApiPropertyBase {
    String route;
    String route_type;
    String route_type_value;
    public RouteFilterProperties() {
    }
    public RouteFilterProperties(String route, String route_type, String route_type_value) {
        this.route = route;
        this.route_type = route_type;
        this.route_type_value = route_type_value;
    }
    public RouteFilterProperties(String route) {
        this(route, null, null);    }
    public RouteFilterProperties(String route, String route_type) {
        this(route, route_type, null);    }
    
    public String getRoute() {
        return route;
    }
    
    public void setRoute(String route) {
        this.route = route;
    }
    
    
    public String getRouteType() {
        return route_type;
    }
    
    public void setRouteType(String route_type) {
        this.route_type = route_type;
    }
    
    
    public String getRouteTypeValue() {
        return route_type_value;
    }
    
    public void setRouteTypeValue(String route_type_value) {
        this.route_type_value = route_type_value;
    }
    
}

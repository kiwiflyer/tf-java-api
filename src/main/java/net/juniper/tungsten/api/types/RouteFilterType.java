//
// Automatically generated.
//
package net.juniper.tungsten.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.tungsten.api.ApiPropertyBase;

public class RouteFilterType extends ApiPropertyBase {
    List<RouteFilterProperties> route_filter_properties;
    public RouteFilterType() {
    }
    public RouteFilterType(List<RouteFilterProperties> route_filter_properties) {
        this.route_filter_properties = route_filter_properties;
    }
    
    public List<RouteFilterProperties> getRouteFilterProperties() {
        return route_filter_properties;
    }
    
    
    public void addRouteFilterProperties(RouteFilterProperties obj) {
        if (route_filter_properties == null) {
            route_filter_properties = new ArrayList<RouteFilterProperties>();
        }
        route_filter_properties.add(obj);
    }
    public void clearRouteFilterProperties() {
        route_filter_properties = null;
    }
    
    
    public void addRouteFilterProperties(String route, String route_type, String route_type_value) {
        if (route_filter_properties == null) {
            route_filter_properties = new ArrayList<RouteFilterProperties>();
        }
        route_filter_properties.add(new RouteFilterProperties(route, route_type, route_type_value));
    }
    
}

//
// Automatically generated.
//
package net.juniper.tungsten.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.tungsten.api.ApiPropertyBase;

public class PrefixListMatchType extends ApiPropertyBase {
    List<String> interface_route_table_uuid;
    String prefix_type;
    public PrefixListMatchType() {
    }
    public PrefixListMatchType(List<String> interface_route_table_uuid, String prefix_type) {
        this.interface_route_table_uuid = interface_route_table_uuid;
        this.prefix_type = prefix_type;
    }
    public PrefixListMatchType(List<String> interface_route_table_uuid) {
        this(interface_route_table_uuid, null);    }
    
    public String getPrefixType() {
        return prefix_type;
    }
    
    public void setPrefixType(String prefix_type) {
        this.prefix_type = prefix_type;
    }
    
    
    public List<String> getInterfaceRouteTableUuid() {
        return interface_route_table_uuid;
    }
    
    
    public void addInterfaceRouteTableUuid(String obj) {
        if (interface_route_table_uuid == null) {
            interface_route_table_uuid = new ArrayList<String>();
        }
        interface_route_table_uuid.add(obj);
    }
    public void clearInterfaceRouteTableUuid() {
        interface_route_table_uuid = null;
    }
    
}

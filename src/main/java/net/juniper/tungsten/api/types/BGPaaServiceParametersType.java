//
// Automatically generated.
//
package net.juniper.tungsten.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.tungsten.api.ApiPropertyBase;

public class BGPaaServiceParametersType extends ApiPropertyBase {
    Integer port_start;
    Integer port_end;
    public BGPaaServiceParametersType() {
    }
    public BGPaaServiceParametersType(Integer port_start, Integer port_end) {
        this.port_start = port_start;
        this.port_end = port_end;
    }
    public BGPaaServiceParametersType(Integer port_start) {
        this(port_start, 50512);    }
    
    public Integer getPortStart() {
        return port_start;
    }
    
    public void setPortStart(Integer port_start) {
        this.port_start = port_start;
    }
    
    
    public Integer getPortEnd() {
        return port_end;
    }
    
    public void setPortEnd(Integer port_end) {
        this.port_end = port_end;
    }
    
}

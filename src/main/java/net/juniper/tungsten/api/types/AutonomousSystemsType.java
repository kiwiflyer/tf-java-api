//
// Automatically generated.
//
package net.juniper.tungsten.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.tungsten.api.ApiPropertyBase;

public class AutonomousSystemsType extends ApiPropertyBase {
    List<Integer> asn;
    public AutonomousSystemsType() {
    }
    public AutonomousSystemsType(List<Integer> asn) {
        this.asn = asn;
    }
    
    public List<Integer> getAsn() {
        return asn;
    }
    
    
    public void addAsn(Integer obj) {
        if (asn == null) {
            asn = new ArrayList<Integer>();
        }
        asn.add(obj);
    }
    public void clearAsn() {
        asn = null;
    }
    
}

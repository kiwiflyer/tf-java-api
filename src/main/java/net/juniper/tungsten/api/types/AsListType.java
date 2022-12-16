//
// Automatically generated.
//
package net.juniper.tungsten.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.tungsten.api.ApiPropertyBase;

public class AsListType extends ApiPropertyBase {
    List<Integer> asn_list;
    public AsListType() {
    }
    public AsListType(List<Integer> asn_list) {
        this.asn_list = asn_list;
    }
    
    public List<Integer> getAsnList() {
        return asn_list;
    }
    
    
    public void addAsn(Integer obj) {
        if (asn_list == null) {
            asn_list = new ArrayList<Integer>();
        }
        asn_list.add(obj);
    }
    public void clearAsn() {
        asn_list = null;
    }
    
}

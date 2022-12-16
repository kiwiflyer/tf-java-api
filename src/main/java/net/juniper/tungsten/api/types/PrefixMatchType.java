//
// Automatically generated.
//
package net.juniper.tungsten.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.tungsten.api.ApiPropertyBase;

public class PrefixMatchType extends ApiPropertyBase {
    String prefix;
    String prefix_type;
    public PrefixMatchType() {
    }
    public PrefixMatchType(String prefix, String prefix_type) {
        this.prefix = prefix;
        this.prefix_type = prefix_type;
    }
    public PrefixMatchType(String prefix) {
        this(prefix, null);    }
    
    public String getPrefix() {
        return prefix;
    }
    
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    
    
    public String getPrefixType() {
        return prefix_type;
    }
    
    public void setPrefixType(String prefix_type) {
        this.prefix_type = prefix_type;
    }
    
}

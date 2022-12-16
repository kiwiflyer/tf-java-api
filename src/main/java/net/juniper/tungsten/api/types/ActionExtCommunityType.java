//
// Automatically generated.
//
package net.juniper.tungsten.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.tungsten.api.ApiPropertyBase;

public class ActionExtCommunityType extends ApiPropertyBase {
    ExtCommunityListType add;
    ExtCommunityListType remove;
    ExtCommunityListType set;
    public ActionExtCommunityType() {
    }
    public ActionExtCommunityType(ExtCommunityListType add, ExtCommunityListType remove, ExtCommunityListType set) {
        this.add = add;
        this.remove = remove;
        this.set = set;
    }
    public ActionExtCommunityType(ExtCommunityListType add) {
        this(add, null, null);    }
    public ActionExtCommunityType(ExtCommunityListType add, ExtCommunityListType remove) {
        this(add, remove, null);    }
    
    public ExtCommunityListType getAdd() {
        return add;
    }
    
    public void setAdd(ExtCommunityListType add) {
        this.add = add;
    }
    
    
    public ExtCommunityListType getRemove() {
        return remove;
    }
    
    public void setRemove(ExtCommunityListType remove) {
        this.remove = remove;
    }
    
    
    public ExtCommunityListType getSet() {
        return set;
    }
    
    public void setSet(ExtCommunityListType set) {
        this.set = set;
    }
    
}

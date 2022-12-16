//
// Automatically generated.
//
package net.juniper.tungsten.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.tungsten.api.ApiPropertyBase;

public class ActionCommunityType extends ApiPropertyBase {
    CommunityListType add;
    CommunityListType remove;
    CommunityListType set;
    public ActionCommunityType() {
    }
    public ActionCommunityType(CommunityListType add, CommunityListType remove, CommunityListType set) {
        this.add = add;
        this.remove = remove;
        this.set = set;
    }
    public ActionCommunityType(CommunityListType add) {
        this(add, null, null);    }
    public ActionCommunityType(CommunityListType add, CommunityListType remove) {
        this(add, remove, null);    }
    
    public CommunityListType getAdd() {
        return add;
    }
    
    public void setAdd(CommunityListType add) {
        this.add = add;
    }
    
    
    public CommunityListType getRemove() {
        return remove;
    }
    
    public void setRemove(CommunityListType remove) {
        this.remove = remove;
    }
    
    
    public CommunityListType getSet() {
        return set;
    }
    
    public void setSet(CommunityListType set) {
        this.set = set;
    }
    
}

//
// Automatically generated.
//
package net.juniper.tungsten.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.tungsten.api.ApiPropertyBase;

public class ActionUpdateType extends ApiPropertyBase {
    ActionAsPathType as_path;
    ActionCommunityType community;
    ActionExtCommunityType extcommunity;
    Integer local_pref;
    Integer med;
    public ActionUpdateType() {
    }
    public ActionUpdateType(ActionAsPathType as_path, ActionCommunityType community, ActionExtCommunityType extcommunity, Integer local_pref, Integer med) {
        this.as_path = as_path;
        this.community = community;
        this.extcommunity = extcommunity;
        this.local_pref = local_pref;
        this.med = med;
    }
    public ActionUpdateType(ActionAsPathType as_path) {
        this(as_path, null, null, null, null);    }
    public ActionUpdateType(ActionAsPathType as_path, ActionCommunityType community) {
        this(as_path, community, null, null, null);    }
    public ActionUpdateType(ActionAsPathType as_path, ActionCommunityType community, ActionExtCommunityType extcommunity) {
        this(as_path, community, extcommunity, null, null);    }
    public ActionUpdateType(ActionAsPathType as_path, ActionCommunityType community, ActionExtCommunityType extcommunity, Integer local_pref) {
        this(as_path, community, extcommunity, local_pref, null);    }
    
    public ActionAsPathType getAsPath() {
        return as_path;
    }
    
    public void setAsPath(ActionAsPathType as_path) {
        this.as_path = as_path;
    }
    
    
    public ActionCommunityType getCommunity() {
        return community;
    }
    
    public void setCommunity(ActionCommunityType community) {
        this.community = community;
    }
    
    
    public ActionExtCommunityType getExtcommunity() {
        return extcommunity;
    }
    
    public void setExtcommunity(ActionExtCommunityType extcommunity) {
        this.extcommunity = extcommunity;
    }
    
    
    public Integer getLocalPref() {
        return local_pref;
    }
    
    public void setLocalPref(Integer local_pref) {
        this.local_pref = local_pref;
    }
    
    
    public Integer getMed() {
        return med;
    }
    
    public void setMed(Integer med) {
        this.med = med;
    }
    
}

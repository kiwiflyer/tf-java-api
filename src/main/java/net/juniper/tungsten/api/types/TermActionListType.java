//
// Automatically generated.
//
package net.juniper.tungsten.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.tungsten.api.ApiPropertyBase;

public class TermActionListType extends ApiPropertyBase {
    ActionUpdateType update;
    String action;
    String action_next_value;
    String external;
    String as_path_expand;
    String as_path_prepend;
    public TermActionListType() {
    }
    public TermActionListType(ActionUpdateType update, String action, String action_next_value, String external, String as_path_expand, String as_path_prepend) {
        this.update = update;
        this.action = action;
        this.action_next_value = action_next_value;
        this.external = external;
        this.as_path_expand = as_path_expand;
        this.as_path_prepend = as_path_prepend;
    }
    public TermActionListType(ActionUpdateType update) {
        this(update, null, null, null, null, null);    }
    public TermActionListType(ActionUpdateType update, String action) {
        this(update, action, null, null, null, null);    }
    public TermActionListType(ActionUpdateType update, String action, String action_next_value) {
        this(update, action, action_next_value, null, null, null);    }
    public TermActionListType(ActionUpdateType update, String action, String action_next_value, String external) {
        this(update, action, action_next_value, external, null, null);    }
    public TermActionListType(ActionUpdateType update, String action, String action_next_value, String external, String as_path_expand) {
        this(update, action, action_next_value, external, as_path_expand, null);    }
    
    public ActionUpdateType getUpdate() {
        return update;
    }
    
    public void setUpdate(ActionUpdateType update) {
        this.update = update;
    }
    
    
    public String getAction() {
        return action;
    }
    
    public void setAction(String action) {
        this.action = action;
    }
    
    
    public String getActionNextValue() {
        return action_next_value;
    }
    
    public void setActionNextValue(String action_next_value) {
        this.action_next_value = action_next_value;
    }
    
    
    public String getExternal() {
        return external;
    }
    
    public void setExternal(String external) {
        this.external = external;
    }
    
    
    public String getAsPathExpand() {
        return as_path_expand;
    }
    
    public void setAsPathExpand(String as_path_expand) {
        this.as_path_expand = as_path_expand;
    }
    
    
    public String getAsPathPrepend() {
        return as_path_prepend;
    }
    
    public void setAsPathPrepend(String as_path_prepend) {
        this.as_path_prepend = as_path_prepend;
    }
    
}

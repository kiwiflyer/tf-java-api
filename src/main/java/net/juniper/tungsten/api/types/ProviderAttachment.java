//
// Automatically generated.
//
package net.juniper.tungsten.api.types;

import java.util.List;
import java.util.ArrayList;
import com.google.common.collect.Lists;

import net.juniper.tungsten.api.ApiObjectBase;
import net.juniper.tungsten.api.ApiPropertyBase;
import net.juniper.tungsten.api.ObjectReference;

public class ProviderAttachment extends ApiObjectBase {
    private IdPermsType id_perms;
    private PermType2 perms2;
    private KeyValuePairs annotations;
    private String display_name;
    private List<ObjectReference<ApiPropertyBase>> virtual_router_refs;
    private List<ObjectReference<ApiPropertyBase>> tag_refs;

    @Override
    public String getObjectType() {
        return "provider-attachment";
    }

    @Override
    public List<String> getDefaultParent() {
        return Lists.newArrayList();
    }

    @Override
    public String getDefaultParentType() {
        return null;
    }
    
    public IdPermsType getIdPerms() {
        return id_perms;
    }
    
    public void setIdPerms(IdPermsType id_perms) {
        this.id_perms = id_perms;
    }
    
    
    public PermType2 getPerms2() {
        return perms2;
    }
    
    public void setPerms2(PermType2 perms2) {
        this.perms2 = perms2;
    }
    
    
    public KeyValuePairs getAnnotations() {
        return annotations;
    }
    
    public void setAnnotations(KeyValuePairs annotations) {
        this.annotations = annotations;
    }
    
    
    public String getDisplayName() {
        return display_name;
    }
    
    public void setDisplayName(String display_name) {
        this.display_name = display_name;
    }
    

    public List<ObjectReference<ApiPropertyBase>> getVirtualRouter() {
        return virtual_router_refs;
    }

    public void setVirtualRouter(VirtualRouter obj) {
        virtual_router_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        virtual_router_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null, null, obj.getUuid()));
    }
    
    public void addVirtualRouter(VirtualRouter obj) {
        if (virtual_router_refs == null) {
            virtual_router_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        virtual_router_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null, null, obj.getUuid()));
    }
    
    public void removeVirtualRouter(VirtualRouter obj) {
        if (virtual_router_refs != null) {
            virtual_router_refs.remove(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
        }
    }

    public void clearVirtualRouter() {
        if (virtual_router_refs != null) {
            virtual_router_refs.clear();
            return;
        }
        virtual_router_refs = null;
    }

    public List<ObjectReference<ApiPropertyBase>> getTag() {
        return tag_refs;
    }

    public void setTag(Tag obj) {
        tag_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        tag_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null, null, obj.getUuid()));
    }
    
    public void addTag(Tag obj) {
        if (tag_refs == null) {
            tag_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        tag_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null, null, obj.getUuid()));
    }
    
    public void removeTag(Tag obj) {
        if (tag_refs != null) {
            tag_refs.remove(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
        }
    }

    public void clearTag() {
        if (tag_refs != null) {
            tag_refs.clear();
            return;
        }
        tag_refs = null;
    }
}
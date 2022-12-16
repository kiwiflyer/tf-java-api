//
// Automatically generated.
//
package net.juniper.tungsten.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.tungsten.api.ApiPropertyBase;

public class TermMatchConditionType extends ApiPropertyBase {
    List<String> protocol;
    List<PrefixMatchType> prefix;
    String community;
    List<String> community_list;
    Boolean community_match_all;
    List<String> extcommunity_list;
    Boolean extcommunity_match_all;
    String family;
    List<Integer> as_path;
    String external;
    Integer local_pref;
    List<Integer> nlri_route_type;
    List<PrefixListMatchType> prefix_list;
    RouteFilterType route_filter;
    public TermMatchConditionType() {
    }
    public TermMatchConditionType(List<String> protocol, List<PrefixMatchType> prefix, String community, List<String> community_list, Boolean community_match_all, List<String> extcommunity_list, Boolean extcommunity_match_all, String family, List<Integer> as_path, String external, Integer local_pref, List<Integer> nlri_route_type, List<PrefixListMatchType> prefix_list, RouteFilterType route_filter) {
        this.protocol = protocol;
        this.prefix = prefix;
        this.community = community;
        this.community_list = community_list;
        this.community_match_all = community_match_all;
        this.extcommunity_list = extcommunity_list;
        this.extcommunity_match_all = extcommunity_match_all;
        this.family = family;
        this.as_path = as_path;
        this.external = external;
        this.local_pref = local_pref;
        this.nlri_route_type = nlri_route_type;
        this.prefix_list = prefix_list;
        this.route_filter = route_filter;
    }
    public TermMatchConditionType(List<String> protocol) {
        this(protocol, null, null, null, null, null, null, null, null, null, null, null, null, null);    }
    public TermMatchConditionType(List<String> protocol, List<PrefixMatchType> prefix) {
        this(protocol, prefix, null, null, null, null, null, null, null, null, null, null, null, null);    }
    public TermMatchConditionType(List<String> protocol, List<PrefixMatchType> prefix, String community) {
        this(protocol, prefix, community, null, null, null, null, null, null, null, null, null, null, null);    }
    public TermMatchConditionType(List<String> protocol, List<PrefixMatchType> prefix, String community, List<String> community_list) {
        this(protocol, prefix, community, community_list, null, null, null, null, null, null, null, null, null, null);    }
    public TermMatchConditionType(List<String> protocol, List<PrefixMatchType> prefix, String community, List<String> community_list, Boolean community_match_all) {
        this(protocol, prefix, community, community_list, community_match_all, null, null, null, null, null, null, null, null, null);    }
    public TermMatchConditionType(List<String> protocol, List<PrefixMatchType> prefix, String community, List<String> community_list, Boolean community_match_all, List<String> extcommunity_list) {
        this(protocol, prefix, community, community_list, community_match_all, extcommunity_list, null, null, null, null, null, null, null, null);    }
    public TermMatchConditionType(List<String> protocol, List<PrefixMatchType> prefix, String community, List<String> community_list, Boolean community_match_all, List<String> extcommunity_list, Boolean extcommunity_match_all) {
        this(protocol, prefix, community, community_list, community_match_all, extcommunity_list, extcommunity_match_all, null, null, null, null, null, null, null);    }
    public TermMatchConditionType(List<String> protocol, List<PrefixMatchType> prefix, String community, List<String> community_list, Boolean community_match_all, List<String> extcommunity_list, Boolean extcommunity_match_all, String family) {
        this(protocol, prefix, community, community_list, community_match_all, extcommunity_list, extcommunity_match_all, family, null, null, null, null, null, null);    }
    public TermMatchConditionType(List<String> protocol, List<PrefixMatchType> prefix, String community, List<String> community_list, Boolean community_match_all, List<String> extcommunity_list, Boolean extcommunity_match_all, String family, List<Integer> as_path) {
        this(protocol, prefix, community, community_list, community_match_all, extcommunity_list, extcommunity_match_all, family, as_path, null, null, null, null, null);    }
    public TermMatchConditionType(List<String> protocol, List<PrefixMatchType> prefix, String community, List<String> community_list, Boolean community_match_all, List<String> extcommunity_list, Boolean extcommunity_match_all, String family, List<Integer> as_path, String external) {
        this(protocol, prefix, community, community_list, community_match_all, extcommunity_list, extcommunity_match_all, family, as_path, external, null, null, null, null);    }
    public TermMatchConditionType(List<String> protocol, List<PrefixMatchType> prefix, String community, List<String> community_list, Boolean community_match_all, List<String> extcommunity_list, Boolean extcommunity_match_all, String family, List<Integer> as_path, String external, Integer local_pref) {
        this(protocol, prefix, community, community_list, community_match_all, extcommunity_list, extcommunity_match_all, family, as_path, external, local_pref, null, null, null);    }
    public TermMatchConditionType(List<String> protocol, List<PrefixMatchType> prefix, String community, List<String> community_list, Boolean community_match_all, List<String> extcommunity_list, Boolean extcommunity_match_all, String family, List<Integer> as_path, String external, Integer local_pref, List<Integer> nlri_route_type) {
        this(protocol, prefix, community, community_list, community_match_all, extcommunity_list, extcommunity_match_all, family, as_path, external, local_pref, nlri_route_type, null, null);    }
    public TermMatchConditionType(List<String> protocol, List<PrefixMatchType> prefix, String community, List<String> community_list, Boolean community_match_all, List<String> extcommunity_list, Boolean extcommunity_match_all, String family, List<Integer> as_path, String external, Integer local_pref, List<Integer> nlri_route_type, List<PrefixListMatchType> prefix_list) {
        this(protocol, prefix, community, community_list, community_match_all, extcommunity_list, extcommunity_match_all, family, as_path, external, local_pref, nlri_route_type, prefix_list, null);    }
    
    public String getCommunity() {
        return community;
    }
    
    public void setCommunity(String community) {
        this.community = community;
    }
    
    
    public Boolean getCommunityMatchAll() {
        return community_match_all;
    }
    
    public void setCommunityMatchAll(Boolean community_match_all) {
        this.community_match_all = community_match_all;
    }
    
    
    public Boolean getExtcommunityMatchAll() {
        return extcommunity_match_all;
    }
    
    public void setExtcommunityMatchAll(Boolean extcommunity_match_all) {
        this.extcommunity_match_all = extcommunity_match_all;
    }
    
    
    public String getFamily() {
        return family;
    }
    
    public void setFamily(String family) {
        this.family = family;
    }
    
    
    public String getExternal() {
        return external;
    }
    
    public void setExternal(String external) {
        this.external = external;
    }
    
    
    public Integer getLocalPref() {
        return local_pref;
    }
    
    public void setLocalPref(Integer local_pref) {
        this.local_pref = local_pref;
    }
    
    
    public RouteFilterType getRouteFilter() {
        return route_filter;
    }
    
    public void setRouteFilter(RouteFilterType route_filter) {
        this.route_filter = route_filter;
    }
    
    
    public List<String> getProtocol() {
        return protocol;
    }
    
    
    public void addProtocol(String obj) {
        if (protocol == null) {
            protocol = new ArrayList<String>();
        }
        protocol.add(obj);
    }
    public void clearProtocol() {
        protocol = null;
    }
    
    
    public List<PrefixMatchType> getPrefix() {
        return prefix;
    }
    
    
    public void addPrefix(PrefixMatchType obj) {
        if (prefix == null) {
            prefix = new ArrayList<PrefixMatchType>();
        }
        prefix.add(obj);
    }
    public void clearPrefix() {
        prefix = null;
    }

    
    public void addPrefix(String prefix, String prefix_type) {
        if (this.prefix == null) {
            this.prefix = new ArrayList<PrefixMatchType>();
        }
        this.prefix.add(new PrefixMatchType(prefix, prefix_type));
    }
    
    
    public List<String> getCommunityList() {
        return community_list;
    }
    
    
    public void addCommunity(String obj) {
        if (community_list == null) {
            community_list = new ArrayList<String>();
        }
        community_list.add(obj);
    }
    public void clearCommunity() {
        community_list = null;
    }
    
    
    public List<String> getExtcommunityList() {
        return extcommunity_list;
    }
    
    
    public void addExtcommunity(String obj) {
        if (extcommunity_list == null) {
            extcommunity_list = new ArrayList<String>();
        }
        extcommunity_list.add(obj);
    }
    public void clearExtcommunity() {
        extcommunity_list = null;
    }
    
    
    public List<Integer> getAsPath() {
        return as_path;
    }
    
    
    public void addAsPath(Integer obj) {
        if (as_path == null) {
            as_path = new ArrayList<Integer>();
        }
        as_path.add(obj);
    }
    public void clearAsPath() {
        as_path = null;
    }
    
    
    public List<Integer> getNlriRouteType() {
        return nlri_route_type;
    }
    
    
    public void addNlriRouteType(Integer obj) {
        if (nlri_route_type == null) {
            nlri_route_type = new ArrayList<Integer>();
        }
        nlri_route_type.add(obj);
    }
    public void clearNlriRouteType() {
        nlri_route_type = null;
    }
    
    
    public List<PrefixListMatchType> getPrefixList() {
        return prefix_list;
    }
    
    
    public void addPrefix(PrefixListMatchType obj) {
        if (prefix_list == null) {
            prefix_list = new ArrayList<PrefixListMatchType>();
        }
        prefix_list.add(obj);
    }
    public void clearPrefixList() {
        prefix_list = null;
    }
    
    
    public void addPrefix(List<String> interface_route_table_uuid, String prefix_type) {
        if (prefix_list == null) {
            prefix_list = new ArrayList<PrefixListMatchType>();
        }
        prefix_list.add(new PrefixListMatchType(interface_route_table_uuid, prefix_type));
    }
    
}

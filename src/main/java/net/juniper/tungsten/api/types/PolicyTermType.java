//
// Automatically generated.
//
package net.juniper.tungsten.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.tungsten.api.ApiPropertyBase;

public class PolicyTermType extends ApiPropertyBase {
    TermMatchConditionType term_match_condition;
    TermActionListType term_action_list;
    public PolicyTermType() {
    }
    public PolicyTermType(TermMatchConditionType term_match_condition, TermActionListType term_action_list) {
        this.term_match_condition = term_match_condition;
        this.term_action_list = term_action_list;
    }
    public PolicyTermType(TermMatchConditionType term_match_condition) {
        this(term_match_condition, null);    }
    
    public TermMatchConditionType getTermMatchCondition() {
        return term_match_condition;
    }
    
    public void setTermMatchCondition(TermMatchConditionType term_match_condition) {
        this.term_match_condition = term_match_condition;
    }
    
    
    public TermActionListType getTermActionList() {
        return term_action_list;
    }
    
    public void setTermActionList(TermActionListType term_action_list) {
        this.term_action_list = term_action_list;
    }
    
}

//
// Automatically generated.
//
package net.juniper.tungsten.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.tungsten.api.ApiPropertyBase;

public class PolicyStatementType extends ApiPropertyBase {
    List<PolicyTermType> term;
    public PolicyStatementType() {
    }
    public PolicyStatementType(List<PolicyTermType> term) {
        this.term = term;
    }
    
    public List<PolicyTermType> getTerm() {
        return term;
    }
    
    
    public void addTerm(PolicyTermType obj) {
        if (term == null) {
            term = new ArrayList<PolicyTermType>();
        }
        term.add(obj);
    }
    public void clearTerm() {
        term = null;
    }
    
    
    public void addTerm(TermMatchConditionType term_match_condition, TermActionListType term_action_list) {
        if (term == null) {
            term = new ArrayList<PolicyTermType>();
        }
        term.add(new PolicyTermType(term_match_condition, term_action_list));
    }
    
}

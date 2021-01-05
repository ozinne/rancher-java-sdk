package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class NodePoolStatus extends AbstractType {
    
    private List<Condition> conditions;
    
    public List<Condition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<Condition> conditions) {
      this.conditions = conditions;
    }
    
}

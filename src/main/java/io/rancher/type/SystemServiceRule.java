package io.rancher.type;

import io.rancher.base.AbstractType;

public class SystemServiceRule extends AbstractType {
    
    private String condition;
    
    public String getCondition() {
        return this.condition;
    }

    public void setCondition(String condition) {
      this.condition = condition;
    }
    
}

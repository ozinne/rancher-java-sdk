package io.rancher.type;

import io.rancher.base.AbstractType;

public class SeLinuxStrategyOptions extends AbstractType {
    
    private String rule;
    
    private SeLinuxOptions seLinuxOptions;
    
    public String getRule() {
        return this.rule;
    }

    public void setRule(String rule) {
      this.rule = rule;
    }
    
    public SeLinuxOptions getSeLinuxOptions() {
        return this.seLinuxOptions;
    }

    public void setSeLinuxOptions(SeLinuxOptions seLinuxOptions) {
      this.seLinuxOptions = seLinuxOptions;
    }
    
}

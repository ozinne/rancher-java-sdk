package io.rancher.type;

import io.rancher.base.AbstractType;

public class DaemonSetUpdateStrategy extends AbstractType {
    
    private RollingUpdateDaemonSet rollingUpdate;
    
    private String strategy;
    
    public RollingUpdateDaemonSet getRollingUpdate() {
        return this.rollingUpdate;
    }

    public void setRollingUpdate(RollingUpdateDaemonSet rollingUpdate) {
      this.rollingUpdate = rollingUpdate;
    }
    
    public String getStrategy() {
        return this.strategy;
    }

    public void setStrategy(String strategy) {
      this.strategy = strategy;
    }
    
}

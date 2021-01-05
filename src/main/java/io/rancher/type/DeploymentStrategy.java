package io.rancher.type;

import io.rancher.base.AbstractType;

public class DeploymentStrategy extends AbstractType {
    
    private RollingUpdateDeployment rollingUpdate;
    
    private String strategy;
    
    public RollingUpdateDeployment getRollingUpdate() {
        return this.rollingUpdate;
    }

    public void setRollingUpdate(RollingUpdateDeployment rollingUpdate) {
      this.rollingUpdate = rollingUpdate;
    }
    
    public String getStrategy() {
        return this.strategy;
    }

    public void setStrategy(String strategy) {
      this.strategy = strategy;
    }
    
}

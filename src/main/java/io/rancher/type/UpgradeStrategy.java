package io.rancher.type;

import io.rancher.base.AbstractType;

public class UpgradeStrategy extends AbstractType {
    
    private RollingUpdate rollingUpdate;
    
    public RollingUpdate getRollingUpdate() {
        return this.rollingUpdate;
    }

    public void setRollingUpdate(RollingUpdate rollingUpdate) {
      this.rollingUpdate = rollingUpdate;
    }
    
}

package io.rancher.type;

import io.rancher.base.AbstractType;

public class RollingUpdateDaemonSet extends AbstractType {
    
    private Integer maxUnavailable;
    
    public Integer getMaxUnavailable() {
        return this.maxUnavailable;
    }

    public void setMaxUnavailable(Integer maxUnavailable) {
      this.maxUnavailable = maxUnavailable;
    }
    
}

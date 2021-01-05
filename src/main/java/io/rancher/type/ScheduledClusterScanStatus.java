package io.rancher.type;

import io.rancher.base.AbstractType;

public class ScheduledClusterScanStatus extends AbstractType {
    
    private Boolean enabled;
    
    private String lastRunTimestamp;
    
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
    }
    
    public String getLastRunTimestamp() {
        return this.lastRunTimestamp;
    }

    public void setLastRunTimestamp(String lastRunTimestamp) {
      this.lastRunTimestamp = lastRunTimestamp;
    }
    
}

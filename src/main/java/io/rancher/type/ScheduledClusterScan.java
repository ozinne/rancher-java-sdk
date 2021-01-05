package io.rancher.type;

import io.rancher.base.AbstractType;

public class ScheduledClusterScan extends AbstractType {
    
    private Boolean enabled;
    
    private ClusterScanConfig scanConfig;
    
    private ScheduledClusterScanConfig scheduleConfig;
    
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
    }
    
    public ClusterScanConfig getScanConfig() {
        return this.scanConfig;
    }

    public void setScanConfig(ClusterScanConfig scanConfig) {
      this.scanConfig = scanConfig;
    }
    
    public ScheduledClusterScanConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    public void setScheduleConfig(ScheduledClusterScanConfig scheduleConfig) {
      this.scheduleConfig = scheduleConfig;
    }
    
}

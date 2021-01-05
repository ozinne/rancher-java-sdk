package io.rancher.type;

import io.rancher.base.AbstractType;

public class ScheduledClusterScanConfig extends AbstractType {
    
    private String cronSchedule;
    
    private Integer retention;
    
    public String getCronSchedule() {
        return this.cronSchedule;
    }

    public void setCronSchedule(String cronSchedule) {
      this.cronSchedule = cronSchedule;
    }
    
    public Integer getRetention() {
        return this.retention;
    }

    public void setRetention(Integer retention) {
      this.retention = retention;
    }
    
}

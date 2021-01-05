package io.rancher.type;

import io.rancher.base.AbstractType;

public class RollingUpdate extends AbstractType {
    
    private Integer batchSize;
    
    private Integer interval;
    
    public Integer getBatchSize() {
        return this.batchSize;
    }

    public void setBatchSize(Integer batchSize) {
      this.batchSize = batchSize;
    }
    
    public Integer getInterval() {
        return this.interval;
    }

    public void setInterval(Integer interval) {
      this.interval = interval;
    }
    
}

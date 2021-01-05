package io.rancher.type;

import io.rancher.base.AbstractType;

public class ClusterScanRule extends AbstractType {
    
    private Boolean failuresOnly;
    
    private String scanRunType;
    
    public Boolean getFailuresOnly() {
        return this.failuresOnly;
    }

    public void setFailuresOnly(Boolean failuresOnly) {
      this.failuresOnly = failuresOnly;
    }
    
    public String getScanRunType() {
        return this.scanRunType;
    }

    public void setScanRunType(String scanRunType) {
      this.scanRunType = scanRunType;
    }
    
}

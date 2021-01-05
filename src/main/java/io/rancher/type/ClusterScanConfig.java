package io.rancher.type;

import io.rancher.base.AbstractType;

public class ClusterScanConfig extends AbstractType {
    
    private CisScanConfig cisScanConfig;
    
    public CisScanConfig getCisScanConfig() {
        return this.cisScanConfig;
    }

    public void setCisScanConfig(CisScanConfig cisScanConfig) {
      this.cisScanConfig = cisScanConfig;
    }
    
}

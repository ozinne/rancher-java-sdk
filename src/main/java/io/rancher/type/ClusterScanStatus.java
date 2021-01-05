package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class ClusterScanStatus extends AbstractType {
    
    private CisScanStatus cisScanStatus;
    
    private List<ClusterScanCondition> conditions;
    
    public CisScanStatus getCisScanStatus() {
        return this.cisScanStatus;
    }

    public void setCisScanStatus(CisScanStatus cisScanStatus) {
      this.cisScanStatus = cisScanStatus;
    }
    
    public List<ClusterScanCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<ClusterScanCondition> conditions) {
      this.conditions = conditions;
    }
    
}

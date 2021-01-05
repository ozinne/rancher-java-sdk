package io.rancher.type;

import io.rancher.base.AbstractType;

public class ClusterMetricNamesInput extends AbstractType {
    
    private String clusterId;
    
    public String getClusterId() {
        return this.clusterId;
    }

    public void setClusterId(String clusterId) {
      this.clusterId = clusterId;
    }
    
}

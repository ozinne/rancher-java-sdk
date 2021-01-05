package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;
import java.util.List;

public class GlobalDnsStatus extends AbstractType {
    
    private Map<String, Object> clusterEndpoints;
    
    private List<String> endpoints;
    
    public Map<String, Object> getClusterEndpoints() {
        return this.clusterEndpoints;
    }

    public void setClusterEndpoints(Map<String, Object> clusterEndpoints) {
      this.clusterEndpoints = clusterEndpoints;
    }
    
    public List<String> getEndpoints() {
        return this.endpoints;
    }

    public void setEndpoints(List<String> endpoints) {
      this.endpoints = endpoints;
    }
    
}

package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class Nodelocal extends AbstractType {
    
    private String ipAddress;
    
    private Map<String, Object> nodeSelector;
    
    private DaemonSetUpdateStrategy updateStrategy;
    
    public String getIpAddress() {
        return this.ipAddress;
    }

    public void setIpAddress(String ipAddress) {
      this.ipAddress = ipAddress;
    }
    
    public Map<String, Object> getNodeSelector() {
        return this.nodeSelector;
    }

    public void setNodeSelector(Map<String, Object> nodeSelector) {
      this.nodeSelector = nodeSelector;
    }
    
    public DaemonSetUpdateStrategy getUpdateStrategy() {
        return this.updateStrategy;
    }

    public void setUpdateStrategy(DaemonSetUpdateStrategy updateStrategy) {
      this.updateStrategy = updateStrategy;
    }
    
}

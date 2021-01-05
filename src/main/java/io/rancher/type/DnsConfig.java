package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;
import java.util.Map;

public class DnsConfig extends AbstractType {
    
    private LinearAutoscalerParams linearAutoscalerParams;
    
    private Map<String, Object> nodeSelector;
    
    private Nodelocal nodelocal;
    
    private String provider;
    
    private List<String> reversecidrs;
    
    private Map<String, Object> stubdomains;
    
    private DeploymentStrategy updateStrategy;
    
    private List<String> upstreamnameservers;
    
    public LinearAutoscalerParams getLinearAutoscalerParams() {
        return this.linearAutoscalerParams;
    }

    public void setLinearAutoscalerParams(LinearAutoscalerParams linearAutoscalerParams) {
      this.linearAutoscalerParams = linearAutoscalerParams;
    }
    
    public Map<String, Object> getNodeSelector() {
        return this.nodeSelector;
    }

    public void setNodeSelector(Map<String, Object> nodeSelector) {
      this.nodeSelector = nodeSelector;
    }
    
    public Nodelocal getNodelocal() {
        return this.nodelocal;
    }

    public void setNodelocal(Nodelocal nodelocal) {
      this.nodelocal = nodelocal;
    }
    
    public String getProvider() {
        return this.provider;
    }

    public void setProvider(String provider) {
      this.provider = provider;
    }
    
    public List<String> getReversecidrs() {
        return this.reversecidrs;
    }

    public void setReversecidrs(List<String> reversecidrs) {
      this.reversecidrs = reversecidrs;
    }
    
    public Map<String, Object> getStubdomains() {
        return this.stubdomains;
    }

    public void setStubdomains(Map<String, Object> stubdomains) {
      this.stubdomains = stubdomains;
    }
    
    public DeploymentStrategy getUpdateStrategy() {
        return this.updateStrategy;
    }

    public void setUpdateStrategy(DeploymentStrategy updateStrategy) {
      this.updateStrategy = updateStrategy;
    }
    
    public List<String> getUpstreamnameservers() {
        return this.upstreamnameservers;
    }

    public void setUpstreamnameservers(List<String> upstreamnameservers) {
      this.upstreamnameservers = upstreamnameservers;
    }
    
}

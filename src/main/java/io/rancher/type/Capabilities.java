package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class Capabilities extends AbstractType {
    
    private List<IngressCapabilities> ingressCapabilities;
    
    private LoadBalancerCapabilities loadBalancerCapabilities;
    
    private Boolean nodePoolScalingSupported;
    
    private String nodePortRange;
    
    private Boolean pspEnabled;
    
    private Boolean taintSupport;
    
    public List<IngressCapabilities> getIngressCapabilities() {
        return this.ingressCapabilities;
    }

    public void setIngressCapabilities(List<IngressCapabilities> ingressCapabilities) {
      this.ingressCapabilities = ingressCapabilities;
    }
    
    public LoadBalancerCapabilities getLoadBalancerCapabilities() {
        return this.loadBalancerCapabilities;
    }

    public void setLoadBalancerCapabilities(LoadBalancerCapabilities loadBalancerCapabilities) {
      this.loadBalancerCapabilities = loadBalancerCapabilities;
    }
    
    public Boolean getNodePoolScalingSupported() {
        return this.nodePoolScalingSupported;
    }

    public void setNodePoolScalingSupported(Boolean nodePoolScalingSupported) {
      this.nodePoolScalingSupported = nodePoolScalingSupported;
    }
    
    public String getNodePortRange() {
        return this.nodePortRange;
    }

    public void setNodePortRange(String nodePortRange) {
      this.nodePortRange = nodePortRange;
    }
    
    public Boolean getPspEnabled() {
        return this.pspEnabled;
    }

    public void setPspEnabled(Boolean pspEnabled) {
      this.pspEnabled = pspEnabled;
    }
    
    public Boolean getTaintSupport() {
        return this.taintSupport;
    }

    public void setTaintSupport(Boolean taintSupport) {
      this.taintSupport = taintSupport;
    }
    
}

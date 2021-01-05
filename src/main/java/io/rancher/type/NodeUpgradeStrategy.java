package io.rancher.type;

import io.rancher.base.AbstractType;

public class NodeUpgradeStrategy extends AbstractType {
    
    private Boolean drain;
    
    private String maxUnavailableControlplane;
    
    private String maxUnavailableWorker;
    
    private NodeDrainInput nodeDrainInput;
    
    public Boolean getDrain() {
        return this.drain;
    }

    public void setDrain(Boolean drain) {
      this.drain = drain;
    }
    
    public String getMaxUnavailableControlplane() {
        return this.maxUnavailableControlplane;
    }

    public void setMaxUnavailableControlplane(String maxUnavailableControlplane) {
      this.maxUnavailableControlplane = maxUnavailableControlplane;
    }
    
    public String getMaxUnavailableWorker() {
        return this.maxUnavailableWorker;
    }

    public void setMaxUnavailableWorker(String maxUnavailableWorker) {
      this.maxUnavailableWorker = maxUnavailableWorker;
    }
    
    public NodeDrainInput getNodeDrainInput() {
        return this.nodeDrainInput;
    }

    public void setNodeDrainInput(NodeDrainInput nodeDrainInput) {
      this.nodeDrainInput = nodeDrainInput;
    }
    
}

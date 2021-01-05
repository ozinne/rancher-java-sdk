package io.rancher.type;

import io.rancher.base.AbstractType;

public class K3sUpgradeStrategy extends AbstractType {
    
    private Boolean drainServerNodes;
    
    private Boolean drainWorkerNodes;
    
    private Integer serverConcurrency;
    
    private Integer workerConcurrency;
    
    public Boolean getDrainServerNodes() {
        return this.drainServerNodes;
    }

    public void setDrainServerNodes(Boolean drainServerNodes) {
      this.drainServerNodes = drainServerNodes;
    }
    
    public Boolean getDrainWorkerNodes() {
        return this.drainWorkerNodes;
    }

    public void setDrainWorkerNodes(Boolean drainWorkerNodes) {
      this.drainWorkerNodes = drainWorkerNodes;
    }
    
    public Integer getServerConcurrency() {
        return this.serverConcurrency;
    }

    public void setServerConcurrency(Integer serverConcurrency) {
      this.serverConcurrency = serverConcurrency;
    }
    
    public Integer getWorkerConcurrency() {
        return this.workerConcurrency;
    }

    public void setWorkerConcurrency(Integer workerConcurrency) {
      this.workerConcurrency = workerConcurrency;
    }
    
}

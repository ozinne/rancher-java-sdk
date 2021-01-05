package io.rancher.type;

import io.rancher.base.AbstractType;

public class NodePlan extends AbstractType {
    
    private Integer agentCheckInterval;
    
    private RkeConfigNodePlan plan;
    
    private Integer version;
    
    public Integer getAgentCheckInterval() {
        return this.agentCheckInterval;
    }

    public void setAgentCheckInterval(Integer agentCheckInterval) {
      this.agentCheckInterval = agentCheckInterval;
    }
    
    public RkeConfigNodePlan getPlan() {
        return this.plan;
    }

    public void setPlan(RkeConfigNodePlan plan) {
      this.plan = plan;
    }
    
    public Integer getVersion() {
        return this.version;
    }

    public void setVersion(Integer version) {
      this.version = version;
    }
    
}

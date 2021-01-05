package io.rancher.type;

import io.rancher.base.AbstractType;

public class LinearAutoscalerParams extends AbstractType {
    
    private Float coresPerReplica;
    
    private Integer max;
    
    private Integer min;
    
    private Float nodesPerReplica;
    
    private Boolean preventSinglePointFailure;
    
    public Float getCoresPerReplica() {
        return this.coresPerReplica;
    }

    public void setCoresPerReplica(Float coresPerReplica) {
      this.coresPerReplica = coresPerReplica;
    }
    
    public Integer getMax() {
        return this.max;
    }

    public void setMax(Integer max) {
      this.max = max;
    }
    
    public Integer getMin() {
        return this.min;
    }

    public void setMin(Integer min) {
      this.min = min;
    }
    
    public Float getNodesPerReplica() {
        return this.nodesPerReplica;
    }

    public void setNodesPerReplica(Float nodesPerReplica) {
      this.nodesPerReplica = nodesPerReplica;
    }
    
    public Boolean getPreventSinglePointFailure() {
        return this.preventSinglePointFailure;
    }

    public void setPreventSinglePointFailure(Boolean preventSinglePointFailure) {
      this.preventSinglePointFailure = preventSinglePointFailure;
    }
    
}

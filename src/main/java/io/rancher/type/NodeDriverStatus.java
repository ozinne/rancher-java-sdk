package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class NodeDriverStatus extends AbstractType {
    
    private String appliedChecksum;
    
    private String appliedDockerMachineVersion;
    
    private String appliedURL;
    
    private List<Condition> conditions;
    
    public String getAppliedChecksum() {
        return this.appliedChecksum;
    }

    public void setAppliedChecksum(String appliedChecksum) {
      this.appliedChecksum = appliedChecksum;
    }
    
    public String getAppliedDockerMachineVersion() {
        return this.appliedDockerMachineVersion;
    }

    public void setAppliedDockerMachineVersion(String appliedDockerMachineVersion) {
      this.appliedDockerMachineVersion = appliedDockerMachineVersion;
    }
    
    public String getAppliedURL() {
        return this.appliedURL;
    }

    public void setAppliedURL(String appliedURL) {
      this.appliedURL = appliedURL;
    }
    
    public List<Condition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<Condition> conditions) {
      this.conditions = conditions;
    }
    
}

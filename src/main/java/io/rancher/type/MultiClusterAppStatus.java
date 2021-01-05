package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class MultiClusterAppStatus extends AbstractType {
    
    private List<AppCondition> conditions;
    
    private String helmVersion;
    
    private String revisionId;
    
    public List<AppCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<AppCondition> conditions) {
      this.conditions = conditions;
    }
    
    public String getHelmVersion() {
        return this.helmVersion;
    }

    public void setHelmVersion(String helmVersion) {
      this.helmVersion = helmVersion;
    }
    
    public String getRevisionId() {
        return this.revisionId;
    }

    public void setRevisionId(String revisionId) {
      this.revisionId = revisionId;
    }
    
}

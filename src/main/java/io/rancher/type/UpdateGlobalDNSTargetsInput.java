package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class UpdateGlobalDNSTargetsInput extends AbstractType {
    
    private List<String> projectIds;
    
    public List<String> getProjectIds() {
        return this.projectIds;
    }

    public void setProjectIds(List<String> projectIds) {
      this.projectIds = projectIds;
    }
    
}

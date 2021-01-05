package io.rancher.type;

import io.rancher.base.AbstractType;

public class ProjectMetricNamesInput extends AbstractType {
    
    private String projectId;
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
}

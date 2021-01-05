package io.rancher.type;

import io.rancher.base.AbstractType;

public class SaveAsTemplateInput extends AbstractType {
    
    private String clusterTemplateName;
    
    private String clusterTemplateRevisionName;
    
    public String getClusterTemplateName() {
        return this.clusterTemplateName;
    }

    public void setClusterTemplateName(String clusterTemplateName) {
      this.clusterTemplateName = clusterTemplateName;
    }
    
    public String getClusterTemplateRevisionName() {
        return this.clusterTemplateRevisionName;
    }

    public void setClusterTemplateRevisionName(String clusterTemplateRevisionName) {
      this.clusterTemplateRevisionName = clusterTemplateRevisionName;
    }
    
}

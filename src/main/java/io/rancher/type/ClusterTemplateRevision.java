package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;
import java.util.List;

public class ClusterTemplateRevision extends AbstractType {
    
    private Map<String, Object> annotations;
    
    private ClusterSpecBase clusterConfig;
    
    private String clusterTemplateId;
    
    private String created;
    
    private String creatorId;
    
    private Boolean enabled;
    
    private Map<String, Object> labels;
    
    private String name;
    
    private List<OwnerReference> ownerReferences;
    
    private List<Question> questions;
    
    private String removed;
    
    private String uuid;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public ClusterSpecBase getClusterConfig() {
        return this.clusterConfig;
    }

    public void setClusterConfig(ClusterSpecBase clusterConfig) {
      this.clusterConfig = clusterConfig;
    }
    
    public String getClusterTemplateId() {
        return this.clusterTemplateId;
    }

    public void setClusterTemplateId(String clusterTemplateId) {
      this.clusterTemplateId = clusterTemplateId;
    }
    
    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
      this.created = created;
    }
    
    public String getCreatorId() {
        return this.creatorId;
    }

    public void setCreatorId(String creatorId) {
      this.creatorId = creatorId;
    }
    
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public List<Question> getQuestions() {
        return this.questions;
    }

    public void setQuestions(List<Question> questions) {
      this.questions = questions;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}

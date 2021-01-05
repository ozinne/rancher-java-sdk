package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;
import java.util.List;

public class Project extends AbstractType {
    
    private Map<String, Object> annotations;
    
    private String clusterId;
    
    private List<ProjectCondition> conditions;
    
    private ContainerResourceLimit containerDefaultResourceLimit;
    
    private String created;
    
    private String creatorId;
    
    private String description;
    
    private Boolean enableProjectMonitoring;
    
    private Map<String, Object> labels;
    
    private MonitoringStatus monitoringStatus;
    
    private String name;
    
    private NamespaceResourceQuota namespaceDefaultResourceQuota;
    
    private String namespaceId;
    
    private List<OwnerReference> ownerReferences;
    
    private String podSecurityPolicyTemplateId;
    
    private String removed;
    
    private ProjectResourceQuota resourceQuota;
    
    private String state;
    
    private String transitioning;
    
    private String transitioningMessage;
    
    private String uuid;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public String getClusterId() {
        return this.clusterId;
    }

    public void setClusterId(String clusterId) {
      this.clusterId = clusterId;
    }
    
    public List<ProjectCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<ProjectCondition> conditions) {
      this.conditions = conditions;
    }
    
    public ContainerResourceLimit getContainerDefaultResourceLimit() {
        return this.containerDefaultResourceLimit;
    }

    public void setContainerDefaultResourceLimit(ContainerResourceLimit containerDefaultResourceLimit) {
      this.containerDefaultResourceLimit = containerDefaultResourceLimit;
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
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public Boolean getEnableProjectMonitoring() {
        return this.enableProjectMonitoring;
    }

    public void setEnableProjectMonitoring(Boolean enableProjectMonitoring) {
      this.enableProjectMonitoring = enableProjectMonitoring;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public MonitoringStatus getMonitoringStatus() {
        return this.monitoringStatus;
    }

    public void setMonitoringStatus(MonitoringStatus monitoringStatus) {
      this.monitoringStatus = monitoringStatus;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public NamespaceResourceQuota getNamespaceDefaultResourceQuota() {
        return this.namespaceDefaultResourceQuota;
    }

    public void setNamespaceDefaultResourceQuota(NamespaceResourceQuota namespaceDefaultResourceQuota) {
      this.namespaceDefaultResourceQuota = namespaceDefaultResourceQuota;
    }
    
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public void setNamespaceId(String namespaceId) {
      this.namespaceId = namespaceId;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public String getPodSecurityPolicyTemplateId() {
        return this.podSecurityPolicyTemplateId;
    }

    public void setPodSecurityPolicyTemplateId(String podSecurityPolicyTemplateId) {
      this.podSecurityPolicyTemplateId = podSecurityPolicyTemplateId;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public ProjectResourceQuota getResourceQuota() {
        return this.resourceQuota;
    }

    public void setResourceQuota(ProjectResourceQuota resourceQuota) {
      this.resourceQuota = resourceQuota;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public String getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(String transitioning) {
      this.transitioning = transitioning;
    }
    
    public String getTransitioningMessage() {
        return this.transitioningMessage;
    }

    public void setTransitioningMessage(String transitioningMessage) {
      this.transitioningMessage = transitioningMessage;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}

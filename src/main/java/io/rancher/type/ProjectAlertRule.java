package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;
import java.util.Map;

public class ProjectAlertRule extends AbstractType {
    
    private String alertState;
    
    private Map<String, Object> annotations;
    
    private String created;
    
    private String creatorId;
    
    private String groupId;
    
    private Integer groupIntervalSeconds;
    
    private Integer groupWaitSeconds;
    
    private Boolean inherited;
    
    private Map<String, Object> labels;
    
    private MetricRule metricRule;
    
    private String name;
    
    private String namespaceId;
    
    private List<OwnerReference> ownerReferences;
    
    private PodRule podRule;
    
    private String projectId;
    
    private String removed;
    
    private Integer repeatIntervalSeconds;
    
    private String severity;
    
    private String state;
    
    private String transitioning;
    
    private String transitioningMessage;
    
    private String uuid;
    
    private WorkloadRule workloadRule;
    
    public String getAlertState() {
        return this.alertState;
    }

    public void setAlertState(String alertState) {
      this.alertState = alertState;
    }
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
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
    
    public String getGroupId() {
        return this.groupId;
    }

    public void setGroupId(String groupId) {
      this.groupId = groupId;
    }
    
    public Integer getGroupIntervalSeconds() {
        return this.groupIntervalSeconds;
    }

    public void setGroupIntervalSeconds(Integer groupIntervalSeconds) {
      this.groupIntervalSeconds = groupIntervalSeconds;
    }
    
    public Integer getGroupWaitSeconds() {
        return this.groupWaitSeconds;
    }

    public void setGroupWaitSeconds(Integer groupWaitSeconds) {
      this.groupWaitSeconds = groupWaitSeconds;
    }
    
    public Boolean getInherited() {
        return this.inherited;
    }

    public void setInherited(Boolean inherited) {
      this.inherited = inherited;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public MetricRule getMetricRule() {
        return this.metricRule;
    }

    public void setMetricRule(MetricRule metricRule) {
      this.metricRule = metricRule;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
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
    
    public PodRule getPodRule() {
        return this.podRule;
    }

    public void setPodRule(PodRule podRule) {
      this.podRule = podRule;
    }
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public Integer getRepeatIntervalSeconds() {
        return this.repeatIntervalSeconds;
    }

    public void setRepeatIntervalSeconds(Integer repeatIntervalSeconds) {
      this.repeatIntervalSeconds = repeatIntervalSeconds;
    }
    
    public String getSeverity() {
        return this.severity;
    }

    public void setSeverity(String severity) {
      this.severity = severity;
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
    
    public WorkloadRule getWorkloadRule() {
        return this.workloadRule;
    }

    public void setWorkloadRule(WorkloadRule workloadRule) {
      this.workloadRule = workloadRule;
    }
    
}

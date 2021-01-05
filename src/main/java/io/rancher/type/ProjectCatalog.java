package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.DnsLabel;
import io.rancher.extend.Password;

import java.util.List;
import java.util.Map;

public class ProjectCatalog extends AbstractType {
    
    private Map<String, Object> annotations;
    
    private String branch;
    
    private String commit;
    
    private List<CatalogCondition> conditions;
    
    private String created;
    
    private String creatorId;
    
    private String description;
    
    private String helmVersion;
    
    private String kind;
    
    private Map<String, Object> labels;
    
    private String lastRefreshTimestamp;
    
    private DnsLabel name;
    
    private String namespaceId;
    
    private List<OwnerReference> ownerReferences;
    
    private Password password;
    
    private String projectId;
    
    private String removed;
    
    private String state;
    
    private String transitioning;
    
    private String transitioningMessage;
    
    private String url;
    
    private String username;
    
    private String uuid;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public String getBranch() {
        return this.branch;
    }

    public void setBranch(String branch) {
      this.branch = branch;
    }
    
    public String getCommit() {
        return this.commit;
    }

    public void setCommit(String commit) {
      this.commit = commit;
    }
    
    public List<CatalogCondition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<CatalogCondition> conditions) {
      this.conditions = conditions;
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
    
    public String getHelmVersion() {
        return this.helmVersion;
    }

    public void setHelmVersion(String helmVersion) {
      this.helmVersion = helmVersion;
    }
    
    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
      this.kind = kind;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getLastRefreshTimestamp() {
        return this.lastRefreshTimestamp;
    }

    public void setLastRefreshTimestamp(String lastRefreshTimestamp) {
      this.lastRefreshTimestamp = lastRefreshTimestamp;
    }
    
    public DnsLabel getName() {
        return this.name;
    }

    public void setName(DnsLabel name) {
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
    
    public Password getPassword() {
        return this.password;
    }

    public void setPassword(Password password) {
      this.password = password;
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
    
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
      this.url = url;
    }
    
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
      this.username = username;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}

package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.DnsLabel;

import java.util.List;
import java.util.Map;

public class MultiClusterApp extends AbstractType {
    
    private Map<String, Object> annotations;
    
    private List<Answer> answers;
    
    private String created;
    
    private String creatorId;
    
    private Map<String, Object> labels;
    
    private List<Member> members;
    
    private DnsLabel name;
    
    private List<OwnerReference> ownerReferences;
    
    private String removed;
    
    private Integer revisionHistoryLimit;
    
    private List<String> roles;
    
    private String state;
    
    private MultiClusterAppStatus status;
    
    private List<Target> targets;
    
    private String templateVersionId;
    
    private Integer timeout;
    
    private String transitioning;
    
    private String transitioningMessage;
    
    private UpgradeStrategy upgradeStrategy;
    
    private String uuid;
    
    private Boolean wait;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public List<Answer> getAnswers() {
        return this.answers;
    }

    public void setAnswers(List<Answer> answers) {
      this.answers = answers;
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
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public List<Member> getMembers() {
        return this.members;
    }

    public void setMembers(List<Member> members) {
      this.members = members;
    }
    
    public DnsLabel getName() {
        return this.name;
    }

    public void setName(DnsLabel name) {
      this.name = name;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public Integer getRevisionHistoryLimit() {
        return this.revisionHistoryLimit;
    }

    public void setRevisionHistoryLimit(Integer revisionHistoryLimit) {
      this.revisionHistoryLimit = revisionHistoryLimit;
    }
    
    public List<String> getRoles() {
        return this.roles;
    }

    public void setRoles(List<String> roles) {
      this.roles = roles;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public MultiClusterAppStatus getStatus() {
        return this.status;
    }

    public void setStatus(MultiClusterAppStatus status) {
      this.status = status;
    }
    
    public List<Target> getTargets() {
        return this.targets;
    }

    public void setTargets(List<Target> targets) {
      this.targets = targets;
    }
    
    public String getTemplateVersionId() {
        return this.templateVersionId;
    }

    public void setTemplateVersionId(String templateVersionId) {
      this.templateVersionId = templateVersionId;
    }
    
    public Integer getTimeout() {
        return this.timeout;
    }

    public void setTimeout(Integer timeout) {
      this.timeout = timeout;
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
    
    public UpgradeStrategy getUpgradeStrategy() {
        return this.upgradeStrategy;
    }

    public void setUpgradeStrategy(UpgradeStrategy upgradeStrategy) {
      this.upgradeStrategy = upgradeStrategy;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public Boolean getWait() {
        return this.wait;
    }

    public void setWait(Boolean wait) {
      this.wait = wait;
    }
    
}

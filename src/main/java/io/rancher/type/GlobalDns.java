package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.DnsLabel;
import io.rancher.extend.Hostname;

import java.util.List;
import java.util.Map;

public class GlobalDns extends AbstractType {
    
    private Map<String, Object> annotations;
    
    private String created;
    
    private String creatorId;
    
    private Hostname fqdn;
    
    private Map<String, Object> labels;
    
    private List<Member> members;
    
    private String multiClusterAppId;
    
    private DnsLabel name;
    
    private List<OwnerReference> ownerReferences;
    
    private List<String> projectIds;
    
    private String providerId;
    
    private String removed;
    
    private String state;
    
    private GlobalDnsStatus status;
    
    private String transitioning;
    
    private String transitioningMessage;
    
    private Integer ttl;
    
    private String uuid;
    
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
    
    public Hostname getFqdn() {
        return this.fqdn;
    }

    public void setFqdn(Hostname fqdn) {
      this.fqdn = fqdn;
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
    
    public String getMultiClusterAppId() {
        return this.multiClusterAppId;
    }

    public void setMultiClusterAppId(String multiClusterAppId) {
      this.multiClusterAppId = multiClusterAppId;
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
    
    public List<String> getProjectIds() {
        return this.projectIds;
    }

    public void setProjectIds(List<String> projectIds) {
      this.projectIds = projectIds;
    }
    
    public String getProviderId() {
        return this.providerId;
    }

    public void setProviderId(String providerId) {
      this.providerId = providerId;
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
    
    public GlobalDnsStatus getStatus() {
        return this.status;
    }

    public void setStatus(GlobalDnsStatus status) {
      this.status = status;
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
    
    public Integer getTtl() {
        return this.ttl;
    }

    public void setTtl(Integer ttl) {
      this.ttl = ttl;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}

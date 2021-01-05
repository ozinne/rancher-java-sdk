package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.DnsLabel;

import java.util.Map;
import java.util.List;

public class ClusterScan extends AbstractType {
    
    private Map<String, Object> annotations;
    
    private String clusterId;
    
    private String created;
    
    private String creatorId;
    
    private Map<String, Object> labels;
    
    private DnsLabel name;
    
    private String namespaceId;
    
    private List<OwnerReference> ownerReferences;
    
    private String removed;
    
    private String runType;
    
    private ClusterScanConfig scanConfig;
    
    private String scanType;
    
    private String state;
    
    private ClusterScanStatus status;
    
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
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public String getRunType() {
        return this.runType;
    }

    public void setRunType(String runType) {
      this.runType = runType;
    }
    
    public ClusterScanConfig getScanConfig() {
        return this.scanConfig;
    }

    public void setScanConfig(ClusterScanConfig scanConfig) {
      this.scanConfig = scanConfig;
    }
    
    public String getScanType() {
        return this.scanType;
    }

    public void setScanType(String scanType) {
      this.scanType = scanType;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public ClusterScanStatus getStatus() {
        return this.status;
    }

    public void setStatus(ClusterScanStatus status) {
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
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}

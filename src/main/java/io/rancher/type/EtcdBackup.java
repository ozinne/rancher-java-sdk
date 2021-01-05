package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.DnsLabel;

import java.util.List;
import java.util.Map;

public class EtcdBackup extends AbstractType {
    
    private Map<String, Object> annotations;
    
    private BackupConfig backupConfig;
    
    private String clusterId;
    
    private String created;
    
    private String creatorId;
    
    private String filename;
    
    private Map<String, Object> labels;
    
    private Boolean manual;
    
    private DnsLabel name;
    
    private String namespaceId;
    
    private List<OwnerReference> ownerReferences;
    
    private String removed;
    
    private String state;
    
    private EtcdBackupStatus status;
    
    private String transitioning;
    
    private String transitioningMessage;
    
    private String uuid;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public BackupConfig getBackupConfig() {
        return this.backupConfig;
    }

    public void setBackupConfig(BackupConfig backupConfig) {
      this.backupConfig = backupConfig;
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
    
    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
      this.filename = filename;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public Boolean getManual() {
        return this.manual;
    }

    public void setManual(Boolean manual) {
      this.manual = manual;
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
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public EtcdBackupStatus getStatus() {
        return this.status;
    }

    public void setStatus(EtcdBackupStatus status) {
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

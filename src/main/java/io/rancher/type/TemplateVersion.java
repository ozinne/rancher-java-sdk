package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.DnsLabel;

import java.util.List;
import java.util.Map;

public class TemplateVersion extends AbstractType {
    
    private Map<String, Object> annotations;
    
    private String appReadme;
    
    private String created;
    
    private String creatorId;
    
    private String digest;
    
    private String externalId;
    
    private Map<String, Object> files;
    
    private String kubeVersion;
    
    private Map<String, Object> labels;
    
    private DnsLabel name;
    
    private List<OwnerReference> ownerReferences;
    
    private List<Question> questions;
    
    private String rancherMaxVersion;
    
    private String rancherMinVersion;
    
    private String rancherVersion;
    
    private String readme;
    
    private String removed;
    
    private String requiredNamespace;
    
    private String state;
    
    private TemplateVersionStatus status;
    
    private String transitioning;
    
    private String transitioningMessage;
    
    private Map<String, Object> upgradeVersionLinks;
    
    private String uuid;
    
    private String version;
    
    private String versionDir;
    
    private String versionName;
    
    private List<String> versionUrls;
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public String getAppReadme() {
        return this.appReadme;
    }

    public void setAppReadme(String appReadme) {
      this.appReadme = appReadme;
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
    
    public String getDigest() {
        return this.digest;
    }

    public void setDigest(String digest) {
      this.digest = digest;
    }
    
    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
      this.externalId = externalId;
    }
    
    public Map<String, Object> getFiles() {
        return this.files;
    }

    public void setFiles(Map<String, Object> files) {
      this.files = files;
    }
    
    public String getKubeVersion() {
        return this.kubeVersion;
    }

    public void setKubeVersion(String kubeVersion) {
      this.kubeVersion = kubeVersion;
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
    
    public String getRancherMaxVersion() {
        return this.rancherMaxVersion;
    }

    public void setRancherMaxVersion(String rancherMaxVersion) {
      this.rancherMaxVersion = rancherMaxVersion;
    }
    
    public String getRancherMinVersion() {
        return this.rancherMinVersion;
    }

    public void setRancherMinVersion(String rancherMinVersion) {
      this.rancherMinVersion = rancherMinVersion;
    }
    
    public String getRancherVersion() {
        return this.rancherVersion;
    }

    public void setRancherVersion(String rancherVersion) {
      this.rancherVersion = rancherVersion;
    }
    
    public String getReadme() {
        return this.readme;
    }

    public void setReadme(String readme) {
      this.readme = readme;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public String getRequiredNamespace() {
        return this.requiredNamespace;
    }

    public void setRequiredNamespace(String requiredNamespace) {
      this.requiredNamespace = requiredNamespace;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public TemplateVersionStatus getStatus() {
        return this.status;
    }

    public void setStatus(TemplateVersionStatus status) {
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
    
    public Map<String, Object> getUpgradeVersionLinks() {
        return this.upgradeVersionLinks;
    }

    public void setUpgradeVersionLinks(Map<String, Object> upgradeVersionLinks) {
      this.upgradeVersionLinks = upgradeVersionLinks;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
      this.version = version;
    }
    
    public String getVersionDir() {
        return this.versionDir;
    }

    public void setVersionDir(String versionDir) {
      this.versionDir = versionDir;
    }
    
    public String getVersionName() {
        return this.versionName;
    }

    public void setVersionName(String versionName) {
      this.versionName = versionName;
    }
    
    public List<String> getVersionUrls() {
        return this.versionUrls;
    }

    public void setVersionUrls(List<String> versionUrls) {
      this.versionUrls = versionUrls;
    }
    
}

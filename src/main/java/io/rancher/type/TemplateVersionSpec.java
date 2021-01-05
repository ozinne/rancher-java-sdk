package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;
import java.util.Map;

public class TemplateVersionSpec extends AbstractType {
    
    private String appReadme;
    
    private String digest;
    
    private String externalId;
    
    private Map<String, Object> files;
    
    private String kubeVersion;
    
    private List<Question> questions;
    
    private String rancherMaxVersion;
    
    private String rancherMinVersion;
    
    private String rancherVersion;
    
    private String readme;
    
    private String requiredNamespace;
    
    private Map<String, Object> upgradeVersionLinks;
    
    private String version;
    
    private String versionDir;
    
    private String versionName;
    
    private List<String> versionUrls;
    
    public String getAppReadme() {
        return this.appReadme;
    }

    public void setAppReadme(String appReadme) {
      this.appReadme = appReadme;
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
    
    public String getRequiredNamespace() {
        return this.requiredNamespace;
    }

    public void setRequiredNamespace(String requiredNamespace) {
      this.requiredNamespace = requiredNamespace;
    }
    
    public Map<String, Object> getUpgradeVersionLinks() {
        return this.upgradeVersionLinks;
    }

    public void setUpgradeVersionLinks(Map<String, Object> upgradeVersionLinks) {
      this.upgradeVersionLinks = upgradeVersionLinks;
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

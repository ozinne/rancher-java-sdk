package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;
import java.util.List;

public class KubeAPIService extends AbstractType {
    
    private Map<String, Object> admissionConfiguration;
    
    private Boolean alwaysPullImages;
    
    private AuditLog auditLog;
    
    private EventRateLimit eventRateLimit;
    
    private Map<String, Object> extraArgs;
    
    private List<String> extraBinds;
    
    private List<String> extraEnv;
    
    private String image;
    
    private Boolean podSecurityPolicy;
    
    private SecretsEncryptionConfig secretsEncryptionConfig;
    
    private String serviceClusterIpRange;
    
    private String serviceNodePortRange;
    
    public Map<String, Object> getAdmissionConfiguration() {
        return this.admissionConfiguration;
    }

    public void setAdmissionConfiguration(Map<String, Object> admissionConfiguration) {
      this.admissionConfiguration = admissionConfiguration;
    }
    
    public Boolean getAlwaysPullImages() {
        return this.alwaysPullImages;
    }

    public void setAlwaysPullImages(Boolean alwaysPullImages) {
      this.alwaysPullImages = alwaysPullImages;
    }
    
    public AuditLog getAuditLog() {
        return this.auditLog;
    }

    public void setAuditLog(AuditLog auditLog) {
      this.auditLog = auditLog;
    }
    
    public EventRateLimit getEventRateLimit() {
        return this.eventRateLimit;
    }

    public void setEventRateLimit(EventRateLimit eventRateLimit) {
      this.eventRateLimit = eventRateLimit;
    }
    
    public Map<String, Object> getExtraArgs() {
        return this.extraArgs;
    }

    public void setExtraArgs(Map<String, Object> extraArgs) {
      this.extraArgs = extraArgs;
    }
    
    public List<String> getExtraBinds() {
        return this.extraBinds;
    }

    public void setExtraBinds(List<String> extraBinds) {
      this.extraBinds = extraBinds;
    }
    
    public List<String> getExtraEnv() {
        return this.extraEnv;
    }

    public void setExtraEnv(List<String> extraEnv) {
      this.extraEnv = extraEnv;
    }
    
    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
      this.image = image;
    }
    
    public Boolean getPodSecurityPolicy() {
        return this.podSecurityPolicy;
    }

    public void setPodSecurityPolicy(Boolean podSecurityPolicy) {
      this.podSecurityPolicy = podSecurityPolicy;
    }
    
    public SecretsEncryptionConfig getSecretsEncryptionConfig() {
        return this.secretsEncryptionConfig;
    }

    public void setSecretsEncryptionConfig(SecretsEncryptionConfig secretsEncryptionConfig) {
      this.secretsEncryptionConfig = secretsEncryptionConfig;
    }
    
    public String getServiceClusterIpRange() {
        return this.serviceClusterIpRange;
    }

    public void setServiceClusterIpRange(String serviceClusterIpRange) {
      this.serviceClusterIpRange = serviceClusterIpRange;
    }
    
    public String getServiceNodePortRange() {
        return this.serviceNodePortRange;
    }

    public void setServiceNodePortRange(String serviceNodePortRange) {
      this.serviceNodePortRange = serviceNodePortRange;
    }
    
}

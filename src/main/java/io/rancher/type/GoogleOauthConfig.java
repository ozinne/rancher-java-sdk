package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.DnsLabel;
import io.rancher.extend.Password;

import java.util.List;
import java.util.Map;

public class GoogleOauthConfig extends AbstractType {
    
    private String accessMode;
    
    private String adminEmail;
    
    private List<String> allowedPrincipalIds;
    
    private Map<String, Object> annotations;
    
    private String created;
    
    private String creatorId;
    
    private Boolean enabled;
    
    private String hostname;
    
    private Map<String, Object> labels;
    
    private DnsLabel name;
    
    private Boolean nestedGroupMembershipEnabled;
    
    private Password oauthCredential;
    
    private List<OwnerReference> ownerReferences;
    
    private String removed;
    
    private Password serviceAccountCredential;
    
    private String type;
    
    private String userInfoEndpoint;
    
    private String uuid;
    
    public String getAccessMode() {
        return this.accessMode;
    }

    public void setAccessMode(String accessMode) {
      this.accessMode = accessMode;
    }
    
    public String getAdminEmail() {
        return this.adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
      this.adminEmail = adminEmail;
    }
    
    public List<String> getAllowedPrincipalIds() {
        return this.allowedPrincipalIds;
    }

    public void setAllowedPrincipalIds(List<String> allowedPrincipalIds) {
      this.allowedPrincipalIds = allowedPrincipalIds;
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
    
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
    }
    
    public String getHostname() {
        return this.hostname;
    }

    public void setHostname(String hostname) {
      this.hostname = hostname;
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
    
    public Boolean getNestedGroupMembershipEnabled() {
        return this.nestedGroupMembershipEnabled;
    }

    public void setNestedGroupMembershipEnabled(Boolean nestedGroupMembershipEnabled) {
      this.nestedGroupMembershipEnabled = nestedGroupMembershipEnabled;
    }
    
    public Password getOauthCredential() {
        return this.oauthCredential;
    }

    public void setOauthCredential(Password oauthCredential) {
      this.oauthCredential = oauthCredential;
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
    
    public Password getServiceAccountCredential() {
        return this.serviceAccountCredential;
    }

    public void setServiceAccountCredential(Password serviceAccountCredential) {
      this.serviceAccountCredential = serviceAccountCredential;
    }
    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
      this.type = type;
    }
    
    public String getUserInfoEndpoint() {
        return this.userInfoEndpoint;
    }

    public void setUserInfoEndpoint(String userInfoEndpoint) {
      this.userInfoEndpoint = userInfoEndpoint;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}

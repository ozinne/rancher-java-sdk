package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.DnsLabel;
import io.rancher.extend.Password;

import java.util.List;
import java.util.Map;

public class ShibbolethConfig extends AbstractType {
    
    private String accessMode;
    
    private List<String> allowedPrincipalIds;
    
    private Map<String, Object> annotations;
    
    private String created;
    
    private String creatorId;
    
    private String displayNameField;
    
    private Boolean enabled;
    
    private String groupsField;
    
    private String idpMetadataContent;
    
    private Map<String, Object> labels;
    
    private DnsLabel name;
    
    private LdapFields openLdapConfig;
    
    private List<OwnerReference> ownerReferences;
    
    private String rancherApiHost;
    
    private String removed;
    
    private String spCert;
    
    private Password spKey;
    
    private String type;
    
    private String uidField;
    
    private String userNameField;
    
    private String uuid;
    
    public String getAccessMode() {
        return this.accessMode;
    }

    public void setAccessMode(String accessMode) {
      this.accessMode = accessMode;
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
    
    public String getDisplayNameField() {
        return this.displayNameField;
    }

    public void setDisplayNameField(String displayNameField) {
      this.displayNameField = displayNameField;
    }
    
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
    }
    
    public String getGroupsField() {
        return this.groupsField;
    }

    public void setGroupsField(String groupsField) {
      this.groupsField = groupsField;
    }
    
    public String getIdpMetadataContent() {
        return this.idpMetadataContent;
    }

    public void setIdpMetadataContent(String idpMetadataContent) {
      this.idpMetadataContent = idpMetadataContent;
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
    
    public LdapFields getOpenLdapConfig() {
        return this.openLdapConfig;
    }

    public void setOpenLdapConfig(LdapFields openLdapConfig) {
      this.openLdapConfig = openLdapConfig;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public String getRancherApiHost() {
        return this.rancherApiHost;
    }

    public void setRancherApiHost(String rancherApiHost) {
      this.rancherApiHost = rancherApiHost;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public String getSpCert() {
        return this.spCert;
    }

    public void setSpCert(String spCert) {
      this.spCert = spCert;
    }
    
    public Password getSpKey() {
        return this.spKey;
    }

    public void setSpKey(Password spKey) {
      this.spKey = spKey;
    }
    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
      this.type = type;
    }
    
    public String getUidField() {
        return this.uidField;
    }

    public void setUidField(String uidField) {
      this.uidField = uidField;
    }
    
    public String getUserNameField() {
        return this.userNameField;
    }

    public void setUserNameField(String userNameField) {
      this.userNameField = userNameField;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}

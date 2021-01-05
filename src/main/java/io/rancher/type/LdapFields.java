package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.Password;

import java.util.List;

public class LdapFields extends AbstractType {
    
    private String certificate;
    
    private Integer connectionTimeout;
    
    private String groupDNAttribute;
    
    private String groupMemberMappingAttribute;
    
    private String groupMemberUserAttribute;
    
    private String groupNameAttribute;
    
    private String groupObjectClass;
    
    private String groupSearchAttribute;
    
    private String groupSearchBase;
    
    private String groupSearchFilter;
    
    private Boolean nestedGroupMembershipEnabled;
    
    private Integer port;
    
    private List<String> servers;
    
    private String serviceAccountDistinguishedName;
    
    private Password serviceAccountPassword;
    
    private Boolean tls;
    
    private Integer userDisabledBitMask;
    
    private String userEnabledAttribute;
    
    private String userLoginAttribute;
    
    private String userMemberAttribute;
    
    private String userNameAttribute;
    
    private String userObjectClass;
    
    private String userSearchAttribute;
    
    private String userSearchBase;
    
    private String userSearchFilter;
    
    public String getCertificate() {
        return this.certificate;
    }

    public void setCertificate(String certificate) {
      this.certificate = certificate;
    }
    
    public Integer getConnectionTimeout() {
        return this.connectionTimeout;
    }

    public void setConnectionTimeout(Integer connectionTimeout) {
      this.connectionTimeout = connectionTimeout;
    }
    
    public String getGroupDNAttribute() {
        return this.groupDNAttribute;
    }

    public void setGroupDNAttribute(String groupDNAttribute) {
      this.groupDNAttribute = groupDNAttribute;
    }
    
    public String getGroupMemberMappingAttribute() {
        return this.groupMemberMappingAttribute;
    }

    public void setGroupMemberMappingAttribute(String groupMemberMappingAttribute) {
      this.groupMemberMappingAttribute = groupMemberMappingAttribute;
    }
    
    public String getGroupMemberUserAttribute() {
        return this.groupMemberUserAttribute;
    }

    public void setGroupMemberUserAttribute(String groupMemberUserAttribute) {
      this.groupMemberUserAttribute = groupMemberUserAttribute;
    }
    
    public String getGroupNameAttribute() {
        return this.groupNameAttribute;
    }

    public void setGroupNameAttribute(String groupNameAttribute) {
      this.groupNameAttribute = groupNameAttribute;
    }
    
    public String getGroupObjectClass() {
        return this.groupObjectClass;
    }

    public void setGroupObjectClass(String groupObjectClass) {
      this.groupObjectClass = groupObjectClass;
    }
    
    public String getGroupSearchAttribute() {
        return this.groupSearchAttribute;
    }

    public void setGroupSearchAttribute(String groupSearchAttribute) {
      this.groupSearchAttribute = groupSearchAttribute;
    }
    
    public String getGroupSearchBase() {
        return this.groupSearchBase;
    }

    public void setGroupSearchBase(String groupSearchBase) {
      this.groupSearchBase = groupSearchBase;
    }
    
    public String getGroupSearchFilter() {
        return this.groupSearchFilter;
    }

    public void setGroupSearchFilter(String groupSearchFilter) {
      this.groupSearchFilter = groupSearchFilter;
    }
    
    public Boolean getNestedGroupMembershipEnabled() {
        return this.nestedGroupMembershipEnabled;
    }

    public void setNestedGroupMembershipEnabled(Boolean nestedGroupMembershipEnabled) {
      this.nestedGroupMembershipEnabled = nestedGroupMembershipEnabled;
    }
    
    public Integer getPort() {
        return this.port;
    }

    public void setPort(Integer port) {
      this.port = port;
    }
    
    public List<String> getServers() {
        return this.servers;
    }

    public void setServers(List<String> servers) {
      this.servers = servers;
    }
    
    public String getServiceAccountDistinguishedName() {
        return this.serviceAccountDistinguishedName;
    }

    public void setServiceAccountDistinguishedName(String serviceAccountDistinguishedName) {
      this.serviceAccountDistinguishedName = serviceAccountDistinguishedName;
    }
    
    public Password getServiceAccountPassword() {
        return this.serviceAccountPassword;
    }

    public void setServiceAccountPassword(Password serviceAccountPassword) {
      this.serviceAccountPassword = serviceAccountPassword;
    }
    
    public Boolean getTls() {
        return this.tls;
    }

    public void setTls(Boolean tls) {
      this.tls = tls;
    }
    
    public Integer getUserDisabledBitMask() {
        return this.userDisabledBitMask;
    }

    public void setUserDisabledBitMask(Integer userDisabledBitMask) {
      this.userDisabledBitMask = userDisabledBitMask;
    }
    
    public String getUserEnabledAttribute() {
        return this.userEnabledAttribute;
    }

    public void setUserEnabledAttribute(String userEnabledAttribute) {
      this.userEnabledAttribute = userEnabledAttribute;
    }
    
    public String getUserLoginAttribute() {
        return this.userLoginAttribute;
    }

    public void setUserLoginAttribute(String userLoginAttribute) {
      this.userLoginAttribute = userLoginAttribute;
    }
    
    public String getUserMemberAttribute() {
        return this.userMemberAttribute;
    }

    public void setUserMemberAttribute(String userMemberAttribute) {
      this.userMemberAttribute = userMemberAttribute;
    }
    
    public String getUserNameAttribute() {
        return this.userNameAttribute;
    }

    public void setUserNameAttribute(String userNameAttribute) {
      this.userNameAttribute = userNameAttribute;
    }
    
    public String getUserObjectClass() {
        return this.userObjectClass;
    }

    public void setUserObjectClass(String userObjectClass) {
      this.userObjectClass = userObjectClass;
    }
    
    public String getUserSearchAttribute() {
        return this.userSearchAttribute;
    }

    public void setUserSearchAttribute(String userSearchAttribute) {
      this.userSearchAttribute = userSearchAttribute;
    }
    
    public String getUserSearchBase() {
        return this.userSearchBase;
    }

    public void setUserSearchBase(String userSearchBase) {
      this.userSearchBase = userSearchBase;
    }
    
    public String getUserSearchFilter() {
        return this.userSearchFilter;
    }

    public void setUserSearchFilter(String userSearchFilter) {
      this.userSearchFilter = userSearchFilter;
    }
    
}

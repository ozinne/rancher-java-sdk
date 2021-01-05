package io.rancher.type;

import io.rancher.base.AbstractType;

public class Member extends AbstractType {
    
    private String accessType;
    
    private String groupPrincipalId;
    
    private String userPrincipalId;
    
    public String getAccessType() {
        return this.accessType;
    }

    public void setAccessType(String accessType) {
      this.accessType = accessType;
    }
    
    public String getGroupPrincipalId() {
        return this.groupPrincipalId;
    }

    public void setGroupPrincipalId(String groupPrincipalId) {
      this.groupPrincipalId = groupPrincipalId;
    }
    
    public String getUserPrincipalId() {
        return this.userPrincipalId;
    }

    public void setUserPrincipalId(String userPrincipalId) {
      this.userPrincipalId = userPrincipalId;
    }
    
}

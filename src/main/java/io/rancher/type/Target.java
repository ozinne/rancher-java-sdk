package io.rancher.type;

import io.rancher.base.AbstractType;

public class Target extends AbstractType {
    
    private String appId;
    
    private String healthState;
    
    private String projectId;
    
    private String state;
    
    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
      this.appId = appId;
    }
    
    public String getHealthState() {
        return this.healthState;
    }

    public void setHealthState(String healthState) {
      this.healthState = healthState;
    }
    
    public String getProjectId() {
        return this.projectId;
    }

    public void setProjectId(String projectId) {
      this.projectId = projectId;
    }
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
}

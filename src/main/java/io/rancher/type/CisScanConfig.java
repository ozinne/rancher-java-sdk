package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class CisScanConfig extends AbstractType {
    
    private Boolean debugMaster;
    
    private Boolean debugWorker;
    
    private String overrideBenchmarkVersion;
    
    private List<String> overrideSkip;
    
    private String profile;
    
    public Boolean getDebugMaster() {
        return this.debugMaster;
    }

    public void setDebugMaster(Boolean debugMaster) {
      this.debugMaster = debugMaster;
    }
    
    public Boolean getDebugWorker() {
        return this.debugWorker;
    }

    public void setDebugWorker(Boolean debugWorker) {
      this.debugWorker = debugWorker;
    }
    
    public String getOverrideBenchmarkVersion() {
        return this.overrideBenchmarkVersion;
    }

    public void setOverrideBenchmarkVersion(String overrideBenchmarkVersion) {
      this.overrideBenchmarkVersion = overrideBenchmarkVersion;
    }
    
    public List<String> getOverrideSkip() {
        return this.overrideSkip;
    }

    public void setOverrideSkip(List<String> overrideSkip) {
      this.overrideSkip = overrideSkip;
    }
    
    public String getProfile() {
        return this.profile;
    }

    public void setProfile(String profile) {
      this.profile = profile;
    }
    
}

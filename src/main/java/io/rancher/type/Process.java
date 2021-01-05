package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;
import java.util.Map;

public class Process extends AbstractType {
    
    private List<String> args;
    
    private List<String> binds;
    
    private List<String> command;
    
    private List<String> env;
    
    private HealthCheck healthCheck;
    
    private String image;
    
    private String imageRegistryAuthConfig;
    
    private Map<String, Object> labels;
    
    private String name;
    
    private String networkMode;
    
    private String pidMode;
    
    private Boolean privileged;
    
    private List<String> publish;
    
    private String restartPolicy;
    
    private String user;
    
    private List<String> volumesFrom;
    
    public List<String> getArgs() {
        return this.args;
    }

    public void setArgs(List<String> args) {
      this.args = args;
    }
    
    public List<String> getBinds() {
        return this.binds;
    }

    public void setBinds(List<String> binds) {
      this.binds = binds;
    }
    
    public List<String> getCommand() {
        return this.command;
    }

    public void setCommand(List<String> command) {
      this.command = command;
    }
    
    public List<String> getEnv() {
        return this.env;
    }

    public void setEnv(List<String> env) {
      this.env = env;
    }
    
    public HealthCheck getHealthCheck() {
        return this.healthCheck;
    }

    public void setHealthCheck(HealthCheck healthCheck) {
      this.healthCheck = healthCheck;
    }
    
    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
      this.image = image;
    }
    
    public String getImageRegistryAuthConfig() {
        return this.imageRegistryAuthConfig;
    }

    public void setImageRegistryAuthConfig(String imageRegistryAuthConfig) {
      this.imageRegistryAuthConfig = imageRegistryAuthConfig;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getNetworkMode() {
        return this.networkMode;
    }

    public void setNetworkMode(String networkMode) {
      this.networkMode = networkMode;
    }
    
    public String getPidMode() {
        return this.pidMode;
    }

    public void setPidMode(String pidMode) {
      this.pidMode = pidMode;
    }
    
    public Boolean getPrivileged() {
        return this.privileged;
    }

    public void setPrivileged(Boolean privileged) {
      this.privileged = privileged;
    }
    
    public List<String> getPublish() {
        return this.publish;
    }

    public void setPublish(List<String> publish) {
      this.publish = publish;
    }
    
    public String getRestartPolicy() {
        return this.restartPolicy;
    }

    public void setRestartPolicy(String restartPolicy) {
      this.restartPolicy = restartPolicy;
    }
    
    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
      this.user = user;
    }
    
    public List<String> getVolumesFrom() {
        return this.volumesFrom;
    }

    public void setVolumesFrom(List<String> volumesFrom) {
      this.volumesFrom = volumesFrom;
    }
    
}

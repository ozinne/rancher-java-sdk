package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;

public class AuditLogConfig extends AbstractType {
    
    private String format;
    
    private Integer maxAge;
    
    private Integer maxBackup;
    
    private Integer maxSize;
    
    private String path;
    
    private Map<String, Object> policy;
    
    public String getFormat() {
        return this.format;
    }

    public void setFormat(String format) {
      this.format = format;
    }
    
    public Integer getMaxAge() {
        return this.maxAge;
    }

    public void setMaxAge(Integer maxAge) {
      this.maxAge = maxAge;
    }
    
    public Integer getMaxBackup() {
        return this.maxBackup;
    }

    public void setMaxBackup(Integer maxBackup) {
      this.maxBackup = maxBackup;
    }
    
    public Integer getMaxSize() {
        return this.maxSize;
    }

    public void setMaxSize(Integer maxSize) {
      this.maxSize = maxSize;
    }
    
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
      this.path = path;
    }
    
    public Map<String, Object> getPolicy() {
        return this.policy;
    }

    public void setPolicy(Map<String, Object> policy) {
      this.policy = policy;
    }
    
}

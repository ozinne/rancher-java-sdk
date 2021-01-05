package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.Map;
import java.util.List;

public class RkeConfigNodePlan extends AbstractType {
    
    private String address;
    
    private Map<String, Object> annotations;
    
    private List<File> files;
    
    private Map<String, Object> labels;
    
    private List<PortCheck> portChecks;
    
    private Map<String, Object> processes;
    
    private List<RkeTaint> taints;
    
    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
      this.address = address;
    }
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public List<File> getFiles() {
        return this.files;
    }

    public void setFiles(List<File> files) {
      this.files = files;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public List<PortCheck> getPortChecks() {
        return this.portChecks;
    }

    public void setPortChecks(List<PortCheck> portChecks) {
      this.portChecks = portChecks;
    }
    
    public Map<String, Object> getProcesses() {
        return this.processes;
    }

    public void setProcesses(Map<String, Object> processes) {
      this.processes = processes;
    }
    
    public List<RkeTaint> getTaints() {
        return this.taints;
    }

    public void setTaints(List<RkeTaint> taints) {
      this.taints = taints;
    }
    
}

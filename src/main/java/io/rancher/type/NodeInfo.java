package io.rancher.type;

import io.rancher.base.AbstractType;

public class NodeInfo extends AbstractType {
    
    private CpuInfo cpu;
    
    private KubernetesInfo kubernetes;
    
    private MemoryInfo memory;
    
    private OsInfo os;
    
    public CpuInfo getCpu() {
        return this.cpu;
    }

    public void setCpu(CpuInfo cpu) {
      this.cpu = cpu;
    }
    
    public KubernetesInfo getKubernetes() {
        return this.kubernetes;
    }

    public void setKubernetes(KubernetesInfo kubernetes) {
      this.kubernetes = kubernetes;
    }
    
    public MemoryInfo getMemory() {
        return this.memory;
    }

    public void setMemory(MemoryInfo memory) {
      this.memory = memory;
    }
    
    public OsInfo getOs() {
        return this.os;
    }

    public void setOs(OsInfo os) {
      this.os = os;
    }
    
}

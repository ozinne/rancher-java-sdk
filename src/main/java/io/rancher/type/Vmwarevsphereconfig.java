package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.Password;

import java.util.List;

public class Vmwarevsphereconfig extends AbstractType {
    
    private String boot2dockerUrl;
    
    private List<String> cfgparam;
    
    private String cloneFrom;
    
    private String cloudConfig;
    
    private String cloudinit;
    
    private String contentLibrary;
    
    private String cpuCount;
    
    private String creationType;
    
    private List<String> customAttribute;
    
    private String datacenter;
    
    private String datastore;
    
    private String datastoreCluster;
    
    private String diskSize;
    
    private String folder;
    
    private String hostsystem;
    
    private String memorySize;
    
    private List<String> network;
    
    private Password password;
    
    private String pool;
    
    private String sshPassword;
    
    private String sshPort;
    
    private String sshUser;
    
    private String sshUserGroup;
    
    private List<String> tag;
    
    private String username;
    
    private String vappIpallocationpolicy;
    
    private String vappIpprotocol;
    
    private List<String> vappProperty;
    
    private String vappTransport;
    
    private String vcenter;
    
    private String vcenterPort;
    
    public String getBoot2dockerUrl() {
        return this.boot2dockerUrl;
    }

    public void setBoot2dockerUrl(String boot2dockerUrl) {
      this.boot2dockerUrl = boot2dockerUrl;
    }
    
    public List<String> getCfgparam() {
        return this.cfgparam;
    }

    public void setCfgparam(List<String> cfgparam) {
      this.cfgparam = cfgparam;
    }
    
    public String getCloneFrom() {
        return this.cloneFrom;
    }

    public void setCloneFrom(String cloneFrom) {
      this.cloneFrom = cloneFrom;
    }
    
    public String getCloudConfig() {
        return this.cloudConfig;
    }

    public void setCloudConfig(String cloudConfig) {
      this.cloudConfig = cloudConfig;
    }
    
    public String getCloudinit() {
        return this.cloudinit;
    }

    public void setCloudinit(String cloudinit) {
      this.cloudinit = cloudinit;
    }
    
    public String getContentLibrary() {
        return this.contentLibrary;
    }

    public void setContentLibrary(String contentLibrary) {
      this.contentLibrary = contentLibrary;
    }
    
    public String getCpuCount() {
        return this.cpuCount;
    }

    public void setCpuCount(String cpuCount) {
      this.cpuCount = cpuCount;
    }
    
    public String getCreationType() {
        return this.creationType;
    }

    public void setCreationType(String creationType) {
      this.creationType = creationType;
    }
    
    public List<String> getCustomAttribute() {
        return this.customAttribute;
    }

    public void setCustomAttribute(List<String> customAttribute) {
      this.customAttribute = customAttribute;
    }
    
    public String getDatacenter() {
        return this.datacenter;
    }

    public void setDatacenter(String datacenter) {
      this.datacenter = datacenter;
    }
    
    public String getDatastore() {
        return this.datastore;
    }

    public void setDatastore(String datastore) {
      this.datastore = datastore;
    }
    
    public String getDatastoreCluster() {
        return this.datastoreCluster;
    }

    public void setDatastoreCluster(String datastoreCluster) {
      this.datastoreCluster = datastoreCluster;
    }
    
    public String getDiskSize() {
        return this.diskSize;
    }

    public void setDiskSize(String diskSize) {
      this.diskSize = diskSize;
    }
    
    public String getFolder() {
        return this.folder;
    }

    public void setFolder(String folder) {
      this.folder = folder;
    }
    
    public String getHostsystem() {
        return this.hostsystem;
    }

    public void setHostsystem(String hostsystem) {
      this.hostsystem = hostsystem;
    }
    
    public String getMemorySize() {
        return this.memorySize;
    }

    public void setMemorySize(String memorySize) {
      this.memorySize = memorySize;
    }
    
    public List<String> getNetwork() {
        return this.network;
    }

    public void setNetwork(List<String> network) {
      this.network = network;
    }
    
    public Password getPassword() {
        return this.password;
    }

    public void setPassword(Password password) {
      this.password = password;
    }
    
    public String getPool() {
        return this.pool;
    }

    public void setPool(String pool) {
      this.pool = pool;
    }
    
    public String getSshPassword() {
        return this.sshPassword;
    }

    public void setSshPassword(String sshPassword) {
      this.sshPassword = sshPassword;
    }
    
    public String getSshPort() {
        return this.sshPort;
    }

    public void setSshPort(String sshPort) {
      this.sshPort = sshPort;
    }
    
    public String getSshUser() {
        return this.sshUser;
    }

    public void setSshUser(String sshUser) {
      this.sshUser = sshUser;
    }
    
    public String getSshUserGroup() {
        return this.sshUserGroup;
    }

    public void setSshUserGroup(String sshUserGroup) {
      this.sshUserGroup = sshUserGroup;
    }
    
    public List<String> getTag() {
        return this.tag;
    }

    public void setTag(List<String> tag) {
      this.tag = tag;
    }
    
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
      this.username = username;
    }
    
    public String getVappIpallocationpolicy() {
        return this.vappIpallocationpolicy;
    }

    public void setVappIpallocationpolicy(String vappIpallocationpolicy) {
      this.vappIpallocationpolicy = vappIpallocationpolicy;
    }
    
    public String getVappIpprotocol() {
        return this.vappIpprotocol;
    }

    public void setVappIpprotocol(String vappIpprotocol) {
      this.vappIpprotocol = vappIpprotocol;
    }
    
    public List<String> getVappProperty() {
        return this.vappProperty;
    }

    public void setVappProperty(List<String> vappProperty) {
      this.vappProperty = vappProperty;
    }
    
    public String getVappTransport() {
        return this.vappTransport;
    }

    public void setVappTransport(String vappTransport) {
      this.vappTransport = vappTransport;
    }
    
    public String getVcenter() {
        return this.vcenter;
    }

    public void setVcenter(String vcenter) {
      this.vcenter = vcenter;
    }
    
    public String getVcenterPort() {
        return this.vcenterPort;
    }

    public void setVcenterPort(String vcenterPort) {
      this.vcenterPort = vcenterPort;
    }
    
}

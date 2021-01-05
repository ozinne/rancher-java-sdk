package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.Password;

public class TencentEngineConfig extends AbstractType {
    
    private Integer bandwidth;
    
    private String bandwidthType;
    
    private String clusterCidr;
    
    private String clusterDesc;
    
    private String clusterName;
    
    private String clusterVersion;
    
    private Integer cpu;
    
    private String cvmType;
    
    private String driverName;
    
    private Boolean emptyCluster;
    
    private Integer ignoreClusterCidrConflict;
    
    private String instanceType;
    
    private Integer isVpcGateway;
    
    private String keyId;
    
    private String masterSubnetId;
    
    private Integer mem;
    
    private String name;
    
    private Integer nodeCount;
    
    private String osName;
    
    private String password;
    
    private Integer period;
    
    private Integer projectId;
    
    private String region;
    
    private String renewFlag;
    
    private Integer rootSize;
    
    private String rootType;
    
    private String secretId;
    
    private Password secretKey;
    
    private String sgId;
    
    private Integer storageSize;
    
    private String storageType;
    
    private String subnetId;
    
    private String userScript;
    
    private String vpcId;
    
    private Integer wanIp;
    
    private String zoneId;
    
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
      this.bandwidth = bandwidth;
    }
    
    public String getBandwidthType() {
        return this.bandwidthType;
    }

    public void setBandwidthType(String bandwidthType) {
      this.bandwidthType = bandwidthType;
    }
    
    public String getClusterCidr() {
        return this.clusterCidr;
    }

    public void setClusterCidr(String clusterCidr) {
      this.clusterCidr = clusterCidr;
    }
    
    public String getClusterDesc() {
        return this.clusterDesc;
    }

    public void setClusterDesc(String clusterDesc) {
      this.clusterDesc = clusterDesc;
    }
    
    public String getClusterName() {
        return this.clusterName;
    }

    public void setClusterName(String clusterName) {
      this.clusterName = clusterName;
    }
    
    public String getClusterVersion() {
        return this.clusterVersion;
    }

    public void setClusterVersion(String clusterVersion) {
      this.clusterVersion = clusterVersion;
    }
    
    public Integer getCpu() {
        return this.cpu;
    }

    public void setCpu(Integer cpu) {
      this.cpu = cpu;
    }
    
    public String getCvmType() {
        return this.cvmType;
    }

    public void setCvmType(String cvmType) {
      this.cvmType = cvmType;
    }
    
    public String getDriverName() {
        return this.driverName;
    }

    public void setDriverName(String driverName) {
      this.driverName = driverName;
    }
    
    public Boolean getEmptyCluster() {
        return this.emptyCluster;
    }

    public void setEmptyCluster(Boolean emptyCluster) {
      this.emptyCluster = emptyCluster;
    }
    
    public Integer getIgnoreClusterCidrConflict() {
        return this.ignoreClusterCidrConflict;
    }

    public void setIgnoreClusterCidrConflict(Integer ignoreClusterCidrConflict) {
      this.ignoreClusterCidrConflict = ignoreClusterCidrConflict;
    }
    
    public String getInstanceType() {
        return this.instanceType;
    }

    public void setInstanceType(String instanceType) {
      this.instanceType = instanceType;
    }
    
    public Integer getIsVpcGateway() {
        return this.isVpcGateway;
    }

    public void setIsVpcGateway(Integer isVpcGateway) {
      this.isVpcGateway = isVpcGateway;
    }
    
    public String getKeyId() {
        return this.keyId;
    }

    public void setKeyId(String keyId) {
      this.keyId = keyId;
    }
    
    public String getMasterSubnetId() {
        return this.masterSubnetId;
    }

    public void setMasterSubnetId(String masterSubnetId) {
      this.masterSubnetId = masterSubnetId;
    }
    
    public Integer getMem() {
        return this.mem;
    }

    public void setMem(Integer mem) {
      this.mem = mem;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    public void setNodeCount(Integer nodeCount) {
      this.nodeCount = nodeCount;
    }
    
    public String getOsName() {
        return this.osName;
    }

    public void setOsName(String osName) {
      this.osName = osName;
    }
    
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
      this.password = password;
    }
    
    public Integer getPeriod() {
        return this.period;
    }

    public void setPeriod(Integer period) {
      this.period = period;
    }
    
    public Integer getProjectId() {
        return this.projectId;
    }

    public void setProjectId(Integer projectId) {
      this.projectId = projectId;
    }
    
    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
      this.region = region;
    }
    
    public String getRenewFlag() {
        return this.renewFlag;
    }

    public void setRenewFlag(String renewFlag) {
      this.renewFlag = renewFlag;
    }
    
    public Integer getRootSize() {
        return this.rootSize;
    }

    public void setRootSize(Integer rootSize) {
      this.rootSize = rootSize;
    }
    
    public String getRootType() {
        return this.rootType;
    }

    public void setRootType(String rootType) {
      this.rootType = rootType;
    }
    
    public String getSecretId() {
        return this.secretId;
    }

    public void setSecretId(String secretId) {
      this.secretId = secretId;
    }
    
    public Password getSecretKey() {
        return this.secretKey;
    }

    public void setSecretKey(Password secretKey) {
      this.secretKey = secretKey;
    }
    
    public String getSgId() {
        return this.sgId;
    }

    public void setSgId(String sgId) {
      this.sgId = sgId;
    }
    
    public Integer getStorageSize() {
        return this.storageSize;
    }

    public void setStorageSize(Integer storageSize) {
      this.storageSize = storageSize;
    }
    
    public String getStorageType() {
        return this.storageType;
    }

    public void setStorageType(String storageType) {
      this.storageType = storageType;
    }
    
    public String getSubnetId() {
        return this.subnetId;
    }

    public void setSubnetId(String subnetId) {
      this.subnetId = subnetId;
    }
    
    public String getUserScript() {
        return this.userScript;
    }

    public void setUserScript(String userScript) {
      this.userScript = userScript;
    }
    
    public String getVpcId() {
        return this.vpcId;
    }

    public void setVpcId(String vpcId) {
      this.vpcId = vpcId;
    }
    
    public Integer getWanIp() {
        return this.wanIp;
    }

    public void setWanIp(Integer wanIp) {
      this.wanIp = wanIp;
    }
    
    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
      this.zoneId = zoneId;
    }
    
}

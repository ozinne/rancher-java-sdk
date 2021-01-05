package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.Password;

import java.util.List;

public class AmazonElasticContainerServiceConfig extends AbstractType {
    
    private String accessKey;
    
    private String ami;
    
    private Boolean associateWorkerNodePublicIp;
    
    private Integer desiredNodes;
    
    private String displayName;
    
    private String driverName;
    
    private Boolean ebsEncryption;
    
    private String instanceType;
    
    private String keyPairName;
    
    private String kubernetesVersion;
    
    private Integer maximumNodes;
    
    private Integer minimumNodes;
    
    private Integer nodeVolumeSize;
    
    private String region;
    
    private Password secretKey;
    
    private List<String> securityGroups;
    
    private String serviceRole;
    
    private String sessionToken;
    
    private List<String> subnets;
    
    private String userData;
    
    private String virtualNetwork;
    
    public String getAccessKey() {
        return this.accessKey;
    }

    public void setAccessKey(String accessKey) {
      this.accessKey = accessKey;
    }
    
    public String getAmi() {
        return this.ami;
    }

    public void setAmi(String ami) {
      this.ami = ami;
    }
    
    public Boolean getAssociateWorkerNodePublicIp() {
        return this.associateWorkerNodePublicIp;
    }

    public void setAssociateWorkerNodePublicIp(Boolean associateWorkerNodePublicIp) {
      this.associateWorkerNodePublicIp = associateWorkerNodePublicIp;
    }
    
    public Integer getDesiredNodes() {
        return this.desiredNodes;
    }

    public void setDesiredNodes(Integer desiredNodes) {
      this.desiredNodes = desiredNodes;
    }
    
    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
      this.displayName = displayName;
    }
    
    public String getDriverName() {
        return this.driverName;
    }

    public void setDriverName(String driverName) {
      this.driverName = driverName;
    }
    
    public Boolean getEbsEncryption() {
        return this.ebsEncryption;
    }

    public void setEbsEncryption(Boolean ebsEncryption) {
      this.ebsEncryption = ebsEncryption;
    }
    
    public String getInstanceType() {
        return this.instanceType;
    }

    public void setInstanceType(String instanceType) {
      this.instanceType = instanceType;
    }
    
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public void setKeyPairName(String keyPairName) {
      this.keyPairName = keyPairName;
    }
    
    public String getKubernetesVersion() {
        return this.kubernetesVersion;
    }

    public void setKubernetesVersion(String kubernetesVersion) {
      this.kubernetesVersion = kubernetesVersion;
    }
    
    public Integer getMaximumNodes() {
        return this.maximumNodes;
    }

    public void setMaximumNodes(Integer maximumNodes) {
      this.maximumNodes = maximumNodes;
    }
    
    public Integer getMinimumNodes() {
        return this.minimumNodes;
    }

    public void setMinimumNodes(Integer minimumNodes) {
      this.minimumNodes = minimumNodes;
    }
    
    public Integer getNodeVolumeSize() {
        return this.nodeVolumeSize;
    }

    public void setNodeVolumeSize(Integer nodeVolumeSize) {
      this.nodeVolumeSize = nodeVolumeSize;
    }
    
    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
      this.region = region;
    }
    
    public Password getSecretKey() {
        return this.secretKey;
    }

    public void setSecretKey(Password secretKey) {
      this.secretKey = secretKey;
    }
    
    public List<String> getSecurityGroups() {
        return this.securityGroups;
    }

    public void setSecurityGroups(List<String> securityGroups) {
      this.securityGroups = securityGroups;
    }
    
    public String getServiceRole() {
        return this.serviceRole;
    }

    public void setServiceRole(String serviceRole) {
      this.serviceRole = serviceRole;
    }
    
    public String getSessionToken() {
        return this.sessionToken;
    }

    public void setSessionToken(String sessionToken) {
      this.sessionToken = sessionToken;
    }
    
    public List<String> getSubnets() {
        return this.subnets;
    }

    public void setSubnets(List<String> subnets) {
      this.subnets = subnets;
    }
    
    public String getUserData() {
        return this.userData;
    }

    public void setUserData(String userData) {
      this.userData = userData;
    }
    
    public String getVirtualNetwork() {
        return this.virtualNetwork;
    }

    public void setVirtualNetwork(String virtualNetwork) {
      this.virtualNetwork = virtualNetwork;
    }
    
}

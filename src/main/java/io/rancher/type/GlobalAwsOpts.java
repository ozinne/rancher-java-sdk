package io.rancher.type;

import io.rancher.base.AbstractType;

public class GlobalAwsOpts extends AbstractType {
    
    private Boolean disableSecurityGroupIngress;
    
    private Boolean disableStrictZoneCheck;
    
    private String elbSecurityGroup;
    
    private String kubernetesClusterId;
    
    private String kubernetesClusterTag;
    
    private String roleArn;
    
    private String routetableId;
    
    private String subnetId;
    
    private String vpc;
    
    private String zone;

    public Boolean getDisableSecurityGroupIngress() {
        return disableSecurityGroupIngress;
    }

    public void setDisableSecurityGroupIngress(Boolean disableSecurityGroupIngress) {
        this.disableSecurityGroupIngress = disableSecurityGroupIngress;
    }

    public Boolean getDisableStrictZoneCheck() {
        return disableStrictZoneCheck;
    }

    public void setDisableStrictZoneCheck(Boolean disableStrictZoneCheck) {
        this.disableStrictZoneCheck = disableStrictZoneCheck;
    }

    public String getElbSecurityGroup() {
        return elbSecurityGroup;
    }

    public void setElbSecurityGroup(String elbSecurityGroup) {
        this.elbSecurityGroup = elbSecurityGroup;
    }

    public String getKubernetesClusterId() {
        return kubernetesClusterId;
    }

    public void setKubernetesClusterId(String kubernetesClusterId) {
        this.kubernetesClusterId = kubernetesClusterId;
    }

    public String getKubernetesClusterTag() {
        return kubernetesClusterTag;
    }

    public void setKubernetesClusterTag(String kubernetesClusterTag) {
        this.kubernetesClusterTag = kubernetesClusterTag;
    }

    public String getRoleArn() {
        return roleArn;
    }

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    public String getRoutetableId() {
        return routetableId;
    }

    public void setRoutetableId(String routetableId) {
        this.routetableId = routetableId;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getVpc() {
        return vpc;
    }

    public void setVpc(String vpc) {
        this.vpc = vpc;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}

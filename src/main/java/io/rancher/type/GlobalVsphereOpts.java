package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.Password;

public class GlobalVsphereOpts extends AbstractType {
    
    private String datacenter;
    
    private String datacenters;
    
    private String datastore;
    
    private Boolean insecureFlag;
    
    private Password password;
    
    private String port;
    
    private String server;
    
    private Integer soapRoundtripCount;
    
    private String user;
    
    private String vmName;
    
    private String vmUuid;
    
    private String workingDir;

    public String getDatacenter() {
        return datacenter;
    }

    public void setDatacenter(String datacenter) {
        this.datacenter = datacenter;
    }

    public String getDatacenters() {
        return datacenters;
    }

    public void setDatacenters(String datacenters) {
        this.datacenters = datacenters;
    }

    public String getDatastore() {
        return datastore;
    }

    public void setDatastore(String datastore) {
        this.datastore = datastore;
    }

    public Boolean getInsecureFlag() {
        return insecureFlag;
    }

    public void setInsecureFlag(Boolean insecureFlag) {
        this.insecureFlag = insecureFlag;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public Integer getSoapRoundtripCount() {
        return soapRoundtripCount;
    }

    public void setSoapRoundtripCount(Integer soapRoundtripCount) {
        this.soapRoundtripCount = soapRoundtripCount;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getVmName() {
        return vmName;
    }

    public void setVmName(String vmName) {
        this.vmName = vmName;
    }

    public String getVmUuid() {
        return vmUuid;
    }

    public void setVmUuid(String vmUuid) {
        this.vmUuid = vmUuid;
    }

    public String getWorkingDir() {
        return workingDir;
    }

    public void setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
    }
}

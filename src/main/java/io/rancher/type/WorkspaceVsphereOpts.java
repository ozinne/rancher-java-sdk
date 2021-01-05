package io.rancher.type;

import io.rancher.base.AbstractType;

public class WorkspaceVsphereOpts extends AbstractType {
    
    private String datacenter;
    
    private String defaultDatastore;
    
    private String folder;
    
    private String resourcepoolPath;
    
    private String server;

    public String getDatacenter() {
        return datacenter;
    }

    public void setDatacenter(String datacenter) {
        this.datacenter = datacenter;
    }

    public String getDefaultDatastore() {
        return defaultDatastore;
    }

    public void setDefaultDatastore(String defaultDatastore) {
        this.defaultDatastore = defaultDatastore;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public String getResourcepoolPath() {
        return resourcepoolPath;
    }

    public void setResourcepoolPath(String resourcepoolPath) {
        this.resourcepoolPath = resourcepoolPath;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }
}

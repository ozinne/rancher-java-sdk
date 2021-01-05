package io.rancher.type;

import io.rancher.base.AbstractType;

public class ServiceOverride extends AbstractType {
    
    private String region;
    
    private String service;
    
    private String signingMethod;
    
    private String signingName;
    
    private String signingRegion;
    
    private String url;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getSigningMethod() {
        return signingMethod;
    }

    public void setSigningMethod(String signingMethod) {
        this.signingMethod = signingMethod;
    }

    public String getSigningName() {
        return signingName;
    }

    public void setSigningName(String signingName) {
        this.signingName = signingName;
    }

    public String getSigningRegion() {
        return signingRegion;
    }

    public void setSigningRegion(String signingRegion) {
        this.signingRegion = signingRegion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

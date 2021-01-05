package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class FluentForwarderConfig extends AbstractType {
    
    private String certificate;
    
    private String clientCert;
    
    private String clientKey;
    
    private String clientKeyPass;
    
    private Boolean compress;
    
    private Boolean enableTls;
    
    private List<FluentServer> fluentServers;
    
    private Boolean sslVerify;
    
    public String getCertificate() {
        return this.certificate;
    }

    public void setCertificate(String certificate) {
      this.certificate = certificate;
    }
    
    public String getClientCert() {
        return this.clientCert;
    }

    public void setClientCert(String clientCert) {
      this.clientCert = clientCert;
    }
    
    public String getClientKey() {
        return this.clientKey;
    }

    public void setClientKey(String clientKey) {
      this.clientKey = clientKey;
    }
    
    public String getClientKeyPass() {
        return this.clientKeyPass;
    }

    public void setClientKeyPass(String clientKeyPass) {
      this.clientKeyPass = clientKeyPass;
    }
    
    public Boolean getCompress() {
        return this.compress;
    }

    public void setCompress(Boolean compress) {
      this.compress = compress;
    }
    
    public Boolean getEnableTls() {
        return this.enableTls;
    }

    public void setEnableTls(Boolean enableTls) {
      this.enableTls = enableTls;
    }
    
    public List<FluentServer> getFluentServers() {
        return this.fluentServers;
    }

    public void setFluentServers(List<FluentServer> fluentServers) {
      this.fluentServers = fluentServers;
    }
    
    public Boolean getSslVerify() {
        return this.sslVerify;
    }

    public void setSslVerify(Boolean sslVerify) {
      this.sslVerify = sslVerify;
    }
    
}

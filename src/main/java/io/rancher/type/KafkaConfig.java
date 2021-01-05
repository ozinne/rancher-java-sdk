package io.rancher.type;

import io.rancher.base.AbstractType;
import io.rancher.extend.Password;

import java.util.List;

public class KafkaConfig extends AbstractType {
    
    private List<String> brokerEndpoints;
    
    private String certificate;
    
    private String clientCert;
    
    private String clientKey;
    
    private Password saslPassword;
    
    private String saslScramMechanism;
    
    private String saslType;
    
    private String saslUsername;
    
    private String topic;
    
    private String zookeeperEndpoint;
    
    public List<String> getBrokerEndpoints() {
        return this.brokerEndpoints;
    }

    public void setBrokerEndpoints(List<String> brokerEndpoints) {
      this.brokerEndpoints = brokerEndpoints;
    }
    
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
    
    public Password getSaslPassword() {
        return this.saslPassword;
    }

    public void setSaslPassword(Password saslPassword) {
      this.saslPassword = saslPassword;
    }
    
    public String getSaslScramMechanism() {
        return this.saslScramMechanism;
    }

    public void setSaslScramMechanism(String saslScramMechanism) {
      this.saslScramMechanism = saslScramMechanism;
    }
    
    public String getSaslType() {
        return this.saslType;
    }

    public void setSaslType(String saslType) {
      this.saslType = saslType;
    }
    
    public String getSaslUsername() {
        return this.saslUsername;
    }

    public void setSaslUsername(String saslUsername) {
      this.saslUsername = saslUsername;
    }
    
    public String getTopic() {
        return this.topic;
    }

    public void setTopic(String topic) {
      this.topic = topic;
    }
    
    public String getZookeeperEndpoint() {
        return this.zookeeperEndpoint;
    }

    public void setZookeeperEndpoint(String zookeeperEndpoint) {
      this.zookeeperEndpoint = zookeeperEndpoint;
    }
    
}

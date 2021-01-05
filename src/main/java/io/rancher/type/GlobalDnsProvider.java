package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;
import java.util.Map;

import io.rancher.extend.DnsLabel;
import io.rancher.extend.Password;

public class GlobalDnsProvider extends AbstractType {
    
    private AlidnsProviderConfig alidnsProviderConfig;
    
    private Map<String, Object> annotations;
    
    private CloudflareProviderConfig cloudflareProviderConfig;
    
    private String created;
    
    private String creatorId;
    
    private Map<String, Object> labels;
    
    private List<Member> members;
    
    private DnsLabel name;
    
    private List<OwnerReference> ownerReferences;
    
    private String removed;
    
    private String rootDomain;
    
    private Route53ProviderConfig route53ProviderConfig;
    
    private String uuid;
    
    public AlidnsProviderConfig getAlidnsProviderConfig() {
        return this.alidnsProviderConfig;
    }

    public void setAlidnsProviderConfig(AlidnsProviderConfig alidnsProviderConfig) {
      this.alidnsProviderConfig = alidnsProviderConfig;
    }
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public CloudflareProviderConfig getCloudflareProviderConfig() {
        return this.cloudflareProviderConfig;
    }

    public void setCloudflareProviderConfig(CloudflareProviderConfig cloudflareProviderConfig) {
      this.cloudflareProviderConfig = cloudflareProviderConfig;
    }
    
    public String getCreated() {
        return this.created;
    }

    public void setCreated(String created) {
      this.created = created;
    }
    
    public String getCreatorId() {
        return this.creatorId;
    }

    public void setCreatorId(String creatorId) {
      this.creatorId = creatorId;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public List<Member> getMembers() {
        return this.members;
    }

    public void setMembers(List<Member> members) {
      this.members = members;
    }
    
    public DnsLabel getName() {
        return this.name;
    }

    public void setName(DnsLabel name) {
      this.name = name;
    }
    
    public List<OwnerReference> getOwnerReferences() {
        return this.ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
      this.ownerReferences = ownerReferences;
    }
    
    public String getRemoved() {
        return this.removed;
    }

    public void setRemoved(String removed) {
      this.removed = removed;
    }
    
    public String getRootDomain() {
        return this.rootDomain;
    }

    public void setRootDomain(String rootDomain) {
      this.rootDomain = rootDomain;
    }
    
    public Route53ProviderConfig getRoute53ProviderConfig() {
        return this.route53ProviderConfig;
    }

    public void setRoute53ProviderConfig(Route53ProviderConfig route53ProviderConfig) {
      this.route53ProviderConfig = route53ProviderConfig;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
}

package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;
import java.util.Map;

public class CloudCredential extends AbstractType {
    
    private Amazonec2credentialconfig amazonec2credentialConfig;
    
    private Map<String, Object> annotations;
    
    private Azurecredentialconfig azurecredentialConfig;
    
    private String created;
    
    private String creatorId;
    
    private String description;
    
    private Digitaloceancredentialconfig digitaloceancredentialConfig;
    
    private Map<String, Object> labels;
    
    private String name;
    
    private List<OwnerReference> ownerReferences;
    
    private String removed;
    
    private String uuid;
    
    private Vmwarevspherecredentialconfig vmwarevspherecredentialConfig;
    
    public Amazonec2credentialconfig getAmazonec2credentialConfig() {
        return this.amazonec2credentialConfig;
    }

    public void setAmazonec2credentialConfig(Amazonec2credentialconfig amazonec2credentialConfig) {
      this.amazonec2credentialConfig = amazonec2credentialConfig;
    }
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public Azurecredentialconfig getAzurecredentialConfig() {
        return this.azurecredentialConfig;
    }

    public void setAzurecredentialConfig(Azurecredentialconfig azurecredentialConfig) {
      this.azurecredentialConfig = azurecredentialConfig;
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
    
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
      this.description = description;
    }
    
    public Digitaloceancredentialconfig getDigitaloceancredentialConfig() {
        return this.digitaloceancredentialConfig;
    }

    public void setDigitaloceancredentialConfig(Digitaloceancredentialconfig digitaloceancredentialConfig) {
      this.digitaloceancredentialConfig = digitaloceancredentialConfig;
    }
    
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    public void setLabels(Map<String, Object> labels) {
      this.labels = labels;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
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
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public Vmwarevspherecredentialconfig getVmwarevspherecredentialConfig() {
        return this.vmwarevspherecredentialConfig;
    }

    public void setVmwarevspherecredentialConfig(Vmwarevspherecredentialconfig vmwarevspherecredentialConfig) {
      this.vmwarevspherecredentialConfig = vmwarevspherecredentialConfig;
    }
    
}

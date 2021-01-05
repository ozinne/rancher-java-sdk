package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;
import java.util.Map;

public class KontainerDriver extends AbstractType {
    
    private Boolean active;
    
    private String actualUrl;
    
    private Map<String, Object> annotations;
    
    private Boolean builtIn;
    
    private String checksum;
    
    private List<Condition> conditions;
    
    private String created;
    
    private String creatorId;
    
    private String executablePath;
    
    private Map<String, Object> labels;
    
    private String name;
    
    private List<OwnerReference> ownerReferences;
    
    private String removed;
    
    private String state;
    
    private String transitioning;
    
    private String transitioningMessage;
    
    private String uiUrl;
    
    private String url;
    
    private String uuid;
    
    private List<String> whitelistDomains;
    
    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
      this.active = active;
    }
    
    public String getActualUrl() {
        return this.actualUrl;
    }

    public void setActualUrl(String actualUrl) {
      this.actualUrl = actualUrl;
    }
    
    public Map<String, Object> getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
      this.annotations = annotations;
    }
    
    public Boolean getBuiltIn() {
        return this.builtIn;
    }

    public void setBuiltIn(Boolean builtIn) {
      this.builtIn = builtIn;
    }
    
    public String getChecksum() {
        return this.checksum;
    }

    public void setChecksum(String checksum) {
      this.checksum = checksum;
    }
    
    public List<Condition> getConditions() {
        return this.conditions;
    }

    public void setConditions(List<Condition> conditions) {
      this.conditions = conditions;
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
    
    public String getExecutablePath() {
        return this.executablePath;
    }

    public void setExecutablePath(String executablePath) {
      this.executablePath = executablePath;
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
    
    public String getState() {
        return this.state;
    }

    public void setState(String state) {
      this.state = state;
    }
    
    public String getTransitioning() {
        return this.transitioning;
    }

    public void setTransitioning(String transitioning) {
      this.transitioning = transitioning;
    }
    
    public String getTransitioningMessage() {
        return this.transitioningMessage;
    }

    public void setTransitioningMessage(String transitioningMessage) {
      this.transitioningMessage = transitioningMessage;
    }
    
    public String getUiUrl() {
        return this.uiUrl;
    }

    public void setUiUrl(String uiUrl) {
      this.uiUrl = uiUrl;
    }
    
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
      this.url = url;
    }
    
    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
    
    public List<String> getWhitelistDomains() {
        return this.whitelistDomains;
    }

    public void setWhitelistDomains(List<String> whitelistDomains) {
      this.whitelistDomains = whitelistDomains;
    }
    
}

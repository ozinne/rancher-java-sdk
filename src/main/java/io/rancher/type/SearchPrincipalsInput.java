package io.rancher.type;

import io.rancher.base.AbstractType;

public class SearchPrincipalsInput extends AbstractType {
    
    private String name;
    
    private String principalType;
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public String getPrincipalType() {
        return this.principalType;
    }

    public void setPrincipalType(String principalType) {
      this.principalType = principalType;
    }
    
}

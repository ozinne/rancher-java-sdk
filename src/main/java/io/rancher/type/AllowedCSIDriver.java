package io.rancher.type;

import io.rancher.base.AbstractType;

public class AllowedCSIDriver extends AbstractType {
    
    private String name;
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
}

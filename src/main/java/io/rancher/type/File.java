package io.rancher.type;

import io.rancher.base.AbstractType;

public class File extends AbstractType {
    
    private String contents;
    
    private String name;
    
    public String getContents() {
        return this.contents;
    }

    public void setContents(String contents) {
      this.contents = contents;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
    
}

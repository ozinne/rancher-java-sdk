package io.rancher.type;

import io.rancher.base.AbstractType;

public class CpuInfo extends AbstractType {
    
    private Integer count;
    
    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer count) {
      this.count = count;
    }
    
}

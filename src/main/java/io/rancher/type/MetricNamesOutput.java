package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class MetricNamesOutput extends AbstractType {
    
    private List<String> names;
    
    private String type;
    
    public List<String> getNames() {
        return this.names;
    }

    public void setNames(List<String> names) {
      this.names = names;
    }
    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
      this.type = type;
    }
    
}

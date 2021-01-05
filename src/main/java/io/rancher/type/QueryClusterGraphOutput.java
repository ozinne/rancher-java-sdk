package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class QueryClusterGraphOutput extends AbstractType {
    
    private List<QueryClusterGraph> data;
    
    private String type;
    
    public List<QueryClusterGraph> getData() {
        return this.data;
    }

    public void setData(List<QueryClusterGraph> data) {
      this.data = data;
    }
    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
      this.type = type;
    }
    
}

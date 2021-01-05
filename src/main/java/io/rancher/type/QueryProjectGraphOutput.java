package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class QueryProjectGraphOutput extends AbstractType {
    
    private List<QueryProjectGraph> data;
    
    private String type;
    
    public List<QueryProjectGraph> getData() {
        return this.data;
    }

    public void setData(List<QueryProjectGraph> data) {
      this.data = data;
    }
    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
      this.type = type;
    }
    
}

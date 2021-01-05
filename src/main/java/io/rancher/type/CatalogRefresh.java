package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class CatalogRefresh extends AbstractType {
    
    private List<String> catalogs;
    
    public List<String> getCatalogs() {
        return this.catalogs;
    }

    public void setCatalogs(List<String> catalogs) {
      this.catalogs = catalogs;
    }
    
}

package io.rancher.type;

import io.rancher.base.AbstractType;

public class CisScanStatus extends AbstractType {
    
    private Integer fail;
    
    private Integer notApplicable;
    
    private Integer pass;
    
    private Integer skip;
    
    private Integer total;
    
    public Integer getFail() {
        return this.fail;
    }

    public void setFail(Integer fail) {
      this.fail = fail;
    }
    
    public Integer getNotApplicable() {
        return this.notApplicable;
    }

    public void setNotApplicable(Integer notApplicable) {
      this.notApplicable = notApplicable;
    }
    
    public Integer getPass() {
        return this.pass;
    }

    public void setPass(Integer pass) {
      this.pass = pass;
    }
    
    public Integer getSkip() {
        return this.skip;
    }

    public void setSkip(Integer skip) {
      this.skip = skip;
    }
    
    public Integer getTotal() {
        return this.total;
    }

    public void setTotal(Integer total) {
      this.total = total;
    }
    
}

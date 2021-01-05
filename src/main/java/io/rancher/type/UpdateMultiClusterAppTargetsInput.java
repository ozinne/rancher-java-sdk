package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class UpdateMultiClusterAppTargetsInput extends AbstractType {
    
    private List<Answer> answers;
    
    private List<String> projects;
    
    public List<Answer> getAnswers() {
        return this.answers;
    }

    public void setAnswers(List<Answer> answers) {
      this.answers = answers;
    }
    
    public List<String> getProjects() {
        return this.projects;
    }

    public void setProjects(List<String> projects) {
      this.projects = projects;
    }
    
}

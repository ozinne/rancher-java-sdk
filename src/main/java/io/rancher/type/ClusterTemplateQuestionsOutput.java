package io.rancher.type;

import io.rancher.base.AbstractType;
import java.util.List;

public class ClusterTemplateQuestionsOutput extends AbstractType {
    
    private List<Question> questions;
    
    public List<Question> getQuestions() {
        return this.questions;
    }

    public void setQuestions(List<Question> questions) {
      this.questions = questions;
    }
    
}

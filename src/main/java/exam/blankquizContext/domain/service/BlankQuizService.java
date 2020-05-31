package exam.blankquizContext.domain.service;

import exam.blankquizContext.application.CreateBlankQuizCommand;
import exam.blankquizContext.domain.model.blankquiz.BlankQuiz;
import exam.blankquizContext.domain.model.blankquiz.BlankQuizId;
import org.springframework.stereotype.Service;

@Service
public class BlankQuizService {
    public BlankQuiz create(CreateBlankQuizCommand command) {
        return BlankQuiz.create(new BlankQuizId("blankQuiz-id"),"someContent",5);
    }
}

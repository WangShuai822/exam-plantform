package exam.blankquizContext.domain.service;

import exam.blankquizContext.application.CreateBlankQuizCommand;
import exam.blankquizContext.domain.model.blankquiz.BlankQuiz;
import exam.blankquizContext.domain.model.blankquiz.BlankQuizId;
import exam.blankquizContext.domain.model.blankquiz.BlankQuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BlankQuizService {
    @Autowired
    BlankQuizRepository blankQuizRepository;

    public BlankQuiz create(CreateBlankQuizCommand command) {
        BlankQuizId blankQuizId = new BlankQuizId("blankQuiz-" + UUID.randomUUID().toString());
        BlankQuiz blankQuiz = BlankQuiz.create(blankQuizId, command.getContent(), command.getScore());
        return blankQuizRepository.save(blankQuiz);
    }
}

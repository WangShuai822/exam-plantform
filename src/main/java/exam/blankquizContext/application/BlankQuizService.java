package exam.blankquizContext.application;

import exam.blankquizContext.domain.model.blankquiz.BlankQuiz;
import exam.blankquizContext.domain.model.blankquiz.BlankQuizId;
import exam.blankquizContext.domain.model.blankquiz.BlankQuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public List<BlankQuiz> getBlankQuizList() {
        return blankQuizRepository.getBlankQuizList();
    }

    public boolean deleteBlankQuizById(String blankQuizId) {
        blankQuizRepository.deleteBlankQuizById(blankQuizId);
        return true;
    }
}

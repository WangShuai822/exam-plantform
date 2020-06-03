package exam.blankquizContext.infrastructure;

import exam.blankquizContext.domain.model.blankquiz.BlankQuiz;
import exam.blankquizContext.domain.model.blankquiz.BlankQuizId;
import exam.blankquizContext.domain.model.blankquiz.BlankQuizRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class MemoryBlankQuizRepository implements BlankQuizRepository {
    List<BlankQuiz> blankQuizList = new ArrayList<>();

    @Override
    public BlankQuiz save(BlankQuiz blankQuiz) {
        BlankQuizId blankQuizId = new BlankQuizId("blankQuiz-" + UUID.randomUUID().toString());
        blankQuiz.setBlankQuizId(blankQuizId);
        blankQuizList.add(blankQuiz);
        return blankQuiz;
    }

    @Override
    public List<BlankQuiz> getBlankQuizList() {
        return blankQuizList;
    }

    @Override
    public boolean deleteBlankQuizById(String blankQuizId) {
        blankQuizList.remove(0);
        return true;
    }
}

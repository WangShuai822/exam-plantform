package exam.blankquizContext.domain.model.blankquiz;

import java.util.List;

public interface BlankQuizRepository {
    BlankQuiz save(BlankQuiz blankQuiz);

    List<BlankQuiz> getBlankQuizList();

    boolean deleteBlankQuizById(String blankQuizId);
}

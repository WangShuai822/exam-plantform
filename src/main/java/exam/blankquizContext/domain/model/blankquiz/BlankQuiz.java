package exam.blankquizContext.domain.model.blankquiz;

import exam.blankquizContext.domain.shared.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BlankQuiz implements Entity<BlankQuiz> {
    private BlankQuizId blankQuizId;
    private String content;
    private int score;

    private BlankQuiz(BlankQuizId blankQuizId, String content, int score) {
        this.blankQuizId = blankQuizId;
        this.content = content;
        this.score = score;
    }

    public static BlankQuiz create(BlankQuizId blankQuizId, String content, int score) {

        return new BlankQuiz(blankQuizId, content, score);
    }

    @Override
    public boolean sameIdentityAs(BlankQuiz other) {
        return false;
    }
}

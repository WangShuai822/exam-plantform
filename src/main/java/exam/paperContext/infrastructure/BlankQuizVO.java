package exam.paperContext.infrastructure;

import exam.paperContext.domain.shared.ValueObject;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BlankQuizVO implements ValueObject {
    private String blantQuizId;
    private String content;
    private int score;

    @Override
    public boolean sameValueAs(Object other) {
        if(!(other instanceof BlankQuizVO)) return false;
        return blantQuizId.equals(((BlankQuizVO) other).getBlantQuizId());
    }
}

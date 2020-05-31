package exam.blankquizContext.application;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateBlankQuizCommand {
    String content;
    int score;
}

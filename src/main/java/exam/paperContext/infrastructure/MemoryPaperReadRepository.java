package exam.paperContext.infrastructure;

import org.springframework.stereotype.Component;

@Component
public class MemoryPaperReadRepository {

    public BlankQuizVO getBlankQuizById(String blankQuizId) {
        // todo: select blankQuiz by id
        BlankQuizVO blankQuizVO = new BlankQuizVO();
        blankQuizVO.setBlantQuizId("1111");
        blankQuizVO.setContent("some content");
        blankQuizVO.setScore(10);

        return blankQuizVO;

    }
}

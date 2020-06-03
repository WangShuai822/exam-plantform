package exam.blankquizContext.userInterface;

import exam.blankquizContext.application.CreateBlankQuizCommand;
import exam.blankquizContext.domain.model.blankquiz.BlankQuiz;
import exam.blankquizContext.application.BlankQuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/blankQuiz")
@ResponseBody
public class BlankQuizController {

    @Autowired
    BlankQuizService blankQuizService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    BlankQuiz add(@RequestBody CreateBlankQuizCommand command) {
        return blankQuizService.create(command);
    }

    @GetMapping("/list")
    List<BlankQuiz> getBlankQuizList (){
        return blankQuizService.getBlankQuizList();
    }

}

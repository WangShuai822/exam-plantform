package exam.paperContext.userInterface;

import exam.paperContext.application.AssemblePaperCommand;
import exam.paperContext.application.PaperService;
import exam.paperContext.domain.model.paper.Paper;
import exam.paperContext.domain.model.paper.PaperId;
import exam.paperContext.infrastructure.BlankQuizVO;
import exam.paperContext.infrastructure.MemoryPaperReadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class PaperController {

    private PaperService paperService;

    @Resource
    private MemoryPaperReadRepository memoryPaperReadRepository;

    @Autowired
    public PaperController(PaperService paperService) {
        this.paperService = paperService;
    }

    @PostMapping("/papers")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    PaperDTO assemble(@RequestBody AssemblePaperCommand command) {
        final PaperId paperId = paperService.assemblePaper(command);
        return PaperDTO.from(paperId);
    }

    @GetMapping("/papers")
    List<Paper> getAll() {
        return paperService.getAll();
    }

    @PutMapping("/papers/{paperId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void reassemble(@PathVariable String paperId, @RequestBody AssemblePaperCommand command) {
        paperService.reassemblePaper(paperId, command);
    }


    @GetMapping("/papers/blankQuiz/{blankQuizId}")
    BlankQuizVO getBlankQuizById(@PathVariable String blankQuizId) {
        return memoryPaperReadRepository.getBlankQuizById(blankQuizId);
    }

}

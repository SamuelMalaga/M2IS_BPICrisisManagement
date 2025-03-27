package CrisisManagement.CrisisManagementSystem.Controllers;


import CrisisManagement.CrisisManagementSystem.Models.Services.ChoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/choice")
public class ChoiceController {

    @Autowired
    private ChoiceService choiceService;

    @GetMapping("/helloChoice")
    public String testRequest(){
        return "HelloChoice";
    }
    
    @GetMapping("/create")
    public void createChoice (){
        
    }

    @PostMapping(
            value = "/delete/{ChoiceId}"
    )
    public void deleteChoice(
            @PathVariable(name="ChoiceId") Long _ChoiceId
    ){
        
    }
    
}

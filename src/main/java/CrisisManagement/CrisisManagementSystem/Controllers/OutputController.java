package CrisisManagement.CrisisManagementSystem.Controllers;


import CrisisManagement.CrisisManagementSystem.Models.Services.OutputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/output")
public class OutputController {

    @Autowired
    private OutputService outputService;

    @GetMapping("/helloOutput")
    public String testRequest(){
        return "HelloOutput";
    }

    @GetMapping("/create")
    public void createOutput (){

    }

    @PostMapping(
            value = "/delete/{OutputId}"
    )
    public void deleteOutput(
            @PathVariable(name="OutputId") Long _OutputId
    ){

    }


}

package CrisisManagement.CrisisManagementSystem.Controllers;

import CrisisManagement.CrisisManagementSystem.Models.Services.InputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/input")
public class InputController {

    @Autowired
    private InputService inputService;

    @GetMapping("/helloInput")
    public String testRequest(){
        return "HelloInput";
    }

    @GetMapping("/create")
    public void createInput (){

    }

    @PostMapping(
            value = "/delete/{InputId}"
    )
    public void deleteInput(
            @PathVariable(name="InputId") Long _InputId
    ){

    }

}

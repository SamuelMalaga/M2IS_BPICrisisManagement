package CrisisManagement.CrisisManagementSystem.Controllers;

import CrisisManagement.CrisisManagementSystem.Models.Services.VariableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/variable")
public class VariableController {

    @Autowired
    private VariableService variableService;

    @GetMapping("/helloVariable")
    public String testRequest(){
        return "HelloVariable";
    }

    @GetMapping("/create")
    public void createVariable (){

    }

    @PostMapping(
            value = "/delete/{VariableId}"
    )
    public void deleteVariable(
            @PathVariable(name="VariableId") Long _VariableId
    ){

    }

}

package CrisisManagement.CrisisManagementSystem.Controllers;

import CrisisManagement.CrisisManagementSystem.Models.Services.ServiceChoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/serviceChoice")
public class ServiceChoiceController {

    @Autowired
    private ServiceChoiceService serviceChoiceService;

    @GetMapping("/helloServiceChoice")
    public String testRequest(){
        return "HelloServiceChoice";
    }

    @GetMapping("/create")
    public void createServiceChoice (){

    }

    @PostMapping(
            value = "/delete/{ServiceChoiceId}"
    )
    public void deleteServiceChoice(
            @PathVariable(name="ServiceChoiceId") Long _ServiceChoiceId
    ){

    }

}

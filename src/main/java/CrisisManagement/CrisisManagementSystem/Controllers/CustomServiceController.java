package CrisisManagement.CrisisManagementSystem.Controllers;

import CrisisManagement.CrisisManagementSystem.Models.Services.CustomServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/service")
public class CustomServiceController {

    @Autowired
    private CustomServiceService serviceService;

    @GetMapping("/helloService")
    public String testRequest(){
        return "HelloService";
    }

    @GetMapping("/create")
    public void createCustomService (){

    }

    @PostMapping(
            value = "/delete/{CustomServiceId}"
    )
    public void deleteCustomService(
            @PathVariable(name="CustomServiceId") Long _CustomServiceId
    ){

    }

}

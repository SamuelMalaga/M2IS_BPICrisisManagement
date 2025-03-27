package CrisisManagement.CrisisManagementSystem.Controllers;

import CrisisManagement.CrisisManagementSystem.Models.Services.DependencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dependency")
public class DependencyController {

    @Autowired
    private DependencyService dependencyService;

    @GetMapping("/helloDependency")
    public String testRequest(){
        return "HelloDependency";
    }

    @GetMapping("/create")
    public void createDependency (){

    }

    @PostMapping(
            value = "/delete/{DependencyId}"
    )
    public void deleteDependency(
            @PathVariable(name="DependencyId") Long _DependencyId
    ){

    }


}

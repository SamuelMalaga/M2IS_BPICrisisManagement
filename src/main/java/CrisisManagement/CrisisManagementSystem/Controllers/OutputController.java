package CrisisManagement.CrisisManagementSystem.Controllers;


import CrisisManagement.CrisisManagementSystem.Models.Services.OutputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/output")
public class OutputController {

    @Autowired
    private OutputService outputService;

}

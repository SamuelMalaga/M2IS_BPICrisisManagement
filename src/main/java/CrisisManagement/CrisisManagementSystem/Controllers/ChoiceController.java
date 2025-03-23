package CrisisManagement.CrisisManagementSystem.Controllers;


import CrisisManagement.CrisisManagementSystem.Models.Services.ChoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/choice")
public class ChoiceController {

    @Autowired
    private ChoiceService choiceService;

}

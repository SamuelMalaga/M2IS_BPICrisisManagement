package CrisisManagement.CrisisManagementSystem.Controllers;

import CrisisManagement.CrisisManagementSystem.Models.Services.ServiceChoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/serviceChoice")
public class ServiceChoiceController {

    @Autowired
    private ServiceChoiceService serviceChoiceService;
}

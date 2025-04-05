package CrisisManagement.CrisisManagementSystem.Controllers;

import CrisisManagement.CrisisManagementSystem.Models.Actor;
import CrisisManagement.CrisisManagementSystem.Models.CustomService;
import CrisisManagement.CrisisManagementSystem.Models.Services.CustomServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/service")
public class CustomServiceController {

    @Autowired
    private CustomServiceService serviceService;

    @GetMapping("/helloService")
    public String testRequest(){
        return "HelloService";
    }

    @PostMapping ("/create")
    public Map<String, String> createCustomService (
            @RequestBody Map<String, String> request
    ){
        String newServiceName = request.get("service_name");
        String newServiceType = request.get("service_type");
        String newServiceTimeString = request.get("service_time");
        String newServiceDecimalString = request.get("service_cost");
        Integer newServiceTime = Integer.parseInt(newServiceTimeString);
        BigDecimal newServiceDecimal = new BigDecimal(newServiceDecimalString);
        CustomService createdService = serviceService.createService(
                newServiceName,
                newServiceType,
                newServiceTime,
                newServiceDecimal
        );
        Map<String, String> response = new HashMap<>();
        response.put("message","Service created successfully");
        response.put("serviceId", String.valueOf(createdService.getIdService()));
        return response;
    }

    @GetMapping("/getServices")
    public List<CustomService> getAvaliableServices(){
        return serviceService.getAllCustomServices();
    }


}

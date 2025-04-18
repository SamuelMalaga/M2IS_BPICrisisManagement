package CrisisManagement.CrisisManagementSystem.Models.Services;


import CrisisManagement.CrisisManagementSystem.Models.CustomService;
import CrisisManagement.CrisisManagementSystem.Models.Repositories.CustomServiceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CustomServiceService {

    @Autowired
    private CustomServiceRepository customServiceRepository;

    public CustomService createService(
            String _serviceName,
            String _serviceType,
            Integer _serviceTime,
            BigDecimal _serviceCost
    ){
        CustomService customService = new CustomService();

        customService.setServiceName(_serviceName);
        customService.setType(_serviceType);
        customService.setServiceTime(_serviceTime);
        customService.setServiceCost(_serviceCost);

        CustomService createdCustomService = customServiceRepository.save(customService);

        return createdCustomService;
    }

    public List<CustomService> getAllCustomServices(){
        return customServiceRepository.findAll();
    }
}

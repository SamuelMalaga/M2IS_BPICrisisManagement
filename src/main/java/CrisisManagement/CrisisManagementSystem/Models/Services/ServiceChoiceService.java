package CrisisManagement.CrisisManagementSystem.Models.Services;


import CrisisManagement.CrisisManagementSystem.Models.Repositories.ServiceChoiceRepository;
import CrisisManagement.CrisisManagementSystem.Models.ServiceChoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceChoiceService {
//    TODO: FIX THE LOGIC HERE
    @Autowired
    private ServiceChoiceRepository serviceChoiceRepository;

    public ServiceChoice createServiceChoice(Long _idService, Long _idChoice){
        ServiceChoice ServiceChoice = new ServiceChoice();

        ServiceChoice.setIdService(_idService);
        ServiceChoice.setIdChoice(_idChoice);

        ServiceChoice createdServiceChoice = serviceChoiceRepository.save(ServiceChoice);

        return createdServiceChoice;
    }

    public void deleteServiceChoice(Long _outputId){
        serviceChoiceRepository.deleteById(_outputId);
    }

    public Optional<ServiceChoice> getServiceChoiceById(Long _outputId) {
        Optional<ServiceChoice> foundServiceChoice = serviceChoiceRepository.findById(_outputId);
        return foundServiceChoice;
    }
    
    
}

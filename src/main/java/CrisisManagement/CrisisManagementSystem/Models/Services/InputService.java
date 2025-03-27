package CrisisManagement.CrisisManagementSystem.Models.Services;


import CrisisManagement.CrisisManagementSystem.Models.Input;
import CrisisManagement.CrisisManagementSystem.Models.Repositories.InputRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InputService {
    
    
    @Autowired
    private InputRepository inputRepository;

    public Input createInput(Long _idService, Long _numVIsInputedBy){
        Input Input = new Input();

        Input.setIdService(_idService);
        Input.setNumVIsInputedBy(_numVIsInputedBy);

        Input createdInput = inputRepository.save(Input);

        return createdInput;
    }

    public void deleteInput(Long _inputId){
        inputRepository.deleteById(_inputId);
    }

    public Optional<Input> getInputById(Long _inputId) {
        Optional<Input> foundInput = inputRepository.findById(_inputId);
        return foundInput;
    }
    
    
}

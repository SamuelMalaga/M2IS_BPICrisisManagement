package CrisisManagement.CrisisManagementSystem.Models.Services;



import CrisisManagement.CrisisManagementSystem.Models.Output;
import CrisisManagement.CrisisManagementSystem.Models.Repositories.OutputRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OutputService {
    
    @Autowired
    private OutputRepository outputRepository;

    public Output createOutput(Long _idService, Long _numVIsOutputedBy){
        Output Output = new Output();

        Output.setIdService(_idService);
        Output.setNumVIsOutputedBy(_numVIsOutputedBy);

        Output createdOutput = outputRepository.save(Output);

        return createdOutput;
    }

    public void deleteOutput(Long _outputId){
        outputRepository.deleteById(_outputId);
    }

    public Optional<Output> getOutputById(Long _outputId) {
        Optional<Output> foundOutput = outputRepository.findById(_outputId);
        return foundOutput;
    }


}

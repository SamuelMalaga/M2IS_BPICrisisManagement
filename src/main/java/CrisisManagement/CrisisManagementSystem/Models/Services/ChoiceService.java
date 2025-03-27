package CrisisManagement.CrisisManagementSystem.Models.Services;

import CrisisManagement.CrisisManagementSystem.Models.Choice;
import CrisisManagement.CrisisManagementSystem.Models.Repositories.ChoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ChoiceService {
    
    @Autowired
    private ChoiceRepository choiceRepository;

    public Choice createChoice(String _choice_textual_rule, String _nature){
        Choice Choice = new Choice();

        Choice.setTextualRule(_choice_textual_rule);
        Choice.setNature(_nature);

        Choice createdChoice = choiceRepository.save(Choice);

        return createdChoice;
    }

    public void deleteChoice(Long _actID){
        choiceRepository.deleteById(_actID);
    }

    public Optional<Choice> getChoiceById(Long _actId) {
        Optional<Choice> foundChoice = choiceRepository.findById(_actId);
        return foundChoice;
    }
    
    
    
}

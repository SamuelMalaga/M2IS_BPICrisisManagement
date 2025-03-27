package CrisisManagement.CrisisManagementSystem.Models.Services;

import CrisisManagement.CrisisManagementSystem.Models.Variable;
import CrisisManagement.CrisisManagementSystem.Models.Repositories.VariableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VariableService {
    
    @Autowired
    private VariableRepository variableRepository;


    public Variable createVariable(String _nameV, String _typeV){
        Variable Variable = new Variable();

        Variable.setNameV(_nameV);
        Variable.setTypeV(_typeV);

        Variable createdVariable = variableRepository.save(Variable);

        return createdVariable;
    }

    public void deleteVariable(Long _numV){
        variableRepository.deleteById(_numV);
    }

    public Optional<Variable> getVariableById(Long _numV) {
        Optional<Variable> foundVariable = variableRepository.findById(_numV);
        return foundVariable;
    }
    
    
    
}

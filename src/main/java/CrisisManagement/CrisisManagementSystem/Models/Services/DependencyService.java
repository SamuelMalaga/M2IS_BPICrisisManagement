package CrisisManagement.CrisisManagementSystem.Models.Services;

import CrisisManagement.CrisisManagementSystem.Models.Dependency;
import CrisisManagement.CrisisManagementSystem.Models.Repositories.DependencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DependencyService {

    //    TODO: FIX THE LOGIC HERE
    @Autowired
    private DependencyRepository dependencyRepository;

    public Dependency createDependency(Long _idServiceRequires, Long _idServiceIsRequiredBy){
        Dependency Dependency = new Dependency();

        Dependency.setIdServiceRequires(_idServiceRequires);
        Dependency.setIdServiceIsRequiredBy(_idServiceIsRequiredBy);

        Dependency createdDependency = dependencyRepository.save(Dependency);

        return createdDependency;
    }

    public void deleteDependency(Long _depId){
        dependencyRepository.deleteById(_depId);
    }

    public Optional<Dependency> getDependencyById(Long _depId) {
        Optional<Dependency> foundDependency = dependencyRepository.findById(_depId);
        return foundDependency;
    }

}

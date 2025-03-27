package CrisisManagement.CrisisManagementSystem.Models.Services;

import CrisisManagement.CrisisManagementSystem.Models.Actor;
import CrisisManagement.CrisisManagementSystem.Models.Repositories.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ActorService {

    @Autowired
    private ActorRepository actorRepository;


    public Actor createActor(String _act_name, Integer _act_number){
        Actor Actor = new Actor();

        Actor.setNameActor(_act_name);
        Actor.setNbActor(_act_number);

        Actor createdActor = actorRepository.save(Actor);

        return createdActor;
    }

    public void deleteActor(Long _actID){
//        Optional<Actor> foundActor = actorRepository.findById(_actID);
        actorRepository.deleteById(_actID);
    }

    public Optional<Actor> getActorById(Long _actId) {
        Optional<Actor> foundActor = actorRepository.findById(_actId);
        return foundActor;
    }

}

package CrisisManagement.CrisisManagementSystem.Controllers;

import CrisisManagement.CrisisManagementSystem.Models.Actor;
import CrisisManagement.CrisisManagementSystem.Models.Services.ActorService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/actor")
public class ActorController {

    @Autowired
    private ActorService actorService;

    @GetMapping("/helloActor")
    public ResponseEntity<String> testRequest(){
        return ResponseEntity.ok().body("HelloActor");
    }

    @PostMapping(
            value = "/create",
            consumes = "application/json",
            produces = "application/json"
    )
    public Map<String, String> createActor(
            @RequestBody Map<String, String> request
    ){
        String actor_name = request.get("actor_name");
        Integer actor_number =  Integer.parseInt(request.get("actor_number"));
        //System.out.println(name);
        Actor createdActor = actorService.createActor(actor_name, actor_number);
        Map<String, String> response = new HashMap<>();
        response.put("message","Actor created successfully");
        response.put("actorId", String.valueOf(createdActor.getActorId()));
        return response;
    }

    @PostMapping(
            value = "/delete/{actorId}"
    )
    public ResponseEntity<String> deleteActor(
            @PathVariable(name="actorId") Long _actId
    ){
        actorService.deleteActor(_actId);
        return ResponseEntity.ok().header("delete").body("TestBody");
    }

}

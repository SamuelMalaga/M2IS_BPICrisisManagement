package CrisisManagement.CrisisManagementSystem.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "actors")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = true)
    private Long actorId;

    @Column(nullable = false)
    private String nameActor;

    @Column(nullable = false)
    private Integer nbActor;

    public Long getActorId() {
        return actorId;
    }

    public String getNameActor() {
        return nameActor;
    }

    public void setNameActor(String nameActor) {
        this.nameActor = nameActor;
    }

    public Integer getNbActor() {
        return nbActor;
    }

    public void setNbActor(Integer nbActor) {
        this.nbActor = nbActor;
    }
}

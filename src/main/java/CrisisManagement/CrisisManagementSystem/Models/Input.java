package CrisisManagement.CrisisManagementSystem.Models;


import CrisisManagement.CrisisManagementSystem.Models.Embeddables.InputKey;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "inputs")
@IdClass(InputKey.class)
public class Input {

    @Id
    private Long idService;

    @Id
    private Long numVIsOutputedBy;

    public Long getIdService() {
        return idService;
    }

    public void setIdService(Long idService) {
        this.idService = idService;
    }

    public Long getNumVIsOutputedBy() {
        return numVIsOutputedBy;
    }

    public void setNumVIsOutputedBy(Long numVIsOutputedBy) {
        this.numVIsOutputedBy = numVIsOutputedBy;
    }
}

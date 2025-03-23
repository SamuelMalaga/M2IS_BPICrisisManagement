package CrisisManagement.CrisisManagementSystem.Models.Embeddables;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class InputKey implements Serializable {


    private Long idService;

    private Long numVIsOutputedBy;

    public InputKey(Long idService, Long numVIsOutputedBy) {
        this.idService = idService;
        this.numVIsOutputedBy = numVIsOutputedBy;
    }

    public InputKey() {

    }

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        InputKey inputKey = (InputKey) o;
        return Objects.equals(idService, inputKey.idService) && Objects.equals(numVIsOutputedBy, inputKey.numVIsOutputedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idService, numVIsOutputedBy);
    }
}

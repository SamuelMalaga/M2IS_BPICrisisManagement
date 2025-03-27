package CrisisManagement.CrisisManagementSystem.Models.Embeddables;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class InputKey implements Serializable {


    private Long idService;

    private Long numVIsInputedBy;

    public InputKey(Long idService, Long numVIsInputedBy) {
        this.idService = idService;
        this.numVIsInputedBy = numVIsInputedBy;
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
        return numVIsInputedBy;
    }

    public void setNumVIsOutputedBy(Long numVIsInputedBy) {
        this.numVIsInputedBy = numVIsInputedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        InputKey inputKey = (InputKey) o;
        return Objects.equals(idService, inputKey.idService) && Objects.equals(numVIsInputedBy, inputKey.numVIsInputedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idService, numVIsInputedBy);
    }
}

package CrisisManagement.CrisisManagementSystem.Models.Embeddables;


import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OutputKey implements Serializable {

    private Long idService;

    private Long numVIsOutputedBy;

    public OutputKey(Long idService, Long numVIsOutputedBy) {
        this.idService = idService;
        this.numVIsOutputedBy = numVIsOutputedBy;
    }

    public OutputKey() {

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
        OutputKey outputKey = (OutputKey) o;
        return Objects.equals(idService, outputKey.idService) && Objects.equals(numVIsOutputedBy, outputKey.numVIsOutputedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idService, numVIsOutputedBy);
    }
}

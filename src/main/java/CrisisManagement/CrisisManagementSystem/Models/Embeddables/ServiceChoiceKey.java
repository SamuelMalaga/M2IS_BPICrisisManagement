package CrisisManagement.CrisisManagementSystem.Models.Embeddables;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ServiceChoiceKey implements Serializable {

    private Long idService;

    private Long idChoice;

    public ServiceChoiceKey(Long idService, Long idChoice) {
        this.idService = idService;
        this.idChoice = idChoice;
    }

    public ServiceChoiceKey() {

    }

    public Long getIdChoice() {
        return idChoice;
    }

    public Long getIdService() {
        return idService;
    }

    public void setIdService(Long idService) {
        this.idService = idService;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ServiceChoiceKey that = (ServiceChoiceKey) o;
        return Objects.equals(idService, that.idService) && Objects.equals(idChoice, that.idChoice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idService, idChoice);
    }
}

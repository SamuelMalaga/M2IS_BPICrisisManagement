package CrisisManagement.CrisisManagementSystem.Models;

import CrisisManagement.CrisisManagementSystem.Models.Embeddables.ServiceChoiceKey;
import jakarta.persistence.*;

@Entity
@Table(name = "service_choices")
@IdClass(ServiceChoiceKey.class)
public class ServiceChoice {

    @Id
    private Long idService;

    @Id
    private Long idChoice;

    @Column(nullable = false)
    private String serviceChoiceCondition;

    public Long getIdService() {
        return idService;
    }

    public void setIdService(Long idService) {
        this.idService = idService;
    }

    public Long getIdChoice() {
        return idChoice;
    }

    public void setIdChoice(Long idChoice) {
        this.idChoice = idChoice;
    }

    public String getServiceChoiceCondition() {
        return serviceChoiceCondition;
    }

    public void setServiceChoiceCondition(String serviceChoiceCondition) {
        this.serviceChoiceCondition = serviceChoiceCondition;
    }
}

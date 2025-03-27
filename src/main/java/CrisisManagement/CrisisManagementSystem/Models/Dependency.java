package CrisisManagement.CrisisManagementSystem.Models;

import CrisisManagement.CrisisManagementSystem.Models.Embeddables.DependencyKey;
import jakarta.persistence.*;

@Entity
@Table(name = "dependencies")
@IdClass(DependencyKey.class)
public class Dependency {

    @Id
    private Long idServiceRequires;

    @Id
    private Long idServiceIsRequiredBy;

    @Column(nullable = false)
    private String dependency;

    public void setIdServiceRequires(Long idServiceRequires) {
        this.idServiceRequires = idServiceRequires;
    }

    public void setIdServiceIsRequiredBy(Long idServiceIsRequiredBy) {
        this.idServiceIsRequiredBy = idServiceIsRequiredBy;
    }

    public Long getIdServiceRequires() {
        return idServiceRequires;
    }

    public Long getIdServiceIsRequiredBy() {
        return idServiceIsRequiredBy;
    }

    public String getDependency() {
        return dependency;
    }

    public void setDependency(String dependency) {
        this.dependency = dependency;
    }
}

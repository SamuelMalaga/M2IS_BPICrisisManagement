package CrisisManagement.CrisisManagementSystem.Models.Embeddables;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DependencyKey implements Serializable {

    private Long idServiceRequires;

    private Long idServiceIsRequiredBy;

    public DependencyKey(Long idServiceRequires, Long idServiceIsRequiredBy) {
        this.idServiceRequires = idServiceRequires;
        this.idServiceIsRequiredBy = idServiceIsRequiredBy;
    }

    public DependencyKey() {

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DependencyKey that = (DependencyKey) o;
        return Objects.equals(idServiceRequires, that.idServiceRequires) && Objects.equals(idServiceIsRequiredBy, that.idServiceIsRequiredBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idServiceRequires, idServiceIsRequiredBy);
    }
}

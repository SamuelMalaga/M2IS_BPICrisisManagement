package CrisisManagement.CrisisManagementSystem.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "variables")
public class Variable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long numV;

    @Column(nullable = false)
    private String nameV;

    @Column(nullable = false)
    private String typeV;

    public Long getNumV() {
        return numV;
    }


    public String getNameV() {
        return nameV;
    }

    public void setNameV(String nameV) {
        this.nameV = nameV;
    }

    public String getTypeV() {
        return typeV;
    }

    public void setTypeV(String typeV) {
        this.typeV = typeV;
    }
}

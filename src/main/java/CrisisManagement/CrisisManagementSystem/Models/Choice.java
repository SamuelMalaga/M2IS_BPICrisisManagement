package CrisisManagement.CrisisManagementSystem.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "choices")
public class Choice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = true)
    private Long idChoice;

    @Column(nullable = false)
    private String textualRule;

    @Column(nullable = false)
    private String nature;


    public Long getIdChoice() {
        return idChoice;
    }

    public String getTextualRule() {
        return textualRule;
    }

    public void setTextualRule(String textualRule) {
        this.textualRule = textualRule;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }
}

package CrisisManagement.CrisisManagementSystem.Models.Repositories;

import CrisisManagement.CrisisManagementSystem.Models.Choice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChoiceRepository extends JpaRepository<Choice,Long> {
}

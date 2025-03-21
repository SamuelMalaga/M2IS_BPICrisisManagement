package CrisisManagement.CrisisManagementSystem.Models.Repositories;

import CrisisManagement.CrisisManagementSystem.Models.Variable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VariableRepository extends JpaRepository<Variable,Long> {
}

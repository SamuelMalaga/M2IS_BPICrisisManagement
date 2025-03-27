package CrisisManagement.CrisisManagementSystem.Models.Repositories;

import CrisisManagement.CrisisManagementSystem.Models.CustomService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomServiceRepository extends JpaRepository<CustomService,Long> {
}

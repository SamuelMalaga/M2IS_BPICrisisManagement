package CrisisManagement.CrisisManagementSystem.Models.Repositories;

import CrisisManagement.CrisisManagementSystem.Models.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service,Long> {
}

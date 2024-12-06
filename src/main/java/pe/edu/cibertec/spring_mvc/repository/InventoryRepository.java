package pe.edu.cibertec.spring_mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.spring_mvc.entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}

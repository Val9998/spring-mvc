package pe.edu.cibertec.spring_mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.spring_mvc.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

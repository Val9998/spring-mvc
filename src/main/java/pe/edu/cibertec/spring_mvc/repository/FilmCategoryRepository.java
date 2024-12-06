package pe.edu.cibertec.spring_mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.spring_mvc.entity.FilmCategory;

public interface FilmCategoryRepository extends JpaRepository<FilmCategory, Long> {
}

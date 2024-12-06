package pe.edu.cibertec.spring_mvc.repository;

import pe.edu.cibertec.spring_mvc.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;



public interface FilmRepository  extends JpaRepository <Film, Long>{

}

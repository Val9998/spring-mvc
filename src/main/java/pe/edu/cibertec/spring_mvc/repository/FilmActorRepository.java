package pe.edu.cibertec.spring_mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.spring_mvc.entity.FilmActor;

public interface FilmActorRepository extends JpaRepository<FilmActor, Long> {

}

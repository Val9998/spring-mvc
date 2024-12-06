package pe.edu.cibertec.spring_mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.spring_mvc.entity.Actor;
import pe.edu.cibertec.spring_mvc.repository.ActorRepository;

import java.util.List;

@Service
public class ActorServiceImpl {
    @Autowired
    private ActorRepository actorRepository;

    public List<Actor> getAllActors() {
        return actorRepository.findAll();
    }
}

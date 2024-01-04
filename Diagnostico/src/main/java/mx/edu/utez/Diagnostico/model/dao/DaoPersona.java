package mx.edu.utez.Diagnostico.model.dao;

import lombok.*;
import mx.edu.utez.Diagnostico.model.entity.BeanPersona;
import org.springframework.data.repository.CrudRepository;

public interface DaoPersona extends CrudRepository<BeanPersona,Integer> {

}

package mx.edu.utez.Diagnostico.service;

import mx.edu.utez.Diagnostico.model.dto.DtoPersona;
import mx.edu.utez.Diagnostico.model.entity.BeanPersona;

import java.util.List;

public interface IPersona {

    BeanPersona save(DtoPersona dtoPersona);

    BeanPersona findById(Integer id);

    void delete(BeanPersona genero);

    List<BeanPersona> findAll();
}

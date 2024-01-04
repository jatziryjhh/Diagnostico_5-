package mx.edu.utez.Diagnostico.service.impl;

import mx.edu.utez.Diagnostico.model.dao.DaoPersona;
import mx.edu.utez.Diagnostico.model.dto.DtoPersona;
import mx.edu.utez.Diagnostico.model.entity.BeanPersona;
import mx.edu.utez.Diagnostico.service.IPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ImplPersona implements IPersona {

    @Autowired
    private DaoPersona daoPersona;

    @Override
    @Transactional
    public BeanPersona save(DtoPersona dtoPersona) {
        BeanPersona personaCreate = BeanPersona.builder()
                .id_persona(dtoPersona.getId_persona())
                .nombre(dtoPersona.getNombre())
                .apellidoP(dtoPersona.getApellidoP())
                .apellidoM(dtoPersona.getApellidoM())
                .curp(dtoPersona.getCurp())
                .nacimiento(dtoPersona.getNacimiento())
                .build();
        return daoPersona.save(personaCreate);
    }

    @Override
    @Transactional(readOnly = true)
    public List<BeanPersona> findAll() {
        return (List<BeanPersona>) daoPersona.findAll();
    }

    public BeanPersona findById(Integer id) {
        return daoPersona.findById(id).orElse(null);
    }

    public void delete(BeanPersona genero) {
        daoPersona.delete(genero);
    }

}

package mx.edu.utez.Diagnostico.controller;

import lombok.Data;
import mx.edu.utez.Diagnostico.model.dto.DtoPersona;
import mx.edu.utez.Diagnostico.model.entity.BeanPersona;
import mx.edu.utez.Diagnostico.service.IPersona;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@RequestMapping("api/persona")
public class ControllerPersona {

    private final IPersona personaservice;

    @PostMapping("/")
    public DtoPersona create(@RequestBody DtoPersona dtoPersona){
        BeanPersona personaCreate =personaservice.save(dtoPersona) ;
        return dtoPersona.builder()
                .id_persona(personaCreate.getId_persona())
                .nombre(personaCreate.getNombre())
                .apellidoP(personaCreate.getApellidoP())
                .apellidoM(personaCreate.getApellidoM())
                .curp(personaCreate.getCurp())
                .nacimiento(personaCreate.getNacimiento())
                .build();
    }

    @PutMapping("/")
    public DtoPersona update(@RequestBody DtoPersona dtoPersona){
        BeanPersona personaCreate =personaservice.save(dtoPersona) ;
        return dtoPersona.builder()
                .id_persona(personaCreate.getId_persona())
                .nombre(personaCreate.getNombre())
                .apellidoP(personaCreate.getApellidoP())
                .apellidoM(personaCreate.getApellidoM())
                .curp(personaCreate.getCurp())
                .nacimiento(personaCreate.getNacimiento())
                .build();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        BeanPersona genero = personaservice.findById(id);
        personaservice.delete(genero);
    }

    @GetMapping("/")
    public List<BeanPersona> getPersona(){
        return personaservice.findAll();
    }

    @GetMapping ("/{id}")
    public BeanPersona getPersona(@PathVariable Integer id){
        return personaservice.findById(id);
    }


}

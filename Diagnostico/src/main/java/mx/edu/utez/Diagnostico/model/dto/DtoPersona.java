package mx.edu.utez.Diagnostico.model.dto;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DtoPersona {
    private Integer id_persona;

    private String nombre;

    private String apellidoP;

    private String apellidoM;

    private String curp;

    private String nacimiento;

}

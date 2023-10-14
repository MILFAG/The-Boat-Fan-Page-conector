package utn.dacs.ms.conector.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class PersonajeDTO {
    @JsonAlias("uuid")
    @JsonProperty("id")
    String id;
    @JsonAlias("displayName")
    @JsonProperty("nombre")
    String nombre;
    @JsonAlias("description")
    @JsonProperty("descripcion")
    String descripcion;
    @JsonAlias("bustPortrait")
    @JsonProperty("retrato")
    String imagen;
    @JsonAlias("backgroundGradientColors")
    @JsonProperty("coloresGradiente")
    String[] coloresGradiente;


}

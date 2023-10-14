package utn.dacs.ms.conector.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class RangoDTO {
    @JsonAlias("tierName")
    @JsonProperty("rango")
    String rango;
    @JsonAlias("divisionName")
    @JsonProperty("division")
    String division;
    @JsonAlias("smallIcon")
    @JsonProperty("iconoChico")
    String iconoChico;
    @JsonAlias("largeIcon")
    @JsonProperty("iconoGrande")
    String iconoGrande;
    @JsonAlias("color")
    @JsonProperty("color")
    String color;
    @JsonAlias("backgroundColor")
    @JsonProperty("colorFondo")
    String colorFondo;

}

package utn.dacs.ms.conector.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class TiersCompetitivosDTO {
    @JsonAlias("tiers")
    @JsonProperty("rangos")
    RangoDTO[] rangos;
}

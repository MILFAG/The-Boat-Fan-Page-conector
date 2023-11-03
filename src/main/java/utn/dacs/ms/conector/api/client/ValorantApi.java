package utn.dacs.ms.conector.api.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import utn.dacs.ms.conector.dto.PersonajeDTO;
import utn.dacs.ms.conector.dto.RangoDTO;
import utn.dacs.ms.conector.dto.Respuesta;
import utn.dacs.ms.conector.dto.TiersCompetitivosDTO;

import java.util.List;

@FeignClient(
        name = "valorantApi",
        url ="${feign.client.config.apiClient.url}"
        //https://valorant-api.com/v1
)
public interface ValorantApi {

    @GetMapping("/agents?isPlayableCharacter=true&language=es-MX")
    Respuesta<PersonajeDTO> agentes();

    @GetMapping("/competitivetiers?language=es-MX")
    Respuesta<TiersCompetitivosDTO> rangos();


}

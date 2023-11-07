package utn.dacs.ms.conector.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "valorantApi",
        url ="${feign.client.config.apiClient.url}"
)
public interface ValorantApi {

    @GetMapping("/agents?isPlayableCharacter=true&language=es-MX")
    Object agentes();

    @GetMapping("/competitivetiers?language=es-MX")
    Object rangos();


}

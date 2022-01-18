package cl.ingerencia.postulacion.client;

import cl.ingerencia.postulacion.dto.HackerNewsGetDTO;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        name = "hacker-news",
        url = "${cl.ingerencia.hacker-news.url}",
        configuration = FeignAutoConfiguration.class
)
public interface HackerNewsClient {

    @GetMapping(value = "${cl.ingerencia.hacker-news.path}", produces = { MediaType.APPLICATION_JSON_VALUE })
    HackerNewsGetDTO search(@RequestParam(name = "query") String query);
}

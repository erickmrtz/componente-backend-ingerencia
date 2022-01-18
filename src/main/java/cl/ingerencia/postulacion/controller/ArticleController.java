package cl.ingerencia.postulacion.controller;

import cl.ingerencia.postulacion.dto.ArticlesGetResponseDTO;
import cl.ingerencia.postulacion.service.ArticleService;
import cl.ingerencia.postulacion.util.Constants;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/news")
@Api(value = "/news", tags = "Articulos Publicados")
public class ArticleController {

    private final ArticleService articleService;

    @ApiOperation(
            value = "Consultar Articulos",
            nickname = "Consultar Articulos",
            notes = "Se obtiene informacion de articulos recientesde Hacker News para Java",
            response = ArticlesGetResponseDTO.class
    )
    @GetMapping(value = "/latest", produces = {MediaType.APPLICATION_JSON_VALUE})
    @ApiResponses(value = {
            @ApiResponse(code = Constants.SUCCESS_CODE, message = Constants.SUCCESS_MESSAGE),
            @ApiResponse(code = Constants.INTERNAL_ERROR_CODE, message = Constants.INTERNAL_ERROR_MESSAGE)
    })
    public ResponseEntity<ArticlesGetResponseDTO> getLatestNews() {
        return new ResponseEntity<>(articleService.getNews(), HttpStatus.OK);
    }
}

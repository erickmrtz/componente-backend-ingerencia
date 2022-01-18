package cl.ingerencia.postulacion.service.impl;

import cl.ingerencia.postulacion.client.HackerNewsClient;
import cl.ingerencia.postulacion.dto.ArticlesGetResponseDTO;
import cl.ingerencia.postulacion.dto.HackerNewsGetDTO;
import cl.ingerencia.postulacion.mapper.ArticleMapperService;
import cl.ingerencia.postulacion.service.ArticleService;
import cl.ingerencia.postulacion.util.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {

    private final HackerNewsClient hackerNewsClient;
    private final ArticleMapperService articleMapperService;

    @Override
    public ArticlesGetResponseDTO getNews() {
        HackerNewsGetDTO response = hackerNewsClient.search(Constants.QUERY);

        return articleMapperService.convertToArticles(response);
    }
}

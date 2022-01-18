package cl.ingerencia.postulacion.mapper;

import cl.ingerencia.postulacion.dto.ArticleGetResponseDTO;
import cl.ingerencia.postulacion.dto.ArticlesGetResponseDTO;
import cl.ingerencia.postulacion.dto.HackerNewsGetDTO;
import cl.ingerencia.postulacion.dto.HitGetDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ArticleMapperService {

    ArticleMapperService INSTANCE = Mappers.getMapper(ArticleMapperService.class);

    @Mapping(target = "hits", source = "hits")
    ArticlesGetResponseDTO convertToArticles(HackerNewsGetDTO hackerNews);

    ArticleGetResponseDTO convertToArticle(HitGetDTO hit);
}

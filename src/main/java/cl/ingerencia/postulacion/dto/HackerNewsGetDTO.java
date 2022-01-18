package cl.ingerencia.postulacion.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HackerNewsGetDTO implements Serializable {
    private static final long serialVersionUID = 8580586105804490197L;

    private List<HitGetDTO> hits;
    private Long nbHits;
    private Integer page;
    private Integer hitsPerPage;
    private Boolean exhaustiveNbHits;
    private Boolean exhaustiveTypo;
    private String query;
    private String params;
    private Object renderingContent;
    private Integer processingTimeMS;

}

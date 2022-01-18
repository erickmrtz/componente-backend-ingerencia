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
public class ArticlesGetResponseDTO implements Serializable {
    private static final long serialVersionUID = 5884438089636702074L;

    private List<ArticleGetResponseDTO> hits;
}

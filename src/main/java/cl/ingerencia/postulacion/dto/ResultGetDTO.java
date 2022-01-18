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
public class ResultGetDTO implements Serializable {
    private static final long serialVersionUID = 303718443777976989L;

    private String value;
    private String matchLevel;
    private Boolean fullyHighlighted;
    private List<String> matchedWords;
}

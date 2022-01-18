package cl.ingerencia.postulacion.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HighlightResultGetDTO implements Serializable {
    private static final long serialVersionUID = 533641129298226696L;

    private ResultGetDTO author;
    @JsonProperty("comment_text")
    private ResultGetDTO commentText;
    @JsonProperty("story_title")
    private ResultGetDTO storyTitle;
    @JsonProperty("story_url")
    private ResultGetDTO storyUrl;
}

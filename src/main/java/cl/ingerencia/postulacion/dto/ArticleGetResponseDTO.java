package cl.ingerencia.postulacion.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class ArticleGetResponseDTO implements Serializable {
    private static final long serialVersionUID = 1592158035527439169L;

    @JsonProperty("created_at")
    private String createdAt;
    private String title;
    private String url;
    private String author;
    private Integer points;
    @JsonProperty("story_text")
    private String storyText;
    @JsonProperty("comment_text")
    private String commentText;
    @JsonProperty("num_comments")
    private Integer numComments;
    @JsonProperty("story_id")
    private Long storyId;
    @JsonProperty("story_title")
    private String storyTitle;
    @JsonProperty("story_url")
    private String storyUrl;
}

package untitled.domain;

import untitled.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private String type;
    private Long size;
}

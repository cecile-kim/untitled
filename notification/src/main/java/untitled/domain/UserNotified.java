package untitled.domain;

import untitled.domain.*;
import untitled.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class UserNotified extends AbstractEvent {

    private Long id;
    private String message;
    private String userId;

    public UserNotified(Notification aggregate){
        super(aggregate);
    }
    public UserNotified(){
        super();
    }
}

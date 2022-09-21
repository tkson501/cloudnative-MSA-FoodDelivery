package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryCanceled extends AbstractEvent {

    private Long id;

    public DeliveryCanceled(StoreMgmt aggregate) {
        super(aggregate);
    }

    public DeliveryCanceled() {
        super();
    }
    // keep

}
package fooddelivery.infra;

import fooddelivery.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class StoreMgmtHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<StoreMgmt>> {

    @Override
    public EntityModel<StoreMgmt> process(EntityModel<StoreMgmt> model) {
        return model;
    }
}

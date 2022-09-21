package fooddelivery.infra;

import fooddelivery.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "orderInfos",
    path = "orderInfos"
)
public interface OrderInfoRepository
    extends PagingAndSortingRepository<OrderInfo, Long> {
    // keep

}

package fooddelivery.domain;

import fooddelivery.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "payMgmts", path = "payMgmts")
public interface PayMgmtRepository
    extends PagingAndSortingRepository<PayMgmt, Long> {}

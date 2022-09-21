package fooddelivery.domain;

import fooddelivery.StoreApplication;
import fooddelivery.domain.DeliveryCanceled;
import fooddelivery.domain.DeliveryStarted;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "StoreMgmt_table")
@Data
public class StoreMgmt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        DeliveryStarted deliveryStarted = new DeliveryStarted(this);
        deliveryStarted.publishAfterCommit();

        DeliveryCanceled deliveryCanceled = new DeliveryCanceled(this);
        deliveryCanceled.publishAfterCommit();
    }

    public static StoreMgmtRepository repository() {
        StoreMgmtRepository storeMgmtRepository = StoreApplication.applicationContext.getBean(
            StoreMgmtRepository.class
        );
        return storeMgmtRepository;
    }

    public static void notifyOrder(OrderPlaced orderPlaced) {
        /** Example 1:  new item 
        StoreMgmt storeMgmt = new StoreMgmt();
        repository().save(storeMgmt);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(storeMgmt->{
            
            storeMgmt // do something
            repository().save(storeMgmt);


         });
        */

    }

    public static void deliveryCancel(PaymentCanceled paymentCanceled) {
        /** Example 1:  new item 
        StoreMgmt storeMgmt = new StoreMgmt();
        repository().save(storeMgmt);

        */

        /** Example 2:  finding and process
        
        repository().findById(paymentCanceled.get???()).ifPresent(storeMgmt->{
            
            storeMgmt // do something
            repository().save(storeMgmt);


         });
        */

    }
}

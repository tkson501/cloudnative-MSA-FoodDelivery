package fooddelivery.domain;

import fooddelivery.CustomerApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "PayMgmt_table")
@Data
public class PayMgmt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static PayMgmtRepository repository() {
        PayMgmtRepository payMgmtRepository = CustomerApplication.applicationContext.getBean(
            PayMgmtRepository.class
        );
        return payMgmtRepository;
    }

    public static void notifyByKakaoTalk(OrderPlaced orderPlaced) {
        /** Example 1:  new item 
        PayMgmt payMgmt = new PayMgmt();
        repository().save(payMgmt);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(payMgmt->{
            
            payMgmt // do something
            repository().save(payMgmt);


         });
        */

    }

    public static void notifyByKakaoTalk(OrderCanceled orderCanceled) {
        /** Example 1:  new item 
        PayMgmt payMgmt = new PayMgmt();
        repository().save(payMgmt);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCanceled.get???()).ifPresent(payMgmt->{
            
            payMgmt // do something
            repository().save(payMgmt);


         });
        */

    }

    public static void notifyByKakaoTalk(DeliveryStarted deliveryStarted) {
        /** Example 1:  new item 
        PayMgmt payMgmt = new PayMgmt();
        repository().save(payMgmt);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryStarted.get???()).ifPresent(payMgmt->{
            
            payMgmt // do something
            repository().save(payMgmt);


         });
        */

    }

    public static void notifyByKakaoTalk(DeliveryCanceled deliveryCanceled) {
        /** Example 1:  new item 
        PayMgmt payMgmt = new PayMgmt();
        repository().save(payMgmt);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCanceled.get???()).ifPresent(payMgmt->{
            
            payMgmt // do something
            repository().save(payMgmt);


         });
        */

    }

    public static void notifyByKakaoTalk(PaymentCompleted paymentCompleted) {
        /** Example 1:  new item 
        PayMgmt payMgmt = new PayMgmt();
        repository().save(payMgmt);

        */

        /** Example 2:  finding and process
        
        repository().findById(paymentCompleted.get???()).ifPresent(payMgmt->{
            
            payMgmt // do something
            repository().save(payMgmt);


         });
        */

    }
}

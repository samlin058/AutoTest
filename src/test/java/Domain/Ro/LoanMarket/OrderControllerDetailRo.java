package Domain.Ro.LoanMarket;

import Domain.Apis.LoanMarket.OrderController;
import Service.Annotations.AnnotationLibrary.Param;
import Service.Annotations.AnnotationProcessor.DenpendencesProcessor;


@lombok.Data
public class OrderControllerDetailRo extends OrderController {

   static {
      DenpendencesProcessor.roDendenpence(OrderControllerDetailRo.class);
   }

    @Param
    public String orderId;


    public OrderControllerDetailRo(String orderId) {
        this.orderId=orderId;
    }
}



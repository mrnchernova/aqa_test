import org.example.Delivery;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeliveryTest {
    Delivery delivery = new Delivery();
    @Test
    void deliveryPriceMinTest(){
        int distance = 0;
        boolean dimensionsBig = false;
        boolean fragileYes = false;
        String busyTime = "";
        int er = 400;
        assertEquals(er, delivery.deliveryPrice(distance,dimensionsBig,fragileYes,busyTime));
    }
    @Test
    @Tag("busyTime")
    void deliveryPriceMaxHighTest(){
        int distance = 30;
        boolean dimensionsBig = true;
        boolean fragileYes = true;
        String busyTime = "high";
        int er = 1120;
        assertEquals(er, delivery.deliveryPrice(distance,dimensionsBig,fragileYes,busyTime));
    }
    @Test
    @Tag("busyTime")
    void deliveryPriceMaxNormalTest(){
        int distance = 30;
        boolean dimensionsBig = true;
        boolean fragileYes = true;
        String busyTime = "normal";
        int er = 980;
        assertEquals(er, delivery.deliveryPrice(distance,dimensionsBig,fragileYes,busyTime));
    }
    @Test
    @Tag("busyTime")
    void deliveryPriceMaxLowTest(){
        int distance = 30;
        boolean dimensionsBig = true;
        boolean fragileYes = true;
        String busyTime = "low";
        int er = 840;
        assertEquals(er, delivery.deliveryPrice(distance,dimensionsBig,fragileYes,busyTime));
    }
}

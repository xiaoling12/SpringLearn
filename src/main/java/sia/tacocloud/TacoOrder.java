package sia.tacocloud;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;


// taco订单的领域对象设计
@Data
public class TacoOrder {

    private String deliveryName;  // 寄送姓名
    private String deliveryStreet; // 寄送街道
    private String deliveryCity;  // 寄送城市
    private String deliveryState;  // 寄送州
    private String deliveryZip;  // 递送邮编
    private String ccNumber;  // 支付信息
    private String ccExpiration;
    private String ccCVV;

    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
}
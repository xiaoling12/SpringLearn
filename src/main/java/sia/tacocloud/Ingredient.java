package sia.tacocloud;

import lombok.Data;

// Data为lombok注解，在编译阶段加上缺少的常规set、get、toString方法
@Data
public class Ingredient {
    private final String id;  // 成分编号
    private final String name;  // 成分名称
    private final Type type;  // 成分类型

    public enum Type{
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }  // 成分类型枚举

}

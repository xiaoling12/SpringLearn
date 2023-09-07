package sia.tacocloud;

import lombok.Data;
import java.util.List;

// taco的领域对象
@Data
public class Taco {
    private String name;

    private List<Ingredient> ingredients;
}

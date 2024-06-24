import java.util.ArrayList;
import java.util.List;

public class BebidaCafe extends Bebida{


    @Override
    public List<String> obterIngredientes() {
        return new ArrayList<>(List.of("cafe"));
    }

    @Override
    public double obterPreco() {
        return 5.35;
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Program {
    public static void main(String[] args) {
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook(1000, 32));
        notebooks.add(new Notebook(800, 16));
        notebooks.add(new Notebook(1200, 8));
        notebooks.add(new Notebook(600, 16));
        
        System.out.println("Возврастание цены:");
        Collections.sort(notebooks, Comparator.comparing(Notebook::getCost));
        for (Notebook notebook : notebooks) {
            System.out.println("Cost: " + notebook.getCost() + ", RAM: " + notebook.getRam());
        }
        
        System.out.println("\nУбывание цены:");
        Collections.sort(notebooks, Comparator.comparing(Notebook::getCost).reversed());
        for (Notebook notebook : notebooks) {
            System.out.println("Cost: " + notebook.getCost() + ", RAM: " + notebook.getRam());
        }
        
        System.out.println("\nУьывание RAM:");
        Collections.sort(notebooks, Comparator.comparing(Notebook::getRam).reversed().thenComparing(Comparator.comparing(Notebook::getCost).reversed()));
        for (Notebook notebook : notebooks) {
            System.out.println("Cost: " + notebook.getCost() + ", RAM: " + notebook.getRam());
        }
    }
}

    


import java.util.*;

public class Main {

    public static void main(String[] args) {

        //1
        String[] cars = {"Tesla", "Benz", "Aston Martin", "BMW", "Volkswagen"};
        Cars car1 = new Cars(cars[0], "Y", 2019, "N/A");
        Cars car2 = new Cars(cars[1], "C-class", 2013, "6.2");
        Cars car3 = new Cars(cars[3], "520d", 2017, "2.0");

        List<Cars> cars2 = new ArrayList<>();
        cars2.add(car1);
        cars2.add(car2);
        cars2.add(car3);

        HashMap<String, Cars> carOwners = new HashMap<>();
        carOwners.put("Silvio", car2);
        carOwners.put("A", car1);
        carOwners.put("B", car3);
        System.out.println(carOwners);


        for (int i = cars2.size()-1; i >= 0; i--) {
            System.out.println(cars2.get(i));
        }
        cars2.remove(car1);
    }
}
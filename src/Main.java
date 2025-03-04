import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Dog");
        strings.add("Meter");
        strings.add("Bol");
        strings.add("Hekur");
        strings.add("Hop");
        Map<Integer, ArrayList> stringMap = new HashMap<>();
        ArrayList<String> tempStrings1 = new ArrayList<>();
        ArrayList<String> tempStrings2 = new ArrayList<>();
        for (String tempString : strings) {
            int intKey = tempString.length();
            if (!stringMap.containsKey(intKey)) {
                ArrayList<String> knp = new ArrayList<>();
                knp.add(tempString);
                stringMap.put(intKey,knp);
            } else {
                stringMap.get(intKey).add(tempString);
            }
        }
        System.out.println(stringMap);

    }
}
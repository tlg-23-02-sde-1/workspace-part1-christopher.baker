package gov.research;

import java.util.HashMap;
import java.util.Map;

class MapTest {
    public static void main(String[] args) {
        Map<String,Double> gpaMap = new HashMap<>();

        gpaMap.put("chance", 3.7);
        gpaMap.put("stephen", 3.8);
        gpaMap.put("jorge", 3.99);
        gpaMap.put("lui", 2.3);
        gpaMap.put("chris", 3.2);
        gpaMap.put("jay", 3.86);
        gpaMap.put("jordan", 3.7);

        double luiGpa = gpaMap.get("lui");
        System.out.println("Lui's GPA is: " + luiGpa);
        }
    }
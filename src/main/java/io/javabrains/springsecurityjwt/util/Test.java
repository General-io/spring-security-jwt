package io.javabrains.springsecurityjwt.util;

import io.javabrains.springsecurityjwt.Personen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Personen> personen = new ArrayList<>();

        personen.add(new Personen("Peter", "Meier"));
        personen.add(new Personen("Felix", "Horst"));
        personen.add(1, new Personen("Markus", "Leer"));

        System.out.println(personen.get(2));

        for (Iterator<Personen> it = personen.iterator(); it.hasNext();) {
            Personen s = it.next();
            if (s.equals("15"))
                it.remove();
            System.out.println(s.getNachname()); // "15" noch enthalten
        }
    }
}

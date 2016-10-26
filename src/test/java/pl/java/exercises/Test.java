package pl.java.exercises;


import java.util.*;

/**
 * Class Test.
 */
public class Test {

    public static void main(String[] args) {

        Man man1 = new Man();
        man1.setName("Tomasz");
        man1.setSurname("Kot");
        man1.setHeight("Tall");
        Man man2 = new Man();
        man2.setName("Bartosz");
        man2.setSurname("Obuchowicz");
        man2.setHeight("Short");
        Man man3 = new Man("Lukasz", "Fabiański", "Tall");
        Man man4 = new Man("Jakub", "Błaszczykowski", "Short");
        Man man5 = new Man("Kamil", "Glik", "Tall");
        Woman woman1 = new Woman();
        woman1.setName("Kasia");
        woman1.setSurname("Nosowska");
        woman1.setBeauty("Pretty");
        Woman woman2 = new Woman();
        woman2.setName("Maryla");
        woman2.setSurname("Rodowicz");
        woman2.setBeauty("Ugly");
        Woman woman3 = new Woman("Mela", "Kotluk", "Pretty");
        Woman woman4 = new Woman("Baba", "Jaga", "Ugly");
        Woman woman5 = new Woman("Królewna", "Snieżka", "Pretty");

//        List<Man> men = new ArrayList<Man>();
//
//        men.add(0, man1);
//        men.add(man2);
//        men.add(2, man3);
//        men.add(man4);
//        men.add(3, man5);
//
//        System.out.println(men.toString());

        List<Human> human = new ArrayList<Human>();
        human.add(0, man1);
        human.add(1, man2);
        human.add(2, man3);
        human.add(3, man4);
        human.add(4, man5);
        human.add(5, woman1);
        human.add(6, woman2);
        human.add(7, woman3);
        human.add(8, woman4);
        human.add(9, woman5);

        System.out.println(human.toString());

        Set<Human> human2 = new HashSet<Human>();
        human2.add(man1);
        human2.add(man2);
        human2.add(man3);
        human2.add(man4);
        human2.add(man5);
        human2.add(woman1);
        human2.add(woman2);
        human2.add(woman3);
        human2.add(woman4);
        human2.add(woman5);

        System.out.println(human2.toString());

        Map<String, String> men = new HashMap<String, String>();
        men.put(man1.getName(), man1.getHeight());
        men.put(man2.getName(), man2.getHeight());
        men.put(man3.getName(), man3.getHeight());
        men.put(man4.getName(), man4.getHeight());
        men.put(man5.getName(), man5.getHeight());

        System.out.println(men.toString());

    }
}

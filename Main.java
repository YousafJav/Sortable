import java.util.*;
public class Main {

    public static void main(String[] args){
        Random random = new Random();
        int oneToTen = random.nextInt(10) + 1;
        System.out.println(oneToTen);

        int[] array = new int[10];
        ArrayList<Integer> arrayList = new ArrayList<>();


        array[0] = 5;
        array[1] = 4;
        array[2] = 6;
        array[3] = 7;
        array[4] = 12;

        for (int i = 0; i <= array.length - 1; i++){
            System.out.println(array[i]);
        }

        array[2] = 0;

        for (int i = 0; i <= array.length - 1; i++){
            System.out.println(array[i]);
        }

        System.out.println("this is arraylist");
        arrayList.add(10);
        arrayList.add(7);
        arrayList.add(20);
        arrayList.add(1);
        arrayList.add(14);
        System.out.println(arrayList);
        arrayList.remove(2);
        System.out.println(arrayList);

        for (Integer num : arrayList){
            if (num == 1){
                int index = arrayList.indexOf(num);
                arrayList.remove(index);
            }
        }

        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);

        ArrayList<People> peoples = new ArrayList<>();

        peoples.add(new People("Yousaf", 20, 2660));
        peoples.add(new People("Hans", 42, 2670));
        peoples.add(new People("Hej", 22, 1000));
        peoples.add(new People("Lars", 57, 2250));

        System.out.println(peoples);

        peoples.sort(Comparator.comparing(People::getName));

        System.out.println(peoples);

        peoples.sort(Comparator.comparing(People::getAge));
        System.out.println(peoples);

        ArrayList<Sortable> sortList = new ArrayList<>();

        sortList.add(new People("Kasper", 30, 2781));
        sortList.add(new People("memmer", 23, 2610));
        sortList.add(new Animals(2, "Dog"));
        sortList.add(new Animals(6, "boot the cat"));

        System.out.println(sortList);

        for (Sortable lifes : sortList){
           String firstChar = lifes.getName().substring(0, 1).toUpperCase();
           String restName = lifes.getName().substring((1));
           String wholeName = firstChar + restName;
            lifes.setName(wholeName);
        }

        sortList.sort(Comparator.comparing(Sortable::getName));
        System.out.println(sortList);
    }

}
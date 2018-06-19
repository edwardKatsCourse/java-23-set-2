package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /**
         *      Set
         * Set usage mechanics (hashCode, equals)
         * TreeSet
         * LinkedHashSet
         */

        //  Collections
        //List, Set, Map
        //List - коллекция, которая хранит много объектов.
        //       Нет ограничений
        //       Можем получить объект по индексу
        //       На какую позицию положили - там и найдем (.add(0, "a"), .add("a"), .set(0, "z") )

        //Set - хранит ТОЛЬКО уникальные объекты
        //      Нельзя получить объект.
        //      Можно узнать, если ли такой в коллекции.
        //      Нельзя сказать, в какой последовательности Сет будет хранить значения.
        //


        //Map - хранит "связку" ключа и значения.
        //  Может быть простой ключ и большой сложный объект как значение <String, Person>


        //Set = Map
        //HashSet - hashCode & equals
        //HashMap - hashCode & equals

        //TreeSet - compareTo or compare
        //TreeMap - compareTo or compare

        //LinkedHashSet - hashCode & equals
        //LinkedHashMap - hashCode & equals

        TreeSet<String> set = new TreeSet<>();
        set.add("d");
        set.add("a");
        set.add("c");
        set.add("b");
        set.add("e");

//        String a = set.get("a");
//        System.out.println(a); //a
        System.out.println(set);
//        Collections.sort();


        CPU i7_4710_2017 = new CPU("Intel i7 HQ4710", 4, 8, 2017);
        CPU i7_4710_2018 = new CPU("Intel i7 HQ4710", 4, 8, 2018);
        CPU i7_4720 = new CPU("Intel i7 HQ4720", 4, 8, 2016);
        CPU i5_6700 = new CPU("Intel i5 HQ6700", 4, 4, 2016);
        CPU i5_7500U = new CPU("Intel i7 7500U", 2, 4, 2018);

        Set<CPU> cpuSet = new TreeSet<>();
        cpuSet.add(i7_4710_2018);
        cpuSet.add(i7_4710_2017);
        cpuSet.add(i7_4720);
        cpuSet.add(i5_6700);
        cpuSet.add(i5_7500U);

//        for (CPU cpu : cpuSet) {
//            System.out.println(cpu);
//        }
        System.out.println(cpuSet.size());
        cpuSet.forEach(/*x -> */System.out::println/*(x)*/);
//        cpuSet.forEach(x -> System.out.println(x));

        Set<CPU> powerCPUSet = new TreeSet<>((cpu1, cpu2) -> {
            int result = cpu2.getCores().compareTo(cpu1.getCores());
            if (result == 0) {
                result = cpu2.getThreads().compareTo(cpu1.getThreads());
            }

            if (result == 0) {
                result = cpu2.getCpuBrand().compareTo(cpu1.getCpuBrand());
            }
            if (result == 0) {
                result = cpu2.getManufacturingYear().compareTo(cpu1.getManufacturingYear());
            }
            return result;
        });

        powerCPUSet.addAll(cpuSet);
        System.out.println("Reverse order TreeSet");
        powerCPUSet.forEach(System.out::println);

//        Set<String> stringSet = new TreeSet<>();
//        ((SortedSet<String>) stringSet).first();
//        ((NavigableSet<String>) stringSet).first();

//        List<String> list = new ArrayList<>();
//        ArrayList<String> list = new ArrayList<>();

        System.out.println("**************");
        System.out.println();
        System.out.println();

        System.out.println("HashSet");
        Set<String> alphabetHashSet = new HashSet<>();
        alphabetHashSet.add("zyx");
        alphabetHashSet.add("abc");
        alphabetHashSet.add("ddd");
        alphabetHashSet.add("cfg");
        alphabetHashSet.add("cfz");

        alphabetHashSet.forEach(System.out::println);

        System.out.println();
        System.out.println();
        System.out.println("TreeSet");
        Set<String> alphabetTreeSet = new TreeSet<>();
        alphabetTreeSet.add("zyx");
        alphabetTreeSet.add("abc");
        alphabetTreeSet.add("ddd");
        alphabetTreeSet.add("cfg");
        alphabetTreeSet.add("cfz");

        alphabetTreeSet.forEach(System.out::println);

        System.out.println();
        System.out.println();
        System.out.println("LinkedHashSet");
        LinkedHashSet<String> alphabetLinkedHashSet = new LinkedHashSet<>();
        alphabetLinkedHashSet.add("zyx");
        alphabetLinkedHashSet.add("abc");
        alphabetLinkedHashSet.add("ddd");
        alphabetLinkedHashSet.add("cfz");
        alphabetLinkedHashSet.add("cfg");

        alphabetLinkedHashSet.forEach(System.out::println);

        //Stream API

    }
}



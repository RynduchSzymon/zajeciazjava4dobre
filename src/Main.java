//Zadanie 1.
//public class MyClass {
//    public MyClass() {
//        // konstruktor bez parametrów
//    }
//
//    public MyClass(int param) {
//        // konstruktor z parametrem
//    }
//}
// 2. Ustalić kiedy zostaje uruchomiony Garbage Collector
//Garbage Collector jest automatycznie uruchamiany przez JVM, gdy system uzna, że istnieją obiekty, które nie są już dostępne.

//Zadanie 3.
//System.gc(); // ręczne uruchomienie Garbage Collectora

//Zadnaie 4.
//public class MyClass {
//    private int privateField;
//    public int publicField;
//
//    private void privateMethod() {
//        // metoda prywatna
//    }
//
//    public void publicMethod() {
//        // metoda publiczna
//    }
//}
//Zadanie 5
//import java.util.Arrays;
//
//public class ArrayExample {
//    public static void main(String[] args) {
//        int[][] array = new int[10][10];
//
//        // Wypełnienie tablicy liczbami losowymi
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = (int) (Math.random() * 26) + 20;
//            }
//        }
//
//        // Sortowanie tablicy
//        for (int[] row : array) {
//            Arrays.sort(row);
//        }
//
//        // Zliczanie wystąpień poszczególnych liczb
//        int[] histogram = new int[46];
//        for (int[] row : array) {
//            for (int num : row) {
//                histogram[num]++;
//            }
//        }
//
//        // Wyświetlanie histogramu
//        for (int i = 20; i <= 45; i++) {
//            System.out.println(i + ": " + histogram[i]);
//        }
//    }
//}

//Zadanie 6-11
//public class MyClass {
//    public static void main(String[] args) {
//        // Tworzenie obiektu
//        MyClass obj = new MyClass();
//
//        // clone()
//        MyClass clonedObj = (MyClass) obj.clone();
//
//        // equals()
//        boolean areEqual = obj.equals(clonedObj);
//
//        // finalize() - automatyczne wywołanie przez GC, nie ma bezpośredniego wywołania w kodzie
//
//        // toString()
//        String objString = obj.toString();
//    }
//}
//Zadanie 12-13
//package myapp;
//
//public class MyCharacter {
//    private String name;
//    private String characterClass;
//    private String race;
//    private int strength;
//
//    public MyCharacter(String name, String characterClass, String race, int strength) {
//        this.name = name;
//        this.characterClass = characterClass;
//        this.race = race;
//        this.strength = strength;
//    }
//}
//package testowanie;
//
//import myapp.MyCharacter;
//
//public class TestCharacter {
//    public static void main(String[] args) {
//        // Utworzenie obiektu klasy MyCharacter
//        MyCharacter character = new MyCharacter("John", "Warrior", "Human", 50);
//
//        // Wyświetlenie informacji o postaci
//        System.out.println("Name: " + character.getName());
//        System.out.println("Class: " + character.getCharacterClass());
//        System.out.println("Race: " + character.getRace());
//        System.out.println("Strength: " + character.getStrength());
//    }
//}

//zadanie 13
//public class Car {
//    private String brand;
//    private String model;
//    private int doors;
//    private double engineCapacity;
//    private double price;
//
//    public Car(String brand, String model, int doors, double engineCapacity, double price) {
//        this.brand = brand;
//        this.model = model;
//        this.doors = doors;
//        this.engineCapacity = engineCapacity;
//        this.price = price;
//    }
//
//    public void displayInfo() {
//        System.out.println("Brand: " + brand);
//        System.out.println("Model: " + model);
//        System.out.println("Doors: " + doors);
//        System.out.println("Engine Capacity: " + engineCapacity);
//        System.out.println("Price: " + price);
//    }
//}
//public class TestCar {
//    public static void main(String[] args) {
//        // Utworzenie obiektów klasy Car
//        Car car1 = new Car("Toyota", "Camry", 4, 2.5, 30000);
//        Car car2 = new Car("Ford", "Focus", 5, 1.8, 25000);
//        Car car3 = new Car("Honda", "Civic", 4, 1.6, 22000);
//
//        // Utworzenie tablicy obiektów klasy Car
//        Car[] cars = {car1, car2, car3};
//
//        // Wyświetlenie informacji o każdym samochodzie z tablicy
//        for (Car car : cars) {
//            car.displayInfo();
//            System.out.println();
//        }
//    }
//}


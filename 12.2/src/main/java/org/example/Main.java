package org.example;

public class Main {
    public static class Tester {
        private String name;
        private String surname;
        private int experienceInYears;
        private String englishLevel;
        private double salary;

        public Tester() {
            this("Viktor", "Bekov", 12);
        }

        public Tester(String name, String surname, int experienceInYears) {
            this(name, surname, experienceInYears, "Intermediate", 2000);
        }

        public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
            this.name = name;
            this.surname = surname;
            this.experienceInYears = experienceInYears;
            this.englishLevel = englishLevel;
            this.salary = salary;
        }
        public void print() {
            System.out.println(name + " " + surname);
        }

        public void print(int experienceInYears, String salary) {
            System.out.println("Experience: " + experienceInYears + " years");
            System.out.println("Salary: $" + salary);
        }

        public void print(String englishLevel) {
            System.out.println("English level: " + englishLevel);
        }

        public static void test(){
            System.out.println("Tester:");
        }
    }

    public static void main(String[] args) {
        Tester tester1 = new Tester();
        Tester.test();
        tester1.print();
        tester1.print(1,"1");
        tester1.print("f");
    }
}
public class Main {
    public static void main(String[] args) {
        hero hero1 = new hero("Aragorn", 100, 87, caracther.WARRIOR);
        hero hero2 = new hero("Gandalf", 80, 2019, caracther.MAGE);
        hero hero3 = new hero("Legolas", 90, 2931, caracther.ARCHER);
        hero hero4 = new hero("Bruce Lee", 95, 32, caracther.MONK);

        hero1.attack();
        hero2.attack();
        hero3.attack();
        hero4.attack();
    }
}

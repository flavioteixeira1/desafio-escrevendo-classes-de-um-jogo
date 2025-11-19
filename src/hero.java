public class hero {
    String name;
    int health;
    int age;
    caracther type;

    //constructor
    public hero(String name, int health, int age, caracther type) {
        this.name = name;
        this.health = health;
        this.age = age;
        this.type = type;
    }

    public void attack() {
        //System.out.println(this.name + " is attacking!");
        if(this.type == caracther.WARRIOR) {
            System.out.println(this.name + " swings a mighty sword! with great strength");
        } else if(this.type == caracther.MAGE) {
            System.out.println(this.name + " casts a powerful spell! with his magic");
        } else if(this.type == caracther.ROGUE) {
            System.out.println(this.name + " strikes from the shadows!");
        } else if(this.type == caracther.ARCHER) {
            System.out.println(this.name + " shoots a precise arrow!");
        } else if(this.type == caracther.MONK) {
            System.out.println(this.name + " delivers a swift punch! with martial arts");
        } else if(this.type == caracther.NINJA) {
            System.out.println(this.name + " throws a shuriken!");
        } else {
            System.out.println(this.name + " performs a basic attack!");
        }   
    }

    //getters and setters
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public int getAge() {
        return age;
    }
    public caracther getType() {
        return type;
    }



}

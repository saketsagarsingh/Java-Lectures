 class Animal{
    String type;
    String color;
    String domesticType;
    int leg;

    Animal(){
    }

    Animal(String type, String color, String domesticType, int leg){
        this.type = type;
        this.color = color;
        this.domesticType = domesticType;
        this.leg = leg;
    }

    @Override
    public String toString() {
        return "Animal [type=" + type + ", color=" + color + ", domesticType=" + domesticType + ", leg=" + leg + "]";
    }

 }

 class Dog extends Animal{
    Dog(String type, String color, String domesticType, int leg){
        super(type,color,domesticType,leg);
    }
 }

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("carnivorous", "black", "pet", 4);
        System.out.println(dog.toString());
    }
}

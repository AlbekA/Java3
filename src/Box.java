import java.util.ArrayList;
import java.util.Collection;

public class Box<T extends Fruit> {
    ArrayList<T> fruits = new ArrayList<>();


    public float getWeight(){
        float weight = 0.0f;
        for(T o : fruits){
            weight += o.getWeight();
        }return weight;
    }
    public boolean compare(Box anotherBox) {
        if(getWeight() == anotherBox.getWeight()) return true;
        return false;
    }

    public void toPour(Box another){

        if (this.getFruitType() == another.getFruitType()){
            another.putFruitsInTheBox(this.getFruits());
            this.fruits.clear();
        }
        else System.out.println("В коробках разные фрукты!");
    }

    public void addFruit(T fruit, int amount){
        for(int i=0;i<amount;i++){
            fruits.add(fruit);
        }
    }

    public void putFruitsInTheBox(Collection<T> fruit){
        fruit.addAll(fruit);
    }

    public boolean getFruitType(){
        this.fruits.get(0).getClass();
        return false;
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

}

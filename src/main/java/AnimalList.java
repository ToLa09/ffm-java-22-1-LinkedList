import java.util.ArrayList;
import java.util.List;

public class AnimalList {
    private AnimalListItem head;
    private List<AnimalListItem> animalList;

//    public AnimalList() {
//    }

    public AnimalList(List<AnimalListItem> animalList) {
        this.animalList = animalList;
    }

    public void add(Animal animal) {
        AnimalListItem nextItem = new AnimalListItem(animal);
        animalList.add(nextItem);
        if (animalList.size() > 1) {
            AnimalListItem previousItem = animalList.get(animalList.size()-2);
            previousItem.setNext(nextItem);
        }
    }

    public void remove(Animal animal){
        for (int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i).getValue() == animal){
                if (i > 0 && i < (animalList.size()-1)){
                    animalList.get(i-1).setNext(animalList.get(i+1));
                }
                if (i == (animalList.size()-1)) {
                    animalList.get(i-1).setNext(null);
                }
                animalList.remove(i);
            }
        }
    }

    public AnimalListItem getAnimalListItemByIndex(int index) {
        return animalList.get(index);
    }

    public AnimalListItem getAnimalListByFirstItem() {
        return animalList.get(0);
    }

    @Override
    public String toString() {
        List<String> output = new ArrayList<>();
        for (AnimalListItem a : animalList) {
            output.add(a.getValue().toString());
        }
        return "AnimalList: " +
                output;
    }
}

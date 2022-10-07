import java.util.ArrayList;
import java.util.List;

public class AnimalList {
    private AnimalListItem head;

    public AnimalList(Animal animal) {
        this.head = new AnimalListItem(animal);
    }

    public void add(Animal animal){
        AnimalListItem current = this.head;

        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(new AnimalListItem(animal));
    }

    public void remove(Animal animal){
        AnimalListItem itemToRemove = this.head;
        if (itemToRemove.getValue() == animal) {
            this.head = head.getNext();
            return;
        }
        while (itemToRemove.getValue() != animal) {
            itemToRemove = itemToRemove.getNext();
        }

        AnimalListItem itemBeforeRemove = this.head;

        while (itemBeforeRemove.getNext() != itemToRemove) {
            itemBeforeRemove = itemBeforeRemove.getNext();
        }
        if (itemBeforeRemove.getNext().getNext() != null) {
            AnimalListItem newNext = itemBeforeRemove.getNext().getNext();
            itemBeforeRemove.setNext(newNext);
        } else itemBeforeRemove.setNext(null);
    }

    @Override
    public String toString() {
        return "AnimalList{" +
                "head=" + head +
                '}';
    }

    //    private List<AnimalListItem> animalList;
//
//    public AnimalList() {
//    }
//
//    public AnimalList(List<AnimalListItem> animalList) {
//        this.animalList = animalList;
//    }
//
//    public void add(Animal animal) {
//        AnimalListItem nextItem = new AnimalListItem(animal);
//        animalList.add(nextItem);
//        if (animalList.size() > 1) {
//            AnimalListItem previousItem = animalList.get(animalList.size()-2);
//            previousItem.setNext(nextItem);
//        }
//    }
//
//    public void remove(Animal animal){
//        for (int i = 0; i < animalList.size(); i++) {
//            if (animalList.get(i).getValue() == animal){
////                if (i > 0 && i < (animalList.size()-1)){
////                    animalList.get(i-1).setNext(animalList.get(i+1));
////                }
////                if (i == (animalList.size()-1)) {
////                    animalList.get(i-1).setNext(null);
////                }
//                animalList.remove(i);
//            }
//        }
//        System.out.println(animalList);
//    }
//
//    public AnimalListItem getAnimalListItemByIndex(int index) {
//        return animalList.get(index);
//    }
//
//    public AnimalListItem getAnimalListByFirstItem() {
//        return animalList.get(0);
//    }
//
//    @Override
//    public String toString() {
//        List<String> output = new ArrayList<>();
//        for (AnimalListItem a : animalList) {
//            output.add(a.getValue().toString());
//        }
//        return "AnimalList: " +
//                output;
//    }
}

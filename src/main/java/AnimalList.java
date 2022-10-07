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

    public void removeAllAnimalsOfType(Animal animal) {
        int numberOfAnimal = countAnimal(animal);
        for (int i = 0; i < numberOfAnimal; i++) {
            this.remove(animal);
        }
    }

    public int countAnimal(Animal animal) {
        AnimalListItem current = this.head;
        int counter = 0;
        while (current.getNext() != null) {
            current = current.getNext();
            if (current.getValue() == animal) {
                counter +=1;
            }
        }
        return counter;
    }

    @Override
    public String toString() {
        return "AnimalList{" +
                "head=" + head +
                '}';
    }
}

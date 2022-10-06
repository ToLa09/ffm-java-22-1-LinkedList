import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal tiger = new Animal("Tiger");
        Animal bear = new Animal("Bär");
        Animal snake = new Animal("Schlange");

        AnimalList meineTierliste = new AnimalList(new ArrayList<>());

        meineTierliste.add(tiger);
        System.out.println("-------------\nnur Tiger: \n" + meineTierliste);

        meineTierliste.add(bear);
        System.out.println("-------------\nzwei Tiere: \n" + meineTierliste);

        meineTierliste.add(snake);
        System.out.println("-------------\ndrei Tiere: \n" + meineTierliste);

        System.out.println("-------------\n" + meineTierliste.getAnimalListItemByIndex(1));
        System.out.println("-------------\n" + meineTierliste.getAnimalListByFirstItem());

        meineTierliste.add(bear);
        meineTierliste.add(snake);
        meineTierliste.add(tiger);
        meineTierliste.add(tiger);
        meineTierliste.add(bear);

        System.out.println("-------------\n" + meineTierliste);
        meineTierliste.remove(tiger);
        System.out.println("-------------\n" + meineTierliste);
        System.out.println("-------------\n" + meineTierliste.getAnimalListByFirstItem());

    }
}
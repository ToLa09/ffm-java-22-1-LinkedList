public class Main {
    public static void main(String[] args) {
        Animal tiger = new Animal("Tiger");
        Animal bear = new Animal("Bär");
        Animal snake = new Animal("Schlange");

        AnimalList meineTierliste = new AnimalList(tiger);

        System.out.println("-------------\nnur Tiger: \n" + meineTierliste);

        meineTierliste.add(bear);
        System.out.println("-------------\nzwei Tiere: \n" + meineTierliste);

        meineTierliste.add(snake);
        System.out.println("-------------\ndrei Tiere: \n" + meineTierliste);


        meineTierliste.add(bear);
        meineTierliste.add(snake);
        meineTierliste.add(tiger);
        meineTierliste.add(tiger);
        meineTierliste.add(bear);


        System.out.println("-------------\nmehr Tiere: \n" + meineTierliste);

        meineTierliste.removeAllAnimalsOfType(tiger);

        System.out.println("-------------\nweniger Tiere: \n" + meineTierliste);

        meineTierliste.removeAllAnimalsOfType(snake);

        System.out.println("-------------\nweniger Tiere: \n" + meineTierliste);
    }
}
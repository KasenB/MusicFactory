public class MusicHQ {

    public static void main(String[] args) {
        MusicHQ myFactory = new MusicHQ();
    }

    public MusicHQ(){
        Music guitar;
        guitar = new Music("guitar","any color imaginable","three", 132, "rock");
        guitar.printInfo();

        Music piano;
        piano = new Music("piano", "black", "eight", 88, "clasical");
        piano.printInfo();
    }
}

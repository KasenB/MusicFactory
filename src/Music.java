public class Music {

    public String musicName;
    public String color;

    public String size;

    public int numNotes;

    public String typeMusic;

    public void printInfo(){
        System.out.println("The instrument is a " + musicName);
        System.out.println("The color of the instrument is: " + color);
        System.out.println("The size of the instrument is: " + size + " feet");
        System.out.println("The number of notes on in the instrument is: " + numNotes);
        System.out.println("The type of music the instrument is used for is: " + typeMusic);
    }

    public Music(String paramMusicName, String paramColor, String paramSize, int paramNumNotes, String paramTypeMusic){
        musicName = paramMusicName;
        color = paramColor;
        size = paramSize;
        numNotes = paramNumNotes;
        typeMusic = paramTypeMusic;
    }
}

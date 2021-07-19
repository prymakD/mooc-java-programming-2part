
public class CD implements Packable{
    private String artist;
    private String nameCD;
    private int publicationYear;

    public CD(String artist, String nameCD, int publicationYear) {
        this.artist = artist;
        this.nameCD = nameCD;
        this.publicationYear = publicationYear;
    }

    @Override
    public double weight() {
        return 0.1;
    }

    public String toString() {
        return this.artist + ": " + this.nameCD + " (" + this.publicationYear + ")";
    }
}

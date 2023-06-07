package TugasFilm;

public class Film {
    int id;
    String judul;
    int tahun;
    String director;

    Film() {

    }
    Film(int id, String judul, int tahun, String director) {
        this.id = id;
        this.judul = judul;
        this.tahun = tahun;
        this.director = director;
    }

    @Override
    public String toString() {
        return "Film{ID Film = " + id + ", Judul Film = " + judul + ", Tahun Tayang = " + tahun + ", Director = " + director + "}";
    }
}

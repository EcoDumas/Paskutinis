import java.util.Comparator;

public class cechas implements Comparable {
    String darbininkas;
    String detale;
    int kiekis;
    double kaina;

    public cechas(String darbininkas, String detale, int kiekis, double kaina) {
        this.darbininkas = darbininkas;
        this.detale = detale;
        this.kaina = kaina;
        this.kiekis = kiekis;
    }

    public String getDarbininkas() {
        return darbininkas;
    }

    public void setDarbininkas(String darbininkas) {
        this.darbininkas = darbininkas;
    }

    public String getDetale() {
        return detale;
    }

    public void setDetale(String detale) {
        this.detale = detale;
    }

    public int getKiekis() {
        return kiekis;
    }

    public void setKiekis(int kiekis) {
        this.kiekis = kiekis;
    }

    public double getKaina() {
        return kaina;
    }

    public void setKaina(double kaina) {
        this.kaina = kaina;
    }

    @Override
    public int compareTo(Object o) {
        return Comparator.comparing(cechas::getKiekis)
                .reversed()
                .thenComparing(cechas::getDetale)
                .compare(this, (cechas) o);
    }

    @Override
    public String toString() {
        return "Darbininkas " + darbininkas +
                ",detale - " + detale +
                "kiekis: " + kiekis +
                ", kaina: " + kaina + "\n";
    }
}
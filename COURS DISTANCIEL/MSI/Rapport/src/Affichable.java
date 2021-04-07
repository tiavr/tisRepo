import java.util.List;

public interface Affichable {
    public String getNomType();

    public String getValeur();

    public List<Affichable> getContenuAffichable();
}

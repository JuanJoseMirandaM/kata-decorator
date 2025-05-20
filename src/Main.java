import sistemaPublicaciones.DeluxeEdition;
import sistemaPublicaciones.IllustratedEdition;
import sistemaPublicaciones.Publication;
import sistemaPublicaciones.PublicationComponent;

/**
 * @author Juan Jose Miranda
 */
public class Main {
  public static void main(String[] args) {
    //    KATA 7
    PublicationComponent bookA = new Publication("Libro A", 200);
    PublicationComponent magazineB = new Publication("Revista B", 50);

    PublicationComponent illustratedBook = new IllustratedEdition(bookA);
    PublicationComponent deluxeMagazine = new DeluxeEdition(magazineB);

    illustratedBook.showDetails();
    deluxeMagazine.showDetails();

    int totalPages = illustratedBook.getPages() + deluxeMagazine.getPages();
    System.out.println("Colección: Biblioteca, Páginas Totales: " + totalPages);
  }
}
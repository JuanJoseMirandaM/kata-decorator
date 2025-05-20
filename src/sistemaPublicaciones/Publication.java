package sistemaPublicaciones;

/**
 * @author Juan Jose Miranda
 */
public class Publication implements PublicationComponent {
  private String title;
  private int pages;

  public Publication(String title, int pages) {
    this.title = title;
    this.pages = pages;
  }

  @Override
  public int getPages() {
    return pages;
  }

  @Override
  public void showDetails() {
    System.out.println("Publicación: " + title + ", Páginas: " + pages);
  }
}
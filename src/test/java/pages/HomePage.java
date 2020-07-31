package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import page.BasePage;

public class HomePage extends BasePage {
    private final By searchInput = By.name("as_word']");
    private final By searchButton = By.xpath("//form/button[@type='submit']");
    private final By categories = By.xpath("//a[text()='Categorías']");
    private final By technologyCategory = By.xpath("//a[text()='Tecnología']");
    private final By tvsSection = By.xpath("//h2/a[text()='TVs']");

    public HomePage() {
        validatePage();
    }

    private void validatePage() {
        Assert.assertTrue("No se encontro el text box de busqueda", find(searchInput));
        Assert.assertTrue("No se encontro el boton de busqueda", find(searchButton));
    }

    public void openCategoriesMenu() {
        Assert.assertTrue("No se encontro la opcion Categorías", find(categories));
        click(categories);

        /*Assert.assertTrue("No se encontro la categoria Tecnologia", find(technologyCategory));
        click(technologyCategory);

        Assert.assertTrue("No se encontro la seccion  TVs", find(tvsSection));
        click(tvsSection);*/
    }
}

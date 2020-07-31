package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import page.BasePage;

public class HomePage extends BasePage {
    private final By searchInput = By.name("as_word");
    private final By searchButton = By.xpath("//form/button[@type='submit']");
    private final By categories = By.xpath("//a[text()='Categorías']");

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
    }
}

package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page.BasePage;

import java.util.List;

public class TVsSectionPage extends BasePage {
    private final By sortByLabel = By.xpath("//label[normalize-space(text())='Más relevantes']");
    private final By minorPriceOption = By.xpath("//ul/li/a[normalize-space(text())='Menor precio']");
    private final By items = By.xpath("//ol[@id='searchResults']/li//h2");
    private final By itemPrice = By.xpath("//span[@class='price-tag-fraction']");

    public void sortByMinorPrice() {
        Assert.assertTrue("No se encontro el label para orden 'Mas relevante'", find(sortByLabel));
        click(sortByLabel);

        Assert.assertTrue("No se encontro la opcion 'Menor precio'", find(minorPriceOption));
        click(minorPriceOption);
    }

    public void clickLastItem() {
        Assert.assertTrue("No se encontro ninguna lista de items'", find(items));

        List<WebElement> list = findElements(items);
        WebElement lastItem = list.get(list.size() - 1);

        lastItem.click();
    }

    public void validatePrice(String price) {
        Assert.assertEquals("El precio del item no coincide con " + price, price, getText(itemPrice));
    }

}

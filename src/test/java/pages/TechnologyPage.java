package pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import page.BasePage;


public class TechnologyPage extends BasePage {
    private String category = "//a[text()='%s']";
    private String section = "//h2/a[text()='%s']";

    public TechnologyPage() {
    }


    public void goToSectionFrom(String category, String section) {
        By locator = By.xpath(String.format(this.category, category));
        Assert.assertTrue("No se encontro la categoria " + category, find(locator));
        click(locator);

        locator = By.xpath(String.format(this.section, section));
        Assert.assertTrue("No se encontro la seccion " + section, find(locator));
        click(locator);
    }
}

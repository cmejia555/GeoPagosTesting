import pages.HomePage;
import pages.TVsSectionPage;
import pages.TechnologyPage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;


@DisplayName("Fravega Test")
@Epic("Frontend")
public class MercadolibreTest extends BaseTest {

    @Test
    @DisplayName("Validar precio ultimo producto")
    @Description("Dentro de la categoria tecnologia se ordena los productos por precio y se valida el ultimo")
    public void test_01_validatePrice() {
        String price = "22.999";

        HomePage homePage = new HomePage();
        homePage.openCategoriesMenu();

        TechnologyPage technologyPage = new TechnologyPage();
        technologyPage.goToSectionFrom("Tecnología", "TVs");

        TVsSectionPage tVsSectionPage = new TVsSectionPage();
        tVsSectionPage.sortByMinorPrice();
        tVsSectionPage.clickLastItem();
        tVsSectionPage.validatePrice(price);
    }

}

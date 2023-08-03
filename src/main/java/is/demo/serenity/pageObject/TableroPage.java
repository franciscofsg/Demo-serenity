package is.demo.serenity.pageObject;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TableroPage extends PageObject {

    @FindBy(xpath= "//h1[.='Dashboard']")
    public WebElementFacade LBLDashboard;


}

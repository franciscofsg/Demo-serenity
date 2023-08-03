package is.demo.serenity.steps;

import is.demo.serenity.pageObject.TableroPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

public class TableroSteps {

    @Page
    TableroPage tablero;

    @Step("Validar mensage en pantalla")
    public void validarMsj() {

        Assert.assertTrue(

                tablero.LBLDashboard.isDisplayed()

        );

    }

}

package is.demo.serenity.steps;

import io.cucumber.datatable.DataTable;
import is.demo.serenity.pageObject.InicioSesionPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class InicioSesionSteps {

   @Page
    InicioSesionPage inicio;

   @Step("Abrir el navegador")
    public void abrirNavegador() {

       inicio.openUrl("https://demo.serenity.is/Account/Login/?ReturnUrl=%2F");

   }

    @Step("Enviar Campo Usuario")
    public void enviarUsuario(DataTable dataTable) {

        // Limpia el campo de usuario
        inicio.getDriver().findElement(inicio.getTxtUsuario()).clear();

        inicio.getDriver().findElement(inicio.getTxtUsuario()).sendKeys(dataTable.asLists().get(1).get(0));

    }

    @Step("Enviar Campo Clave")
    public void enviarClave(DataTable dataTable) {

        // Limpia el campo de usuario
        inicio.getDriver().findElement(inicio.getTxtClave()).clear();

        inicio.getDriver().findElement(inicio.getTxtClave()).sendKeys(dataTable.asLists().get(1).get(1));

    }

    @Step("Click iniciar sesion")
    public void clickInicioSesion() {

        // Click en boton
        inicio.getDriver().findElement(inicio.getBtnInicioSesion()).click();


    }


    public void validarTexto() {

        // Click en boton
        inicio.getDriver().findElement(inicio.getBtnInicioSesion()).click();


    }


}

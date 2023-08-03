package is.demo.serenity.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.*;
import is.demo.serenity.steps.InicioSesionSteps;
import is.demo.serenity.steps.TableroSteps;
import net.thucydides.core.annotations.Steps;


public class InicioSesionStepDefinitions {

    @Steps
    InicioSesionSteps inicioSesion;

    @Steps
    TableroSteps tableroSteps;


    @Dado("que el usuario abre la pagina demo")
    public void queElUsuarioAbreLaPaginaDemo() {
        inicioSesion.abrirNavegador();
    }
    @Cuando("el usuario ingresa las credenciales")
    public void elUsuarioIngresaLasCredenciales(DataTable dataTable) {

        inicioSesion.enviarUsuario(dataTable);
        inicioSesion.enviarClave(dataTable);

    }
    @Cuando("de click en ingresar")
    public void deClickEnIngresar() {

        inicioSesion.clickInicioSesion();

    }
    @Entonces("el usuario podrá ver un mensaje de plataforma.")
    public void elUsuarioPodráVerUnMensajeDePlataforma() {

        tableroSteps.validarMsj();

    }


}

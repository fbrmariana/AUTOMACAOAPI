package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import utils.RestUtils;

import java.util.Map;

public class UsersSteps {
    Map<String, String> mapDados;
    String id = "";

    @Dado("que sejam preenchidos os valores de users com")
    public void queSejamPreenchidosOsValoresDeUsersCom(Map<String, String> map) {
        mapDados = map;
    }

    @Dado("que seja utilizado o id {string}")
    public void queSejaUtilizadoOId(String id) {
        this.id = id;
    }

    @Quando("chamado o POST de users")
    public void chamadoOPOSTDeUsers() {
        RestUtils.postRequest("https://reqres.in/api/users", mapDados);
    }

    @Quando("chamado o Get de users Por Id")
    public void chamadoOGetDeUsersPorId() {
        RestUtils.getRequest("https://reqres.in/api/users/"+this.id);
    }

    @Entao("o sistema devolve o status {int}")
    public void oSistemaDevolveOStatus(int status)    {
        Assert.assertEquals(status, RestUtils.getStatusCode());
    }

    @Entao("o campo {string} retorna o valor {string}")
    public void oCampoRetornouOValor(String key, String value) {
        Assert.assertEquals(value, RestUtils.getResponse(key));
    }

    @Entao("o campo {string} retorna o valor {int}")
    public void oCampoRetornouOValor(String key, int value) {
        Assert.assertEquals(value, RestUtils.getResponse(key));
    }

}

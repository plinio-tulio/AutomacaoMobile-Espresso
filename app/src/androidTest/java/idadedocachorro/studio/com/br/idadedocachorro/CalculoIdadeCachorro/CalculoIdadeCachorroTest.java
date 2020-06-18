package idadedocachorro.studio.com.br.idadedocachorro.CalculoIdadeCachorro;

import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import idadedocachorro.studio.com.br.idadedocachorro.CalculoIdadeCachorro.pages.CalculoIdadeCachorroPage;
import idadedocachorro.studio.com.br.idadedocachorro.MainActivity;

public class CalculoIdadeCachorroTest {

    @Rule
    public ActivityTestRule<MainActivity>
            mActivityRule = new ActivityTestRule<>(MainActivity.class, false, true);

    @Before
    public void setup() {


    }

    @After
    public void finish() {


    }

    @Test
    public void validarTela() {
        new CalculoIdadeCachorroPage()
                .verificarTituloPagina()
                .verificarElementoImagem()
                .verificarTextoTela()
                .verificarCampoNumero()
                .verificarBotaoIdade();
    }

    @Test
    public void validarCalculoIdadeCachorro() throws InterruptedException {
        new CalculoIdadeCachorroPage()
                .escreverIdade()
                .clicarEmCalcular()
                .sleep(5)
                .verificarResultadoCalculo();
    }

    @Test
    public void validarCalculoIdadeCachorroSemInformarValor() {
        new CalculoIdadeCachorroPage()
                .clicarEmCalcular()
                .verificarResultadoVazio();
    }

}

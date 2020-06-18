package idadedocachorro.studio.com.br.idadedocachorro.CalculoIdadeCachorro.pages;

import idadedocachorro.studio.com.br.idadedocachorro.R;
import idadedocachorro.studio.com.br.idadedocachorro.common.ScreenRobot;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static idadedocachorro.studio.com.br.idadedocachorro.CalculoIdadeCachorro.constants.constants.IDADE;
import static idadedocachorro.studio.com.br.idadedocachorro.CalculoIdadeCachorro.constants.constants.RESULTADO_CALCULO;
import static idadedocachorro.studio.com.br.idadedocachorro.CalculoIdadeCachorro.constants.constants.RESULTADO_VAZIO;
import static idadedocachorro.studio.com.br.idadedocachorro.CalculoIdadeCachorro.constants.constants.TXT_BTN_DESCOBRIR_IDADE;
import static idadedocachorro.studio.com.br.idadedocachorro.CalculoIdadeCachorro.constants.constants.TXT_TELA;
import static idadedocachorro.studio.com.br.idadedocachorro.CalculoIdadeCachorro.constants.constants.TXT_TITLE_TELA;

public class CalculoIdadeCachorroPage extends ScreenRobot<CalculoIdadeCachorroPage> {

    private static final int IMAGEM_TELA = R.id.imageView2;
   // private static final int TXT_TITULO_TELA = R.id.;
    private static final int VIEWTXT_TELA = R.id.textView;
    private static final int CAMPO_NUMERO = R.id.numero;
    private static final int BOTAO_IDADE = R.id.btnIdade;
    private static final int VIEWTEXT_RESULTADO = R.id.resultado;

    public CalculoIdadeCachorroPage verificarTituloPagina() {

        return checkViewContainsText(TXT_TITLE_TELA);
    }

    public CalculoIdadeCachorroPage verificarElementoImagem() {

        return checkIsDisplayed(IMAGEM_TELA);
    }

    public CalculoIdadeCachorroPage verificarTextoTela() {

        return checkViewHasText(VIEWTXT_TELA, TXT_TELA);
    }

    public CalculoIdadeCachorroPage verificarCampoNumero() {

        return checkIsDisplayed(CAMPO_NUMERO);
    }

    public CalculoIdadeCachorroPage verificarBotaoIdade() {

        return checkViewHasText(BOTAO_IDADE,TXT_BTN_DESCOBRIR_IDADE);
    }

    public CalculoIdadeCachorroPage verificarResultadoCalculo() {
        System.out.println("IMPRIMINDO TESTE ::: "+onView(withId(VIEWTEXT_RESULTADO)).toString());
        return checkViewHasText(VIEWTEXT_RESULTADO,RESULTADO_CALCULO);
    }

    public CalculoIdadeCachorroPage verificarResultadoVazio() {

        return checkViewHasText(VIEWTEXT_RESULTADO,RESULTADO_VAZIO);
    }

    public CalculoIdadeCachorroPage escreverIdade() {

        return enterTextIntoView(CAMPO_NUMERO,IDADE);
    }

    public CalculoIdadeCachorroPage clicarEmCalcular(){

        return clickOnView(BOTAO_IDADE);
    }



}

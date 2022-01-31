import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.322f;
        DecimalFormatSymbols symbol = new DecimalFormatSymbols(new Locale("pt","BR"));
        symbol.setDecimalSeparator('.');
        symbol.setGroupingSeparator(',');
        String pattern = "#,##0.000";
        DecimalFormat formatador = new DecimalFormat(pattern, symbol);
        System.out.printf("Valor: R$ %s\n", formatador.format(valor));
        System.out.printf("Taxa: %.2f%%", taxa);
    }
}

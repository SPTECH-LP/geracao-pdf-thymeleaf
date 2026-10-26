package school.sptech;

import java.time.LocalDate;
import java.util.List;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class GeradorHtml {

    private final TemplateEngine templateEngine;

    public GeradorHtml() {
        // Diz ao Thymeleaf onde procurar os templates: src/main/resources/templates/*.html
        ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
        resolver.setPrefix("templates/");
        resolver.setSuffix(".html");
        resolver.setTemplateMode(TemplateMode.HTML);
        resolver.setCharacterEncoding("UTF-8");

        templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(resolver);
    }

    public String gerarHtmlRelatorioEstoque(List<Produto> produtos) {
        double valorTotalEstoque = 0;
        for (Produto produto : produtos) {
            valorTotalEstoque += produto.getValorTotal();
        }

        // Variáveis que o template vai enxergar como ${produtos}, ${valorTotal} e ${dataGeracao}
        Context contexto = new Context();
        contexto.setVariable("produtos", produtos);
        contexto.setVariable("valorTotal", valorTotalEstoque);
        contexto.setVariable("dataGeracao", LocalDate.now());

        return templateEngine.process("relatorio-estoque", contexto);
    }
}

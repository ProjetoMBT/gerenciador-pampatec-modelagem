import oracle.oats.scripting.modules.basic.api.*;
import oracle.oats.scripting.modules.browser.api.*;
import oracle.oats.scripting.modules.functionalTest.api.*;
import oracle.oats.scripting.modules.utilities.api.*;
import oracle.oats.scripting.modules.utilities.api.sql.*;
import oracle.oats.scripting.modules.utilities.api.xml.*;
import oracle.oats.scripting.modules.utilities.api.file.*;
import oracle.oats.scripting.modules.webdom.api.*;

public class script extends IteratingVUserScript {
	@ScriptService oracle.oats.scripting.modules.utilities.api.UtilitiesService utilities;
	@ScriptService oracle.oats.scripting.modules.browser.api.BrowserService browser;
	@ScriptService oracle.oats.scripting.modules.functionalTest.api.FunctionalTestService ft;
	@ScriptService oracle.oats.scripting.modules.webdom.api.WebDomService web;
	
	public void initialize() throws Exception {
		browser.launch();
	}
		
	/**
	 * Add code to be executed each iteration for this virtual user.
	 */
	public void run() throws Exception {
		beginStep(
				"[1] Acessar o Sistema - Login (/loginEmpreendedor.jsf;jsessionid=55215c6a6f5dbd1fe8d385895f35)",
				0);
		{
			web.window(77, "/web:window[@index='0' or @title='about:blank']")
					.navigate(
							"http://192.168.100.11:8080/GerenciadorPampatec/loginEmpreendedor.jsf;jsessionid=55215c6a6f5dbd1fe8d385895f35");
			web.window(79,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']")
					.waitForPage(null);
			{
				think(1.461);
			}
			web.textBox(
					80,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']/web:document[@index='0']/web:form[@id='formularioDeLogin' or @name='formularioDeLogin' or @index='1']/web:input_text[@id='formularioDeLogin:emailInput' or @name='formularioDeLogin:emailInput' or @index='0']")
					.click();
			{
				think(3.997);
			}
			web.textBox(
					81,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']/web:document[@index='0']/web:form[@id='formularioDeLogin' or @name='formularioDeLogin' or @index='1']/web:input_text[@id='formularioDeLogin:emailInput' or @name='formularioDeLogin:emailInput' or @index='0']")
					.click();
			{
				think(1.458);
			}
			web.textBox(
					82,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']/web:document[@index='0']/web:form[@id='formularioDeLogin' or @name='formularioDeLogin' or @index='1']/web:input_text[@id='formularioDeLogin:emailInput' or @name='formularioDeLogin:emailInput' or @index='0']")
					.setText("testetestezin@gmail.com");
			{
				think(1.238);
			}
			web.textBox(
					83,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']/web:document[@index='0']/web:form[@id='formularioDeLogin' or @name='formularioDeLogin' or @index='1']/web:input_password[@id='formularioDeLogin:senhaInput' or @name='formularioDeLogin:senhaInput' or @index='0']")
					.click();
			{
				think(1.235);
			}
			web.textBox(
					84,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']/web:document[@index='0']/web:form[@id='formularioDeLogin' or @name='formularioDeLogin' or @index='1']/web:input_password[@id='formularioDeLogin:senhaInput' or @name='formularioDeLogin:senhaInput' or @index='0']")
					.setPassword(deobfuscate("jAkVtHLCrPJcJyqHt69rhg=="));
			{
				think(0.781);
			}
			web.textBox(
					85,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']/web:document[@index='0']/web:form[@id='formularioDeLogin' or @name='formularioDeLogin' or @index='1']/web:input_password[@id='formularioDeLogin:senhaInput' or @name='formularioDeLogin:senhaInput' or @index='0']")
					.pressEnter();
			{
				think(2.793);
			}
			web.element(
					86,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']/web:document[@index='0']/web:div[@text='\r\n\r\nAcessar\r\n ' or @index='21']")
					.click();
		}
		endStep();
		beginStep(
				"[2] Página Principal - Empreendedor (/homeEmpreendedor.jsf)",
				0);
		{
			web.window(87,
					"/web:window[@index='0' or @title='Página Principal - Empreendedor']")
					.waitForPage(null);
			{
				think(0.234);
			}
			web.element(
					89,
					"/web:window[@index='0' or @title='Página Principal - Empreendedor']/web:document[@index='0']/web:i[@index='0']")
					.click();
		}
		endStep();
		beginStep(
				"[3] Planos de Negócio - Empreendedor (/paginaBuscaPlanoDeNegocio.jsf)",
				0);
		{
			web.window(90,
					"/web:window[@index='0' or @title='Planos de Negócio - Empreendedor']")
					.waitForPage(null);
			{
				think(4.544);
			}
			web.element(
					91,
					"/web:window[@index='0' or @title='Planos de Negócio - Empreendedor']/web:document[@index='0']/web:label[@innerText=' \r\n Criar novo plano de negócio' and @text=' \r\n Criar novo plano de negócio' and @index='0']")
					.click();
		}
		endStep();
		beginStep("[4] Cadastro Plano de Negócio (/enviarProjeto.jsf)", 0);
		{
			web.window(92,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']")
					.waitForPage(null);
			{
				think(5.481);
			}
			web.button(
					93,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:form[@id='formEquipe' or @name='formEquipe' or @index='2']/web:button[@id='formEquipe:botaoSalvar1' or @name='formEquipe:botaoSalvar1' or @index='15']")
					.click();
			{
				think(1.509);
			}
			web.button(
					94,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:form[@id='formulario_cadastro_projeto' or @name='formulario_cadastro_projeto' or @index='1']/web:input_submit[@name='formulario_cadastro_projeto:j_idt65' or @value='Salvar Equipe' or @index='16']")
					.click();
		}
		endStep();
		beginStep("[5] Cadastro Plano de Negócio (/enviarProjeto.jsf)", 0);
		{
			web.window(95,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']")
					.waitForPage(null);
			{
				think(7.376);
			}
			web.textArea(
					96,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:form[@id='formulario_cadastro_projeto' or @name='formulario_cadastro_projeto' or @index='1']/web:textarea[@id='formulario_cadastro_projeto:empresaProjeto' or @name='formulario_cadastro_projeto:empresaProjeto' or @index='0']")
					.setText("Nome");
			{
				think(4.45);
			}
			web.textArea(
					97,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:form[@id='formulario_cadastro_projeto' or @name='formulario_cadastro_projeto' or @index='1']/web:textarea[@id='formulario_cadastro_projeto:segmentoDeClientes' or @name='formulario_cadastro_projeto:segmentoDeClientes' or @index='1']")
					.setText("teste");
			{
				think(1.541);
			}
			web.textArea(
					98,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:form[@id='formulario_cadastro_projeto' or @name='formulario_cadastro_projeto' or @index='1']/web:textarea[@id='formulario_cadastro_projeto:propostaDeValor' or @name='formulario_cadastro_projeto:propostaDeValor' or @index='2']")
					.setText("teste");
			{
				think(3.323);
			}
			web.textArea(
					99,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:form[@id='formulario_cadastro_projeto' or @name='formulario_cadastro_projeto' or @index='1']/web:textarea[@id='formulario_cadastro_projeto:atividadesChave' or @name='formulario_cadastro_projeto:atividadesChave' or @index='3']")
					.setText("teste");
			{
				think(10.104);
			}
			web.link(
					100,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:a[@text='Análise de Mercado' or @href='http://192.168.100.11:8080/GerenciadorPampatec/view/empreendedor/enviarProjeto.jsf#formParte03' or @index='9']")
					.click();
			{
				think(1.77);
			}
			web.textArea(
					101,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:form[@id='formulario_cadastro_projeto' or @name='formulario_cadastro_projeto' or @index='1']/web:textarea[@id='formulario_cadastro_projeto:relacoComClientes' or @name='formulario_cadastro_projeto:relacoComClientes' or @index='4']")
					.setText("teste");
			{
				think(2.343);
			}
			web.textArea(
					102,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:form[@id='formulario_cadastro_projeto' or @name='formulario_cadastro_projeto' or @index='1']/web:textarea[@id='formulario_cadastro_projeto:parceriasChaves' or @name='formulario_cadastro_projeto:parceriasChaves' or @index='5']")
					.setText("teste");
			{
				think(1.137);
			}
			web.textArea(
					103,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:form[@id='formulario_cadastro_projeto' or @name='formulario_cadastro_projeto' or @index='1']/web:textarea[@id='formulario_cadastro_projeto:canais' or @name='formulario_cadastro_projeto:canais' or @index='6']")
					.setText("teste");
			{
				think(3.022);
			}
			web.textArea(
					104,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:form[@id='formulario_cadastro_projeto' or @name='formulario_cadastro_projeto' or @index='1']/web:textarea[@id='formulario_cadastro_projeto:recursosPrincipais' or @name='formulario_cadastro_projeto:recursosPrincipais' or @index='7']")
					.setText("teste");
			{
				think(0.839);
			}
			web.textArea(
					105,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:form[@id='formulario_cadastro_projeto' or @name='formulario_cadastro_projeto' or @index='1']/web:textarea[@id='formulario_cadastro_projeto:concorrentes' or @name='formulario_cadastro_projeto:concorrentes' or @index='8']")
					.setText("teste");
			{
				think(3.895);
			}
			web.link(
					106,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:a[@text='Produto ou Serviço' or @href='http://192.168.100.11:8080/GerenciadorPampatec/view/empreendedor/enviarProjeto.jsf#formParte04' or @index='10']")
					.click();
			{
				think(4.583);
			}
			web.selectBox(
					107,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:form[@id='formulario_cadastro_projeto' or @name='formulario_cadastro_projeto' or @index='1']/web:select[(@id='formulario_cadastro_projeto:estagioDeEvolucao' or @name='formulario_cadastro_projeto:estagioDeEvolucao' or @index='0') and multiple mod 'False']")
					.selectOptionByText("Projeto Básico");
			{
				think(1.615);
			}
			web.textArea(
					108,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:form[@id='formulario_cadastro_projeto' or @name='formulario_cadastro_projeto' or @index='1']/web:textarea[@id='formulario_cadastro_projeto:tecnologiaProcessos' or @name='formulario_cadastro_projeto:tecnologiaProcessos' or @index='9']")
					.setText("teste");
			{
				think(0.991);
			}
			web.textArea(
					109,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:form[@id='formulario_cadastro_projeto' or @name='formulario_cadastro_projeto' or @index='1']/web:textarea[@id='formulario_cadastro_projeto:potencialInovacaoTecnologica' or @name='formulario_cadastro_projeto:potencialInovacaoTecnologica' or @index='10']")
					.setText("teste");
			{
				think(2.256);
			}
			web.textArea(
					110,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:form[@id='formulario_cadastro_projeto' or @name='formulario_cadastro_projeto' or @index='1']/web:textarea[@id='formulario_cadastro_projeto:aplicacoes' or @name='formulario_cadastro_projeto:aplicacoes' or @index='11']")
					.setText("teste");
			{
				think(1.235);
			}
			web.textArea(
					111,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:form[@id='formulario_cadastro_projeto' or @name='formulario_cadastro_projeto' or @index='1']/web:textarea[@id='formulario_cadastro_projeto:dificuldadesEsperadas' or @name='formulario_cadastro_projeto:dificuldadesEsperadas' or @index='12']")
					.setText("teste");
			{
				think(3.016);
			}
			web.textArea(
					112,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:form[@id='formulario_cadastro_projeto' or @name='formulario_cadastro_projeto' or @index='1']/web:textarea[@id='formulario_cadastro_projeto:interacaoEmpresaUniversidade' or @name='formulario_cadastro_projeto:interacaoEmpresaUniversidade' or @index='13']")
					.setText("teste");
			{
				think(1.018);
			}
			web.textArea(
					113,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:form[@id='formulario_cadastro_projeto' or @name='formulario_cadastro_projeto' or @index='1']/web:textarea[@id='formulario_cadastro_projeto:interacaoEmpresaComunidadeGoverno' or @name='formulario_cadastro_projeto:interacaoEmpresaComunidadeGoverno' or @index='14']")
					.setText("teste");
			{
				think(0.757);
			}
			web.textArea(
					114,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:form[@id='formulario_cadastro_projeto' or @name='formulario_cadastro_projeto' or @index='1']/web:textarea[@id='formulario_cadastro_projeto:infraestrutura' or @name='formulario_cadastro_projeto:infraestrutura' or @index='15']")
					.setText("teste");
			{
				think(2.37);
			}
			web.link(
					115,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:a[@text='Gestão de Pessoas' or @href='http://192.168.100.11:8080/GerenciadorPampatec/view/empreendedor/enviarProjeto.jsf#formParte05' or @index='11']")
					.click();
			{
				think(1.571);
			}
			web.textArea(
					116,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:form[@id='formulario_cadastro_projeto' or @name='formulario_cadastro_projeto' or @index='1']/web:textarea[@id='formulario_cadastro_projeto:participacaoAcionaria' or @name='formulario_cadastro_projeto:participacaoAcionaria' or @index='16']")
					.setText("teste");
			{
				think(2.682);
			}
			web.textArea(
					117,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:form[@id='formulario_cadastro_projeto' or @name='formulario_cadastro_projeto' or @index='1']/web:textarea[@id='formulario_cadastro_projeto:potencialEmprego' or @name='formulario_cadastro_projeto:potencialEmprego' or @index='17']")
					.setText("teste");
			{
				think(1.76);
			}
			web.link(
					118,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:a[@text='Plano Financeiro' or @href='http://192.168.100.11:8080/GerenciadorPampatec/view/empreendedor/enviarProjeto.jsf#formParte06' or @index='12']")
					.click();
			{
				think(2.489);
			}
			web.textArea(
					119,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:form[@id='formulario_cadastro_projeto' or @name='formulario_cadastro_projeto' or @index='1']/web:textarea[@id='formulario_cadastro_projeto:fontesDeReceita' or @name='formulario_cadastro_projeto:fontesDeReceita' or @index='18']")
					.setText("teste");
			{
				think(2.502);
			}
			web.textArea(
					120,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:form[@id='formulario_cadastro_projeto' or @name='formulario_cadastro_projeto' or @index='1']/web:textarea[@id='formulario_cadastro_projeto:estruturaCustos' or @name='formulario_cadastro_projeto:estruturaCustos' or @index='19']")
					.setText("teste");
			{
				think(1.07);
			}
			web.textArea(
					121,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:form[@id='formulario_cadastro_projeto' or @name='formulario_cadastro_projeto' or @index='1']/web:textarea[@id='formulario_cadastro_projeto:investimentoInicial' or @name='formulario_cadastro_projeto:investimentoInicial' or @index='20']")
					.setText("teste");
			{
				think(4.147);
			}
			web.button(
					122,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:form[@id='formulario_cadastro_projeto' or @name='formulario_cadastro_projeto' or @index='1']/web:button[@id='formulario_cadastro_projeto:botaoSalvar6' or @name='formulario_cadastro_projeto:botaoSalvar6' or @index='12']")
					.click();
			{
				think(1.312);
			}
			web.button(
					123,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:form[@id='formulario_cadastro_projeto' or @name='formulario_cadastro_projeto' or @index='1']/web:input_submit[@name='formulario_cadastro_projeto:j_idt57' or @value='Salvar Plano de Negócio' or @index='14']")
					.click();
		}
		endStep();
		beginStep("[6] Cadastro Plano de Negócio (/enviarProjeto.jsf)", 0);
		{
			web.window(124,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']")
					.waitForPage(null);
		}
		endStep();

	}
	
	public void finish() throws Exception {
	}
}

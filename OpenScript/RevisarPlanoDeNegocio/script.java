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
		beginStep("[1] Acessar o Sistema - Login (/GerenciadorPampatec/)", 0);
		{
			web.window(20, "/web:window[@index='0' or @title='about:blank']")
					.navigate("http://192.168.100.11:8080/GerenciadorPampatec/");
			web.window(21,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']")
					.waitForPage(null);
			{
				think(0.866);
			}
			web.textBox(
					22,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']/web:document[@index='0']/web:form[@id='formularioDeLogin' or @name='formularioDeLogin' or @index='1']/web:input_text[@id='formularioDeLogin:emailInput' or @name='formularioDeLogin:emailInput' or @index='0']")
					.click();
			{
				think(0.416);
			}
			web.textBox(
					23,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']/web:document[@index='0']/web:form[@id='formularioDeLogin' or @name='formularioDeLogin' or @index='1']/web:input_text[@id='formularioDeLogin:emailInput' or @name='formularioDeLogin:emailInput' or @index='0']")
					.setText("testetestezin@gmail.com");
			{
				think(1.047);
			}
			web.textBox(
					24,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']/web:document[@index='0']/web:form[@id='formularioDeLogin' or @name='formularioDeLogin' or @index='1']/web:input_password[@id='formularioDeLogin:senhaInput' or @name='formularioDeLogin:senhaInput' or @index='0']")
					.click();
			{
				think(1.636);
			}
			web.textBox(
					25,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']/web:document[@index='0']/web:form[@id='formularioDeLogin' or @name='formularioDeLogin' or @index='1']/web:input_password[@id='formularioDeLogin:senhaInput' or @name='formularioDeLogin:senhaInput' or @index='0']")
					.setPassword(deobfuscate("jAkVtHLCrPJcJyqHt69rhg=="));
			{
				think(1.023);
			}
			web.button(
					26,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']/web:document[@index='0']/web:form[@id='formularioDeLogin' or @name='formularioDeLogin' or @index='1']/web:button[@id='formularioDeLogin:botaoLogin' or @name='formularioDeLogin:botaoLogin' or @index='1']")
					.click();
		}
		endStep();
		beginStep(
				"[2] Página Principal - Empreendedor (/homeEmpreendedor.jsf)",
				0);
		{
			web.window(27,
					"/web:window[@index='0' or @title='Página Principal - Empreendedor']")
					.waitForPage(null);
			{
				think(1.191);
			}
			web.element(
					29,
					"/web:window[@index='0' or @title='Página Principal - Empreendedor']/web:document[@index='0']/web:i[@index='0']")
					.click();
		}
		endStep();
		beginStep(
				"[3] Planos de Negócio - Empreendedor (/paginaBuscaPlanoDeNegocio.jsf)",
				0);
		{
			web.window(30,
					"/web:window[@index='0' or @title='Planos de Negócio - Empreendedor']")
					.waitForPage(null);
			{
				think(1.058);
			}
			web.button(
					31,
					"/web:window[@index='0' or @title='Planos de Negócio - Empreendedor']/web:document[@index='0']/web:form[@id='lista_planos' or @name='lista_planos' or @index='1']/web:button[@id='lista_planos:singleDT:0:visualizar' or @name='lista_planos:singleDT:0:visualizar' or @index='1']")
					.click();
		}
		endStep();
		beginStep("[4] Cadastro Plano de Negócio (/enviarProjeto.jsf)", 0);
		{
			web.window(32,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']")
					.waitForPage(null);
			{
				think(1.516);
			}
			web.button(
					33,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:input_submit[@id='botao_revisar' or @name='botao_revisar' or @value='Revisar' or @index='2']")
					.click();
		}
		endStep();

	}
	
	public void finish() throws Exception {
	}
}

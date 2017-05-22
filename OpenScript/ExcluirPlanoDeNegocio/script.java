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
			web.window(13, "/web:window[@index='0' or @title='about:blank']")
					.navigate("http://192.168.100.6:8080/GerenciadorPampatec/");
			web.window(14,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']")
					.waitForPage(null);
			{
				think(0.769);
			}
			web.element(
					15,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']/web:document[@index='0']/web:div[@text='Insira seu E-mail ou CPF ' or @index='15']")
					.click();
			{
				think(0.731);
			}
			web.textBox(
					16,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']/web:document[@index='0']/web:form[@id='formularioDeLogin' or @name='formularioDeLogin' or @index='1']/web:input_text[@id='formularioDeLogin:emailInput' or @name='formularioDeLogin:emailInput' or @index='0']")
					.click();
			{
				think(0.477);
			}
			web.textBox(
					17,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']/web:document[@index='0']/web:form[@id='formularioDeLogin' or @name='formularioDeLogin' or @index='1']/web:input_text[@id='formularioDeLogin:emailInput' or @name='formularioDeLogin:emailInput' or @index='0']")
					.setText("testetestezin@gmail.com");
			{
				think(1.218);
			}
			web.textBox(
					18,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']/web:document[@index='0']/web:form[@id='formularioDeLogin' or @name='formularioDeLogin' or @index='1']/web:input_password[@id='formularioDeLogin:senhaInput' or @name='formularioDeLogin:senhaInput' or @index='0']")
					.click();
			{
				think(0.473);
			}
			web.textBox(
					19,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']/web:document[@index='0']/web:form[@id='formularioDeLogin' or @name='formularioDeLogin' or @index='1']/web:input_password[@id='formularioDeLogin:senhaInput' or @name='formularioDeLogin:senhaInput' or @index='0']")
					.setPassword(deobfuscate("jAkVtHLCrPJcJyqHt69rhg=="));
			{
				think(1.724);
			}
			web.button(
					20,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']/web:document[@index='0']/web:form[@id='formularioDeLogin' or @name='formularioDeLogin' or @index='1']/web:button[@id='formularioDeLogin:botaoLogin' or @name='formularioDeLogin:botaoLogin' or @index='1']")
					.click();
		}
		endStep();
		beginStep(
				"[2] Página Principal - Empreendedor (/homeEmpreendedor.jsf)",
				0);
		{
			web.window(21,
					"/web:window[@index='0' or @title='Página Principal - Empreendedor']")
					.waitForPage(null);
			{
				think(0.282);
			}
			web.element(
					23,
					"/web:window[@index='0' or @title='Página Principal - Empreendedor']/web:document[@index='0']/web:i[@index='0']")
					.click();
		}
		endStep();
		beginStep(
				"[3] Planos de Negócio - Empreendedor (/paginaBuscaPlanoDeNegocio.jsf)",
				0);
		{
			web.window(24,
					"/web:window[@index='0' or @title='Planos de Negócio - Empreendedor']")
					.waitForPage(null);
			{
				think(1.377);
			}
			web.button(
					25,
					"/web:window[@index='0' or @title='Planos de Negócio - Empreendedor']/web:document[@index='0']/web:form[@id='lista_planos' or @name='lista_planos' or @index='1']/web:button[@id='lista_planos:singleDT:0:j_idt56' or @name='lista_planos:singleDT:0:j_idt56' or @index='2']")
					.click();
			{
				think(1.57);
			}
			web.button(
					26,
					"/web:window[@index='0' or @title='Planos de Negócio - Empreendedor']/web:document[@index='0']/web:form[@id='lista_planos' or @name='lista_planos' or @index='1']/web:input_submit[@name='lista_planos:singleDT:0:j_idt58' or @value='Confirmar exclusão' or @index='0']")
					.click();
		}
		endStep();
		beginStep(
				"[4] Planos de Negócio - Empreendedor (/paginaBuscaPlanoDeNegocio.jsf)",
				0);
		{
			web.window(27,
					"/web:window[@index='0' or @title='Planos de Negócio - Empreendedor']")
					.waitForPage(null);
		}
		endStep();

	}
	
	public void finish() throws Exception {
	}
}

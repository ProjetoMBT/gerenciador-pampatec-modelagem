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
			web.window(2, "/web:window[@index='0' or @title='about:blank']")
					.navigate("http://192.168.100.11:8080/GerenciadorPampatec/");
			web.window(4,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']")
					.waitForPage(null);
			{
				think(103.118);
			}
			web.textBox(
					5,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']/web:document[@index='0']/web:form[@id='formularioDeLogin' or @name='formularioDeLogin' or @index='1']/web:input_text[@id='formularioDeLogin:emailInput' or @name='formularioDeLogin:emailInput' or @index='0']")
					.click();
			{
				think(1.175);
			}
			web.textBox(
					6,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']/web:document[@index='0']/web:form[@id='formularioDeLogin' or @name='formularioDeLogin' or @index='1']/web:input_text[@id='formularioDeLogin:emailInput' or @name='formularioDeLogin:emailInput' or @index='0']")
					.setText("testetestezin@gmail.com");
			{
				think(0.979);
			}
			web.textBox(
					7,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']/web:document[@index='0']/web:form[@id='formularioDeLogin' or @name='formularioDeLogin' or @index='1']/web:input_password[@id='formularioDeLogin:senhaInput' or @name='formularioDeLogin:senhaInput' or @index='0']")
					.click();
			{
				think(4.019);
			}
			web.textBox(
					8,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']/web:document[@index='0']/web:form[@id='formularioDeLogin' or @name='formularioDeLogin' or @index='1']/web:input_password[@id='formularioDeLogin:senhaInput' or @name='formularioDeLogin:senhaInput' or @index='0']")
					.setPassword(deobfuscate("jAkVtHLCrPJcJyqHt69rhg=="));
			{
				think(0.638);
			}
			web.button(
					9,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']/web:document[@index='0']/web:form[@id='formularioDeLogin' or @name='formularioDeLogin' or @index='1']/web:button[@id='formularioDeLogin:botaoLogin' or @name='formularioDeLogin:botaoLogin' or @index='1']")
					.click();
		}
		endStep();
		beginStep(
				"[2] Página Principal - Empreendedor (/homeEmpreendedor.jsf)",
				0);
		{
			web.window(10,
					"/web:window[@index='0' or @title='Página Principal - Empreendedor']")
					.waitForPage(null);
			{
				think(0.236);
			}
			web.element(
					12,
					"/web:window[@index='0' or @title='Página Principal - Empreendedor']/web:document[@index='0']/web:label[@innerText=' \r\nMeus Planos' and @text=' \r\nMeus Planos' and @index='0']")
					.click();
		}
		endStep();
		beginStep(
				"[3] Planos de Negócio - Empreendedor (/paginaBuscaPlanoDeNegocio.jsf)",
				0);
		{
			web.window(13,
					"/web:window[@index='0' or @title='Planos de Negócio - Empreendedor']")
					.waitForPage(null);
			{
				think(7.905);
			}
			web.button(
					14,
					"/web:window[@index='0' or @title='Planos de Negócio - Empreendedor']/web:document[@index='0']/web:form[@id='lista_planos' or @name='lista_planos' or @index='1']/web:button[@id='lista_planos:singleDT:0:visualizar' or @name='lista_planos:singleDT:0:visualizar' or @index='1']")
					.click();
		}
		endStep();
		beginStep("[4] Cadastro Plano de Negócio (/enviarProjeto.jsf)", 0);
		{
			web.window(15,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']")
					.waitForPage(null);
			{
				think(5.742);
			}
			web.button(
					16,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:input_submit[@id='botao_submeter' or @name='botao_submeter' or @value='Submeter' or @index='3']")
					.click();
			{
				think(5.789);
			}
			web.button(
					17,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:form[@id='form_enviar_projeto' or @name='form_enviar_projeto' or @index='3']/web:button[@id='form_enviar_projeto:j_idt221' or @name='form_enviar_projeto:j_idt221' or @index='16']")
					.click();
			{
				think(1.518);
			}
			web.button(
					18,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']/web:document[@index='0']/web:form[@id='formulario_cadastro_projeto' or @name='formulario_cadastro_projeto' or @index='1']/web:input_submit[@name='formulario_cadastro_projeto:j_idt61' or @value='Submeter Projeto' or @index='15']")
					.click();
		}
		endStep();
		beginStep("[5] Cadastro Plano de Negócio (/enviarProjeto.jsf)", 0);
		{
			web.window(19,
					"/web:window[@index='0' or @title='Cadastro Plano de Negócio']")
					.waitForPage(null);
		}
		endStep();

	}
	
	public void finish() throws Exception {
	}
}

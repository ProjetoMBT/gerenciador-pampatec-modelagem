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
					.navigate("http://192.168.1.10:8080/GerenciadorPampatec/");
			web.window(4,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']")
					.waitForPage("http://192.168.1.10:8080/GerenciadorPampatec/", MatchOption.Exact, null);
			{
				think(0.834);
			}
			web.textBox(
					5,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']/web:document[@index='0']/web:form[@id='formularioDeLogin' or @name='formularioDeLogin' or @index='1']/web:input_text[@id='formularioDeLogin:emailInput' or @name='formularioDeLogin:emailInput' or @index='0']")
					.click();
			{
				think(0.479);
			}
			web.textBox(
					6,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']/web:document[@index='0']/web:form[@id='formularioDeLogin' or @name='formularioDeLogin' or @index='1']/web:input_text[@id='formularioDeLogin:emailInput' or @name='formularioDeLogin:emailInput' or @index='0']")
					.setText("testetestezin@gmail.com");
			{
				think(0.967);
			}
			web.textBox(
					7,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']/web:document[@index='0']/web:form[@id='formularioDeLogin' or @name='formularioDeLogin' or @index='1']/web:input_text[@id='formularioDeLogin:emailInput' or @name='formularioDeLogin:emailInput' or @index='0']")
					.pressTab();
			{
				think(1.559);
			}
			web.textBox(
					8,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']/web:document[@index='0']/web:form[@id='formularioDeLogin' or @name='formularioDeLogin' or @index='1']/web:input_password[@id='formularioDeLogin:senhaInput' or @name='formularioDeLogin:senhaInput' or @index='0']")
					.setPassword(deobfuscate("jAkVtHLCrPJcJyqHt69rhg=="));
			{
				think(5.232);
			}
			web.button(
					9,
					"/web:window[@index='0' or @title='Acessar o Sistema - Login']/web:document[@index='0']/web:form[@id='formularioDeLogin' or @name='formularioDeLogin' or @index='1']/web:button[@id='formularioDeLogin:botaoLogin' or @name='formularioDeLogin:botaoLogin' or @index='1']")
					.click();
		}
		endStep();

	}
	
	public void finish() throws Exception {
	}
}

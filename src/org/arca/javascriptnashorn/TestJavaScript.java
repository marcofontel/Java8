package org.arca.javascriptnashorn;

import java.io.FileReader;
import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class TestJavaScript {

	public static void main(String[] args) {
		ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");
		Bindings bind =  ee.getBindings(ScriptContext.ENGINE_SCOPE);
		bind.put("goodbye","Ate Logo");
		try {
			ee.eval(new FileReader("OlaMundo.js"));
		} catch (Exception  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

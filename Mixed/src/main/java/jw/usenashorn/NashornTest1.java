package jw.usenashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornTest1 {

    public static void main(String[] args) throws ScriptException {
        //获取engine
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");

        engine.put("a", 100);
        engine.put("b", 200);
        engine.eval("var c = a+b");
        String result = engine.get("c").toString();

        System.out.println(result);
    }

}

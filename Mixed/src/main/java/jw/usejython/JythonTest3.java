package jw.usejython;

import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

import javax.script.ScriptException;

public class JythonTest3
{

    /**
     * 随机输出cnt个随机数值，并计算和
     * cnt由Java代码设置
     * randomSum.py中使用java Random类生成随机数并计算和
     * @param args
     * @throws ScriptException
     */
    public static void main( String[] args ) throws ScriptException
    {
        try (PythonInterpreter pi = new PythonInterpreter()) {
            pi.set("cnt", 5);
            pi.execfile("src/main/java/edu/ecnu/randomSum.py");
            PyObject sum = pi.get("sum");
            System.out.println("Sum is: " + sum);
        }
    }
}

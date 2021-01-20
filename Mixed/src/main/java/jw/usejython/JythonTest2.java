package jw.usejython;

import org.python.util.PythonInterpreter;

public class JythonTest2 {

    public static void main(String[] args) {
        PythonInterpreter pi = new PythonInterpreter();
        pi.execfile("src/main/java/edu/ecnu/hello.py");
        pi.cleanup();
        pi.close();

    }
}

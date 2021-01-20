package jw.annoruntime;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface Fruit {
	String name() default "";
}


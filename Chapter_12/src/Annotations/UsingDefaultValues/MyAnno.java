package Annotations.UsingDefaultValues;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// An annotation type declaration that includes defaults.
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String str() default "Testing";
    int val() default 9000;
}
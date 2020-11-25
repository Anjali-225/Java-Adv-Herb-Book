package RepeatingAnnotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// This is the container annotation.
@Retention(RetentionPolicy.RUNTIME)
public @interface MyRepeatedAnnos {
    MyAnno[] value();
}
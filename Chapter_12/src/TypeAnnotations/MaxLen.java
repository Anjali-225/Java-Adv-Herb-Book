package TypeAnnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// A parameterized annotation that can be applied to a type.
@Target(ElementType.TYPE_USE)
public @interface MaxLen {
    int value();
}

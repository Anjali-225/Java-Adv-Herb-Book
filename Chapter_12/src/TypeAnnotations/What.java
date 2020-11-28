package TypeAnnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// An annotation that can be applied to a type parameter.
@Target(ElementType.TYPE_PARAMETER)
public @interface What {
    String description();
}
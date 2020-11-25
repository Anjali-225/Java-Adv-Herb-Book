package TypeAnnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Another marker annotation that can be applied to a type.
@Target(ElementType.TYPE_USE)
public @interface NotZeroLen {
}
package TypeAnnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// An annotation that can be applied to a field declaration.
@Target(ElementType.FIELD)
public @interface EmptyOK { }

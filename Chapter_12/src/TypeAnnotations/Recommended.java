package TypeAnnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// An annotation that can be applied to a method declaration.
@Target(ElementType.METHOD)
public @interface Recommended { }

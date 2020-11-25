package Annotations.SingleMemberAnnotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// A single-member annotation.
@Retention(RetentionPolicy.RUNTIME)
public @interface MySingle {
    int value(); // this variable name must be value
}

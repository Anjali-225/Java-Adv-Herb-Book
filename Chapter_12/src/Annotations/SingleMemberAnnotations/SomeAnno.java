package Annotations.SingleMemberAnnotations;

public @interface SomeAnno {
    int value();
    int xyz() default 0;
}

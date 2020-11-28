package LambdaExpressionsAndExceptions;

public class EmptyArrayException extends Throwable {
    EmptyArrayException() {
        super("Array Empty");
    }
}

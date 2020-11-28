package BoundedTypes;
// Stats attempts (unsuccessfully) to
// create a generic class that can compute
// the average of an array of numbers of
// any given type.
//
// The class contains an error!
//class Stats<T> {
//    T[] nums; // nums is an array of type T
//
//    // Pass the constructor a reference to
//    // an array of type T.
//    Stats(T[] o) {
//        nums = o;
//    }
//
//    // Return type double in all cases.
//    double average() {
//        double sum = 0.0;
//
//        for(int i=0; i < nums.length; i++)
//            sum += nums[i].doubleValue(); // Error!!!
//
//        return sum / nums.length;
//    }
//}

// In this version of Stats, the type argument for
// T must be either Number, or a class derived
// from Number.
public class Stats<T extends Number> {
    T[] nums; // array of Number or subclass

    // Pass the constructor a reference to
    // an array of type Number or subclass.
    Stats(T[] o) {
        nums = o;
    }

    // Return type double in all cases.
    double average() {
        double sum = 0.0;

        for(int i=0; i < nums.length; i++)
            sum += nums[i].doubleValue();

        return sum / nums.length;
    }
}

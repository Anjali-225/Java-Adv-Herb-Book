package WildcardArguments.BoundedWildcards;
// Four-dimensional coordinates.
public class FourD extends ThreeD {
    int t;

    FourD(int a, int b, int c, int d) {
        super(a, b, c);
        t = d;
    }
}

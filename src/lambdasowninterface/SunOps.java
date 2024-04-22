package lambdasowninterface;

public class SunOps implements MathOperation {
    @Override
    public int ops(int a, int b) {
        return a - b;
    }
}

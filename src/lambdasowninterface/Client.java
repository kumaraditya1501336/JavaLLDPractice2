package lambdasowninterface;

public class Client {
    public static void main(String[] args) {
        MathOperation mathOperation = new AddOps();
        int addRes = mathOperation.ops(1 ,2);
        System.out.println(addRes);

        int subRes = executeOps(1, 2, (a, b) -> {
            return a - b;
        });

        System.out.println(subRes);

        int mulRes = executeOps(2, 5, (a, b) -> a * b);

        System.out.println(mulRes);

        MathOperation mathOperation1 = (p, q) -> p + q;


        System.out.println(executeOps(2, 4, mathOperation1));
    }

    public static int executeOps (int a, int b, MathOperation mathOperation) {
        return mathOperation.ops(a, b);
    }
}

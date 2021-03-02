import java.util.StringJoiner;

/**
 * StringJoiner 的简单示例
 */
public class Test11 {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner("===","【","】");
        StringJoiner add = stringJoiner.add("ew").add("pq").add("zl");
        System.out.println(add.toString());
    }
}

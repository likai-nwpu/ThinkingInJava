package chapter_05;

/**
 * 可变参数列表
 *
 * @author KaiLee
 *
 */
public class VarArgs {
    static void print(Object... args) {
        for (Object obj : args) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print(1, 2, 3, 6);
        print(new Integer(8), 9);
        print((Object)new String[]{"Kai","Lee", "hello"});
    }
}

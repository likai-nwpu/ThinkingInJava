package chapter_16;

import java.util.Arrays;
import java.util.Random;

/**
 * 自定义类，覆盖了equals
 */
class SelfClass {
    private int i = 0;
    public SelfClass() {}
    public SelfClass(int i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SelfClass selfClass = (SelfClass) o;
        return i == selfClass.i;
    }
}

/**
 * <p>Arrays.fill(), Arrays.equals, Comparable, Arrays.sort, Arrays.toString(), Arrays.binarySearch()</p>
 * <ol>
 *     <li>通过覆盖Object的equals方法，可以实现自定义类的Arrays.equals</li>
 *     <li>对类实现Comparable接口，可以使用Arrays.sort方法</li>
 * </ol>
 * 总结：我们应该在程序中优先使用容器而非数组，除非性能是一个大问题。
 * Created by Kai on 2016/3/1.
 */
public class ArraysFunction {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        int[] a1 = new int[10];
        int[] a2 = new int[10];
        Arrays.fill(a1, 12);
        Arrays.fill(a2, 12);
        System.out.println("a1 equals a2 " + Arrays.equals(a1, a2));
        a2[0] = 11;
        System.out.println("a1 equals a2 " + Arrays.equals(a1, a2));
        SelfClass[] c1 = new SelfClass[4];
        SelfClass[] c2 = new SelfClass[4];
        Arrays.fill(c1, new SelfClass(2));
        Arrays.fill(c2, new SelfClass(2));
        //通过覆盖了equals可以是实现自定义类的比较
        System.out.println("SelfClass c1 equals c2 " + Arrays.equals(c1, c2));
        int[] f1 = new int[20];
        Random r = new Random();
        for(int i = 0; i < f1.length; i++)
            f1[i] = r.nextInt(20);
        Arrays.sort(f1);
        for(int i : f1)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("find 5 " + Arrays.binarySearch(f1, 5));
    }
}

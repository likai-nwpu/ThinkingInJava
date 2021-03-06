package chapter_03;
/**
 * 覆盖test的equals用于测试
 * @author KaiLee
 *
 */
class Test{
    int e;
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if (obj instanceof Test){
            Test test = (Test)obj;
            if(test.e == this.e)
                return true;
        }
        return false;
    }
}
/**
 * 类之间通过 ==，比较的是引用。
 * <ul>
 * 	<li>需要用<em><b>equals</b></em></li>
 * 	<li><em><b>equals</b></em>设计者初衷是让开发者比较类的内容，
 * 	前提是覆盖<em><b>object</b></em>的<em><b>equals</b></em>方法。</li>
 *	<li> 若开发者未实现equals，则比较引用。</li>
 * </ul>
 * @author KaiLee
 * @version 1.0 2016.0.16
 */
public class Equals {
    /**
     * 主函数入口
     * @param args
     */
    public static void main(String args[]){

        Integer n1 = new Integer(1);
        Integer n2 = new Integer(1);
        Integer n3 = n2;
        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));
        System.out.println(n2 == n3);
        System.out.println("----------------");
        Test test1 = new Test();
        test1.e = 5;
        Test test2 = new Test();
        test2.e = 5;
        System.out.println(test1 == test2);
        System.out.println(test1.equals(test2));
    }
}

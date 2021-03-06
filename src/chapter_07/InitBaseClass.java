package chapter_07;

class Animals {
    Animals() {
        System.out.println("Animals");
    }
    Animals(int i) {
        System.out.println("Animals " + i);
    }
}
class Dogs extends Animals {
    Dogs() {//如果删除基类的空构造方法，提示如下错误
        //Implicit super constructor Animals() is undefined. Must explicitly invoke another constructor
        System.out.println("Dogs");
    }
    Dogs(int i) {
        super(i);
        System.out.println("Dogs " + i);
    }
    static void f() {
        System.out.println("I'm a static method.");
    }
}
/**
 * 测试类的初始化过程中，基类的构造函数调用问题
 * @author KaiLee
 * @version 1.0 2016.01.17
 */
public class InitBaseClass extends Dogs{
    public static void main(String[] args){
        Dogs dogs = new Dogs();
        Dogs dogs1 = new Dogs(1);
        //即使initBaseClass没有构造器，编译器也会给其构造一个默认的构造器，并隐式调用基类默认构造器
        //此处提示当我们继承一个基类时，应该在派生类中显示调用基类的构造函数，以防饮隐式用而产生不可预知的情况
        InitBaseClass initBaseClass = new InitBaseClass();
    }
} /* Output
Animals	//先加载基类构造函数
Dogs	//再加载派生类
		//派生类必须调用基类的某个构造器，无论是显式还是隐式
		//总之，每个类的构造方法必须执行
*///
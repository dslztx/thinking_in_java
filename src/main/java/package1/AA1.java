package package1;

import package2.AA2;
import package3.AAA;

/**
 * 同包子类（注释掉的资源表示不能被访问）
 *
 * @author dsl
 */
public class AA1 extends A {

  //类的完整定义包含下面“复制类成员”
  //public int d;
  //protected int c;
  //int b;

  public static void main(String[] args) {
    A a = new A();
    //不能访问，“类成员地址”与“访问者地址”不满足“规则集1”
    //System.out.println(a.a);
    System.out.println(a.b);
    System.out.println(a.c);
    System.out.println(a.d);

    AA1 aa1 = new AA1();
    //不能访问，在该类的完整定义中，“a”类成员不存在
    //System.out.println(aa1.a);
    //能访问，引用链中第一个节点对应地址与“访问者地址”一致
    System.out.println(aa1.b);
    //能访问，引用链中第一个节点对应地址与“访问者地址”一致
    System.out.println(aa1.c);
    //能访问，引用链中第一个节点对应地址与“访问者地址”一致
    System.out.println(aa1.d);

    AA2 aa2 = new AA2();
    //不能访问，在该类的完整定义中，“a”类成员不存在
    //System.out.println(aa2.a);
    //不能访问，在该类的完整定义中，“b”类成员不存在
    //System.out.println(aa2.b);
    //能访问，引用链中最后一个节点对应地址与“访问者地址”满足“规则集1”
    System.out.println(aa2.c);
    //能访问，引用链中最后一个节点对应地址与“访问者地址”满足“规则集1”
    System.out.println(aa2.d);

    AAA aaa = new AAA();
    //不能访问，在该类的完整定义中，“a”类成员不存在
    //System.out.println(aaa.a);
    //不能访问，在该类的完整定义中，“b”类成员不存在
    //System.out.println(aaa.b);
    //能访问，引用链中最后一个节点对应地址与“访问者地址”满足“规则集1”
    System.out.println(aaa.c);
    //能访问，引用链中最后一个节点对应地址与“访问者地址”满足“规则集1”
    System.out.println(aaa.d);
  }

}

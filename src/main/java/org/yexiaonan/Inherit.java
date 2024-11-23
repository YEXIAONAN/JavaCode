/**
 * 继承的使用。
 *
 * Intherit为父类，PWoman为子类
 *
 * 将父类继承给子类需要使用【 class 子类 extends 父类 】
 */

package org.yexiaonan;

public class Inherit {
    String pname = "";
    int page = 0;

    public Inherit(){};
    public Inherit(String pname, int page){
        this.pname = pname;
        this.page = 0;
    }

    public void Print(){
        System.out.println("Name：" + pname + " Age：" + page);
    }
}

class PWoman extends Inherit{

}
class Start{
    public static void main(String[] args) {
        PWoman pWoman = new PWoman();
        pWoman.pname = "木棍";
        pWoman.page = 18;
        pWoman.Print();
    }

}
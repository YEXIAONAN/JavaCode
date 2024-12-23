import java.util.Scanner;

public class TwoTagger {
    public static void main(String[] args) {
        /*
        /需求：
        动物园里面有两只老虎，体重分别通过键盘录入获得
        请用程序实现判断两只老虎的体重是否相同
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重：");
        int FristTagger = scanner.nextInt();

        System.out.println("请输入第二只老虎的体重：");
        int TwoTagger = scanner.nextInt();

        String result = FristTagger == TwoTagger ? "相同" : "不同";
        System.out.println(result);
    }
}

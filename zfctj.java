package text_5_13.text;

import java.util.Scanner;

public class zfctj {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s1=sc.nextLine();
        int daxie=0;
        int xiaoxie=0;
        int shuzi=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)>='A'&&s1.charAt(i)<='Z')
                daxie++;
            else if(s1.charAt(i)>='a'&&s1.charAt(i)<='z')
                xiaoxie++;
            else if(s1.charAt(i)>='0'&&s1.charAt(i)<='9')
                shuzi++;
        }
        System.out.println("大写字符有："+daxie+","+"小写字符有："+xiaoxie+","+"数字字符有"+shuzi+"。");
    }
}

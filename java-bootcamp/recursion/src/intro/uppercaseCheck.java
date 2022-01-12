package intro;

public class uppercaseCheck {
    public static void main(String[] args) {
        String s="geeks for geeKs";
        int index=0;
        check(s,index);
    }

    static void check(String s, int i)
    {
        char ch=s.charAt(i);
        if(Character.isUpperCase(ch))
        {
            System.out.println(s.charAt(i));
            return;
        }
        check(s,i+1);
    }
}

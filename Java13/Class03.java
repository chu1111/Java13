import static java.lang.System.out;
public class Class03 {
    public static void main(String args[]) {
        int num = 12, den = 0;
        try{
            int ans = num/den;
            out.println(ans);
        } catch (Exception e) {
            out.println("除數為0");
        } finally {
            
        }
    }
}

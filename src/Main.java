public class Main {

    public static void main(String args[]) {
     str("Ручка"," Портфель");
    }
    static void str (String b,String...word){
        String result = null;
        for (String v:word)
            result = b + v;
        System.out.println(result);
    }
}
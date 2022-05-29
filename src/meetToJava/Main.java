package meetToJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args){
        String s;
        int[] ar = new int[2];
        int i = 0;
        try {
            BufferedReader ewq = new BufferedReader(new FileReader("input.txt"));
            while((s = ewq.readLine()) != null) {
                try {Integer.parseInt(s);}
                catch(Exception e) {System.out.println("Input only numbers.Try again!");return;}
                ar[i] = Integer.parseInt(s);
                i++;
            }
            ewq.close();
        }catch(Exception ex) {System.out.println(ex.getMessage());}
        //System.out.println(Arrays.toString(ar));
        try {
            int a = ar[0];
            int b = ar[1];
            if(b == 0) {
                throw new Exception("Wrong num b.Not zero.");
            }
            double c = (double)Math.pow(a, b);
            System.out.println(c);

            String z = Double.toString(c);


            FileWriter qwe = new FileWriter("output.txt", false);
            qwe.write(z);
            qwe.close();
        }catch(Exception e) {

            System.out.println(e.getMessage());
            return;
        }
    }
}

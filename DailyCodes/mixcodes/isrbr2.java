import java.io.*;


class userinputt{
                           
        public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);

        System.out.println("Enter num1:");
        float num1 = Float.parseFloat(br.readLine());

        System.out.println("Enter num2:");
        float num2 = Float.parseFloat(br.readLine());
        
	System.out.println("Enter character :");
        char ch = br.readLine().charAt(0);

        System.out.println(num1 + num2);
	System.out.println("character :" + ch);
        }



}

import java.io.*;

class UserInput{
       public static void main(String[] args) throws IOException {
       
	       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	       System.out.println("enter society name:");
	       String socName = br.readLine();

	       System.out.println("enter wing:");
               char wing = (char)br.read();
	       br.skip(1);

	    //char wing = br.readLine().charAt(0);

	       System.out.println("enter flat number:");
               int flatNum = Integer.parseInt(br.readLine());

	       System.out.println("enter rent:");
               float rent = Float.parseFloat(br.readLine());

	       System.out.println("society name:" + socName);
	       System.out.println("Wing:" + wing );
	       System.out.println("flat number:" + flatNum);
	       System.out.println("rent:" + rent);
       
       }

}

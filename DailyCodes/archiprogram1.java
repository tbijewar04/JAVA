import java.io.*;

class FlatDetails{
    public static void main(String[] args)throws IOException{
    
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    System.out.println("enter the society name: ");
	    String sName = br.readLine();

	    System.out.println("enter wing name: ");
            char wing = (char)br.read();
            br.skip(1);

	    System.out.println("enter flat number: ");
            int flatno = Integer.parseInt(br.readLine());

            System.out.println("enter the rent: ");
            float rent = Float.parseFloat(br.readLine());


	    System.out.println("Society Name : " + sName);
	    System.out.println("wing : " + wing);
	    System.out.println("flat number : " + flatno);
            System.out.println("rent :" + rent);	    
    }

}

package interfacing;

public class lenovo implements interfacingpractice {
      	/*INTERFACE :
	 * INTERFACE IS BLUE PRINT OF THE CLASS
	 * CLASS IS THE BLUE PRINT OF THE OBJECTS
	 * the intreface are providing the rules that in nothing but METHODS
	 * the interface states that what to in the higher level
	 * 
	 * interface are the not available for implenting the direct method until java version 7
	 * the interface are implementing the methods directly in the version 8 of java 
	 * the implentation of interface using the default access modifiers and static key words
	 * 
	 * 
	 * */
	


public void paste(){
System.out.println("write the paste:");
}

      public void cut(){
            System.out.println("write the cutted :");

      }
      public void copy(){
            System.out.println("write the copy text:");

      }
public void pasting(int K){
      System.out.println("accesing the intrefacing default keyword:"+K);
}


      
private static void common(){
      System.out.println("common");
}
  

}
 
package interfacing;

public interface interfacingpractice {
      /*INTERFACE :
	 * INTERFACE is a type of container that cna consisting the abstract methods and containers
	 * interface can be undefined the abstract methods
	 * interface is similar to class
	 * 
	 * the 7th version of interface is not allow you to write execution in the interface 
	 * but the upon 8 and more version are developed to execute code on interfaces using,
	 * three ways 
	 * 1.DEFAULT
	 * 2.PRIVATE 
	 * 3.STATIC
       * 4.PUBLIC 
       * 5.PRIVATE SATAIC
	 * 
	 * */

      public void paste();

      public void cut();
      public void copy();

  default void pasting(){
      common();
        
             System.out.println("the interface implementation");
      }
      static void ajio() {
            common();
            System.out.println("these is static keyword in interface");
            common();
      }
      private static void common(){
            System.out.println("hemanth");
      }
      public static void main(String[] args) {
            
      }

      

}

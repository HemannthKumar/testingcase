package interfacing;

public interface maininterface {

      public void hello();

      public void namsthe();

      private void itsprivat(){
            vide();
            System.out.println("these is private interface");
      }

      static void audio(){
            System.out.println("these is static keyword in interface:");
      }

      default void vide(){
            System.out.println("these is the default access modifiers in intetrface ");
      }


      
}


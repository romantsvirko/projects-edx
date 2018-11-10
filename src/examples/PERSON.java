package examples;


 class A implements Cloneable, java.io.Serializable {
         public final int length;

     A(int length) {
         this.length = length;
     }

     public Object clone() {
             try { return super.clone(); }
             catch (CloneNotSupportedException e) {
                 throw new InternalError(e.getMessage());
                /*System.out.println(new int[3]);
                 System.out.println(new int[3][5]);
                 System.out.println(new String[2]);
                 System.out.println(new float[2].hashCode());*/
             }
     }
 }
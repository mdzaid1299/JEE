public class overRidingParent {
    public String pt() {
      return   "parent se";

    }
    public  class child extends overRidingParent {
        public  String pt(){
            return "Badme";
        }



    }

    public static void main(String[] args) {
        overRidingParent overRidingParent = new overRidingParent();
        System.out.println("1 " + overRidingParent.pt());
//        System.out.println("2 " + child.pt());
    }


}

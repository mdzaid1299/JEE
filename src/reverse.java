public class reverse {

        public static void main(String[] args)
        {
            String str="Happy";
            String reverse="";
            for(int i=str.length()-1;i>=0;i--)
            {
                reverse=reverse+str.charAt(i);
            }
            System.out.println("Reverse of Happy is:"+reverse);
        }
}

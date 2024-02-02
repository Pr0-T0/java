class StringBuffer{
    public static void main(String args[]){
         StringBuilder sb = new StringBuilder("hello");
         sb.append("myr");
         System.out.println(sb);

         String str = sb.toString();

         System.out.println(str);
    }
}
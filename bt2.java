

public class bt2 {
    public static void main(String[] args) {
        
        String chuoi = "You only live once, but if you do it right, once is enough";
      
        System.out.println("độ dài  chuoi :" + chuoi.length());
        char kt = 'o';
        int count = 0;
         
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kt) {
                System.out.println("xuathientaivitri:" + i);
                count++;

            }

        }
        System.out.println("so lan suat hien:" + count);

        



   

    }
    
}

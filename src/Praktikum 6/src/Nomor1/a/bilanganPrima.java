public class bilanganPrima {

    public static void main(String[] args) {
        System.out.println("Bilangan Prima 0-20: ");
        boolean isPrima = true;
        int i =2;
        while(i<=20){
            int j = 2;
            while (j<i){ 
                if (i%j == 0){
                    isPrima = false;
                    break;
                }
           j++; 
        }
        if(isPrima==true){
            
            System.out.print(i+ " ");
        }
        i++;
        isPrima = true;
    }
    System.out.println("\n");
    System.out.println("Bilangan tidak prima 0-20: ");
    isPrima = true;
    i =2;
    while(i<=20){
        int j = 2;
        while (j<i){ 
            if (i%j == 0){
                isPrima = false;
                break;
            }
       j++; 
    }
    if(isPrima==false){
        
        System.out.print(i+ " ");
    }
    i++;
    isPrima = true;
}
}
}
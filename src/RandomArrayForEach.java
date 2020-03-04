public class RandomArrayForEach {
    public static void main(String[] args) {
        //create an array size 10
        int[] arrayNumber =new int[10];
        for (int i=0 ; i<arrayNumber.length ; i++){
            //create random number with 3 digit turns to int than assign to current element[i] in array
            arrayNumber[i]= (int)(Math.random()*1000);
        }
        for (int randomVariable: arrayNumber) {
            System.out.println(randomVariable);

        }

    }
}

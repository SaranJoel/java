public class sumoftwo {

    public int add(int num1, int num2){
        return num1+num2;
    }

    public static void main(String[] args){
        sumoftwo sumFT = new sumoftwo();
        System.out.println("this is the output:"+ sumFT.add(11,22));
    }

}
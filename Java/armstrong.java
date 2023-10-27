public class armstrong{
    static int cube = 0;
    static int isarmstrong(int data){
        if(data>0){
          int  rem = data%10;
            cube += rem*rem*rem;
            data=data/10;
            return isarmstrong(data);
        }
        return cube;
    }
    public static void main(String[] args) {
        int data = 378;
        isarmstrong(data);
        if(cube == data){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
    }
}

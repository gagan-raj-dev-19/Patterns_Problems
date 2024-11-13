////Rectangular Star Pattern
//
//class Patterns_Problems1 {
//    public static void pattern1(int N){
//        for (int i =0; i<N; i++){
//            for (int j = 0; j<N; j++){
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }
//
//    }
//
//    public static void main(String[] args) {
//        int N = 5;
//        pattern1(N);
//    }
//}
//
//// Right angle triangle
//class Patterns_Problem2 {
//    public static void pattern2(int N){
//        for (int i=0; i<N;i++){
//            for (int j=0;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        int N = 5;
//        pattern2(N);
//    }
//}
//
////Right-Angled Number Pyramid
//
//class Patterns_Problem3{
//    public static void pattern3(int N){
//        for (int i=1;i<=N;i++){
//            for (int j=1; j<=i;j++)
//                System.out.print(j+" ");{
//
//            }
//            System.out.println("");
//
//        }
//    }
//
//    public static void main(String[] args) {
//        int N=6;
//        pattern3(N);
//    }
//}
//
////Right-Angled Number Pyramid - II
//
//class Patterns_Problem4{
//    public static void pattern4(int N){
//        for (int i=1; i<=N; i++){
//            for (int j=1; j<=i; j++){
//                System.out.print(i+" ");
//            }
//            System.out.println(" ");
//        }
//
//    }
//
//    public static void main(String[] args) {
//        int N  =5;
//        pattern4(N);
//    }
//}
//
// Inverted Right Pyramid
//
//class Patterns_Problem5{
//    public static void pattern5(int N){
//        for (int i=0; i<N; i++){
//            for (int j=N; j>i; j--){
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }
//    }
//
//    public static void main(String[] args) {
//        int N =5;
//        pattern5(N);
//    }
//}
//
// //Inverted Numbered Right Pyramid
//
//class Patterns_Problem6{
//    public static void pattern6(int N){
//        for (int i=0; i<N; i++){
//            for (int j=N; j>i; j--){
//                System.out.print(N-j+1+" ");
//            }
//            System.out.println(" ");
//        }
//    }
//
//    public static void main(String[] args) {
//        int N=5;
//        pattern6(N);
//    }
//}
//
//
//// Star Pyramid
//
//class Patterns_Problem7{
//    public static void pattern7(int N){
//        for (int i =0; i<N; i++){
//            for (int j=0;j<N-i-1; j++){
//                System.out.print(" ");
//            }
//            for (int j=0; j< 2*i+1; j++){
//                System.out.print("*");
//            }
//            for (int j=0;j<N-i-1; j++){
//                System.out.print(" ");
//            }
//            System.out.println(" ");
//        }
//    }
//
//    public static void main(String[] args) {
//        int N=5;
//        pattern7(N);
//    }
//}
//
////Inverted Star Pyramid
//
//class Patterns_Problem8{
//    public static void pattern8(int N){
//        for (int i=0; i<N; i++){
//            for (int j=0; j<i; j++){
//                System.out.print(" ");
//            }
//            for (int j=0; j<2*N - (2*i+1);j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//    }
//
//    public static void main(String[] args) {
//        int N = 5;
//        pattern8(N);
//    }
//}
//
//// Diamond Star Pattern
//
//class Patterns_Problem{
//    public static void errect_Pyramid(int N){
//        for (int i=0; i<N; i++){
//            for (int j=0; j<N-i-1;j++){
//                System.out.print(" ");
//            }
//            for (int j=0; j<2*i+1; j++){
//                System.out.print("*");
//            }
//            for (int j=0; j<N-i-1;j++){
//                System.out.print(" ");
//            }
//            System.out.println("");
//        }
//    }
//
//    public static void inverted_Pyramid(int N){
//        for (int i=0; i<N; i++){
//            for (int j=0; j<i; j++){
//                System.out.print(" ");
//            }
//            for (int j=0; j< 2*N - (2*i +1); j++){
//                System.out.print("*");
//            }
//            for (int j=0; j<N; j++){
//                System.out.print(" ");
//            }
//
//            System.out.println(" ");
//        }
//    }
//
//    public static void main(String[] args) {
//        int N = 5;
//        errect_Pyramid(N);
//        inverted_Pyramid(N);
//    }
//}
//
//
//// Half Diamond Star Pattern
//
//class Patterns_Problem10 {
//
//    static void pattern10(int N)
//    {
//        for(int i=1; i<=2*N+1; i++){
//
//            int stars = i;
//
//            if(i>N) stars = 2*N-i;
//
//            for(int j=1; j<=stars; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//
//        int N = 5;
//        pattern10(N);
//    }
//}
//
//
////Binary Number Triangle Pattern
//
//class Patterns_Problem11 {
//
//    static void pattern11(int N)
//    {
//        int start =1;
//
//        for(int i=0;i<N;i++){
//
//            if(i%2 == 0) start = 1;
//
//            else start = 0;
//
//            for(int j=0;j<=i;j++){
//                System.out.print(start);
//                start = 1-start;
//            }
//
//            System.out.println();
//        }
//    }
//
//
//
//    public static void main(String[] args) {
//
//        int N = 5;
//        pattern11(N);
//    }
//}
//
// Number Crown Pattern
//
//class Patterns_Problem12 {
//
//    static void pattern12(int N) {
//        int spaces= 2*(N-1);
//        for (int i =1; i<=N; i++){
//            for (int j=1; j<=i; j++){
//                System.out.print(j);
//            }
//            for (int j=1; j<= spaces; j++){
//                System.out.print(" ");
//            }
//            for (int j=i; j>=1; j--){
//                System.out.print(j);
//            }
//            System.out.println();
//            spaces -=2;
//        }
//
//    }
//
//    public static void main(String[] args) {
//        int N = 5;
//        pattern12(N);
//    }
//
//}

// Increasing Number Triangle Pattern
class Patterns_Problem13 {

    static void pattern13(int N) {
        int num = 1;

        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num + 1;
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {

        int N = 5;
        pattern13(N);
    }
}

// 1 Rectangular Star Pattern
class Patterns_Problems1 {
    public static void pattern1(int N){
        for (int i =0; i<N; i++){
            for (int j = 0; j<N; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        int N = 5;
        pattern1(N);
    }
}

// -------------------------------------------------------------------
// 2 Right angle triangle
class Patterns_Problem2 {
    public static void pattern2(int N){
        for (int i=0; i<N;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 5;
        pattern2(N);
    }
}

// -------------------------------------------------------------------


// 3 Right-Angled Number Pyramid

class Patterns_Problem3{
    public static void pattern3(int N){
        for (int i=1;i<=N;i++){
            for (int j=1; j<=i;j++)
                System.out.print(j+" ");{

            }
            System.out.println("");

        }
    }

    public static void main(String[] args) {
        int N=6;
        pattern3(N);
    }
}

// -------------------------------------------------------------------


//4 Right-Angled Number Pyramid - II

class Patterns_Problem4{
    public static void pattern4(int N){
        for (int i=1; i<=N; i++){
            for (int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }

    }

    public static void main(String[] args) {
        int N  =5;
        pattern4(N);
    }
}

// -------------------------------------------------------------------


//5  Inverted Right Pyramid

class Patterns_Problem5{
    public static void pattern5(int N){
        for (int i=0; i<N; i++){
            for (int j=N; j>i; j--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int N =5;
        pattern5(N);
    }
}

// -------------------------------------------------------------------

// 6 Inverted Numbered Right Pyramid

class Patterns_Problem6{
    public static void pattern6(int N){
        for (int i=0; i<N; i++){
            for (int j=N; j>i; j--){
                System.out.print(N-j+1+" ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int N=5;
        pattern6(N);
    }
}

// -------------------------------------------------------------------


// 7 Star Pyramid

class Patterns_Problem7{
    public static void pattern7(int N){
        for (int i =0; i<N; i++){
            for (int j=0;j<N-i-1; j++){
                System.out.print(" ");
            }
            for (int j=0; j< 2*i+1; j++){
                System.out.print("*");
            }
            for (int j=0;j<N-i-1; j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int N=5;
        pattern7(N);
    }
}

// -------------------------------------------------------------------

// 8 Inverted Star Pyramid

 class Patterns_Problem8{
    public static void pattern8(int N){
        for (int i=0; i<N; i++){
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            for (int j=0; j<2*N - (2*i+1);j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int N = 5;
        pattern8(N);
    }
}

// 9 Diamond Star Pattern

class Patterns_Problem9{
    public static void errect_Pyramid9(int N){
        for (int i=0; i<N; i++){
            for (int j=0; j<N-i-1;j++){
                System.out.print(" ");
            }
            for (int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            for (int j=0; j<N-i-1;j++){
                System.out.print(" ");
            }
            System.out.println("");
        }

}


    public static void inverted_Pyramid(int N){
        for (int i=0; i<N; i++){
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            for (int j=0; j< 2*N - (2*i +1); j++){
                System.out.print("*");
            }
            for (int j=0; j<N; j++){
                System.out.print(" ");
            }

            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int N = 5;
        errect_Pyramid9(N);
        inverted_Pyramid(N);
    }
}


// -------------------------------------------------------------------


// 10 Half Diamond Star Pattern

class Patterns_Problem10 {

    static void pattern10(int N)
    {
        for(int i=1; i<=2*N+1; i++){

            int stars = i;

            if(i>N) stars = 2*N-i;

            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int N = 5;
        pattern10(N);
    }
}

// -------------------------------------------------------------------


// 11 Binary Number Triangle Pattern

class Patterns_Problem11 {

    static void pattern11(int N)
    {
        int start =1;

        for(int i=0;i<N;i++){

            if(i%2 == 0) start = 1;

            else start = 0;

            for(int j=0;j<=i;j++){
                System.out.print(start);
                start = 1-start;
            }

            System.out.println();
        }
    }



    public static void main(String[] args) {

        int N = 5;
        pattern11(N);
    }
}

// -------------------------------------------------------------------

// 12 Number Crown Pattern

class Patterns_Problem12 {

    static void pattern12(int N) {
        int spaces= 2*(N-1);
        for (int i =1; i<=N; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            for (int j=1; j<= spaces; j++){
                System.out.print(" ");
            }
            for (int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
            spaces -=2;
        }

    }

    public static void main(String[] args) {
        int N = 5;
        pattern12(N);
    }

}

// -------------------------------------------------------------------


// 13 Increasing Number Triangle Pattern

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

// -------------------------------------------------------------------


// 14 increasing Letter Triangle

class Patterns_Problem14 {

    static void pattern14(int N) {
        for(int i=0; i<N;i++){
            for (char ch ='A'; ch<='A'+i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int N = 5;
        pattern14(N);
    }
}

// -------------------------------------------------------------------


// 15 Reverse Letter Triangle Pattern

class Patterns_Problem15 {

   static void pattern15(int N) {

       for (int i=0; i<N; i++){
           for (char ch='A'; ch<='A'+(N-i-1); ch++){
               System.out.print(ch+" ");
           }
           System.out.println();
       }

   }

    public static void main(String[] args) {
        int N=5;
        pattern15(N);
    }
   }

// -------------------------------------------------------------------

// 16 Alpha-Ramp Pattern

class Patterns_Problem16 {

    static void pattern16(int N) {
        for(int i=0; i<N; i++){

            for (int j=0; j<=i;j++){
                System.out.print((char)((int)('A'+i))+" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int N=5;
        pattern16(N);
    }
    }

// -------------------------------------------------------------------


//  17 Alpha-Hill Pattern

class Patterns_Problem17 {

    static void pattern17(int N) {
        for (int i=0; i<N;i++){
            for (int j=0; j<N-i-1; j++){
                System.out.print(" ");
            }
            char ch = 'A';
            int breakPoint = (2*i+1)/2;
            for (int j=1; j<=2*i+1;j++){
                System.out.print(ch);
                if (j<=breakPoint)ch++;
                else ch--;
            }
            System.out.println(" ");

        }

    }

    public static void main(String[] args) {
        int N = 5;
        pattern17(N);
    }

    }

// -------------------------------------------------------------------


// 18 Alpha-Hill Pattern reverse

class Patterns_Problem18 {

  static void pattern18(int N) {
      for (int i=0; i<N; i++){
          for (char ch = (char)(int)('A'+N-1-i);ch<=(char)(int)('A'+N-1); ch++){
              System.out.print(ch+" ");
          }
          System.out.println(" ");
      }
  }

    public static void main(String[] args) {
        int N = 5;
        pattern18(N);
    }
  }

// -------------------------------------------------------------------


// 19 Symmetric-Void Pattern

class Patterns_Problem19 {

    static void pattern19(int N)
    {
         // upper half
        int iniS = 0;
        for(int i=0;i< N;i++){

            for(int j=1;j<=N-i;j++){
                System.out.print("*");
            }

            for(int j=0;j<iniS;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=N-i;j++){
                System.out.print("*");
            }

            iniS+=2;

            System.out.println();
        }

         // lower half
        iniS = 2*N -2;
        for(int i=1;i<=N;i++){

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            for(int j=0;j<iniS;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            iniS-=2;

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int N = 5;
        pattern19(N);
    }
}

// -------------------------------------------------------------------


// 20 Symmetric-Butterfly Pattern

class Patterns_Problem20 {

    static void pattern20(int N)
    {
        int spaces = 2*N-2;

        for(int i = 1;i<=2*N-1;i++){

            int stars = i;

            if(i>N) stars = 2*N - i;

            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }

            for(int j = 1;j<=spaces;j++){
                System.out.print(" ");
            }

            for(int j = 1;j<=stars;j++){
                System.out.print("*");
            }

            System.out.println();
            if(i<N) spaces -=2;
            else spaces +=2;
        }
    }

    public static void main(String[] args) {

          int N = 5;
        pattern20(N);
    }
}

// -------------------------------------------------------------------


// 21 Hollow Rectangle Pattern

class Patterns_Problem21 {

    static void pattern21(int N) {
        for(int i =0; i<N;i++){
            for(int j=0;j<N;j++){
                if (i==0||j==0|| i==N-1||j==N-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");

        }
    }

    public static void main(String[] args) {
        int N =5;
        pattern21(N);
    }
}

// -------------------------------------------------------------------


// 22 The Number Pattern

class Patterns_Problem22{

    static void pattern22(int N)
    {
        // Outer loop for no. of rows
        for(int i=0;i<2*N-1;i++){

            for(int j=0;j<2*N-1;j++){

                int top = i;
                int bottom = j;
                int right = (2*N - 2) - j;
                int left = (2*N - 2) - i;

                System.out.print(N- Math.min(Math.min(top,bottom), Math.min(left,right)) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int N = 5;
        pattern22(N);
    }
}

// -------------------------------------------------------------------

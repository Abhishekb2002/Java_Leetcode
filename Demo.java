// // #include<iostream>
// // using namespace std;

// // class Demo
// // {
// //     public:
// //     int i;
// //     private:
// //     int j;
// //     protected:
// //     int k;
// //     public:
// //        Demo()
// //        {
// //         i=10;
// //         j=20;
// //         k=30;
// //        }
// //         friend void fun();

// // };
// // void fun()
// // {
// //     Demo obj;
// //     cout<<"Value of i:"<<obj.i<<"\n";
// //     cout<<"Value of j:"<<obj.j<<"\n";
// //     cout<<"Value of k:"<<obj.k<<"\n";
// // }
// // int main()
// // {
// //     fun();
// //     return 0;

// // }
// // #include<iostream>
// // using namespace std;

// // class Marvellous
// // {
// //     public:
// //        void fun();
// //        void gun();
// // };
// // class Demo
// // {
// //     public:
// //     int i;
// //     private:
// //     int j;
// //     protected:
// //     int k;
// //     public:
// //        Demo()
// //        {
// //         i=10;
// //         j=20;
// //         k=30;
// //        }
// //         friend void Marvellous:: fun();

// // };
// // void Marvellous:: fun()
// // {
// //     Demo obj;
// //     cout<<"Value of i:"<<obj.i<<"\n";
// //     cout<<"Value of j:"<<obj.j<<"\n";
// //     cout<<"Value of k:"<<obj.k<<"\n";
// // }
// // int main()
// // {
// //     Marvellous mobj;
// //     mobj.fun();
// //     return 0;

// // }

// // #include<iostream>
// // using namespace std;
// //  class constant 
// //  {
// //     public:
// //     int i;
// //     private:
// //     int j;
// //     protected:
// //     int k;

// //     public:
// //     Demo()
// //     {
        
// //     }
// //  }
// //     void fun()
// //     {

// //     }
 
// // int main()
// // {
// //     return 0;

// // }

// import java.util.*;
// class Math
// {
//     public int iNo1;
//     public int iNo2;

//     public Math()
//     {
//         iNo1=0;
//         iNo2=0;
//          System.out.println("Defult constructor");

//     }
//     public Math(int A,int B)
//     {
//         iNo1=A;
//         iNo2=B;
//         System.out.println("Inside parameterised constructor");

//     }
//     public int Addition()
//     {
//         int iAns=0;
//         iAns=iNo1+iNo2;
//         return iAns;

//     }
//     public int Substraction()
//     {
//         int iAns=0;
//         iAns=iNo1-iNo2;
//         return iAns;

//     }
// }
// class Demo
// {
//     public static void main(String a[])
//     {
//         int iret=0;


//         Math mobj1=new Math();
//         Math mobj2=new Math(20,10);

//         iret=mobj2.Addition();
//         System.out.println("Addition is "+iret);
//         iret=mobj2.Substraction();
//         System.out.println("Addition is "+iret);



//     }
// }
import java.util.*;
import java.util.Scanner;
class Demo
{
    public static void main(String arg[])
    {
        int iNo1=0,iNo2=0;
        int iCnt=0;
        int iSum=0;
        

        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter the size of Array");
        int iSize =sobj.nextInt();

        int Arr[]=new int[iSize];

        System.out.println("array are"+Arr.length);
        for(iCnt=0; iCnt<Arr.length;iCnt++)
        {
            Arr[iCnt]=sobj.nextInt();
            iSum=iSum+Arr[iCnt];

        }
        System.out.println("Sunmation is "+iSum);

    }

}
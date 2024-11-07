// implementation of list using Array


import java.util.*;
class DynamicArr{
   private  final int constsize=16;
 private  int arr[];
 private  int size;
 private  int capacity;

    public DynamicArr() {
        size=0;
        arr=new int[constsize];
        capacity=constsize;

    }
   
    public void add(int val){
        if(size==capacity){
            expandArr();
        }
     arr[size]=val;
     size++;
    }
     
    private void  expandArr(){
    capacity=capacity*2;
    arr= java.util.Arrays.copyOf(arr, capacity);

    }
    
    public void display(){
        System.err.println("element in list");
    for(int i=0;i<size;i++){
        System.out.print(arr[i]+" ");
    }

    }

    public void insertAtPos(int pos,int val){
        if(size==capacity){
            expandArr();
        }
        for(int i=size-1;i>=pos;i--){
            arr[i+1]=arr[i];

        }
        arr[pos]=val;
        size++;

    }

    public void deleteAtPos(int pos){
        for(int i=pos+1;i<size;i++){
            arr[i-1]=arr[i];
        }
        size--;
        if(capacity >constsize  && capacity > 3*size){
            shrinkArr();
        }

    }
     private void shrinkArr(){
        capacity=capacity/2;
        arr=java.util.Arrays.copyOf(arr,capacity);
     }

}



class arrListImplementation{
    public static void main(String args[]){
System.err.println("hi");
DynamicArr list1 =new DynamicArr();
int val,pos;

Scanner  sc= new Scanner(System.in);
while(true) 
 { 
   System.out.println("\n-----------------list menu----------------------");
   System.out.println("1.insert at end");
   System.out.println("2. display the list");
   System.out.println("3.insert at specific position");
   System.out.println("4.delete at specific pos");
   System.out.println("5.exit");
   System.out.println("-----------------------------");
   System.out.println("enter your choice");
int choice;
choice=sc.nextInt();

   switch(choice){
    case 1 :{
     System.err.println("Enter data to insert");
     val= sc.nextInt();
     list1.add(val);
     break;
    }
    
    case 2:{
        list1.display();
        break;
    }

    case 3:{
        System.err.println("Enter position to insert");
        pos= sc.nextInt();
        if(pos<0){
            System.err.println("invalid pos");
            break;
        }
        System.err.println("Enter data to insert");
        val= sc.nextInt();
        list1.insertAtPos(pos,val);
        break;
    }

    case 4:{
        System.err.println("Enter position to insert");
        pos= sc.nextInt();
        if(pos<0){
            System.err.println("invalid pos");
            break;
        }
       list1.deleteAtPos(pos);
        break;

    }

    case 5:{
        System.exit(0);
        break;
    }
    
    default:{
        System.err.println("invalid choice");
    }

   }

}


    }
}

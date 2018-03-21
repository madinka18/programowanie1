package pl.sdacademy.structure;

public class stack {

     private final  static int SIZE = 5;
     private Integer[] stack;
     private int top;

     public stack(){
         stack = new Integer[SIZE];
         top = -1;
     }
     public void push(Integer i){

         if (top >= stack.length){
             extendstack();
         }
         stack[++top] = i;
     }

    private void extendstack() {
         Integer[] newstack = new Integer[stack.length + SIZE];
        System.arraycopy(stack, 0, newstack, 0, stack.length - 1);
        stack = newstack;
    }

    public Integer pop(){
         return  stack[top--];

     }
     public  Integer peek(){
         return stack[top];
     }
     private int size(){
         return top;
     }
     public void print(){
        for (int i =top; i >= 0; i--){
            System.out.println(stack[i]);
        }
     }

}




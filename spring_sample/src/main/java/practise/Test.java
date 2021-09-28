package practise;/*
    Created By: Talveen Rakhra
    Created On: 21-06-2021
    Question URL:
    Time Taken:
    Complexity:*/

interface BaseI{
    default void method(){
        System.out.println("test");
    }
}
class BaseC{
    public void method(){
        System.out.println("BaseC");
    }
}


public class Test extends BaseC implements BaseI{
    public static void main(String[] args) {
        (new Test()).method();
        }
    }


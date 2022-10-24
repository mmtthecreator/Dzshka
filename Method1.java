public class Method1 {
    public static void agecalc(int age){
        if(age < 0){
            System.out.println("Enter correct age!");
        }else if(age >=0 && age <= 18) {
            System.out.println("You are not an adult!");
        }else if(age > 18){
            System.out.println("You are adult!");
        }


    }
}

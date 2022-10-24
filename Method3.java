public class Method3 {
    public static void salarycalc(float years, float salaryNow){
        if(years >=1 && years <=3){
            float salaryUpd = salaryNow + (salaryNow * 10 / 100);
            System.out.println("Your updated salary: " +salaryUpd);
        }else if(years > 3){
            float salaryUpd = salaryNow + (salaryNow * 20 / 100);
            System.out.println("Your updated salary: " +salaryUpd);
        }else{
            System.out.println("Your experience less than 1 year!");
    }
}
}
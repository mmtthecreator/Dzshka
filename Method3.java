public class Method3 {
    public static void salarycalc(float years, float salaryNow){
        float salaryUpd = 0;
        if(years >=1 && years <=3){
            salaryUpd = salaryNow + (salaryNow * 10 / 100);
        }if(years > 3){
            salaryUpd = salaryNow + (salaryNow * 20 / 100);
        }if(salaryUpd < 4000){
            float salaryBonus = salaryUpd + 1000;
            System.out.println("Your updated salary: " + salaryBonus);
    }else{ 
            float salaryBonus = salaryUpd + 500;
            System.out.println("Your updated salary: " + salaryBonus);
        }
}
}
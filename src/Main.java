public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        byte pencilCase = 1;
        System.out.println(" Значение пременной pencilCase с типом byte = " + pencilCase);
        short ballPen = 3;
        System.out.println(" Значение пременной ballPen с типом short = " + ballPen);
        int pencil = 13;
        System.out.println(" Значение пременной pencil с типом int = " + pencil);
        long totalTrees = 10000000;
        System.out.println(" Значение пременной totalTrees с типом long = " + totalTrees);
        float boxerWeight = 75.3f;
        System.out.println(" Значение пременной boxerWeight с типом float = " + boxerWeight);
        double landingPoint = 23.5555555555;
        System.out.println(" Значение пременной landingPoint с типом double = " + landingPoint);

        // Задание 2
        System.out.println("Задание 2");
        float a = 27.12f;
        System.out.println(" Значение пременной A с типом float = " + a);
        byte b = 2;
        System.out.println(" Значение пременной B с типом byte = " + b);
        short c = 786;
        System.out.println(" Значение пременной C с типом short = " + c);
        boolean d = false;
        System.out.println(" Значение пременной D с типом boolean = " + d);
        short e = 569;
        System.out.println(" Значение пременной E с типом short = " + e);
        short f = - 159;
        System.out.println(" Значение пременной F с типом short = " + f);
        short g = 27897;
        System.out.println(" Значение пременной G с типом short = " + g);
        double i = 67.;
        System.out.println(" Значение пременной I с типом double = " + i);
        long h = 987678965549L;
        System.out.println(" Значение пременной H с типом long = " + h);

        // Задание 3
        System.out.println("Задание 3");
        byte studentsClass1 = 23;
        System.out.println("В классе Людмилы Павловны " + studentsClass1 + " ученика ");
        byte studentsClass2 = 27;
        System.out.println("В классе Анны Сергеевны " + studentsClass2 + " ученика ");
        byte studentsClass3 = 30;
        System.out.println("В классе Екатерины Андреевны " + studentsClass3 + " ученика ");
        int totalStudents = studentsClass1 + studentsClass2 + studentsClass3;
        System.out.println("Всего в трех классах - " + totalStudents + " учеников ");

        short totalPaper = 480;
        System.out.println("Общее количество купленой бумаги на три класса " + totalPaper + " листов ");
        System.out.println("На каждого ученика расчитано " + (totalPaper / totalStudents) + " листов бумаги");

        // Задание 4
        System.out.println("Задание 4");
        byte totalBottles = 16;
        byte workingHours = 2;
        int bottlesPerMinute = totalBottles / workingHours;
        System.out.println("За 1 минуту, машина производит бутылок " + bottlesPerMinute + " штук ");
        byte productionTime1 = 20;
        System.out.println("За 20 минут машина произвела бутылок " + ( bottlesPerMinute * productionTime1 ) + " штук ");
        int productionTime2 = 1440;
        System.out.println("За 24 часа машина произвела бутылок " + ( bottlesPerMinute * productionTime2 ) + " штук ");
        int productionTime3 = 4320;
        System.out.println("За 72 часа машина произвела бутылок " + ( bottlesPerMinute * productionTime3 ) + " штук ");
        int productionTime4 = 43200;
        System.out.println("За 720 часов машина произвела бутылок " + ( bottlesPerMinute * productionTime4 ) + " штук ");

        // Задание 5
        System.out.println("Задание 5");
        byte generalNeed = 120;
        System.out.println("Всего необходимо для ремонта школы " + generalNeed + " банок краски двух цветов ");
        byte whitePaint = 2;
        byte brownPaint = 4;
        System.out.println("Для ремонта одного класса требуется " + whitePaint + " банки белой краски и " + brownPaint + " банки коричневой краски ");
        int totalPaint = whitePaint + brownPaint;
        System.out.println("Всего наобходимо для ремонта одного класса " + totalPaint + " банок краски ");
        int totalClasses = generalNeed / totalPaint;
        System.out.println("В школе всего " + totalClasses + " классов ");
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + (whitePaint * totalClasses) + " банок белой краски и " + (brownPaint * totalClasses) + " банок коричневой краски. ");

        // Задание 6
        System.out.println("Задание 6");
        byte bananaWeight = 80;
        byte totalBananas = 5;
        int totalWeightBananas = totalBananas * bananaWeight;
        byte milkWeight = 105;
        byte totalMilk = 2;
        int totalWeightMilk = totalMilk * milkWeight;
        byte iceCreamWeight = 100;
        byte totalIceCream = 2;
        int totalWeightIceCream = totalIceCream * iceCreamWeight;
        byte eggWeight = 70;
        byte totalEgg = 4;
        int totalWeightEgg = totalEgg * eggWeight;
        int totalWeightProducts = totalWeightBananas + totalWeightMilk + totalWeightIceCream + totalWeightEgg;
        System.out.println("Общий вес спорт-завтрака в граммах = " + (totalWeightProducts) + " грамм. ");
        int grPerKg = 1000;
        float weightKg = totalWeightProducts / ( float )grPerKg;
        System.out.println("Общий вес спорт-завтрака в килограммах = " + weightKg + " килограмм ");



        
    }
}
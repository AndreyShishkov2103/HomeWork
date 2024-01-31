package lesson3;

/**
 * AIT-TR, Java Basic, Cohort42.1, HW #3
 * @author Andrey Shishkov
 * @version 2024-01-26 update comments to English
 */
public class HomeWork3 {
    public static void main(String[] args) {

        // task #1
        int a = 0, b = 1, c = 2, d = 3, e = 4, f = 5, g = 6, h = 7, i = 8, j = 9;
        int varI = (a + b + c + d + e + f + g + h + i + j) / 10;
        /* We don't receive Average using int variable varI, need transfer to double varD */
        double varD = (double) (a + b + c + d + e + f + g + h + i + j) / 10;
        System.out.println("---task #1 result:---");
        System.out.println("varI (not average): " + varI);
        System.out.println("varD (average): " + varD);

        // task #2
        int itemA = 1000, itemB = 500;
        double itemAB, discountAB;
        System.out.println("---task #2 result:---");
        System.out.println("Item A price: " + itemA + " EUR");
        System.out.println("Item B price: " + itemB + " EUR");
        System.out.println("Discount (A + B): 10 %");
        itemAB = (itemA + itemB) * 0.9;
        discountAB = (itemA + itemB) * 0.1;
        System.out.println("Total price with discount: " + itemAB + " EUR");
        System.out.println("Total discount: " + discountAB + " EUR");

        // task #3
        int tempMo = 0, tempTu = 0, tempWe = -3, tempTh = 4, tempFr = 3, tempSa = -1, tempSu = -1;
        double tempAvg;
        // https://meteofor.com.ua/ru/weather-kyiv-4944/month/
        System.out.println("---task #3 result:---");
        System.out.println("Mon Temp, C.deg.: " + tempMo);
        System.out.println("Tue Temp, C.deg.: " + tempTu);
        System.out.println("Wed Temp, C.deg.: " + tempWe);
        System.out.println("Thu Temp, C.deg.: " + tempTh);
        System.out.println("Fri Temp, C.deg.: " + tempFr);
        System.out.println("Sat Temp, C.deg.: " + tempSa);
        System.out.println("Sun Temp, C.deg.: " + tempSu);
        tempAvg = (double) (tempMo + tempTu + tempWe + tempTh + tempFr + tempSa + tempSu)/7;
        System.out.println("Avg Week Temp, C.deg.: " + tempAvg);

        // task #4
        int num1 = 23, num2 = 49, num3 = 77;
        System.out.println("---task #4 result:---");
        System.out.println("remainder of " + num1 + " divided by 2: " + num1%2);
        System.out.println("remainder of " + num1 + " divided by 3: " + num1%3);
        System.out.println("remainder of " + num2 + " divided by 2: " + num2%2);
        System.out.println("remainder of " + num2 + " divided by 3: " + num2%3);
        System.out.println("remainder of " + num3 + " divided by 2: " + num3%2);
        System.out.println("remainder of " + num3 + " divided by 3: " + num3%3);

        // task #5
        int x = 3;
        System.out.println("---task #5 result:---");
        System.out.println(x += x++); // += addition assignment operator, ++ increment

    }
}

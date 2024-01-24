import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        System.out.println("Currency converter");
        Scanner sc = new Scanner(System.in);

        boolean continueConversion = true;

        while (continueConversion) {
            System.out.print("Please enter Indian Rupees: ");
            double ind = getValidInput(sc);

        System.out.println("Currency you want to convert to : ");
        System.out.println("1. US Dollars");
        System.out.println("2. Pound Sterling");
        System.out.println("3. Kuwait Dinar");
        System.out.println("4. Euro");
        System.out.println("5. Bangladeshi Taka");
        System.out.println("6. Australian Dollar");
        System.out.println("7. Canadian Dollar");
        System.out.println("8. Chinese Yuan");
        System.out.println("9. Hong Kong Dollar");
        System.out.println("10.Israeli New Shekel");
        System.out.println("11.Japanese Yen");
        System.out.println("12.Malaysian Ringgit");
        System.out.println("13.Mexican Peso");
        System.out.println("14.New Zealand Dolla");
        System.out.println("15.Russian Ruble");
        System.out.println("16.Singapore Dollar");
        System.out.println("17.Sri Lankan Rupee");
        System.out.println("18.Swiss Franc");
        System.out.println("19.Vietnamese dong");
        System.out.println("20.South Korean won");
        System.out.print("Choose : ");

            System.out.print("Choose : ");
            int cur = getValidInput(sc, 1, 20);

            switch (cur) {
                case 1:
                    double us = ind / 83.12;
                    System.out.printf("%f Rupees is equal to %f Dollars",ind,us);
                    break;
                case 2:
                    double uk = ind / 105.60;
                    System.out.printf("%f Rupees is equal to %f Pound sterling ",ind,uk);
                    break;
                case 3:
                    double kd = ind / 270.04;
                    System.out.printf("%f Rupees is equal to %f Kuwaiti Dinar ",ind,kd);
                    break;   
                case 4:
                    double eu = ind / 90.73;
                    System.out.printf("%f Rupees is equal to %f Euro ",ind,eu);
                    break; 
                case 5:
                    double bt = ind / 0.76;
                    System.out.printf("%f Rupees is equal to %f Bangladeshi Taka ",ind,bt);
                    break;
                case 6:
                    double ad = ind / 54.86;
                    System.out.printf("%f Rupees is equal to %f Australian Dollar ",ind,ad);
                    break;
                case 7:
                    double cd = ind / 61.74;
                    System.out.printf("%f Rupees is equal to %f Canadian Dollar ",ind,cd);
                    break;
                case 8:
                    double cy = ind / 11.68;
                    System.out.printf("%f Rupees is equal to %f Chinese Yuan ",ind,cy);
                    break;
                case 9:
                    double hk = ind / 10.63;
                    System.out.printf("%f Rupees is equal to %f  Hong Kong Dollar ",ind,hk);
                    break;
                case 10:
                    double is = ind / 22.20;
                    System.out.printf("%f Rupees is equal to %f Israeli New Shekel ",ind,is);
                    break;
                case 11:
                    double jy = ind / 0.56;
                    System.out.printf("%f Rupees is equal to %f Japanese Yen ",ind,jy);
                    break;
                case 12:
                    double mr = ind / 17.63;
                    System.out.printf("%f Rupees is equal to %f Malaysian Ringgit ",ind,mr);
                    break;
                case 13:
                    double mp = ind / 4.87;
                    System.out.printf("%f Rupees is equal to %f Mexican Peso ",ind,mp);
                    break;
                case 14:
                    double nz = ind / 50.92;
                    System.out.printf("%f Rupees is equal to %f New Zealand Dollar ",ind,nz);
                    break;
                case 15:
                    double rr = ind / 0.94;
                    System.out.printf("%f Rupees is equal to %f Russian Ruble ",ind,rr);
                    break;
                case 16:
                    double sd = ind / 62.00;
                    System.out.printf("%f Rupees is equal to %f Singapore Dollar ",ind,sd);
                    break;
                case 17:
                    double sr = ind / 0.26;
                    System.out.printf("%f Rupees is equal to %f Sri Lankan Rupee ",ind,sr);
                    break;
                case 18:
                    double sf = ind / 95.73;
                    System.out.printf("%f Rupees is equal to %f Swiss Franc ",ind,sf);
                    break;
                case 19:
                    double vd = ind / 0.0034;
                    System.out.printf("%f Rupees is equal to %f Vietnamese dong ",ind,vd);
                    break;
                case 20:
                    double sw = ind / 0.062;
                    System.out.printf("%f Rupees is equal to %f South Korean ",ind,sw);
                    break;
                    
                default:
                    System.out.println("Sorry, we dont have that converter right now");
            }
    
            System.out.print("Do you want to convert again? (Enter 'yes' to continue, any other input to stop): ");
            String continueChoice = sc.next().toLowerCase();
            continueConversion = continueChoice.equals("yes");
        }

        System.out.println("Currency conversion program stopped.");
        sc.close();
    }

    private static double getValidInput(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid numeric value.");
            sc.next(); // Consume invalid input
        }
        return sc.nextDouble();
    }

    private static int getValidInput(Scanner sc, int minValue, int maxValue) {
        int choice;
        do {
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid numeric choice.");
                sc.next(); // Consume invalid input
            }
            choice = sc.nextInt();
        } while (choice < minValue || choice > maxValue);

        return choice;
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[][] kilometers = {{"128km", "135km", "129km", "139km"}, {"135km", "129km", "130km", "155km"}, {"139km", "175km", "185km", "221km"}};
        String[] city = {"JHB", "DBN", "CTN", "PE"};

        int total = 0;
        int maximum = 0;
        int min = 0;

        System.out.println("************************");
        System.out.println("SPEED FINES REPORT");
        System.out.println("************************");
        System.out.println("    JAN   FEB  MAR");


        for (int i = 0; i < kilometers.length; i++) {
            for (int j = 0; j < city.length; j++) {
                System.out.println("\t"+ kilometers[i][j]+ "\t");
            }
            System.out.println();
        }

        System.out.println("************************");
        System.out.println("SPEED FINES STATISTICS");
        System.out.println("************************");


        System.out.println("Maximum speed capture" + maximum);
        System.out.println("Minimum speed capture" + min);

    }
    }

import java.util.*;

public class fashionShop {

    
    public static Scanner Sc = new Scanner(System.in);
    
    public static int[] xs = new int[0];
     public static int[] s = new int[0];
     public static int[] m = new int[0];
     public static int[] l = new int[0];
     public static int[] xl = new int[0];
     public static int[] xxl = new int[0];
    
    public static int[] totalQTYArray = new int[0];
    public static int[] totalAmountArray = new int[0];
    
    public static String[] orderids = new String[0];
    public static String[] customerid = new String[0];
    public static String[] sizes = new String[0];
    public static int[] qutys = new int[0];
    public static int[] status = new int[0];
    public static double[] totalone = new double[0];
    
    public static String[] sizename = {"XS", "S", "M", "L", "XL", "XXL"};
    public static final double[] prices = {600.00, 800.00, 900.00, 1000.00, 1100.00, 1200.00};
    public static String[] pdd={"Processing","Delivering","Deliverd"};
    
    public static String generateid(){
    if(orderids.length>0){
    String id= orderids[orderids.length-1];
    int num=Integer.parseInt(id.split("[#]")[1]);
    num++;
    return String.format("ODR#%04d", num);
    }
        return "ODR#0001";
    }
    static String[] getArrayWithoutDuplicates(String[] arr) {
        String[] noDupliatesArray = new String[1];
        noDupliatesArray[0] = arr[0];
        for (int i = 0; i < arr.length; i++) {
            boolean alreadyIncluded = false;

            Loop:
            for (String noDupliatesArray1 : noDupliatesArray) {
                if (arr[i].equals(noDupliatesArray1)) {
                    alreadyIncluded = true;
                    break Loop;
                }
            }
            if (alreadyIncluded == false) {
              extendallarrays();
            }
        }

        return noDupliatesArray;
    }

   
    public static void extendallarrays(){
        
     
        int[] tempxs= new int[orderids.length+1];
        int[] temps= new int[orderids.length+1];
        int[] tempm= new int[orderids.length+1];
        int[] templ= new int[orderids.length+1];
        int[] tempxl= new int[orderids.length+1];
        int[] tempxxl= new int[orderids.length+1];
        
       int[] temptotalQTYArray= new int[orderids.length+1];  
     int[] temptotalAmountArray= new int[orderids.length+1];  
    String[] temporderids= new String[orderids.length+1];
    String[] tempcusids= new String[orderids.length+1];
    String[] tempsizes= new String[orderids.length+1];
    int[] tempQtys= new int[orderids.length+1];
    int[] tempstatus= new int[orderids.length+1];
    double[] temptotalallone= new double[orderids.length+1];
    
        for (int i = 0; i < orderids.length; i++) {
            temptotalQTYArray[i]=totalQTYArray[i];
            temptotalAmountArray[i]=totalAmountArray[i];
            temporderids[i] = orderids[i];
            tempcusids[i] = customerid[i];
            tempsizes[i] = sizes[i];
            tempQtys[i] = qutys[i];
            tempstatus[i]= status[i];     
            temptotalallone[i]= totalone[i];
            
             tempxs[i] = xs[i];
            temps[i] = s[i];
            tempm[i] = m[i];
            templ[i] = l[i];
            tempxl[i] = xl[i];
            tempxxl[i] = xxl[i];
    
          
           }
        totalQTYArray= temptotalQTYArray;
        totalAmountArray=temptotalAmountArray;
        orderids = temporderids;
        orderids = temporderids;
        customerid = tempcusids;
        sizes = tempsizes;
        qutys = tempQtys;
        status = tempstatus;
        totalone = temptotalallone;
        
        xs=tempxs;
        s=temps;
        m=tempm;
        l=templ;
        xl=tempxl;
        xxl=tempxxl;
    


       
    
    }
    
    public final static void clearConsole() {
try {
final String os = System.getProperty("os.name");
if (os.contains("Windows")) {
new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
} else {
System.out.print("\033[H\033[2J");
System.out.flush();
}
} catch (final Exception e) {
e.printStackTrace();
// Handle any exceptions.
}
}
    
    
    public static void home() {
         
        System.out.println("  \n" +
"   /$$$$$$$$                 /$$       /$$                             /$$$$$$  /$$\n" +
"  | $$_____/                | $$      |__/                            /$$__  $$| $$\n" +
"  | S$    /$$$$$$   /$$$$$$$| $$$$$$$  /$$  /$$$$$$  /$$$$$$$        | $$  \\__/| $$$$$$$   /$$$$$$   /$$$$$$\n" +
"  | $$$$$|____  $$ /$$_____/| $$__  $$| $$ /$$__  $$| $$__  $$       |  $$$$$$ | $$__  $$ /$$__  $$ /$$__  $$\n" +
"  | $$__/ /$$$$$$$|  $$$$$$ | $$  \\ $$| $$| $$  \\ $$| $$  \\ $$        \\____  $$| $$  \\ $$| $$  \\ $$| $$  \\ $$\n" +
"  | $$   /$$__  $$ \\____  $$| $$  | $$| $$| $$  | $$| $$  | $$        /$$  \\ $$| $$  | $$| $$  | $$| $$  | $$\n" +
"  | $$  |  $$$$$$$ /$$$$$$$/| $$  | $$| $$|  $$$$$$/| $$  | $$       |  $$$$$$/| $$  | $$|  $$$$$$/| $$  | $$\n" +
"  |__/   \\_______/|_______/ |__/  |__/|__/ \\______/ |__/  |__/        \\______/ |__/  |__/ \\______/ | $$$$$$$/\n" +
"                                                                                                   | $$____/\n" +
"                                                                                                   | $$\n" +
"                                                                                                   | $$\n" +
"                                                                                                   |__/");
    
    int i;
        for (i = 0; i < 150; i++) {
            System.out.print("-");
        }
        System.out.println("");
        System.out.println();
        
        
        System.out.println("\t[1] Place Order                  [2] Search Customer");
        System.out.println("\t[3] Search Order                 [4] View Reports");
        System.out.println("\t[5] Change OrderStatus           [6] Delete Order");
        
        
        System.out.println("");
        System.out.print("\tInput Option : ");
        int option = Sc.nextInt();
        switch(option){
                case 1:clearConsole();PlaceOrder(); break;
                case 2:clearConsole();SearchCustomer();break;
                case 3:clearConsole();Searchorder();break;
                case 4:clearConsole();viewReports();break;
                case 5:clearConsole();OderStatus();break;
                case 6:clearConsole();DeleteOrder();break;
        
        }
        
       
    }
    //=====================================================================================================================================
    
    public static void PlaceOrder() {
        
        System.out.println("  _____  _                    ____          _\n" +
" |  __ \\| |                  / __ \\        | |\n" +
" | |__) | | __ _  ___ ___   | |  | |_ __ __| | ___ _ __\n" +
" |  ___/| |/ _' |/ __/ _ \\  | |  | | '__/ _' |/ _ \\ '__|\n" +
" | |    | | (_| | (_|  __/  | |__| | | | (_| | ___/ |\n" +
" |_|    |_|\\__,_|\\___\\___|   \\____/|_|  \\__,_|\\___|_|");
        
          
        
  System.out.println("");
          String orderid=generateid();
        System.out.println("\n\tEnter Order ID : " + orderid);
        System.out.println("");

        
        L1:  while (true) {
            System.out.print("\tEnter Customer Phone Number : ");
            String cusid = Sc.next();

            L2:   if(cusid.charAt(0)!='0'||cusid.length()!=10){
            System.out.println("\n\tInvalid phone number... Try again");
            continue L1;

             }
           
                while (true) {
                    System.out.print("\n\tEnter T-Shirt Size(XS/S/M/L/XL/XXL) : ");
                    String size = Sc.next().toUpperCase();

                   
                       
                        while (true) {
                            System.out.print("\n\tEnter QTY : ");
                            int QTY = Sc.nextInt();

                            double Am = 0.00;
                                    switch (size) {
                                        case "XS" :
                                            Am = prices[0] * QTY;
                                             
                                        case "S" :
                                            Am = prices[1] * QTY;
                                           
                                        case "M" :
                                            Am = prices[2] * QTY;
                                           
                                        case "L" :
                                            Am = prices[3] * QTY;
                                             
                                        case "XL" :
                                            Am = prices[4] * QTY;
                                           
                                        case "XXL" :
                                            Am = prices[5] * QTY;
                                           
                                    }
                                    System.out.println("");
                                    System.out.println("\n\tAmount : " + Am );

                                    System.out.println("\n");
                                    
                                    while (true) {
                                        System.out.print("\n\tDo you want to place this order ? (Y/N) : ");

                                        String place = Sc.next();
                                        switch (place.toLowerCase()) {
                                            case "y" :
                                                
                                                extendallarrays();
                                                orderids[orderids.length - 1] = orderid;
                                                customerid[customerid.length - 1] = cusid;
                                                sizes[sizes.length - 1] = size;
                                                qutys[qutys.length - 1] = QTY;
                                                 totalone[totalone.length-1]=Am;
                                                
                                               
                                                System.out.println("\n\t\tOrder Placed...!");
                                                break ;
                                            
                                            case "n":
                                                break ;
                                            
                                        }
                                    System.out.print("\n\tDo you want to place another order ? (Y/N) : ");

                                        String placeone = Sc.next();

                                        if (placeone.equalsIgnoreCase("y")) {
                                            PlaceOrder();
                                        } else if (placeone.equalsIgnoreCase("n")) {
                                            home();
                                        } else {
                                            clearConsole();
                                            home();
                                        }
                                    }
                                    
                                }
                         
                                       
                                    
                                    
                            }}}
    
    
    public static void SearchCustomer() {
        
        System.out.println("   ____                      _        ____           _\n" +
"  / ___|                    | |      / ___|         | |\n" +
" | (___   ___  __ _ _ __ ___| |__   | |    _   _ ___| |_ ___  _ __ ___   ___ _ __\n" +
"  \\___ \\ / _ \\/ _' | '__/ __| '_ \\  | |   | | | / __| __/ _ \\| '_ ' _ \\ / _ \\ '__|\n" +
"   ___) |  __/ (_| | | | (__| | | | | |___| |_| \\__ \\ || ( ) | | | | | |  __/ |\n" +
"  |____/ \\___|\\__,_|_|  \\___|_| |_|  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|");
        
         
      
        while (true) {
            System.out.print("\t\tEnter Customer Phone Number : ");
            String phoneNum = Sc.next();

            if (phoneNum.charAt(0) != '0' || phoneNum.length() != 10) {
                System.out.println("\t\t\tInvalid input..!");
                System.out.print("\n\tDo you want to search another customer report? (y/n) :");
                char try1 = Sc.next().charAt(0);
                if (try1 == 'y' || try1 == 'Y') {
                    continue;
                } else {
                    System.out.println("\t\t\tInvalid input..!");
                    break;
                }
            } else {
                int index = 0;
                int arrIndex = 0;
                int[] indexAr = new int[customerid.length];
                for (String id : customerid) {
                    if (id.equalsIgnoreCase(phoneNum)) {
                        indexAr[index] = arrIndex;
                        index++;
                    }
                    arrIndex++;
                }
                int[] indexValues = new int[index];
                for (int i = 0; i < index; i++) {
                    indexValues[i] = indexAr[i];                                        
                }
                if (index > 0) {
                    int[] cusQty = new int[index];
                    String[] cusSizes = new String[index];
                    for (int i = 0; i < index; i++) {
                        cusQty[i] = qutys[indexValues[i]];
                        cusSizes[i] = sizes[indexValues[i]];
                    }
                    int qxs = 0, qs = 0, qm = 0, ql = 0, qxl = 0, qxxl = 0, sizeIndex = 0;
                    for (String sizeShort : cusSizes) {
                        switch (sizeShort.toLowerCase()) {
                            case "xs":
                                qxs += qutys[indexAr[sizeIndex]];
                                break;
                            case "s":
                                qs += qutys[indexAr[sizeIndex]];
                                break;
                            case "m":
                                qm += qutys[indexAr[sizeIndex]];
                                break;
                            case "l":
                                ql += qutys[indexAr[sizeIndex]];
                                break;
                            case "xl":
                                qxl += qutys[indexAr[sizeIndex]];
                                break;
                            case "xxl":
                                qxxl += qutys[indexAr[sizeIndex]];
                                break;
                        }
                        sizeIndex++;
                    }
                    String[] CountSizelist = sizename;
                    int[] countedSize = {qxs, qs, qm, ql, qxl, qxxl};
                    double[] counteAmount = new double[countedSize.length];
                    for (int i = 0; i < countedSize.length; i++) {
                        counteAmount[i] = countedSize[i] * prices[i];
                    }
                    int amount = 0;
                    for (double value : counteAmount) {
                        amount += value;
                    }
                    for (int i = 0; i < countedSize.length; i++) {
                        for (int j = i; j < countedSize.length; j++) {
                            if (countedSize[i] < countedSize[j]) {
                                int tempvalue = countedSize[i];
                                countedSize[i] = countedSize[j];
                                countedSize[j] = tempvalue;

                                String tempvalue1 = CountSizelist[i];
                                CountSizelist[i] = CountSizelist[j];
                                CountSizelist[j] = tempvalue1;

                                double tempvalue3 = counteAmount[i];
                                counteAmount[i] = counteAmount[j];
                                counteAmount[j] = tempvalue3;
                            }
                        }
                    }
                    System.out.printf("\t\t+%-7s+%-6s+%-15s+\n", "-------", "------", "---------------");
                    System.out.printf("\t\t|%-7s|%-6s|%-15s|\n", " size", "  QTY", "      Total");
                    System.out.printf("\t\t+%-7s+%-6s+%-15s+\n", "-------", "------", "---------------");
                    for (int i = 0; i < CountSizelist.length; i++) {
                        System.out.printf("\t\t|  %-5s|  %-4d|%13.2f  |\n", CountSizelist[i], countedSize[i], counteAmount[i]);
                    }
                    System.out.printf("\t\t+%-7s+%-6s+%-15s+\n", "-------", "------", "---------------");
                } else {
                    System.out.println("Invalid input..!");
                }
                System.out.print("\n\t\tDo you want to search anothe customer report? (y/n) : ");
                char newOrder = Sc.next().charAt(0);

                if (newOrder == 'y' || newOrder == 'Y') {

                } else {
                    home();
                    break;
                }
            }
        }
    }
    
     public static void Searchorder() {
        System.out.println("   ____                      _         ____          _\n" +
"  / ___|                    | |       / __ \\        | | \n" +
" | (___   ___  __ _ _ __ ___| |__    | |  | |_ __ __| | ___ _ __\n" +
"  \\___ \\ / _ \\/ _' | '__/ __| '_ \\   | |  | | '__/ _' |/ _ \\ '__|\n" +
"   ___) |  __/ (_| | | | (__| | | |  | |__| | | | (_| | ___/ |\n" +
"  |____/ \\___|\\__,_|_|  \\___|_| |_|   \\____/|_|  \\__,_|\\___| |");
        
            
            System.out.print("\tEnter order ID : ");
            String orderID = Sc.next();
            System.out.println("");

            int orderIDIndex = -1;
                for (int i = 0; i < orderids.length; i++) {
                 if (orderID.equals(orderids[i])) {
                        orderIDIndex  = i;
                    }
                }
                if (orderIDIndex > -1) {
                    System.out.print("\t");
                    System.out.printf("%-20s", "Phone Number");
                    System.out.println(" : " + customerid[orderIDIndex]);
                    System.out.print("\t");
                    System.out.printf("%-20s", "Size");
                    System.out.println(" : " + sizename[orderIDIndex]);
                    System.out.print("\t");
                    System.out.printf("%-20s", "QTY");
                    System.out.println(" : " + qutys[orderIDIndex]);
                    System.out.print("\t");
                    System.out.printf("%-20s", "Amount");
                    System.out.println(" : " + totalone[orderIDIndex] + ".00");
                    System.out.print("\t");
                    System.out.printf("%-20s", "Status");
                    System.out.println(" : " + pdd[orderIDIndex]);
                    System.out.println("");
                    System.out.println("");

                } else {
                    System.out.println("\t\tInvalid ID...");
                    System.out.println("");

                }
             
            while (true) {
                System.out.print("\tDo you want to search another order ? (Y/N) : ");
                String SearchAnotherOrderYN = Sc.nextLine();

                if (SearchAnotherOrderYN.equalsIgnoreCase("y")) {
                    Searchorder();
                } else if (SearchAnotherOrderYN.equalsIgnoreCase("n")) {
                    home();
                } else {
                    clearConsole();
                }

            }
        }

     public static void viewReports() {
        System.out.println("  ____                       _\n" +
" |  _ \\                     | |\n" +
" | | ) |___ _ __   ___  _ __| |_ ___\n" +
" |  _ // _ \\ '_ \\ / _ \\| '__| __/ __|\n" +
" | | \\ \\  _/ | ) | ( ) | |  | |_\\__ \\\n" +
" |_|  \\_\\__| .__/ \\___/|_|  \\___|___/\n" +
"           | |\n" +
"           |_|");
        
        
        
    
        System.out.println("\t[1]Coustomer Reports");
        System.out.println("\t[2]Item Reports");
        System.out.println("\t[3]Orders Reports");
        
        System.out.print("Enter option : ");
      int reportoption = Sc.nextInt();
    
      switch(reportoption){
          case 1: clearConsole();Coustomerreports();break;
          case 2:clearConsole();Itemreports();break;
          case 3:clearConsole();Orderreports();break;
      
      
      }
    
    }
    public static void Coustomerreports() {
        System.out.println("                                                \n" +
"   ____           _                               ____                       _\n" +
"  / ___|         | |                             |  _ \\                     | |\n" +
" | |    _   _ ___| |_ ___  _ __ ___   ___ _ __   | | ) |___ _ __   ___  _ __| |_ ___\n" +
" | |   | | | / __| __/ _ \\| '_ ' _ \\ / _ \\ '__|  |  _ // _ \\ '_ \\ / _ \\| '__| __/ __|\n" +
" | |___| |_| \\__ \\ || ( ) | | | | | |  __/ |     | | \\ \\  _/ | ) | ( ) | |  | |_\\__ \\\n" +
"  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|     |_|  \\_\\__| .__/ \\___/|_|  \\___|___/\n" +
"                                                           | |\n" +
"                                                           |_|    \n" +
" ");
        
        
        
        
        
     System.out.println("\t[1]Best Customers");
        System.out.println("\t[2]view Customers");
        System.out.println("\t[3]All Customers");
        
        System.out.print("Enter option : ");
      int custoption = Sc.nextInt();
    
      switch(custoption){
          case 1:clearConsole(); BestInCoustomers();break;
          case 2:clearConsole();ViewCoustomers();break;
          case 3:clearConsole();AllCoustomerReport();break;
      
      
      }
    
    
    }
    public static void BestInCoustomers() {
    System.out.println("  ____            _     _____           ____           _\n" +
" |  _ \\          | |   |_   _|         / ___|         | |\n" +
" | |_) | ___  ___| |_    | |  _ __    | |    _   _ ___| |_ ___  _ __ ___   ___ _ __ ___\n" +
" |  _ < / _ \\/ __| __|   | | | '_ \\   | |   | | | / __| __/ _ \\| '_ ' _ \\ / _ \\ '__/ __|\n" +
" | |_) |  __/\\__ \\ |_   _| |_| | | |  | |___| |_| \\__ \\ || ( ) | | | | | |  __/ |  \\__ \\\n" +
" |____/ \\___||___/\\__| |_____|_| |_|   \\_____\\__,_|___/\\__\\_ __/|_| |_| |_|\\___|_|  |___/");
        
    
   
    

    for (int k = 0; k < orderids.length; k++) {
       
            int index = 0;
                int arrIndex = 0;
                int[] indexAr = new int[customerid.length];
                for (String id : customerid) {
                    
                        indexAr[index] = arrIndex;
                        index++;
                    
                    arrIndex++;
                }
                int[] indexValues = new int[index];
                for (int i = 0; i < index; i++) {
                    indexValues[i] = indexAr[i];                                      
                }
                if (index > 0) {
                    int[] cusQty = new int[index];
                    String[] cusSizes = new String[index];
                    for (int i = 0; i < index; i++) {
                        cusQty[i] = qutys[indexValues[i]];
                        cusSizes[i] = sizes[indexValues[i]];
                    }
                     int qxs = 0, qs = 0, qm = 0, ql = 0, qxl = 0, qxxl = 0, sizeIndex = 0;
                    for (String sizeShort : cusSizes) {
                        switch (sizeShort.toLowerCase()) {
                            case "xs":
                                qxs += qutys[indexAr[sizeIndex]];
                                break;
                            case "s":
                                qs += qutys[indexAr[sizeIndex]];
                                break;
                            case "m":
                                qm += qutys[indexAr[sizeIndex]];
                                break;
                            case "l":
                                ql += qutys[indexAr[sizeIndex]];
                                break;
                            case "xl":
                                qxl += qutys[indexAr[sizeIndex]];
                                break;
                            case "xxl":
                                qxxl += qutys[indexAr[sizeIndex]];
                                break;
                        }
                        sizeIndex++;
                    }
                    String[] CountSizelist = sizename;
                   int[] countedSize = {qxs, qs, qm, ql, qxl, qxxl};
                    double[] counteAmount = new double[countedSize.length];
                   
                    for (int i = 0; i < countedSize.length; i++) {
                        counteAmount[i] = countedSize[i] * prices[i];
                    }
                    int amount = 0;
                    for (double value : counteAmount) {
                        amount += value;
                    }
                    for (int i = 0; i < countedSize.length; i++) {
                        for (int j = i; j < countedSize.length; j++) {
                            if (countedSize[i] < countedSize[j]) {
                                int tempvalue = countedSize[i];
                                countedSize[i] = countedSize[j];
                                countedSize[j] = tempvalue;

                                String tempvalue1 = CountSizelist[i];
                                CountSizelist[i] = CountSizelist[j];
                                CountSizelist[j] = tempvalue1;

                                double tempvalue3 = counteAmount[i];
                                counteAmount[i] = counteAmount[j];
                                counteAmount[j] = tempvalue3;
                            }
                        }
                    }
                 
                        
                    System.out.printf("\t+------------------------------------------%n");
         System.out.printf("\t| %-10s | %-10s | %-10s |%n","Customer ID","ALL QTY","Total Amount");
         System.out.printf("\t+------------------------------------------%n");
                  for (int i = 0; i < customerid.length; i++) {
                      
                 System.out.printf("\t| %-10s | %-11s | %-11s |%n",customerid[i],countedSize[i],counteAmount[i]);

                  

                    }
                        

                    
                } else {
                    System.out.println("Invalid input..!");
                }
                System.out.print("\n\t\tDo you want to search anothe customer report? (y/n) : ");
                char newOrder = Sc.next().charAt(0);

                if (newOrder == 'y' || newOrder == 'Y') {

                } else {
                    home();
                    break;
                }
            
        }
    
    }

    
    
    
    public static void ViewCoustomers() {
    System.out.println("  __      ___                     ____           _\n" +
"  \\ \\    / (_)                   / ___|         | |\n" +
"   \\ \\  / / _  _____        __  | |    _   _ ___| |_ ___  _ __ ___   ___ _ __ ___\n" +
"    \\ \\/ / | |/ _ \\ \\  /\\  / /  | |   | | | / __| __/ _ \\| '_ ' _ \\ / _ \\ '__/ __|\n" +
"     \\  /  | |  __/\\ \\/  \\/ /   | |___| |_| \\__ \\ || ( ) | | | | | |  __/ |  \\__ \\\n" +
"      \\/   |_|\\___| \\__/\\__/     \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|  |___/");
    
    
    
     System.out.printf("\t+------------------------------------------%n");
         System.out.printf("\t| %-10s | %-10s | %-10s |%n","Customer ID","ALL QTY","Total Amount");
         System.out.printf("\t+------------------------------------------%n");
                  for (int i = 0; i < customerid.length; i++) {
                      
                 System.out.printf("\t| %-10s | %-10s | %-10s |%n",customerid[i],qutys[i],totalone[i]);

                  }
                  
                  
         System.out.printf("\t+------------------------------------------%n");
    
        System.out.println();
        System.out.println("To access the main menu, please enter 0 : ");
        int accessmenu = Sc.nextInt();
        if(accessmenu==0){clearConsole();home();}
        else {System.out.println("invalid input .... ");clearConsole();BestInCoustomers();}
    
    
    
    
    
    }
    public static void AllCoustomerReport() {
    System.out.println("           _ _    ____           _                               ____                       _\n" +
"     /\\   | | |  / ___|         | |                             |  _ \\                     | |\n" +
"    /  \\  | | | | |    _   _ ___| |_ ___  _ __ ___   ___ _ __   | | ) |___ _ __   ___  _ __| |_ \n" +
"   / /\\ \\ | | | | |   | | | / __| __/ _ \\| '_ ' _ \\ / _ \\ '__|  |  _ // _ \\ '_ \\ / _ \\| '__| __|\n" +
"  / ____ \\| | | | |___| |_| \\__ \\ || ( ) | | | | | |  __/ |     | | \\ \\  _/ | ) | ( ) | |  | |_\n" +
" /_/    \\_\\_|_|  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|     |_|  \\_\\__| .__/ \\___/|_|  \\___|\n" +
"                                                                          | |\n" +
"                                                                          |_|    ");
    
      

        
            

            for (String noDuplicatePhoneNumber : customerid) {
                double totalAmountte = 0.00;
                int totalQTYXSTShirts = 0;
                int totalQTYSTShirts = 0;
                int totalQTYMTShirts = 0;
                int totalQTYLTShirts = 0;
                int totalQTYXLTShirts = 0;
                int totalQTYXXLTShirts = 0;
                for (int j = 0; j < customerid.length; j++) {
                    if (customerid[j].equals(noDuplicatePhoneNumber)) {
                        totalAmountte += fashionShop.totalone[j];
                        switch (fashionShop.sizes[j]) {
                            case "XS" ->
                                totalQTYXSTShirts += fashionShop.qutys[j];
                            case "S" ->
                                totalQTYSTShirts += fashionShop.qutys[j];
                            case "M" ->
                                totalQTYMTShirts += fashionShop.qutys[j];
                            case "L" ->
                                totalQTYLTShirts += fashionShop.qutys[j];
                            case "XL" ->
                                totalQTYXLTShirts += fashionShop.qutys[j];
                            case "XXL" ->
                                totalQTYXXLTShirts += fashionShop.qutys[j];
                        }
                    }
                }
                 
                xs[xs.length - 1] = totalQTYXSTShirts;

                s[s.length - 1] = totalQTYSTShirts;

                m[m.length - 1] = totalQTYMTShirts;

                l[l.length - 1] = totalQTYLTShirts;

                xl[xl.length - 1] = totalQTYXLTShirts;

                xxl[xxl.length - 1] = totalQTYXXLTShirts;
                
                  totalone[totalone.length-1]=totalAmountte;
                  
                  System.out.println();
    
        System.out.printf("\t-----------------------------------------------------------%n");
        System.out.printf("\t| %-10s | %-3s | %-3s | %-3s | %-3s | %-3s | %-3s | %-10s |%n","phone number","XS","S","M","L","XL","XXL","total");
        System.out.printf("\t-----------------------------------------------------------%n");
      
        for (int i = 0; i < totalone.length; i++) {
            
                        System.out.printf("\t| %-10s | %-3s | %-3s | %-3s | %-3s | %-3s | %-3s | %-10s |%n",customerid[i],xs[i],s[i],m[i],l[i],xl[i],xxl[i],totalone[i]);

        }

                while (true) {
                System.out.print("\tTo access the Main Menu, Please enter 0 : ");
                switch (Sc.nextLine()) {
                    case "0" ->
                        home();
                    default ->
                        clearConsole();
                }
            }
        }
    
    
    
    }
    
    
    public static void Itemreports() {
        System.out.println("  _____ _                    ____                       _\n" +
" |_   _| |                  |  _ \\                     | |\n" +
"   | | | |_ ___ _ __ ___    | | ) |___ _ __   ___  _ __| |_ ___\n" +
"   | | | __/ _ \\ '_ ' _ \\   |  _ // _ \\ '_ \\ / _ \\| '__| __/ __|\n" +
"  _| |_| ||  __/ | | | | |  | | \\ \\  _/ | ) | ( ) | |  | |_\\__ \\\n" +
" |_____|\\__\\___|_| |_| |_|  |_|  \\_\\__| .__/ \\___/|_|  \\___|___/\n" +
"                                      | |\n" +
"                                      |_|  ");
        
        
        
    
    System.out.println("\t[1]Best Categories sorted by QTY");
    System.out.println("\t[2]Best Selling Categories sorted by Amount");
        
        System.out.print("Enter option : ");
      int viewcusoption = Sc.nextInt();
    
      switch(viewcusoption){
          case 1:clearConsole(); SortedByQty();break;
          case 2:clearConsole();SortByAmount();break;
         
      
      }
    
    }
    public static void SortedByQty() {
     System.out.println("   ____             _           _   ____           ____ _________     __\n" +
"  / ___|           | |         | | |  _ \\         / __ \\__   __\\ \\   / /\n" +
" | (___   ___  _ __| |_ ___  __| | | |_) |_   _  | |  | | | |   \\ \\_/ /\n" +
"  \\___ \\ / _ \\| '__| __/ _ \\/ _' | |  _ <| | | | | |  | | | |    \\   /\n" +
"  ____) | (_) | |  | ||  __/ (_) | | |_) | |_| | | |__| | | |     | |\n" +
" |_____/ \\___/|_|   \\__\\___|\\__,_| |____/ \\__, |  \\___\\_\\ |_|     |_|\n" +
"                                           __/ |\n" +
"                                          |___/");
        
   int countXSTShirts = 0;
            int countSTShirts = 0;
            int countMTShirts = 0;
            int countLTShirts = 0;
            int countXLTShirts = 0;
            int countXXLTShirts = 0;

            int amountXSTShirts = 0;
            int amountSTShirts = 0;
            int amountMTShirts = 0;
            int amountLTShirts = 0;
            int amountXLTShirts = 0;
            int amountXXLTShirts = 0;

            for (int i = 0; i < orderids.length; i++) {

                switch (sizes[i]) {
                    case "XS" -> {
                        countXSTShirts += qutys[i];
                        amountXSTShirts += totalone[i];
                    }
                    case "S" -> {
                        countSTShirts += qutys[i];
                        amountSTShirts += totalone[i];
                    }
                    case "M" -> {
                        countMTShirts += qutys[i];
                        amountMTShirts += totalone[i];
                    }
                    case "L" -> {
                        countLTShirts += qutys[i];
                        amountLTShirts += totalone[i];
                    }
                    case "XL" -> {
                        countXLTShirts += qutys[i];
                        amountXLTShirts += totalone[i];
                    }
                    case "XXL" -> {
                        countXXLTShirts += qutys[i];
                        amountXXLTShirts += totalone[i];
                    }
                }

            }
            String[] TShirtsSizes = {"XS", "S", "M", "L", "XL", "XXL"};
            int[] tempQTY = {countXSTShirts, countSTShirts, countMTShirts, countLTShirts, countXLTShirts, countXXLTShirts};
            int[] tempTotalAmount = {amountXSTShirts, amountSTShirts, amountMTShirts, amountLTShirts, amountXLTShirts, amountXXLTShirts};

            for (int i = 0; i < tempQTY.length; i++) {
                for (int j = 0; j < tempQTY.length - 1; j++) {
                    if (tempQTY[j] < tempQTY[j + 1]) {
                        int temp = tempQTY[j + 1];
                        tempQTY[j + 1] = tempQTY[j];
                        tempQTY[j] = temp;

                        temp = tempTotalAmount[j + 1];
                        tempTotalAmount[j + 1] = tempTotalAmount[j];
                        tempTotalAmount[j] = temp;

                        String temps = TShirtsSizes[j + 1];
                        TShirtsSizes[j + 1] = TShirtsSizes[j];
                        TShirtsSizes[j] = temps;
                    }
                }
            }
             System.out.printf("\t+--------------------------------------%n");
         System.out.printf("\t| %-10s | %-10s | %-10s |%n","Size","QTY","TotalAmount");
         System.out.printf("\t+--------------------------------------%n");
     
        for (int i = 0; i < sizename.length; i++) {
            System.out.printf("\t| %-10s | %-10s | %-10s |%n",TShirtsSizes[i],tempQTY[i],tempTotalAmount[i]);
        }
    
        System.out.printf("\t+--------------------------------------%n");
    
            while (true) {
                System.out.print("\tTo access the Main Menu, Please enter 0 : ");
                switch (Sc.nextLine()) {
                    case "0" ->
                        home();
                    default ->
                        clearConsole();
                }
            }
        }
    

    public static void SortByAmount() {
    System.out.println("   ____             _           _   ____         \n" +
"  / ___|           | |         | | |  _ \\            /\\                                _\n" +
" | (___   ___  _ __| |_ ___  __| | | |_) |_   _     /  \\   _ __ ___   ___  _   _ _ __ | |_\n" +
"  \\___ \\ / _ \\| '__| __/ _ \\/ _' | |  _ <| | | |   / /\\ \\ | '_ ' _  \\/   \\| | | | '_ \\| __|\n" +
"  ____) | (_) | |  | ||  __/ (_) | | |_) | |_| |  / ____ \\| | | | | | (_) | | | | | | | |_\n" +
" |_____/ \\___/|_|   \\__\\___|\\__,_| |____/ \\__, | /_/    \\_\\_| |_| |_|\\___/ \\__,_|_| |_|\\__|\n" +
"                                           __/ | \n" +
"                                          |___/  ");
    
    int countXSTShirts = 0;
            int countSTShirts = 0;
            int countMTShirts = 0;
            int countLTShirts = 0;
            int countXLTShirts = 0;
            int countXXLTShirts = 0;

            int amountXSTShirts = 0;
            int amountSTShirts = 0;
            int amountMTShirts = 0;
            int amountLTShirts = 0;
            int amountXLTShirts = 0;
            int amountXXLTShirts = 0;

            for (int i = 0; i < orderids.length; i++) {

                switch (sizes[i]) {
                    case "XS" -> {
                        countXSTShirts += qutys[i];
                        amountXSTShirts += totalone[i];
                    }
                    case "S" -> {
                        countSTShirts += qutys[i];
                        amountSTShirts += totalone[i];
                    }
                    case "M" -> {
                        countMTShirts += qutys[i];
                        amountMTShirts += totalone[i];
                    }
                    case "L" -> {
                        countLTShirts += qutys[i];
                        amountLTShirts += totalone[i];
                    }
                    case "XL" -> {
                        countXLTShirts += qutys[i];
                        amountXLTShirts += totalone[i];
                    }
                    case "XXL" -> {
                        countXXLTShirts += qutys[i];
                        amountXXLTShirts += totalone[i];
                    }
                }

            }
            String[] TShirtsSizes = {"XS", "S", "M", "L", "XL", "XXL"};
            int[] tempQTY = {countXSTShirts, countSTShirts, countMTShirts, countLTShirts, countXLTShirts, countXXLTShirts};
            int[] tempTotalAmount = {amountXSTShirts, amountSTShirts, amountMTShirts, amountLTShirts, amountXLTShirts, amountXXLTShirts};

            for (int i = 0; i < tempQTY.length; i++) {
                for (int j = 0; j < tempQTY.length - 1; j++) {
                    if (tempTotalAmount[j] < tempTotalAmount[j + 1]) {
                        int temp = tempQTY[j + 1];
                        tempQTY[j + 1] = tempQTY[j];
                        tempQTY[j] = temp;

                        temp = tempTotalAmount[j + 1];
                        tempTotalAmount[j + 1] = tempTotalAmount[j];
                        tempTotalAmount[j] = temp;

                        String temps = TShirtsSizes[j + 1];
                        TShirtsSizes[j + 1] = TShirtsSizes[j];
                        TShirtsSizes[j] = temps;
                    }
                }
            }
            
            System.out.printf("\t+--------------------------------------%n");
         System.out.printf("\t| %-10s | %-10s | %-10s |%n","Size","QTY","TotalAmount");
         System.out.printf("\t+--------------------------------------%n");
     
        for (int i = 0; i < sizename.length; i++) {
            System.out.printf("\t| %-10s | %-10s | %-10s |%n",TShirtsSizes[i],tempQTY[i],tempTotalAmount[i]);
        }
    
        System.out.printf("\t+--------------------------------------%n");
            while (true) {
                System.out.print("\tTo access the Main Menu, Please enter 0 : ");
                switch (Sc.nextLine()) {
                    case "0" ->
                        home();
                    default ->
                        clearConsole();
                }
            }
        }
    
  
    
    
    public static void Orderreports() {
          System.out.println("  ____          _               ____                       _\n" +
" / __ \\        | |             |  _ \\                     | |\n" +
"| |  | |_ __ __| | ___ _ __    | | ) |___ _ __   ___  _ __| |_ ___\n" +
"| |  | | '__/ _' |/ _ \\ '__|   |  _ // _ \\ '_ \\ / _ \\| '__| __/ __|\n" +
"| |__| | | | (_| | ___/ |      | | \\ \\  _/ | ) | ( ) | |  | |_\\__ \\\n" +
" \\____/|_|  \\__,_|\\___|_|      |_|  \\_\\__| .__/ \\___/|_|  \\___|___/\n" +
"                                         | |\n" +
"                                         |_|");
        
        
        
    
        System.out.println("\t[1]All orders");
    System.out.println("\t[2]Orders by Amount");
        
        System.out.print("Enter option : ");
      int orderreportoption = Sc.nextInt();
    
      switch(orderreportoption){
          
          case 1:clearConsole(); ViewOrders();break;
          case 2:clearConsole();OrderByAmount();break;
         
      
      }
    
    
    }
    public static void ViewOrders() {
    System.out.println("  __      ___                      ____          _\n" +
"  \\ \\    / (_)                    / __ \\        | |\n" +
"   \\ \\  / / _  _____        __   | |  | |_ __ __| | ___ _ __ ___\n" +
"    \\ \\/ / | |/ _ \\ \\  /\\  / /   | |  | | '__/ _' |/ _ \\ '__/ __|\n" +
"     \\  /  | |  __/\\ \\/  \\/ /    | |__| | | | (_| | ___/ |  \\__ \\\n" +
"      \\/   |_|\\___| \\__/\\__/      \\____/|_|  \\__,_|\\___|_|  |___/");
        
      System.out.printf("\t+---------------------------------------------------------------------%n");
    System.out.printf(  "\t| %-10s | %-10s | %-3s | %-3s | %-10s | %-10s |%n","order id","customer id","size","qty","amount","status");
    System.out.printf(  "\t+---------------------------------------------------------------------%n");
    for (int i = 0; i < orderids.length; i++) {
            System.out.printf("\t| %-10s | %-10s | %-3s | %-3s | %-10s | %-10s |%n",orderids[i],customerid[i],sizes[i],qutys[i],totalone[i],pdd[i]);

        }
      System.out.printf("\t+----------------------------------------------------------------------%n");
    
    
    
    System.out.println();
        System.out.println("To access the main menu, please enter 0 : ");
        int accessmenu = Sc.nextInt();
        if(accessmenu==0){clearConsole();home();}
        else {System.out.println("invalid input .... ");clearConsole();BestInCoustomers();}
    
    }
    public static void OrderByAmount() {
    System.out.println("   ____          _                  ____         \n" +
"  / __ \\        | |                |  _ \\            /\\                                _\n" +
" | |  | |_ __ __| | ___ _ __ ___   | |_) |_   _     /  \\   _ __ ___   ___  _   _ _ __ | |_  \n" +
" | |  | | '__/ _' |/ _ \\ '__/ __|  |  _ <| | | |   / /\\ \\ | '_ ' _  \\/   \\| | | | '_ \\| __|\n" +
" | |__| | | | (_| | ___/ |  \\__ \\  | |_) | |_| |  / ____ \\| | | | | | (_) | | | | | | | |_\n" +
"  \\____/|_|  \\__,_|\\___|_|  |___/  |____/ \\__, | /_/    \\_\\_| |_| |_|\\___/ \\__,_|_| |_|\\__|\n" +
"                                           __/ |\n" +
"                                          |___/    \n" +
"                                              \n" +
"\n" +
"");
   
  
     int[] tempStatus = status;
            int[] tempQTY = qutys;
            double[] tempAmount = totalone;
            String[] tempPhoneNumber = customerid;
            String[] tempOrderId = orderids;
            String[] tempTShirtSize = sizes;

            for (int i = 0; i < tempAmount.length; i++) {

                for (int j = 0; j < tempAmount.length - 1; j++) {
                    if (tempAmount[j] < tempAmount[j + 1]) {

                        double temp = tempAmount[j];
                        tempAmount[j] = tempAmount[j + 1];
                        tempAmount[j + 1] = temp;

                        int ttemp = tempStatus[j];
                        tempStatus[j] = tempStatus[j + 1];
                        tempStatus[j + 1] = ttemp;

                        int tttemp = tempQTY[j];
                        tempQTY[j] = tempQTY[j + 1];
                        tempQTY[j + 1] = tttemp;

                        String temps = tempPhoneNumber[j];
                        tempPhoneNumber[j] = tempPhoneNumber[j + 1];
                        tempPhoneNumber[j + 1] = temps;

                        temps = tempPhoneNumber[j];
                        tempPhoneNumber[j] = tempPhoneNumber[j + 1];
                        tempPhoneNumber[j + 1] = temps;

                        temps = tempTShirtSize[j];
                        tempTShirtSize[j] = tempTShirtSize[j + 1];
                        tempTShirtSize[j + 1] = temps;

                        temps = tempOrderId[j];
                        tempOrderId[j] = tempOrderId[j + 1];
                        tempOrderId[j + 1] = temps;

                    }
                }

            }

             System.out.printf("\t+-------------------------------------------------%n");
    System.out.printf("\t| %-10s | %-10s | %-3s | %-3s | %-10s | %-10s |%n","order id","customer id","size","qty","amount","status");
    System.out.printf("\t+--------------------------------------%n");
    for (int i = 0; i < orderids.length; i++) {
            System.out.printf("\t| %-10s | %-10s | %-3s | %-3s | %-10s | %-10s |%n",orderids[i],customerid[i],sizes[i],qutys[i],totalone[i],pdd[i]);

        }
      System.out.printf("\t+-------------------------------------------------%n");
            
            

            while (true) {
                System.out.print("\tTo access the Main Menu, Please enter 0 : ");
                switch (Sc.nextLine()) {
                    case "0" ->
                        home();
                    default ->
                        clearConsole();
                }
            }
        }
    

    
    
    
    public static void OderStatus() {
    System.out.println("   ____          _              _____ _\n" +
"  / __ \\        | |            / ____| |       _\n" +
" | |  | |_ __ __| | ___ _ __  | (___ | |_ __ _| |_ _   _ ___\n" +
" | |  | | '__/ _' |/ _ \\ '__|  \\___ \\| __/ _' | __| | | / __|\n" +
" | |__| | | | (_| | ___/ |     ____) | || (_| | |_| |_| \\__ \\\n" +
"  \\____/|_|  \\__,_|\\___|_|    |_____/ \\__\\__,_|\\__|\\__,_|___/");
   
        System.out.println();
    
    
        
        System.out.print("\tEnter order ID : ");
            String orderID = Sc.next();
            System.out.println("");

            int orderIDIndex = -1;
            if (orderID.matches("ODR#\\d+") && orderID.length() == 8) {
                for (int i = 0; i <orderids.length; i++) {
                    if (orderID.equalsIgnoreCase(orderids[i])) {

                        orderIDIndex = i;

                    }

                }
                if (orderIDIndex > -1) {
                    System.out.print("\t");
                    System.out.printf("%-20s", "Phone Number");
                    System.out.println(" : " + customerid[orderIDIndex]);
                    System.out.print("\t");
                    System.out.printf("%-20s", "Size");
                    System.out.println(" : " + sizes[orderIDIndex]);
                    System.out.print("\t");
                    System.out.printf("%-20s", "QTY");
                    System.out.println(" : " + qutys[orderIDIndex]);
                    System.out.print("\t");
                    System.out.printf("%-20s", "Amount");
                    System.out.println(" : " + totalone[orderIDIndex] + ".00");
                    System.out.print("\t");
                    System.out.printf("%-20s", "Status");
                    System.out.println(" : " + pdd[orderIDIndex]);
                    System.out.println("");
                    System.out.println("");

                    if (pdd[orderIDIndex] == "Delivering") {
                        System.out.println("\t\tCan't change this order status, Order already delivered!...");
                        System.out.println("");
                    } else {

                        System.out.print("\tDo you want to change this order status ? (Y/N) : ");
                        String changeStatusYN = Sc.next();
                        if (changeStatusYN.equalsIgnoreCase("y")) {
                            if (pdd[orderIDIndex] == "Processing") {
                                System.out.println("\n\t\t[1] Order Delivering\n");
                                System.out.println("\t\t[2] Order Delivered\n");
                                L1:
                                while (true) {
                                    System.out.print("\tEnter Option : ");
                                    switch (Sc.next()) {
                                        case "1" -> {
                                            pdd[orderIDIndex] = pdd[orderIDIndex+1];
                                            System.out.println("\n\t\tStatus Changed...");
                                            break L1;
                                        }
                                        case "2" -> {
                                            pdd[orderIDIndex] += pdd[orderIDIndex+2];
                                            System.out.println("\n\t\tStatus Changed...");
                                            break L1;
                                        }
                                        default -> {
                                            clearConsole();
                                            continue L1;
                                        }
                                    }
                                }
                            } else if (pdd[orderIDIndex] == "Processing") {
                                System.out.println("\n\t\t[1] Order Delivered\n");
                                L1:
                                while (true) {
                                    System.out.print("\n\tEnter Option : ");
                                    switch (Sc.next()) {
                                        case "1" -> {
                                            pdd[orderIDIndex] += 1;
                                            System.out.println("\n\t\tStatus Changed...");
                                            break L1;
                                        }
                                        default -> {
                                            continue L1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    System.out.println("\t\tInvalid ID...");
                    System.out.println("");
                }

            } else {
                System.out.println("\t\tInvalid ID...");
                System.out.println("");
            }
            System.out.println("");
            while (true) {
                System.out.print("\tDo you want to change another order status ? (Y/N) : ");
                String SearchAnotherOrderYN = Sc.next();

                if (SearchAnotherOrderYN.equalsIgnoreCase("y")) {
                    OderStatus();
                } else if (SearchAnotherOrderYN.equalsIgnoreCase("n")) {
                    home();
                } else {
                    clearConsole();
                }
            }
        }
    
        
        
    public static void DeleteOrder() {
        System.out.println("  _____       _                    ____          _    \n" +
" |  __ \\     | |     _            / __ \\        | |           \n" +
" | |  | | ___| | ___| |_ ___     | |  | |_ __ __| | ___ _ __ \n" +
" | |  | |/ _ \\ |/ _ \\ __/ - \\    | |  | | '__/ _' |/ _ \\ '__| \n" +
" | |__| | ___/ |  __/ ||  __/    | |__| | | | (_| | ___/ |   \n" +
" |_____/ \\___|_|\\___|\\__\\___|     \\____/|_|  \\__,_|\\___|_| ");
    
        L12: do{  
    System.out.print("\tEnter Order Id : ");
      String  delete= Sc.next();
        System.out.println();
        
        if(delete.equals(orderids[0])){
            System.out.println("phone number : "+ customerid[0]);
            System.out.println("Size : "+ sizename[0]);
            System.out.println("QTY : "+ qutys[0]);
            System.out.println("Amount : "+totalone);
            System.out.println("Status :"+pdd[1]+"\n");
            
            System.out.print("Do you want to delete this order (y/n) : ");
           char der= Sc.next().toLowerCase().charAt(0);
                if (der == 'y') {
                        
                    int inderx=search(delete);

                    if(inderx==-1){
                        System.out.println(delete+" not exists ...");
                    }
                    else{
                        for (int i = inderx; i < customerid.length-1; i++) {
                            customerid[i]=customerid[i+1];
                            trimtosize();
                        }
                    }

                    
                    
                    
                    
                    
                    
                } else if (der == 'n') {
                   System.out.println("Do you want to delete another order (y/n) : ");
                char der1= Sc.next().toLowerCase().charAt(0);
                if (der1 == 'y') {
					clearConsole();
                    continue L12;
                } else if (der1 == 'n') {
					clearConsole();
                   home();
                }  
                }
            System.out.println("Do you want to delete another order (y/n) : ");
            char der1= Sc.next().toLowerCase().charAt(0);
                if (der1 == 'y') {
					clearConsole();
                    continue L12;
                } else if (der1 == 'n') {
					clearConsole();
                   home();
                }   
            
        }
        else{
            System.out.println("Invalid ID ...\n");
            System.out.println("Do you want to delete another order (y/n) :");
            char der2= Sc.next().toLowerCase().charAt(0);
                if (der2 == 'y') {
					clearConsole();
                    continue L12;
                } else if (der2 == 'n') {
					clearConsole();
                   home();
                }   
        }
    }while(true);
    }
    
    
    public static int search(String cusID){
        for (int i = customerid.length; i < 10; i++) {
            if(customerid[i].equalsIgnoreCase(cusID)){
            return -1;
        }
    }
    return -1;
    }
    
    
    public static void trimtosize(){
    String[] temparyarray= new String [customerid.length-1];
        for (int i = 0; i < temparyarray.length; i++) {
            temparyarray[i]=customerid[i];
            
        }
            customerid=temparyarray;
    }
    
   
    
    public static void main(String[] args) {
        fashionShop c= new fashionShop();
        c.home();
    }

}
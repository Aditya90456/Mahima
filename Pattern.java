public class Pattern {
    public static void Mahima_Hans() {
        /*
         * p p
         * p p
         * p p
         * p p
         * p p
         */

        // squre first
        // loop for row
        int n = 5;
        for (int r = 1; r <= n; r++) {
            for (int line = 1; line <= n; line++) {
                if (line == 1) {

                    System.out.print("p ");
                }

            }
            for (int p = 1; p <= r; p++) {
                if (p == 1) {
                    System.out.print(" ");
                }
                if (p >= 2) {
                    System.out.print(" ");
                }
            }
            for (int st = 1; st <= n; st++) {
                if (st == 1) {
                    System.out.print("p");
                }

            }
            for (int i = 1; i <= n - r; i++) {
                if (r <= n) {
                    System.out.print("  ");
                }
                if (i == n) {
                    System.out.print("");
                }

            }
            for (int k = 1; k <= n; k += 1) {
                if (k == 1) {
                    System.out.print("p");
                }
            }
            for (int sf = 1; sf <= r; sf++) {
                if (sf >= 1) {

                    System.out.print(" ");
                }
            }
            for (int k = 1; k <= n; k += 1) {
                if (k == 1) {
                    System.out.print("p");
                }
            }

            for (int i = 1; i <= n - r + 4; i++) {
                System.out.print(" ");
            }
            
            System.out.println();
        }
    System.out.println();
        for (int m = 1; m <= n; m++) { 
            for (int h = 1; h <= n; h++) {
                if (m == 1 || h == 1 || h == n || m==3) {
                    
                    System.out.print(" p ");
                } else {
                        
                    System.out.print("   ");
                }
           }
           System.out.println();
        }
        System.out.println(); 
    
        for (int m = 1; m <= n; m++) { 
            for (int h = 1; h <= n; h++) {
                if (h == 1 || h == n || m==3) {
                    
                    System.out.print(" p ");
                } else {
                        
                    System.out.print("   ");
                }
                }
            System.out.println();
           }
           System.out.println();
           for(int i=1;i<=n;i++){
            for(int f=1;f<=n;f++){
                if(f==1 || i==1 || i==n || f==n){
                    System.out.print(" p ");
                }else{
                    System.out.print("   ");
                }
                
            }
            System.out.println();
        }
        
        for(int i=1;i<=n;i++){
            System.out.println("       p ");
        }
        
        for(int i=1;i<=n;i++){
            for(int f=1;f<=n;f++){
                if(f==1 || i==1 || i==n || f==n){
                    System.out.print(" p ");
                }else{
                    System.out.print("   ");
                }
                
            }
            System.out.println();
        }
        System.out.println();
        for (int r = 1; r <= n; r++) {
            for (int line = 1; line <= n; line++) {
                if (line == 1) {

                    System.out.print("p ");
                }

            }
            for (int p = 1; p <= r; p++) {
                if (p == 1) {
                    System.out.print(" ");
                }
                if (p >= 2) {
                    System.out.print(" ");
                }
            }
            for (int st = 1; st <= n; st++) {
                if (st == 1) {
                    System.out.print("p");
                }

            }
            for (int i = 1; i <= n - r; i++) {
                if (r <= n) {
                    System.out.print("  ");
                }
                if (i == n) {
                    System.out.print("");
                }

            }
            for (int k = 1; k <= n; k += 1) {
                if (k == 1) {
                    System.out.print("p");
                }
            }
            for (int sf = 1; sf <= r; sf++) {
                if (sf >= 1) {

                    System.out.print(" ");
                }
            }
            for (int k = 1; k <= n; k += 1) {
                if (k == 1) {
                    System.out.print("p");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int m = 1; m <= n; m++) { 
            for (int h = 1; h <= n; h++) {
                if (m == 1 || h == 1 || h == n || m==3) {
                    
                    System.out.print(" p ");
                } else {
                        
                    System.out.print("   ");
                }
           }
           System.out.println();
        }
}

    public static void main(String[] args) {
        Mahima_Hans();
    }
}

package Lab8;

public class Medals
{
   public static void main(String[] args)
   {
      final int COUNTRIES = 7;
      final int MEDALS = 3;

      String[] countries =
         {
            "Canada",
            "China",
            "Germany",
            "Korea",
            "Japan",
            "Ireland",
            "United States"
         };

      int[][] counts =
         {
            { 1, 0, 1 },
            { 1, 1, 0 },
            { 0, 0, 1 },
            { 1, 0, 0 },
            { 0, 1, 1 },
            { 0, 1, 1 },
            { 1, 1, 0 }
         };
      
      System.out.println("           Country        Gold         Silver       Bronze   Total");
       int totalGold=0;
       int totalSilver=0;
       int totalBronze=0;
      // Print countries, counts, and row totals
      for (int i = 0; i < COUNTRIES; i++)
      {

         // Process the ith row

         System.out.printf("%15s", countries[i]);

         int total = 0; 

         // Print each row element and update the row total
        for (int j = 0; j < MEDALS; j++){
            System.out.printf("%15s", counts[i][j]);
            total += counts[i][j];
            if(j==0){
                totalGold+=counts[i][j];
            }else if(j==1){
                totalSilver+=counts[i][j];
            }else {
                totalBronze+=counts[i][j];
            }
        }

		// ADD CODE HERE
         
         // Display the row total and print a new lineg
         System.out.printf("%8d\n", total);
      }
      
      //Total all the medals 
       int totalMedals = totalGold+totalSilver+totalBronze;
       


		// ADD CODE HERE


       System.out.println("\n\nTotal medals "+ totalMedals);


      
      //Saving row Totals
      int []countryTotals = new int[COUNTRIES];
      for (int i = 0; i < COUNTRIES; i++)
      {
         // Total the ith row
         countryTotals[i] = 0; 

         for (int j = 0; j < MEDALS; j++)
         {
            countryTotals[i] += counts[i][j];
         }
      }
      
      //Display the row totals
      System.out.println("\n\n        Country    Total Medals");
      for (int i = 0; i < COUNTRIES; i++){
          System.out.printf("%15s", countries[i]);
          System.out.printf("%8d\n", countryTotals[i]);
      }
      
      //Saving column Totals
      int []medalTotals = new int[MEDALS];
      for (int j = 0; j < MEDALS; j++)
      {
         // Total the jth column
         medalTotals[j] = 0; 

         for (int i = 0; i < COUNTRIES; i++)
         {
            medalTotals[j] += counts[i][j];
         }
      }
      
      //Display the column totals
      System.out.println("\n\n    Gold  Silver  Bronze");
      
		// ADD CODE HERE
        System.out.printf("%8d %8d  %8d", totalGold, totalSilver,totalBronze);

           
   }
}

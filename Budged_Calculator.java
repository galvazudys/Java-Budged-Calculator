import java.util.Scanner;
import java.util.InputMismatchException;
import java.*;


public class Budged_Calculator {

    public static void main(String[] args)
        {
            //Creating Scanner Object we gone use in program.
            Scanner sc = new Scanner(System.in);

            //Declering Variables and assigning values to 0.
            int valueEnter = 0;
            float mortgage = 0f;
            float groceries = 0f;
            float telephoneBroadband = 0f;
            float tvSubscription = 0f;
            float travel = 0f;
            float entertainment = 0f;
            float miscellaneous = 0f;
            float weeklyIncome = 0f;
            float weeklyExpenses = 0f;
            float monthlyExpenses = 0f;
            float potencialSavings = 0f;
            String  currentMonth = "";
            int daysForMonth=0;



            //creating do-while loop,that gone break if Option 6 enter to console
                do
                {

                    //Print option's menu to console for user.
                    System.out.println(" ***Welcome To The Household Expenses Calculator*** ");
                    System.out.println(" Please Select One Of Fallowing Options: ");
                    System.out.println(" Enter 1 To Enter Your Weekly Expenses. ");
                    System.out.println(" Enter 2 To Enter Your Weekly Income. ");
                    System.out.println(" Enter 3 To Calculate Total Weekly Expenses. ");
                    System.out.println(" Enter 4 To Calculate Total Monthly Expenses. ");
                    System.out.println(" Enter 5 to Calculate Potencial Savings. ");
                    System.out.println(" Enter 6 to Exit. ");

                    /*Read input of user to console and
                    create try-catch block to catch if user enters not number,its break loop
                    and print message for user*/
                    try
                    {

                        valueEnter = sc.nextInt();
                    }
                    catch(InputMismatchException ex)
                    {
                        System.out.println(" Enter Integer Number Please ");
                        break;
                    }

                    /*create if-else statetment block that check user input for option
                      and perform action based on option entered*/

                    if(valueEnter == 1)
                    {
                        //Ask prompts message to input values of expenses and read input to currect variable.
                        try{ //Added try-catch block to prevent from user enter string-char
                              System.out.println(" *** Please Enter You Expenses:  ");
                              System.out.println(" The mortgage ");
                              mortgage += sc.nextFloat();
                              System.out.println("-----------------");
                              System.out.println(" Groceries ");
                              groceries += sc.nextFloat();
                              System.out.println("-----------------");
                              System.out.println(" Telephone / broadband ");
                              telephoneBroadband += sc.nextFloat();
                              System.out.println("-----------------");
                              System.out.println(" TV Subscription ");
                              tvSubscription += sc.nextFloat();
                              System.out.println("-----------------");
                              System.out.println(" Travel ");
                              travel += sc.nextFloat();
                              System.out.println("-----------------");
                              System.out.println(" Entertainment ");
                              entertainment += sc.nextFloat();
                              System.out.println("-----------------");
                              System.out.println(" Miscellaneous ");
                              miscellaneous += sc.nextFloat();
                              System.out.println("-----------------");
                            }catch(InputMismatchException error)
                            {
                              System.out.println("Enter Number!!!"); //prints message and breaks loop.
                              continue;
                            }
                        //calcutes total weekly expenses and stores in variabe.
                        weeklyExpenses = mortgage + groceries + telephoneBroadband + tvSubscription + travel + entertainment + miscellaneous;
                    }else if(valueEnter == 2)
                    {
                        //promts message for user enter weekly income and read that input,storing in variable.
                        System.out.println(" If it's Not Secret,Would You Mind Enter Your Weekly Income");
                        weeklyIncome = sc.nextFloat();
                    }else if (valueEnter == 3)
                    {
                        //promts message for user with total weekly expenses,using string concatenation method.
                        System.out.println("-----------------");
                        System.out.println("Your Total Expenses For a Week Are: " + weeklyExpenses + "Eur.");
                        System.out.println("-----------------");
                    }else if(valueEnter == 4)
                    {
                        //promts message for user enter current month,does calculation of total montly expenses.
                        System.out.println("-----------------");
                        System.out.println("Please Enter Current Month: ");
                        System.out.println("-----------------");
                        currentMonth = sc.next();
                        currentMonth = currentMonth.toUpperCase();
                        //Add big SWITCH statment to test each case entered to console by user and assign to current months days.
                        switch (currentMonth)
                        {
                            case "JANUARY": daysForMonth = 31;
                                            break;
                            case "FEBRUARY": daysForMonth = 28;
                                            break;
                            case "MARCH": daysForMonth = 31;
                                            break;
                            case "APRIL": daysForMonth = 30;
                                            break;
                            case "MAY" : daysForMonth = 31;
                                            break;
                            case "JUNE": daysForMonth = 30;
                                            break;
                            case "JULY": daysForMonth = 31;
                                            break;
                            case "AUGUST": daysForMonth = 31;
                                            break;
                            case "SEPTEMBER" : daysForMonth = 30;
                                            break;
                            case "OCTOBER": daysForMonth = 31;
                                            break;
                            case "NOVEMBER": daysForMonth =30;
                                            break;
                            case "DECEMBER": daysForMonth = 31;
                                            break;
                        }
                        System.out.println("-----------------");
                        monthlyExpenses = (weeklyExpenses/7) * daysForMonth; // does calculation getting total weekly and dividing from 7days,then multiply by 30days of month.
                        System.out.println("Your Total Expenses For a "+ currentMonth +" Are: " + monthlyExpenses +"Eur." );
                        System.out.println("-----------------");
                        System.out.println();
                    }else if(valueEnter == 5)
                    {
                        //Calculate total weekly savings for user by subtracting total expenses for a week from total weekly income.
                        potencialSavings = weeklyIncome - weeklyExpenses;
                        System.out.println("-----------------");
                        System.out.println("Your Savings For a Week Are: " + potencialSavings + "Eur.");
                        System.out.println("-----------------");
                    } //end if-else statment block



                }while (valueEnter != 6); // that ends do-while loop.


        } // end of main method
} // end of class statment.
//new message here
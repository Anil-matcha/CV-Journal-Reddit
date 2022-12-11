package ass4;
import java.util.Scanner;
public class BudgetDemo {
	public static void main(String[] args) {

		System.out.println("**********************************************************");
		System.out.println();
		System.out.println("Welcome to COMP248 Geek's HouseholdBudget_2022 Application");
		System.out.println();
		System.out.println("**********************************************************");

		Scanner x = new Scanner(System.in);

		String codem;
		int code,hNum,y,month,day;

		// HouseholdBudget #0
		Fund fund0 = new Fund (4,2,0,1,1);
		Expense expense0 = new Expense("Purchase", 62.2, "Depanneur",11,12);
		Expense expense01 = new Expense("Bill", 122.75, "Fido", 2 , 22);
		Expense [] expenseArray0 = { expense0, expense01};
		HouseholdBudget HouseholdBudget0 = new HouseholdBudget(fund0,expenseArray0);

		// HouseholdBudget #1
		Fund fund1 = new Fund (4,2,0,1,1);
		Expense expense1 = new Expense("Purchase", 62.2, "Depanneur",11,16);
		Expense expense11 = new Expense("Bill", 52.20, "Pharmaprix", 2 , 22);
		Expense [] expenseArray1 = { expense1, expense11};
		HouseholdBudget HouseholdBudget1 = new HouseholdBudget(fund1,expenseArray1);

		// HouseholdBudget #2
		Fund fund2 = new Fund (0,2,4,2,1);
		Expense expense2 = new Expense("Purchase", 85.5, "IGA",25,11);
		Expense expense21 = new Expense("Bill", 122.75, "Concordia", 4 , 12);
		Expense expense22 = new Expense("Purchase", 128.1, "O", 5 , 2);
		Expense [] expenseArray2 = { expense2, expense21, expense22};
		HouseholdBudget HouseholdBudget2 = new HouseholdBudget(fund2,expenseArray2);

		// HouseholdBudget #3
		Fund fund3 = new Fund (2,1,0,0,3);
		Expense [] expenseArray3 = {};
		HouseholdBudget HouseholdBudget3 = new HouseholdBudget(fund3,expenseArray3);

		// HouseholdBudget #4
		Fund fund4 = new Fund (2,1,0,0,3);
		Expense [] expenseArray4 = {};
		HouseholdBudget HouseholdBudget4 = new HouseholdBudget(fund4, expenseArray4);

		HouseholdBudget[] HouseholdBudget = { HouseholdBudget0, HouseholdBudget1, HouseholdBudget2, HouseholdBudget3, HouseholdBudget4};

		do  {
			System.out.println();
			System.out.println("What would you like to do?");
			System.out.println("1. See all posessions of all householdBudgets");
			System.out.println("2. See all posessions of one householdBudget");
			System.out.println("3. List householdBudgets with the same total amount of fund");
			System.out.println("4. List householdBudgets with the same fund denomination(s)");
			System.out.println("5. List householdBudgets with the same total amount of fund and same number of expenses");
			System.out.println("6. Add an expense to an existing householdBudget");
			System.out.println("7. Remove an existing expense from a householdbudget");
			System.out.println("8. Update the payment due date of an existing expense");
			System.out.println("9. Add fund to a householdBudget");
			System.out.println("0. To quit");
			System.out.println();
			System.out.print("Please enter your choice and press <enter>:");

			codem = x.next();
			if (((codem.equals("1"))||(codem.equals("2"))||(codem.equals("3"))||(codem.equals("4"))||(codem.equals("5"))||(codem.equals("6"))||(codem.equals("7"))||(codem.equals("8"))||(codem.equals("9")))) {
				code=Integer.parseInt(codem);
			}    
			
			else  //If user input is not equal to or not more than 0 and smaller than 4, ask the user to enter a code again.
				code=10;


			switch (code) { //this switch is based of off user input and allows the user to access what is needed
			
			case 0: //exits program
				System.out.println("Thank you for using Geek's HouseholdBudget_2022 Application");
				System.exit(0);

			case 1: //prints out all household funds and expenses
				System.out.println("Household #0");
				System.out.println(HouseholdBudget0.toString());
				System.out.println();

				System.out.println("Household #1");
				System.out.println(HouseholdBudget1.toString());
				System.out.println();

				System.out.println("Household #2");
				System.out.println(HouseholdBudget2.toString());
				System.out.println();

				System.out.println("Household #3");
				System.out.println(HouseholdBudget3.toString());
				System.out.println();

				System.out.println("Household #4");
				System.out.println(HouseholdBudget4.toString());
				System.out.println();

				break;

			case 2: //allows to view all posessions for a single household.
				System.out.print("Please enter the household (number 0 to 4) you would like to view all possessions for:");
				y = x.nextInt();
				
				while (y < 0 || y > 4) {
					System.out.println("Sorry there is no HouseholdBudget number " + y);
				    System.out.print("Try again. Please enter a number between 0 and 4:");
				    y = x.nextInt();
				}

				switch (y) {
				case 0:
					System.out.println("Household #0");
					System.out.println(HouseholdBudget0.toString());

					break;
				case 1:
					System.out.println("Household #1");
					System.out.println(HouseholdBudget1.toString());

					break;
				case 2:
					System.out.println("Household #2");
					System.out.println(HouseholdBudget2.toString());

					break;
				case 3:
					System.out.println("Household #3");
					System.out.println(HouseholdBudget3.toString());

					break;
				case 4:
					System.out.println("Household #4");
					System.out.println(HouseholdBudget4.toString());

					break;
					
				
				}

				break;

			case 3: //finds the households with the same total fund value
				for(int i=0;i<5;i++)
					for(int j=i+1;j<5;j++)
						if (HouseholdBudget[i].getTotalFundValue()==HouseholdBudget[j].getTotalFundValue())
							System.out.println("Household "+(i)+" and Household "+(j)+" have the same value of "+HouseholdBudget[i].getTotalFundValue()+"$");
				break;

			case 4:  //finds the households with the same total fund distributions
				for(int i=0;i<5;i++)
					for(int j=i+1;j<5;j++)
						if (HouseholdBudget[i].getFund().equals(HouseholdBudget[j].getFund()))
							System.out.println("Household "+(i)+" and Household "+(j)+" have the same fund distribution: "+HouseholdBudget[i].getFund().toString());
				break;

			case 5:  //finds the households with the same total value of fund and expenses

				for (int i = 0; i < 5; i++) {
					for (int j = i + 1; j < 5; j++) {
						if (HouseholdBudget[i].equals(HouseholdBudget[j])) {
							System.out.println("Household " + (i) + " and Household " + (j) + " have the same total value of fund and the number of expenses ");
						}
					}
				}

				break;

			case 6: //allows to add expenses to a household
				System.out.println("Which household would you like to add an expense to?");
				hNum=x.nextInt();

				Expense newExpense= new Expense();

				System.out.println("Please enter the expense type: ");
				newExpense.setExpenseType(x.next());

				System.out.println("Please enter the amount of expense:");
				newExpense.setAmount(x.nextInt());

				System.out.println("Please enter the business name:");
				newExpense.setBusinessName(x.next());

				System.out.println("Please enter the due Month for this expense:");
				newExpense.setDueMonth(x.nextInt());

				System.out.println("Please enter the due day of this expense:");
				newExpense.setDueDay(x.nextInt());

				HouseholdBudget[hNum].addExpense(newExpense);

				System.out.println("Thank you! Your new expense has been added");

				break;

			case 7: //allows to remove a expense
				System.out.println("Which household would you like to remove an expense from?");
				hNum=x.nextInt();

				System.out.println("What is the index of the expense you would like to remove?");
				y=x.nextInt();

				HouseholdBudget[hNum].removeExpense(y);

				System.out.println("This expense was succesfully removed");

				break;

			case 8: //allows to update an expense and due date
				System.out.println("Please state the Household you would like to update an expense from:");
				hNum=x.nextInt();

				System.out.println("Please state the index of the expense you would like to update:");
				y=x.nextInt();

				System.out.println("What is the new due date (using format d m. For example: 5 11 for November fifth)");
				day=x.nextInt();

				month=x.nextInt();

				HouseholdBudget[hNum].updateExpenseDueDate(HouseholdBudget[hNum].getExpenses()[y], day, month);

				System.out.println("The due date was successfully updated.");

				break;

			case 9: //allows to update the fund denominations

				System.out.println("Please state the Household you would like to update the fund of:");
				hNum=x.nextInt();

				System.out.println("Please state the number of each cash type you want to add to in the followinf format:"
						+ " loonies toonies 5$Bills 10$Bills 20$Bills. For example, 5 5 5 5 5 ");

				Fund newFund= new Fund(x.nextInt(),x.nextInt(),x.nextInt(),x.nextInt(),x.nextInt());

				HouseholdBudget[hNum].setFund(newFund);

				System.out.println("The fund was updated.");

				break;
			}
		}while (code != 0); //if code does not equal to 0, continue running the code.
		
		x.close(); //scanner close
	}
}

package main.java.org.lld.Step_25_Splitwise.Expense;


import main.java.org.lld.Step_25_Splitwise.BalanceSheetController;
import main.java.org.lld.Step_25_Splitwise.Expense.Split.ExpenseSplit;
import main.java.org.lld.Step_25_Splitwise.Expense.Split.Split;
import main.java.org.lld.Step_25_Splitwise.User.User;

import java.util.List;

public class ExpenseController {

    BalanceSheetController balanceSheetController;
    public ExpenseController(){
        balanceSheetController = new BalanceSheetController();
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount,
                                 List<Split> splitDetails, ExpenseSplitType splitType, User paidByUser){

        ExpenseSplit expenseSplit = SplitFactory.getSplitObject(splitType);
        expenseSplit.validateSplitRequest(splitDetails, expenseAmount);

        Expense expense = new Expense(expenseId, expenseAmount, description, paidByUser, splitType, splitDetails);

        balanceSheetController.updateUserExpenseBalanceSheet(paidByUser, splitDetails, expenseAmount);

        return expense;
    }
}

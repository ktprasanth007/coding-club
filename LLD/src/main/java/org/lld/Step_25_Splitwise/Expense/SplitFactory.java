package main.java.org.lld.Step_25_Splitwise.Expense;

import main.java.org.lld.Step_25_Splitwise.Expense.Split.EqualExpenseSplit;
import main.java.org.lld.Step_25_Splitwise.Expense.Split.ExpenseSplit;
import main.java.org.lld.Step_25_Splitwise.Expense.Split.PercentageExpenseSplit;
import main.java.org.lld.Step_25_Splitwise.Expense.Split.UnequalExpenseSplit;

public class SplitFactory {

    public static ExpenseSplit getSplitObject(ExpenseSplitType splitType) {

        switch (splitType) {
            case EQUAL:
                return new EqualExpenseSplit();
            case UNEQUAL:
                return new UnequalExpenseSplit();
            case PERCENTAGE:
                return new PercentageExpenseSplit();
            default:
                return null;
        }
    }
}

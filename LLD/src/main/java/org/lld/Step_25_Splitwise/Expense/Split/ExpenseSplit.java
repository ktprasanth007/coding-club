package main.java.org.lld.Step_25_Splitwise.Expense.Split;

import java.util.List;

public interface ExpenseSplit {

    public void validateSplitRequest(List<Split> splitList, double totalAmount);
}

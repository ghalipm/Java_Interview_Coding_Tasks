package JavaSE_Test.Practice.GeeksForGeeks;

import java.util.*;

public class TegusCodeProblem {

    static TreeMap<String, Integer> initialPrice=new TreeMap<String, Integer>();

    public static void main(String[] args) {

        // price initialization:
        setInitialPrice("GOOG", 100);
        setInitialPrice("FB", 100);
        //setInitialPrice("TEGUS", 300);

        // To print out initialization:
        //get all entries

        Set<Map.Entry<String, Integer>> entries = initialPrice.entrySet();

        //using for loop
        System.out.println("Ticker => ($)Price:");
        for(Map.Entry<String, Integer> entry : entries){
            System.out.println( entry.getKey() + " => $" + entry.getValue() );
        }



        // buy or sell transactions:
        List<Transaction> transactions=new ArrayList<>();
        Transaction transactionRecord=new Transaction("Fred","BUY","GOOG", 10);
        transactions.add(transactionRecord);
        // after each transaction, a report schould be produced: need to be implemented.
        String investorName=transactionRecord.investorName;
        Integer totalExpenses=transactionRecord.numberOfShares*initialPrice.firstEntry().getValue(); // for buy
        Integer totalEndingValue=0;
        Double relativeChangeInValue=0.0;

        FinalReport finalReport=new FinalReport(investorName, totalExpenses, totalEndingValue,relativeChangeInValue);
        System.out.println("Final Report = " + finalReport.investorName+" SPENT $"+ finalReport.totalExpenses+" AND ENDED WITH $"+totalEndingValue+ ", A " +relativeChangeInValue+"% RETURN");

        //transactionRecord=new Transaction("Lisa","BUY","TEGUS", 10);
        //transactions.add(transactionRecord);
        transactionRecord=new Transaction("Fred","BUY","FB", 5);
        transactions.add(transactionRecord);
        if(transactionRecord.buyOrSell.equals("BUY")) {
            finalReport.totalExpenses += transactionRecord.numberOfShares * initialPrice.firstEntry().getValue();
            finalReport = new FinalReport(investorName, totalExpenses, totalEndingValue, relativeChangeInValue);
            System.out.println("Final Report = " + finalReport.investorName + " SPENT $" + finalReport.totalExpenses + " AND ENDED WITH $" + totalEndingValue + ", A " + relativeChangeInValue + "% RETURN");
        }


        //print out transactions:
        System.out.println("===============Transactions:===============");
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println("transactions.get("+i+").investor= " + transactions.get(i).investorName+", "+transactions.get(i).buyOrSell+", "+transactions.get(i).ticker+", "+transactions.get(i).numberOfShares);
        }




        // price change
        List<PriceChange> priceChanges=new ArrayList<>();
        PriceChange priceChangeRecord= new PriceChange("FB", "UP",0, 50);
        priceChanges.add(priceChangeRecord);
        priceChangeRecord=new PriceChange("GOOG","DOWN",0, 25);
        priceChanges.add(priceChangeRecord);

        transactionRecord=new Transaction("Fred","SELL","GOOG", 5);
        transactions.add(transactionRecord);
        priceChangeRecord=new PriceChange("GOOG","UP",10, 0);
        priceChanges.add(priceChangeRecord);

        //print out priceChanges:

        System.out.println("===============Price Changes:===============");
        for (int i = 0; i < priceChanges.size(); i++) {
            System.out.println("priceChanges.get("+i+").ticker= " + priceChanges.get(i).ticker+", "+priceChanges.get(i).upOrDown+", "+priceChanges.get(i).absoluteChange+", "+priceChanges.get(i).relativeChange);
        }



        System.out.println("================== Final Output: ======================");



    }

    public static void setInitialPrice(String ticker, Integer price) {
        initialPrice.put(ticker, price);
    }

    static class Transaction {
        String investorName;
        String buyOrSell;
        String ticker;
        Integer numberOfShares;


        public Transaction(String investorName, String buyOrSell, String ticker, Integer numberOfShares) {
            this.investorName = investorName;
            this.buyOrSell = buyOrSell;
            this.ticker = ticker;
            this.numberOfShares = numberOfShares;
        }
    }

        static class PriceChange{
            String ticker;
            String upOrDown;
            Integer absoluteChange;
            Integer relativeChange;

            public PriceChange(String ticker, String upOrDown, Integer absoluteChange, Integer relativeChange) {
                this.ticker = ticker;
                this.upOrDown = upOrDown;
                this.absoluteChange=absoluteChange;
                this.relativeChange=relativeChange;
            }
        }

        static class FinalReport{
            String investorName;
            Integer totalExpenses; //SPENT
            Integer totalEndingValue; //AND ENDED WITH
            Double relative_change_in_value; // A xy % RETURN

            public FinalReport(String investorName, Integer totalExpenses, Integer totalEndingValue, Double relative_change_in_value) {
                this.investorName = investorName;
                this.totalExpenses = totalExpenses;
                this.totalEndingValue = totalEndingValue;
                this.relative_change_in_value = relative_change_in_value;
            }
        }





}

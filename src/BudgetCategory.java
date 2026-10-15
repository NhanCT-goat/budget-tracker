public class BudgetCategory {
    private String category;
    private double limit;
    private double spent;
    public BudgetCategory(String category, double limit2, double spent2) {
        this.category = category;
        this.limit = limit;
        this.spent = spent;
    }
    public String getCategory() {
        return category;
    }
    public double getLimit() {
        return limit;
    }
    public double getSpent() {
        return spent;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setLimit(double limit) {
        this.limit = limit;   
    }
    public void setSpent(double spent) {
        this.spent = spent;
    }
    public String toString() {
        return "BudgetCategory [name=" + category + ", limit=" + limit   + ", spent=" + spent + "]";
    }
}
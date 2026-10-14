public class BudgetCategory {
    private String name;
    private int budget;
    private int spent;
    public BudgetCategory(String name, int budget, int spent) {
        this.name = name;
        this.budget = budget;
        this.spent = spent;
    }
    public String getName() {
        return name;
    }
    public int getBudget() {
        return budget;
    }
    public int getSpent() {
        return spent;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBudget(int budget) {
        this.budget = budget;   
    }
    public void setSpent(int spent) {
        this.spent = spent;
    }
    public String toString() {
        return "BudgetCategory [name=" + name + ", budget=" + budget + ", spent=" + spent + "]";
    }
}
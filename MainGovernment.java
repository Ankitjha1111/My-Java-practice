public class MainGovernment {
    public static void main(String[] args) {
        Ministry education = new Ministry();
        System.out.print("Education Ministry: ");
        education.makePolicy();

        Ministry health = new Ministry();
        System.out.print("Health Ministry: ");
        health.allocateBudget();

        Ministry finance = new Ministry();
        System.out.print("Finance Ministry: ");
        finance.regulatefinance();
    }
}

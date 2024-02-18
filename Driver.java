public class Driver {
    public static void main(String[] args) {
        SalariedEmployee johnJones = new SalariedEmployee("John", "Jones", "111-11-1111", 2500);
        HourlyEmployee stephanieSmith = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee maryQuinn = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        CommissionEmployee nicoleDior = new CommissionEmployee("Nicole", "Dior", "333-33-3333", 0.15, 50000);
        SalariedEmployee renwaChanel = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        BaseEmployee mikeDavenport = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        CommissionEmployee mahnazVaziri = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000);

        // Employee #1
        System.out.println("Employee 1 name: " + johnJones.getFirstName() + " " + johnJones.getLastName());
        System.out.println("Employee 1 social security number: " + johnJones.getSsn());
        System.out.println("Employee 1 weekly salary: $" + johnJones.getWeeklySalary());

        // Employee #2
        System.out.println("Employee 2 name: " + stephanieSmith.getFirstName() + " " + stephanieSmith.getLastName());
        System.out.println("Employee 2 social security number: " + stephanieSmith.getSsn());
        System.out.println("Employee 2 hourly wage: $" + stephanieSmith.getWage());
        System.out.println("Employee 2 hours worked: " + stephanieSmith.getHoursWorked());

        // Employee #3
        System.out.println("Employee 3 name: " + maryQuinn.getFirstName() + " " + maryQuinn.getLastName());
        System.out.println("Employee 3 social security number: " + maryQuinn.getSsn());
        System.out.println("Employee 3 hourly wage: $" + maryQuinn.getWage());
        System.out.println("Employee 3 hours worked: " + maryQuinn.getHoursWorked());

        // Employee #4
        System.out.println("Employee 4 name: " + nicoleDior.getFirstName() + " " + nicoleDior.getLastName());
        System.out.println("Employee 4 social security number: " + nicoleDior.getSsn());
        System.out.println("Employee 4 commission rate: " + nicoleDior.getCommissionRate());
        System.out.println("Employee 4 gross sales: $" + nicoleDior.getGrossSales());

        // Employee #5
        System.out.println("Employee 5 name: " + renwaChanel.getFirstName() + " " + renwaChanel.getLastName());
        System.out.println("Employee 5 social security number: " + renwaChanel.getSsn());
        System.out.println("Employee 5 weekly salary: $" + renwaChanel.getWeeklySalary());

        // Employee #6
        System.out.println("Employee 6 name: " + mikeDavenport.getFirstName() + " " + mikeDavenport.getLastName());
        System.out.println("Employee 6 social security number: " + mikeDavenport.getSsn());
        System.out.println("Employee 6 base salary: $" + mikeDavenport.getBaseSalary());
        // Employee #7
        System.out.println("Employee 7 name: " + mahnazVaziri.getFirstName() + " " + mahnazVaziri.getLastName());
        System.out.println("Employee 7 social security number: " + mahnazVaziri.getSsn());
        System.out.println("Employee 7 commission rate: " + mahnazVaziri.getCommissionRate());
        System.out.println("Employee 7 gross sales: $" + mahnazVaziri.getGrossSales());
    }
}
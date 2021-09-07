package org.example;


import org.example.model.MortgageClients;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMortgageApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MortgageClients mortgageClients = context.getBean("mortgageClients", MortgageClients.class);
        System.out.println(mortgageClients.getName());
        context.close();
    }

}

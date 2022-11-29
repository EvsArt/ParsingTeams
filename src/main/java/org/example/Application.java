package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.HashSet;

public class Application {
    static void run(){
        final String DRIVERPATH = "/home/artevseev/Desktop/Selenium/geckodriver";
        System.setProperty("webdriver.gecko.driver", DRIVERPATH);
        WebDriver driver = new FirefoxDriver(); // Init driver
        final String LOGINPAGE = "https://login.microsoftonline.com" +
                "/common/oauth2/v2.0/authorize?response_type=id_token&scope=openid%20profile" +
                "&client_id=5e3ce6c0-2b1f-4285-8d4b-75ee78787346" +
                "&redirect_uri=https%3A%2F%2Fteams.microsoft.com%2Fgo&state=eyJpZCI6ImZmZTlkZGJiLTY1YTgtNDE1ZC1hNzI2LWM5MzI0ZWVkZjI3ZiIsInRzIjoxNjY2OTkwNjc1LCJtZXRob2QiOiJyZWRpcmVjdEludGVyYWN0aW9uIn0%3D&nonce=188c88cc-c29e-43f6-ae09-33c779fce8eb&client_info=1&x-client-SKU=MSAL.JS&x-client-Ver=1.3.4&client-request-id=d907ba6b-96b1-4cf7-b020-83b348f45974" +
                "&response_mode=fragment";

        final String HimPage = "https://teams.microsoft.com/_#/teamDashboard/%D0%A5%D0%B8%D0%BC%D0%B8%D0%BA%D0%B8%20%D0%B8%20%D0%98%D0%98%D0%A2%20%D0%B8%20%D0%9F%20%202022/19:7qXfOS5MzVaIYk5t6CiPxQ-pzk_c0nS679qjS0h7FGM1@thread.tacv2/td.members";

        final String LiftPage = "https://teams.microsoft.com/_#/teamDashboard/" +
                "%D0%9B%D0%98%D0%A4%D0%A2_%D0%94%D0%B8%D1%81%D0%BA%D1%83%D1%81%D1%81%D0%B8%D0%BE%D0%BD%D0%BD%D1%8B%D0%B9%20%D0%BA%D0%BB%D1%83%D0%B1_%D0%92%D0%95%D0%91%D0%98%D0%9D%D0%90%D0%A0%D0%AB_%D0%9F%D1%81%D0%B8%D1%85%D0%BE%D0%BB%20%D1%81%D0%BB%D1%83%D0%B6%D0%B1%D0%B0%20%D0%90%D0%9F%D0%9F%20%D0%AE%D0%A4%D0%A3/" +
                "19:0bf593b671be4ac884057a020811fd1a@thread.tacv2/td.members";

        final String BlockchainPage = "https://teams.microsoft.com/_#/teamDashboard/%D0%91%D0%BB%D0%BE%D0%BA%D1%87%D0%B5%D0%B9%D0%BD%20%D0%A6%D0%B8%D1%84%D1%80%D0%BE%D0%B2%D0%B0%D1%8F%20%D0%BA%D0%B0%D1%84%D0%B5%D0%B4%D1%80%D0%B0%202022/19:y2HPm3hWeboYNlv4Lw95s9Ec3UHw39a_GdEMXjA6_b81@thread.tacv2/td.members";

        final String MathPage = "https://teams.microsoft.com/_#/teamDashboard/%D0%A4%D0%92%D0%A2(%D0%98%D0%92%D0%A2%D0%B8%D0%9F)%20%201%20%D0%BA%D1%83%D1%80%D1%81%20%D0%9C%D0%B0%D1%82%D0%B5%D0%BC%D0%B0%D1%82%D0%B8%D0%BA%D0%B0%20%D0%9B%D0%B5%D0%BA%D1%86%D0%B8%D0%B8%202021-22/19:OavdGOL8uxhXBFh8fZ2bBHiKmtKqQjA-qnNG-eEj2QQ1@thread.tacv2/td.members";

        final String SfeduNetPage = "https://teams.microsoft.com/_#/teamDashboard/SfeduNet%206.0:%20%D1%83%D1%87%D0%B0%D1%81%D1%82%D0%BD%D0%B8%D0%BA%D0%B8/19:qhh8fvYpIhcjiyPoBMjwN0Qdcqrg8VQxVH8oaoNAopA1@thread.tacv2/td.members";

        final String FizPage = "https://teams.microsoft.com/_#/teamDashboard/%D0%A4%D0%B8%D0%B7%D0%B8%D0%BA%D0%B0-%D0%BB%D0%B5%D0%BA%D1%86%D0%B8%D0%B8-1%D0%BA-%D0%98%D0%92%D0%A2%D0%B8%D0%9F%D0%A2-2021-22-%D1%83%D1%87.%D0%B3./19:GsEnpNxDLNIZdD7qP7rvXHivWuYTJVx8mVtaIhYzXmk1@thread.tacv2/td.members";

        final String MuamPage = "https://teams.microsoft.com/_#/teamDashboard/%D0%97%D0%B0%D0%BF%D0%B8%D1%81%D1%8C%20%D0%BD%D0%B0%20%D0%9C%D0%A3%D0%90%D0%9C/19:N9di6yaV4_bwTvQCaxs2niWH1oorFVmauAIwwi2GcCc1@thread.tacv2/td.members";

        final String EngNamPage = "https://teams.microsoft.com/_#/teamDashboard/%D0%92%D0%BE%D0%B7%D0%BC%D0%BE%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D0%B8%20%D1%81%D0%B5%D1%82%D0%B8%20%D0%98%D0%BD%D1%82%D0%B5%D1%80%D0%BD%D0%B5%D1%82%20%D0%B4%D0%BB%D1%8F%20%D1%81%D0%B0%D0%BC%D0%BE%D1%81%D1%82%D0%BE%D1%8F%D1%82%D0%B5%D0%BB%D1%8C%D0%BD%D0%BE%D0%B3%D0%BE%20%D0%B8%D0%B7%D1%83%D1%87%D0%B5%D0%BD%D0%B8%D1%8F%20%D0%B0%D0%BD%D0%B3%D0%BB%D0%B8%D0%B9%D1%81%D0%BA%D0%BE%D0%B3%D0%BE%20%D1%8F%D0%B7%D1%8B%D0%BA%D0%B0/19:p_sT55gKx5BqjtdpgtZPX57mfGi2TsaEIQNC9yDncUo1@thread.tacv2/td.members";

        final String EnglishPage = "https://teams.microsoft.com/_#/teamDashboard/%D0%98%D0%AF222812_%D0%90%D0%BD%D0%B3%D0%BB%D0%B8%D0%B9%D1%81%D0%BA%D0%B8%D0%B9-B1/19:PKHk1M1YRIJBDi-5PIjCFuD4gX4qWmeJfNTqXk27JYw1@thread.tacv2/td.members";

        final String email = "";
        final String password = "";

        DBWorking dbWorking = new DBWorking();

//        dbWorking.addAllEmailsFromFile("Emails1.txt");


        LoginPage loginPage = new LoginPage(driver, LOGINPAGE);
        loginPage.login(email, password);

        HashSet<String> emails = new HashSet<>();

        ChannelMembersPage channel;

        channel = new ChannelMembersPage(driver, HimPage);
        channel.getEmails(emails, "antoi@sfedu.ru");

        channel = new ChannelMembersPage(driver, LiftPage);
        channel.getEmails(emails, "negriboda@sfedu.ru");

        channel = new ChannelMembersPage(driver, BlockchainPage);
        channel.getEmails(emails, "vtaranenko@sfedu.ru");

        channel = new ChannelMembersPage(driver, MathPage);
        channel.getEmails(emails, "antoi@sfedu.ru");

        channel = new ChannelMembersPage(driver, SfeduNetPage);
        channel.getEmails(emails, "pnedelko@sfedu.ru");

        channel = new ChannelMembersPage(driver, FizPage);
        channel.getEmails(emails, "antoi@sfedu.ru");

        channel = new ChannelMembersPage(driver, MuamPage);
        channel.getEmails(emails, "antoi@sfedu.ru");

        channel = new ChannelMembersPage(driver, EngNamPage);
        channel.getEmails(emails, "zchernyh@sfedu.ru");

        channel = new ChannelMembersPage(driver, EnglishPage);
        channel.getEmails(emails, "uandreeva@sfedu.ru");

        dbWorking.addAllEmails(emails);
    }
}

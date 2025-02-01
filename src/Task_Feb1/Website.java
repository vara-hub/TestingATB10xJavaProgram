package Task_Feb1;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter URL type");
        String web = sc.nextLine();


        if (web.endsWith(".com")) {
            System.out.println("The website type is: Commercial website!");
        }
        else if(web.endsWith(".org"))
        {
            System.out.println("The website type is: Non-profit organization!");
        }
        else if(web.endsWith(".edu"))
        {
            System.out.println("The website type is: Educational institution!");
        }
        else if(web.endsWith(".gov"))
        {
            System.out.println("The website type is: Government website!");
        }
        else if(web.endsWith(".net"))
        {
            System.out.println("The website type is: Network-related website!");
        }
        else if(web.endsWith(".info"))
        {
            System.out.println("The website type is: Informational website!");
        }
        else if(web.endsWith(".xyz"))
        {
            System.out.println("The website type is:  Unknown or other types of websites!");
        }
        else {System.out.println("You have entered and invalid url, Please ensure URL has right domain");
        }
    }
}

//output:
/*
Enter URL type
example.com
The website type is: Commercial website!

Enter URL type
example.org
The website type is: Non-profit organization!

Enter URL type
example.edu
The website type is: Educational institution!

Enter URL type
example.gov
The website type is: Government website!

Enter URL type
example.net
The website type is: Network-related website!

Enter URL type
example.info
The website type is: Informational website!

Enter URL type
example.xyz
The website type is:  Unknown or other types of websites!

Enter URL type
v.orgara
You have entered and invalid url, Please ensure URL has right domain


 */
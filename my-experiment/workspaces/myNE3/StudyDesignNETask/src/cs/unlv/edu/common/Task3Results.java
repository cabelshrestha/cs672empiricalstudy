package cs.unlv.edu.common;

public class Task3Results {

    public static final String expectedResult1 = "CODE:NAME:DESCRIPTION\n" +
            "200:OK:Action completed successfully.\n" +
            "201:Created:Success following a post command.\n" +
            "204:No Content:Server has received the request but there is no content to send back.\n" +
            "201:Moved Permanently:Requested a directory instead of a specific file. The web server added the filename index.html, index.htm, home.html, or home.htm to the URL.\n" +
            "400:Bad Request:The request had bad syntax or was impossible to be satisfied.\n" +
            "401:Unauthorized:User failed to provide a valid user name / password required for access to file / directory.\n" +
            "403:Forbidden:The request does not specify the file name. Or the directory or the file does not have the permission that allows the pages to be viewed from the web.\n" +
            "404:Not Found:The requested file was not found.\n" +
            "500:Server Error:In most cases, this error is a result of a problem with the code or program you are calling rather than with the web server itself.\n" +
            "501:Not Implemented:The server does not support the facility required.\n" +
            "503:Out of Resource:The server cannot process the request due to a system overload.  This should be a temporary condition.\n" +
            "504:Gateway Timeout:The service did not respond within the time frame that the gateway was willing to wait.\n";
    
    public static final String expectedResult21 = "200:Action completed successfully.";
    public static final String expectedResult22 = "400:The request had bad syntax or was impossible to be satisfied.";
    public static final String expectedResult23 = "200:Action completed successfully.";
    public static final String expectedResult24 = "204:Server has received the request but there is no content to send back.";
    
    public static final String expectedResult31 = "204:Server has received the request but there is no content to send back.";
    public static final String expectedResult32 = "201:Success following a post command.";
    public static final String expectedResult33 = "200:Action completed successfully.";
    
    public static final String expectedResult41 = "500:In most cases, this error is a result of a problem with the code or program you are calling rather than with the web server itself.";
    public static final String expectedResult42 = "201:Success following a post command.";

    public static final String expectedResult51 = "500:In most cases, this error is a result of a problem with the code or program you are calling rather than with the web server itself.";
    public static final String expectedResult52 = "400:The request had bad syntax or was impossible to be satisfied.";
    public static final String expectedResult53 = "404:The requested file was not found.";
    
    public static final String expectedResult61 = "201:Success following a post command.";
    public static final String expectedResult62 = "200:Action completed successfully.";
    public static final String expectedResult63 = "200:Action completed successfully.";
    public static final String expectedResult64 = "200:Action completed successfully.";
}

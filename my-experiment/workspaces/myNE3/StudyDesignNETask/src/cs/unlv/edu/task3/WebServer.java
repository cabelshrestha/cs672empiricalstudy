package cs.unlv.edu.task3;

import java.util.ArrayList;
import java.util.List;

import cs.unlv.edu.common.Utils;

public class WebServer {

	List<String> webpages;

	public WebServer() {
		initialize();
	}
	
	private void initialize() {
		this.webpages = new ArrayList<String>();
		this.webpages.add("google.com");
		this.webpages.add("stackoverflow.com");
		this.webpages.add("dzone.com");
	}
	
	/**
	 * Complete the following inner class. 
	 * - add members: code:int, name:String, description:String
	 * - add constructor that takes in code, name and description and sets it to class members
	 * - override toString() method to return a string that looks like this
	 * 		<code>:<name>:<description>
	 */
	private static class HTTPErrorCodes {

		//<YOUR CODE HERE>

	}


	/**
	 * TODO: Create the following constants of type HTTPErrorCodes. 
	 * 
	 * const: OK, code: 200, name: "OK", description: "Action completed successfully."
	 * const: CREATED, code: 201, name: "Created", description: "Success following a post command." 
	 * const: NO_CONTENT, code: 204, name: "No Content", description: "Server has received the request but there is no content to send back."
	 * const: MOVED_PERMANENTLY, code: 301, name: "Moved Permanently", description: "Requested a directory instead of a specific file. The web server added the filename index.html, index.htm, home.html, or home.htm to the URL."
	 * const: BAD_REQUEST, code: 400, name: "Bad Request", description: "The request had bad syntax or was impossible to be satisfied."
	 * const: UNAUTHORIZED, code: 401, name: "Unauthorized", description: "User failed to provide a valid user name / password required for access to file / directory."
	 * const: FORBIDDEN, code: 403, name: "Forbidden", description: "The request does not specify the file name. Or the directory or the file does not have the permission that allows the pages to be viewed from the web."
	 * const: NOT_FOUND, code: 404, name: "Not Found", description: "The requested file was not found."
	 * const: SERVER_ERROR, code: 500, name: "Server Error", description: "In most cases, this error is a result of a problem with the code or program you are calling rather than with the web server itself."
	 * const: NOT_IMPLEMENTED, code: 501, name: "Not Implemented", description: "The server does not support the facility required."
	 * const: OUT_OF_RESOURCE, code: 503, name: "Out of Resource", description: "The server cannot process the request due to a system overload.  This should be a temporary condition."
	 * const: GATEWAY_TIMEOUT, code: 504, name: "Gateway Timeout", description: "The service did not respond within the time frame that the gateway was willing to wait."
	 * 
	 */

	//<YOUR CODE HERE>


	
	/**
	 * TODO: Complete the method below.
	 * - This method should put all the HTTP Errors in the following format into the list.
	 * <CODE:NAME:DESCRIPTION>
	 * 
	 * for example:
	 * 200:OK:Action completed successfully.
	 * 
	 */
	public List<String> getAllErrors() {

	    List<String> errors = new ArrayList<String>();
        
        errors.add("CODE:NAME:DESCRIPTION");

		//<YOUR CODE HERE>

        return errors;
	}

	/**
	 * TODO: Complete the method below.
	 * - This method checks if requested URL is in the 
	 *   'webpages' list and returns a string result accordingly
	 *    in the format <code>:<description>
	 *   
	 * @param URL
	 * 		- requested URL
	 * @return <code>:<description>
	 * 		- if URL is empty, error is BAD_REQUEST.
	 * 		- else if 'webpages' does not contain URL, error is NO_CONTENT
	 * 		- else, it is OK.
	 */
	public String get(String URL) {
		
		Utils.print("Getting... " + $(URL) );

		//<YOUR CODE HERE>
		
		return null;

	}

	/**
	 * TODO: Complete the method below.
	 *  - This method adds the URL to 'webpages' list and returns 
	 *  a string result accordingly in the format <code>:<description>
	 * 
	 * @param URL
	 * 		- URL to create
	 * @return <code>:<description>
	 * 		- if URL is empty, error is SEVER_ERROR.
	 * 		- else, it is CREATED.
	 */
	public String post(String URL) {
		
		Utils.print("Creating " + $(URL) );

		//<YOUR CODE HERE>

		return null;
	}
	
	/**
	 * TODO: Complete the method below.
	 * - this method replaces existing URL in 'webpages' 
	 * with the newURL passed to the method.
	 * 
	 * @param URL
	 * 		- existing url
	 * @param newURL
	 * 		- url to replace with
	 * @return <code>:<description>
	 * 		- if URL is empty, error is SERVER_ERROR.
	 * 		- else if newURL is empty, error is BAD_REQUEST.
	 * 		- else
	 * 			- if URL is not found in 'webpages', error is NOT_FOUND
	 * 			- else, replace URL with newURL and return OK 
	 */
	public String put(String URL, String newURL) {

		Utils.print("Updating " + $(URL) + " with " + $(newURL));
		
		//<YOUR CODE HERE>

		return null;
	}
	
	/**
	 * Helper method. No change required.
	 * 
	 * @param url
	 * 		This is the URL to print. e.g. www.google.com
	 * @return
	 * 		if URL is empty, returns <EMPTY_URL>
	 * 		else, returns < URL >
	 */
	private String $(String url) {
		return (Utils.isEmpty(url)? "<EMPTY_URL>":"<"+url+">");
	}

	

}

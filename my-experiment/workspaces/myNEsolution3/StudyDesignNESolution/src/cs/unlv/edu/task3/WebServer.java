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
	 * TODO: Create an enum called HTTPErrorCodes.
	 * -Add the following enums. Specify their code, name and description.
	 * 
	 * enum: OK, code: 200, name: "OK", description: "Action completed successfully."
	 * enum: CREATED, code: 201, name: "Created", description: "Success following a post command." 
	 * enum: NO_CONTENT, code: 204, name: "No Content", description: "Server has received the request but there is no content to send back."
	 * enum: MOVED_PERMANENTLY, code: 301, name: "Moved Permanently", description: "Requested a directory instead of a specific file. The web server added the filename index.html, index.htm, home.html, or home.htm to the URL."
	 * enum: BAD_REQUEST, code: 400, name: "Bad Request", description: "The request had bad syntax or was impossible to be satisfied."
	 * enum: UNAUTHORIZED, code: 401, name: "Unauthorized", description: "User failed to provide a valid user name / password required for access to file / directory."
	 * enum: FORBIDDEN, code: 403, name: "Forbidden", description: "The request does not specify the file name. Or the directory or the file does not have the permission that allows the pages to be viewed from the web."
	 * enum: NOT_FOUND, code: 404, name: "Not Found", description: "The requested file was not found."
	 * enum: SERVER_ERROR, code: 500, name: "Server Error", description: "In most cases, this error is a result of a problem with the code or program you are calling rather than with the web server itself."
	 * enum: NOT_IMPLEMENTED, code: 501, name: "Not Implemented", description: "The server does not support the facility required."
	 * enum: OUT_OF_RESOURCE, code: 503, name: "Out of Resource", description: "The server cannot process the request due to a system overload.  This should be a temporary condition."
	 * enum: GATEWAY_TIMEOUT, code: 504, name: "Gateway Timeout", description: "The service did not respond within the time frame that the gateway was willing to wait."
	 * 
	 * -Override toString() method of the enum to return a string that is <code>:<name>:<description>
	 */

	public static final HTTPErrorCodes OK = new HTTPErrorCodes(200, "OK", "Action completed successfully.");
	public static final HTTPErrorCodes CREATED = new HTTPErrorCodes(201, "Created", "Success following a post command.");
	public static final HTTPErrorCodes NO_CONTENT = new HTTPErrorCodes(204, "No Content", "Server has received the request but there is no content to send back.");
	public static final HTTPErrorCodes MOVED_PERMANENTLY = new HTTPErrorCodes(201, "Moved Permanently", "Requested a directory instead of a specific file. The web server added the filename index.html, index.htm, home.html, or home.htm to the URL.");
	public static final HTTPErrorCodes BAD_REQUEST = new HTTPErrorCodes(400, "Bad Request", "The request had bad syntax or was impossible to be satisfied.");
	public static final HTTPErrorCodes UNAUTHORIZED = new HTTPErrorCodes(401, "Unauthorized", "User failed to provide a valid user name / password required for access to file / directory.");
	public static final HTTPErrorCodes FORBIDDEN = new HTTPErrorCodes(403, "Forbidden", "The request does not specify the file name. Or the directory or the file does not have the permission that allows the pages to be viewed from the web.");
	public static final HTTPErrorCodes NOT_FOUND = new HTTPErrorCodes(404, "Not Found", "The requested file was not found.");
	public static final HTTPErrorCodes SERVER_ERROR = new HTTPErrorCodes(500, "Server Error", "In most cases, this error is a result of a problem with the code or program you are calling rather than with the web server itself.");
	public static final HTTPErrorCodes NOT_IMPLEMENTED = new HTTPErrorCodes(501, "Not Implemented", "The server does not support the facility required.");
	public static final HTTPErrorCodes OUT_OF_SERVICE = new HTTPErrorCodes(503, "Out of Resource", "The server cannot process the request due to a system overload.  This should be a temporary condition.");
	public static final HTTPErrorCodes GATEWAY_TIMEOUT = new HTTPErrorCodes(504, "Gateway Timeout", "The service did not respond within the time frame that the gateway was willing to wait.");

	private static class HTTPErrorCodes {
		
		int code = 0;
		String name = null;
		String description = null;

		public HTTPErrorCodes(int code, String name, String description) {
			this.code = code;
			this.name = name;
			this.description = description;
		}
		
		@Override
		public String toString() {
			return code + ":" + name + ":" + description;
		}
	}


	
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
		errors.add(OK.toString());
		errors.add(CREATED.toString());
		errors.add(NO_CONTENT.toString());
		errors.add(MOVED_PERMANENTLY.toString());
		errors.add(BAD_REQUEST.toString());
		errors.add(UNAUTHORIZED.toString());
		errors.add(FORBIDDEN.toString());
		errors.add(NOT_FOUND.toString());
		errors.add(SERVER_ERROR.toString());
		errors.add(NOT_IMPLEMENTED.toString());
		errors.add(OUT_OF_SERVICE.toString());
		errors.add(GATEWAY_TIMEOUT.toString());

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
		HTTPErrorCodes result = OK;

		if ( Utils.isEmpty(URL)) {

			result = BAD_REQUEST;

		} else {
			
			if ( !webpages.contains(URL)) {
				result = NO_CONTENT;
			}
			
		}
		
		return result.code + ":" + result.description;

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
		HTTPErrorCodes result = null;

		if ( Utils.isEmpty(URL)) {

			result = SERVER_ERROR;

		} else {

			this.webpages.add(URL);
			result = CREATED;

		}

		return result.code + ":" + result.description;
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

		HTTPErrorCodes result = null;
		
		if ( Utils.isEmpty(URL)) {

			result = SERVER_ERROR;

		} else if ( Utils.isEmpty( newURL )) {

			result = BAD_REQUEST;

		} else {
			
			int index = this.webpages.indexOf(URL);
			if ( index < 0 ) {
				result = NOT_FOUND;
			} else {
				this.webpages.add(index, newURL);
				result = OK;
			}
		}

		return result.code + ":" + result.description;
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

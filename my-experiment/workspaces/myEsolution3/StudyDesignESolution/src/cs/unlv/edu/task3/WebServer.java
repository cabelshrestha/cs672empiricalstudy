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
	
	public enum HTTPErrorCodes {

		OK(200, "OK", "Action completed successfully."),
		CREATED(201, "Created", "Success following a post command."),
		NO_CONTENT(204, "No Content", "Server has received the request but there is no content to send back." ),
		MOVED_PERMANENTLY(301, "Moved Permanently", "Requested a directory instead of a specific file.   The web server added the filename index.html, index.htm, home.html, or home.htm to the URL."),
		BAD_REQUEST(400, "Bad Request", "The request had bad syntax or was impossible to be satisfied."),
		UNAUTHORIZED(401, "Unauthorized", "User failed to provide a valid user name / password required for access to file / directory."),
		FORBIDDEN(403, "Forbidden", "The request does not specify the file name. Or the directory or the file does not have the permission that allows the pages to be viewed from the web."),
		NOT_FOUND(404, "Not Found", "The requested file was not found."),
		SERVER_ERROR(500, "Server Error", "In most cases, this error is a result of a problem with the code or program you are calling rather than with the web server itself."),
		NOT_IMPLEMENTED(501, "Not Implemented", "The server does not support the facility required."),
		OUT_OF_RESOURCE(503, "Out of Resource", "The server cannot process the request due to a system overload.  This should be a temporary condition."),
		GATEWAY_TIMEOUT(504, "Gateway Timeout", "The service did not respond within the time frame that the gateway was willing to wait.");

		private int code;
		public String name;
		String description;

		private HTTPErrorCodes(int code, String name, String description) {
			this.code = code;
			this.name = name;
			this.description = description;
		}
		
		@Override
		public String toString() {
			return this.code + ":" + name + ":" + description;
		}
	}

	public List<String> getAllErrors() {
		
	    List<String> errors = new ArrayList<String>();
	    
		errors.add("CODE:NAME:DESCRIPTION");

		for (HTTPErrorCodes code : HTTPErrorCodes.values()) {
			errors.add(code.toString());
		}
		
		return errors;

	}

	public String get(String URL) {
		
		Utils.print("Getting... " + $(URL) );

		HTTPErrorCodes result = HTTPErrorCodes.OK;

		if ( Utils.isEmpty(URL)) {

			result = HTTPErrorCodes.BAD_REQUEST;

		} else {
			
			if ( !webpages.contains(URL)) {
				result = HTTPErrorCodes.NO_CONTENT;
			}
			
		}
		
		return result.code + ":" + result.description;
	}

	public String post(String URL) {
		
		Utils.print("Creating " + $(URL) );
		
		HTTPErrorCodes result = null;

		if ( Utils.isEmpty(URL)) {

			result = HTTPErrorCodes.SERVER_ERROR;

		} else {

			this.webpages.add(URL);
			result = HTTPErrorCodes.CREATED;

		}

		return result.code + ":" + result.description;
	}
	
	public String put(String URL, String newURL) {

		Utils.print("Updating " + $(URL) + " with " + $(newURL));
		
		HTTPErrorCodes result = null;
		
		if ( Utils.isEmpty(URL)) {

			result = HTTPErrorCodes.SERVER_ERROR;

		} else if ( Utils.isEmpty( newURL )) {

			result = HTTPErrorCodes.BAD_REQUEST;

		} else {
			
			int index = this.webpages.indexOf(URL);
			if ( index < 0 ) {
				result = HTTPErrorCodes.NOT_FOUND;
			} else {
				this.webpages.add(index, newURL);
				result = HTTPErrorCodes.OK;
			}
		}

		return result.code + ":" + result.description;
	}
	
	/**
	 * Helper method.
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

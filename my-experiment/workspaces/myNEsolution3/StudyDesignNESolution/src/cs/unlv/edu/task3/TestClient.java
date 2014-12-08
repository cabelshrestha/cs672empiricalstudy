package cs.unlv.edu.task3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import cs.unlv.edu.common.ResultMatcher;
import cs.unlv.edu.common.Task3Results;
import cs.unlv.edu.common.Utils;

public class TestClient {

	WebServer server = new WebServer();

	public void execute() throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String action = "continue";

		while (!(action.equals("quit"))) {

			Utils.print("\nEnter test number 1,2,3,4,5,6 (or <quit> to exit): ");
			String input = in.readLine();

			if ( input.equals("1")) {

				runTest1();

			} else if (input.equals("2")) {

				runTest2();

			} else if (input.equals("3")) { 
				
				runTest3();
				
			} else if (input.equals("4")) { 
				
				runTest4();

			} else if (input.equals("5")) { 
				
				runTest5();

			} else if (input.equals("6")) { 
				
				runTest6();

			} else if (input.equalsIgnoreCase("quit")) {

				action = input;

			} else {

				System.out.println("INVALID INPUT! \n There are 6 test suites. \n -Enter test number to run. \n -Enter QUIT to end the test.\n");

			}
		}
	}
	
	private void runTest1() throws Exception {
	    List<String> errors = server.getAllErrors();
	    
	    StringBuffer sb = new StringBuffer();
	    
	    for(String error : errors) {
	        sb.append(error + "\n");
	    }
	    
	    printResult(Task3Results.expectedResult1, sb.toString());
	    
	    
	}
	
	private void runTest2() throws Exception {

		printResult(Task3Results.expectedResult21, server.get("stackoverflow.com"));
		printResult(Task3Results.expectedResult22, server.get(null));
		printResult(Task3Results.expectedResult23, server.get("dzone.com"));
		printResult(Task3Results.expectedResult24, server.get("daisy-duck.com"));
	}
	
	private void runTest3() throws Exception {
		
		printResult(Task3Results.expectedResult31, server.get("bitnami.com"));
		printResult(Task3Results.expectedResult32, server.post("bitnami.com"));
		printResult(Task3Results.expectedResult33, server.get("bitnami.com"));
		
	}
	
	private void runTest4() throws Exception {
		printResult(Task3Results.expectedResult41, server.post(""));
		printResult(Task3Results.expectedResult42, server.post("kathmandu-nepal.com"));
	}
	
	private void runTest5() throws Exception {
		printResult(Task3Results.expectedResult51, server.put("", "my.github.io"));
		printResult(Task3Results.expectedResult52, server.put("dzone.com", null));
		printResult(Task3Results.expectedResult53, server.put("hello-world.org", "leeks.com"));
	}
	
	private void runTest6() throws Exception {
		printResult(Task3Results.expectedResult61, server.post("mojoland.net"));
		printResult(Task3Results.expectedResult62, server.put("mojoland.net", "my.github.io"));
		printResult(Task3Results.expectedResult63, server.get("my.github.io"));
		printResult(Task3Results.expectedResult64, server.get("mojoland.net"));
	}
	
	
	private void printResult(String expected, String result) throws Exception {
		Utils.print("RESULT = " + result + "\n");
		
		Thread.sleep(1000);
		
		if(ResultMatcher.match(expected, result)){
            System.out.println("TEST SUCCESSFULL\n");
        } else {
            System.err.println("TEST FAILED\n");
        }
		
	}

	public static void main(String[] args) {
		TestClient test = new TestClient();

		try {
			System.out.println("Starting test suites...\n");

			test.execute();

			System.out.println("\nEnd of testing!!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

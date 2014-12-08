package cs.unlv.edu.task1;

import cs.unlv.edu.common.Utils;

public class CellNetwork {

	enum Network{
		ATNT, VERIZON, SPRINT, TMOBILE, USCELLULAR;
	}
	
	public void printNetworkCompanyName(Network network) {
		
		switch(network) {
		
			case ATNT:
				Utils.print("AT&T");
				break;
				
			case VERIZON:
				Utils.print("Verizon Wireless");
				break;
				
			case SPRINT:
				Utils.print("Sprint Corporation");
				break;
				
			case TMOBILE:
				Utils.print("T-Mobile");
				break;
				
			case USCELLULAR:
				Utils.print("U.S. Cellular");
				break;
		}
	}
	
	public static void main(String[] args) {

		CellNetwork obj = new CellNetwork();

		obj.printNetworkCompanyName(Network.ATNT);
		obj.printNetworkCompanyName(Network.VERIZON);
		obj.printNetworkCompanyName(Network.SPRINT);
		obj.printNetworkCompanyName(Network.TMOBILE);
		obj.printNetworkCompanyName(Network.USCELLULAR);
	}
}

package jdbc_Entertaiment;














public class TestConnection {
	public static void main(String[] args) {
		
		ConnectionClass connect = new ConnectionClass();
		connect.openConnection();
		connect.closeConnection();
		
		
	}

}

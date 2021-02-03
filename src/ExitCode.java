
public class ExitCode {

	public static void main(String[] args) {
		
		// Use the first command line argument as exit code
		int code = Integer.parseInt(args[0]);
		
		System.out.println("*********** EXIT CODE = " + code + " ***********");
		
		System.exit(code);
	}

}

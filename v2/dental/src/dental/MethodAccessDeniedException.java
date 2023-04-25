package dental;

public class MethodAccessDeniedException extends Exception {
	public MethodAccessDeniedException(String string) {
		super(string);
	}
	
	public MethodAccessDeniedException() {
		super("This class does not support this action.");
	}
	
}

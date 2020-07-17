package Main;

public class PatternSyntaxChecker {

	// invalid: {(}, {41]}, }9430{, {}
	public boolean isValidExpression(String expression) {
		String openChar = "{([";
		String closeChar = "})]";
		
		
		int openPosition = -1; 
		int closePosition = -1;
		int validClosePosition = -1;
		
		for (int i = 0; i < openChar.length(); i++) {
			openPosition = expression.indexOf(openChar.substring(i, i+1));
			
			if (openPosition >= 0) {
				validClosePosition = (openPosition + 2 <= expression.length() ? openPosition + 2 : -1);
				if (validClosePosition == -1) {
					return false;
				} else {
					closePosition = expression.indexOf(closeChar.substring(i, i+1), validClosePosition);
					
					if (closePosition > 0) {
						//verificar se existe outro caracter no meio da expressão que não esteja fechado
						String expr = expression.substring(openPosition, closePosition);
						
					}
				}
			}
		}
		
		return false;
	}
}

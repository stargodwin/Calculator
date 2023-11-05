package hello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.List;

public class CalculatorController {
	
	//private String history = "";
		private List<String> history = new ArrayList<>();
		
		@RequestMapping("/calculator/add")
		public String add(@RequestParam("op1") String op1, @RequestParam("op2") String op2) {
		    double op1_d = Double.parseDouble(op1);
		    double op2_d = Double.parseDouble(op2);
		    String result = op1 + " + " + op2 + " = " + String.valueOf(op1_d + op2_d);

		    // Add the result to the history list
		    history.add(result);

		    return result;
		}
		
		@RequestMapping("/calculator/minus")
		public String subtract(@RequestParam("op1") String op1, @RequestParam("op2") String op2) {
		    double op1_d = Double.parseDouble(op1);
		    double op2_d = Double.parseDouble(op2);
		    String result = op1 + " - " + op2 + " = " + String.valueOf(op1_d - op2_d);

		    // Add the result to the history list
		    history.add(result);

		    return result;
		}
		
		@RequestMapping("/calculator/product")
		public String multiply(@RequestParam("op1") String op1, @RequestParam("op2") String op2) {
		    double op1_d = Double.parseDouble(op1);
		    double op2_d = Double.parseDouble(op2);
		    String result = op1 + " * " + op2 + " = " + String.valueOf(op1_d * op2_d);

		    // Add the result to the history list
		    history.add(result);

		    return result;
		}
		
		@RequestMapping("/calculator/divide")
		public String divide(@RequestParam("op1") String op1, @RequestParam("op2") String op2) {
		    double op1_d = Double.parseDouble(op1);
		    double op2_d = Double.parseDouble(op2);
		    String result = op1 + " / " + op2 + " = " + String.valueOf(op1_d / op2_d);

		    // Add the result to the history list
		    history.add(result);

		    return result;
		}
		
		@RequestMapping("/calculator/history")
		public String getHistory() {
		    StringBuilder stringBuilder = new StringBuilder();
		    for (String item : history) {
		        stringBuilder.append(item).append("\n");
		    }
		    return stringBuilder.toString();
		}
//		public String getHistory() {
//		    // Return the history list
//		   // return history;
//		    return String.join("\n", history);
//		}
		
		
		@RequestMapping("/calculator/clear")
		public String clearHistory() {
		    // Clear the history list
		    history.clear();
		    return "History cleared";
		}

}

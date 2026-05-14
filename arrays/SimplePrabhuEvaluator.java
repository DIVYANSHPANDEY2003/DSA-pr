
    

    import java.util.*;

    public class SimplePrabhuEvaluator{
    
        private static final Map<String, Integer> digitMap = new HashMap<>();
        static {
            digitMap.put("zero", 0);
            digitMap.put("one", 1);
            digitMap.put("two", 2);
            digitMap.put("three", 3);
            digitMap.put("four", 4);
            digitMap.put("five", 5);
            digitMap.put("six", 6);
            digitMap.put("seven", 7);
            digitMap.put("eight", 8);
            digitMap.put("nine", 9);
        }
    
        private static Integer parseNumber(String word) {
            String[] parts = word.split("c");
            StringBuilder number = new StringBuilder();
            for (String part : parts) {
                if (!digitMap.containsKey(part)) {
                    return null;  
                }
                number.append(digitMap.get(part));
            }
            return Integer.parseInt(number.toString());
        }
    
        private static String evaluateExpression(String[] tokens) {
            if (tokens.length < 3) {
                return "expression is not complete or invalid";
            }
    
            String operation = tokens[0];
            Integer num1 = parseNumber(tokens[1]);
            Integer num2 = parseNumber(tokens[2]);
    
            if (num1 == null || num2 == null) {
                return "expression evaluation stopped invalid words present";
            }
    
            int result = 0;
            switch (operation) {
                case "add":
                    result = num1 + num2;
                    break;
                case "sub":
                    result = num1 - num2;
                    break;
                case "mul":
                    result = num1 * num2;
                    break;
                case "rem":
                    result = num1 % num2;
                    break;
                case "pow":
                    result = (int) Math.pow(num1, num2); 
                    break;
                default:
                    return "expression evaluation stopped invalid words present";
            }
    
            
            if (tokens.length > 3) {
                return "expression is not complete or invalid";
            }
    
            return String.valueOf(result);  
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
    
            String[] tokens = input.split(" ");
    
            
            String result = evaluateExpression(tokens);
            System.out.print(result);
        }
    }
    


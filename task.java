
/**
 * Сделать программу, в рамках которой необходимо определить какой символ
 * сколько раз встречается в строке.
 * Например: входящая строка вида - "aaaaabbbbcddd" мы должны получить -
 * "a5b4c1d3".
 */
public class task {

    public static void main(String[] args) {
        int count = 1;
        String input = "aaaaabbbbcddd";
        StringBuilder result = new StringBuilder();

        for (int i = 1; i < input.length(); i++) {

            if (input.charAt(i) == input.charAt(i - 1)) {  // в последний символах нет различий поэтому в результат они не записываются
                count++;
            } else {
                result.append(input.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        result.append(input.charAt(input.length()-1)).append(count); //искуственно добавляю последний символ в котором нет различий
        System.out.printf("Результат = " + result.toString()); 
    }                    
        // можно ли как то это реализовать без искуственного добавления??? 
}

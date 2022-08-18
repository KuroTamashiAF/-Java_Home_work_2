import java.util.Arrays;

/*Закончить задачу под номером '5' из общего списка: Задача: Задано уравнение вида q + w = e, q, w, e >= 0. 
Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет. 
Входящие строки могут иметь любое количество символов, например, 2? + 1? = ??*/

public class task5 {
    private static int NumberOfQuestions(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '?')
                count++;
        }
        return count;
    }

    private static void generateCombinations(int arr[], int index, int MaxVal) {
        if (index == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = 0; i < MaxVal; i++) {
            arr[index] = i;
            generateCombinations(arr, index + 1, MaxVal);  // то что разобрали на уроке и все дальше я не знаю. 
        }                                                  // необходимо пояснение т.к метод закончен в него мы ничего не добавлем
    }                                                //метод ничего не возвращет, а при попытке что то вернуть идет ошибка 
                                                    //как вот в это 2? + 1? = ?? подставить допустим это [1, 0, 1, 0]
                                                    //и еще на выводе у нас просто много массивов которые 1 за 1 выводятся 
                                                    // или это arr[][] ?
    

    public static void main(String[] args) {

        String input = "2? + 1? = ??";
        int SizeArray = NumberOfQuestions(input); // количество елементов в массиве
        int MaxValue = 2; // от 0 до 9

        int array[] = new int[SizeArray];
        generateCombinations(array, 0, MaxValue);





    }
}

package class99;

public class reverseWordsInString {
    public String reverseWords(String input) {
        // Write your solution here.
        if (input == null || input.length() <= 1) {
            return input;
        }
        input = input.trim();
        input = input.replaceAll("\\s+"," ");
        char[] inputs = input.toCharArray();
        swap(inputs, 0, inputs.length - 1);
        int i = 0, j = 0;
        
        while(j < inputs.length) {
            if (inputs[j] == ' ') {
                swap(inputs, i, j - 1);
                i = j + 1;
                j++;
            } else {
                j++;
            }
        }
        swap(inputs, i, inputs.length - 1);
        return new String(inputs);
    }
    
//    public String removeDuplicateSpaces(String input) {
//        char[] inputs = input.toCharArray();
//        int slow = 0;
//        int fast = 0;
//        
//        while (fast < inputs.length) {
//            if (slow < 2 || inputs[slow - 1] != ' ') {
//                true;
//            }
//        }
//        
//        return new String();
//    }
    
    public void swap(char[] array, int left, int right) {
        while (left < right) {
            char tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
    }
}

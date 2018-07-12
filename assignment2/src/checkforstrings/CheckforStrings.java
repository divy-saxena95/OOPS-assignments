package checkforstrings;

//TIME COMPLEXITY-O(n)
//SPACE COMPLEXITY-O(1)



public class CheckforStrings {
    public static boolean check(String input)
    {
        // Create a hash table to mark the
        // characters present in the string
        // By default all the elements of
        // mark would be false.
        boolean[] mark = new boolean[26];

        // For indexing in mark[]
        int index = 0;

        // Traverse all characters
        for (int i = 0; i < input.length(); i++)
        {
            // If uppercase character, subtract 'A'
            // to find index.
            if ('A' <= input.charAt(i) &&
                    input.charAt(i) <= 'Z')

                index = input.charAt(i) - 'A';

                // If lowercase character, subtract 'a'
                // to find index.
            else if('a' <= input.charAt(i) &&
                    input.charAt(i) <= 'z')

                index = input.charAt(i) - 'a';

            // Mark current character
            mark[index] = true;
        }

        // Return false if any character is unmarked
        for (int i = 0; i <= 25; i++)
            if (!mark[i])
                return (false);

        // If all characters were present
        return (true);
    }

}

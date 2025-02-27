import java.util.*;

public class Main {

    public static void main(String[] args) {
        String text = """
                If you're looking for random paragraphs, you've come to the right place. When a random word or a random sentence isn't quite enough, the next logical step is to find a random paragraph. We created the Random Paragraph Generator with you in mind. The process is quite simple. Choose the number of random paragraphs you'd like to see and click the button. Your chosen number of paragraphs will instantly appear.
                        
                While it may not be obvious to everyone, there are a number of reasons creating random paragraphs can be useful. A few examples of how some people use this generator are listed in the following paragraphs.
                        Creative Writing
                Generating random paragraphs can be an excellent way for writers to get their creative flow going at the beginning of the day. The writer has no idea what topic the random paragraph will be about when it appears. This forces the writer to use creativity to complete one of three common writing challenges. The writer can use the paragraph as the first one of a short story and build upon it. A second option is to use the random paragraph somewhere in a short story they create. The third option is to have the random paragraph be the ending paragraph in a short story. No matter which of these challenges is undertaken, the writer is forced to use creativity to incorporate the paragraph into their writing.
                        Tackle Writers' Block
                        this this this this this
                A random paragraph can also be an excellent way for a writer to tackle writers' block. Writing block can often happen due to being stuck with a current project that the writer is trying to complete. By inserting a completely random paragraph from which to begin, it can take down some of the issues that may have been causing the writers' block in the first place.
                """;
        String formatedText = text
                .toLowerCase()
                .replace("," , "")
                .replace("." , "")
                .replace("'", "")
                .replace("?", "")
                .replace("!", "")
                .replaceAll("\\s+", ",");


        Map<String, Integer> wordMap = new HashMap<>();

        String[] words = formatedText.split(",");

        System.out.println(Arrays.toString(words));


        for (String word : words){
            if (wordMap.containsKey(word)){
                int count = wordMap.get(word)+1;
                wordMap.put(word,count);
            }
            else {
                wordMap.put(word,1);
            }
        }
        System.out.println(wordMap);



    }
}
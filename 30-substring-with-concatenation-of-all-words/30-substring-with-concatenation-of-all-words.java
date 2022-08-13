class Solution {
      public List<Integer> findSubstring(final String s, final String[] words) {
        final int wordCount = words.length;
        final int wordLength = words[0].length();
        if (wordLength == 0 || wordCount == 0) return new ArrayList<>();

        final Map<String, String> dictionary = new HashMap<>();
        
		// Convert the words into a single (sorted) sentence
        final String requiredString = Arrays.stream(words).sorted().map(word -> {
            dictionary.putIfAbsent(word, Character.toString((char) (dictionary.size() + 65)));
            return dictionary.get(word);
        }).collect(Collectors.joining());

        final int sentenceLength = wordCount * wordLength;
        return IntStream.range(0, s.length() - sentenceLength + 1).filter(
                i -> {
                    final String sentence = s.substring(i, i + sentenceLength);

					//Apply same conversion and sort, we've found an answer when it matches the required
                    final String converted = IntStream.range(0, wordCount).mapToObj(j -> {
                        final String token = sentence.substring(j * wordLength, j * wordLength + wordLength);
                        return dictionary.getOrDefault(token, " ");
                    }).sorted().collect(Collectors.joining());

                    return converted.equals(requiredString);
                }
        ).boxed().collect(Collectors.toList());
    }
}

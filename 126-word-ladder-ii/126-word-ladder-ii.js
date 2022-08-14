var findLadders = function (beginWord, endWord, wordList) {
    //When each word is added, the lowest step count is tracked to ensure its not possible to land on a word at a later step
    const stepMap = new Map();

    //Each word will track the words that led to that word in the sequence. This is used later to regenerate output through backtracking
    const trailTracker = new Map();
	
	const availableWords = new Set(wordList);

    wordList.push(beginWord);
    stepMap.set(beginWord, 1);
    const q = [beginWord];

    while (q.length) {
        const currWord = q.shift();
        const nextStep = stepMap.get(currWord) + 1;
		availableWords.delete(currWord);

        findingWords: for (const word of availableWords) {
            if (!stepMap.has(word) || nextStep <= stepMap.get(word)) {
                let charDiffs = 0;
                for (let i = 0; i < word.length; ++i) {
                    if (word[i] !== currWord[i]) {
                        ++charDiffs;
                    }
                    if (charDiffs > 1) {
                        continue findingWords;
                    }
                }
                if (!trailTracker.has(word)) {
                    trailTracker.set(word, new Set());
                }
                trailTracker.get(word).add(currWord);
                //this is required to pass
                if (!stepMap.has(word) || nextStep < stepMap.get(word)) {
                    q.push(word);
                }
                stepMap.set(word, nextStep);
            }
        }
    }

    const output = [];
    const curr = [endWord];

    function backtrack(word) {
        if (word === beginWord) {
            output.push([...curr].reverse()); //trail was constructed in reverse and the output is expected in order
            return;
        }

        if (!trailTracker.has(word)) {
            return;
        }

        for (const next of trailTracker.get(word)) {
            curr.push(next);
            backtrack(next);
            curr.pop();
        }
    }
    backtrack(endWord);

    return output;
};
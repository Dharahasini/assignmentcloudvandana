function reverseWordsInSentence(sentence) {
    const words = sentence.split(' ');
    const reversedWords = words.map(word => reverseWord(word));
    const reversedSentence = reversedWords.join(' ');
    return reversedSentence;
}
function reverseWord(word) {
    return word.split('').reverse().join('');
}
const inputSentence = "hi hasini";
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log(reversedSentence);

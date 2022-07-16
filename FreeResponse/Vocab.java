public class Vocab{

  public int countNotInVocab(String[] wordArray){
    int counter = 0;
    for(int i = 0; i < wordArray.length; i++){
      if(!findWord(wordArray[i])){
        counter++;
      }
    }
    return counter;
  }

  public String[] notInVocab(String[] wordArray){
    String[] arr = new String[countNotInVocab(wordArray)];
    int counter = 0;
    for(int i = 0; i < wordArray.length; i++){
      if(!findWord(wordArray[i])){
        arr[counter] = wordArray[i];
        counter++;
      }
    }
    return arr;
  }

  // We need a public boolean addLearnedVocab(String v) method.
  // This method would have to iterate through theVocab to check whether
  // the string is already in theVocab.
  // If the string is in theVocab, return true.
  // If the string is not in theVocab, we create a new String[] array of size
  // theVocab.length+1
  // We then iterate through theVocab and copy the elements into our new array.
  // At the end, we add the new word to the array.
  // We then set theVocab to our new array with the new word in it.
}

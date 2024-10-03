/*
 * *** Abdullah I Khan ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {
    Set<Integer> allElements = new TreeSet<>(setA); // create copy to store uniqueElements
    allElements.addAll(setB); // add all elements from setB to uniqueElements
    Set<Integer>commonElements = new TreeSet<>(setA); // set holding commonElements
    commonElements.retainAll(setB); // keep only common elements between setA and setB
    allElements.removeAll(commonElements); // remove all the same elements from uniqueElements
return allElements;

    // This can be done numerous ways, but once such will only that
    // *several* lines of code. Hint: create two temporary TreeSets and utilize the
    // methods retainAll(), addAll(), and removeAll(). But in the end, get something to work.
  }
  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {
  for(Integer key : new TreeSet<>(treeMap.keySet())){ // using a TreeSet to maintain the sorted order of keys
  if (key % 2 == 0){ // check if key is even
    treeMap.remove(key); // remove key if even
  }
    }
  }
  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */
  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {
    return tree1.equals(tree2); // checks if tree1 and tree2 are equal and if true return true
    // and if false, return false
  }
} // end treeProblems class

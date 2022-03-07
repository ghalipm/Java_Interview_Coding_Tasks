package JavaSE_Test.Practice.GeeksForGeeks;
/*
asked by Jamila Osman:
        Suppose we have some input data describing a graph of relationships between parents and children over multiple generations. The data is formatted as a list of (parent, child) pairs, where each individual is assigned a unique positive integer identifier.
        For example, in this diagram, 3 is a child of 1 and 2, and 5 is a child of 4:
        1   2    4   15
        \ /   / | \ /
        3   5  8  9
        \ / \     \
        6   7    11
        Sample input/output (pseudodata):
        parentChildPairs = [
        (1, 3), (2, 3), (3, 6), (5, 6), (15, 9),
        (5, 7), (4, 5), (4, 8), (4, 9), (9, 11)
        ]
        (parent, child) (1, 3), (2, 3)
        Write a function that takes this data as input and returns two collections:
        one containing all individuals with zero known parents, and
        one containing all individuals with exactly one known parent.
        Output may be in any order:
        findNodesWithZeroAndOneParents(parentChildPairs) => [
        [1, 2, 4, 15],       // Individuals with zero parents
        [5, 7, 8, 11]        // Individuals with exactly one parent
        ]
        n: number of pairs in the input
        */

// original code: at
//https://gist.github.com/rahulsonwalkar/dc67cf3c6751336c32e7e5b7ac62461f


import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
    public static void main(String[] args) {
        int[][] parentChildPairs = new int[][] {
                {1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7},
                {4, 5}, {4, 8}, {4, 9}, {9, 11}, {15, 9}
        };

        List<List<Integer>> returnList = findParents(parentChildPairs);
        int i = 0;
        System.out.println("Individuals with zero parents: ");
        while(i < returnList.get(0).size()){
            System.out.print(returnList.get(0).get(i)+" ");
            i++;
        }

        System.out.println(" ");
        System.out.println("Individuals with exactly one parent:");
        i = 0;
        while(i < returnList.get(1).size()){
            System.out.print(returnList.get(1).get(i)+" ");
            i++;
        }
        // parent, child

        System.out.println(" ");
        System.out.println("Individuals with exactly two parent:");
        i = 0;
        while(i < returnList.get(2).size()){
            System.out.print(returnList.get(2).get(i)+" ");
            i++;
        }
        // parent, child


    }

    // Time Complexity: O(n) n - num of ind.
    // Space Complexity: O(n)
    public static List<List<Integer>> findParents(int[][] pairs){
        HashMap<Integer, Integer> numberOfParents = new HashMap<>();

        for(int i = 0; i < pairs.length; i++){
            int parent = pairs[i][0];
            int child = pairs[i][1];


            if(numberOfParents.containsKey(child))
                numberOfParents.put(child, numberOfParents.get(child) + 1);
            else
                numberOfParents.put(child, 1);

            if(!numberOfParents.containsKey(parent))
                numberOfParents.put(parent, 0);

        }

        ArrayList<Integer> zeroParents = new ArrayList<>();
        ArrayList<Integer> oneParent = new ArrayList<>();
        ArrayList<Integer> twoParent = new ArrayList<>();

        numberOfParents.forEach((key, value) -> {
            if(value == 0)
                zeroParents.add(key);
            if(value == 1)
                oneParent.add(key);
            if(value == 2)
                twoParent.add(key);

        });

        List<List<Integer>> returnList = new ArrayList<>();

        returnList.add(zeroParents);
        returnList.add(oneParent);
        returnList.add(twoParent);

        return returnList;


    }
}
/*
        This is another company coding interview question;
        time limit 5 minutes
 */
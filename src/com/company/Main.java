package com.company;

public class Main {

    public static void main(String[] args) {
	int[] arr = {1,2,3,4,5};
	CollectionArrays collectionArrays = new CollectionArrays(arr);
        System.out.println(collectionArrays);
        collectionArrays.addInArray(4);
        System.out.println(collectionArrays);
        collectionArrays.addInArrayForIndex(3,5);
        System.out.println(collectionArrays);
        collectionArrays.addInArrayForIndex(10,5);
        System.out.println(collectionArrays);
        collectionArrays.deleteElementForIndex(14);
        collectionArrays.deleteElementForIndex(2);
        collectionArrays.clearArray();
        System.out.println(collectionArrays);
        collectionArrays.setArray(arr);
        System.out.println(collectionArrays);
    }
}

package com.company;

import java.util.Arrays;

public class CollectionArrays {


    public CollectionArrays(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "CollectionArrays{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    private int[] array;

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void addInArray(int number) {
        this.array = Arrays.copyOf(array,array.length+1);
        array[array.length -1]=number;
    }
    public void addInArrayForIndex(int index, int number){
        if ( index < this.array.length){
            this.array[index]=number;
        }else {
            this.array = Arrays.copyOf(array,index+1);
            array[index]=number;
        }
    }
    public void deleteElementForIndex(int index){
        if (this.array.length < index){
            System.out.println("Индекс больше длинны массива - элемента не существует (удален) \n");
        }else {
            this.array[index] = 0;
            System.out.println(Arrays.toString(array));
        }
    }
    public void clearArray(){
        for (int index = 0; index < array.length; index++) {
            array[index]=0;
        }
    }

}

package Generics.Lab.ArrayCreator;

import java.lang.reflect.Array;

public class ArrayCreator<T> {

   public static <T> T[] create(int length, T element){
       T[] array = (T[]) Array.newInstance(element.getClass(), length);

       for (int i = 0; i < length; i++) {
           array[i] = element;
       }
       return array;
   }

   public static <T> T[] create(Class<T> clazz, int length, T element){
       T[] array = (T[]) Array.newInstance(clazz, length);

       for (int i = 0; i < length; i++) {
           array[i] = element;
       }
       return array;
   }
}

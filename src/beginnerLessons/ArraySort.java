package beginnerLessons;

public class ArraySort {
        public static int[] bubbleSort(int[] array) {
            boolean isSorted = false;     //проверо будем массив пока не станет true и массив будет отсортирован

            while (!isSorted) {

                isSorted = true;

                for (int i = 1; i < array.length; i++) {
                    if (array[i - 1] > array[i]) {
                        int temp = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = temp;

                        isSorted = false;
                    }
                }
            }

            return array;
        }

        public static void main(String[] args) {
            int[] array = new int[]{64, 42, 73, 41, 32, 53, 16, 24, 57, 48, 74, 55, 36};

            long start = 0;
            long end = 0;
            start = System.nanoTime();
            bubbleSort(array);
            end = System.nanoTime();

            System.out.println(end - start);
        }

    }

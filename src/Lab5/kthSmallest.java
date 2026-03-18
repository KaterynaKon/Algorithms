package Lab5;

import java.util.Arrays;

public class kthSmallest {

        public static void main(String[] args) {
            int[] score = {27, 50, 20, 90, 105};
            int k = 3;

            System.out.println(kthSmallest(Arrays.copyOf(score, score.length), k));
        }
             public static int kthSmallest(int[] score, int k){
                for (int i = 0; i <k; i++) {
                    int minidex = i;
                    for (int j = i + 1; j < score.length; j++) {
                        if (score[j] < score[minidex]) {
                            minidex = j;
                        }
                    }
                    if (i != minidex) {
                        int temp = score[i];
                        score[i] = score[minidex];
                        score[minidex] = temp;
                    }
                }
                return score[k-1];


            }
        }



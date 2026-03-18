package Lab5;

public class EX1 {
    public static void main(String[] args) {
        int [] score={27,50,60,80,90};

        for (int i=0; i<score.length-1; i++){
            int minidex=i;
            for(int j=i+1;j<score.length;j++){
                if (score[j]<score[minidex]){
                    minidex=j;
                }
            }
            if (i!=minidex){
                int temp=score[i];
                score[i]=score[minidex];
                score[minidex]=temp;
            }
        }
    }
}

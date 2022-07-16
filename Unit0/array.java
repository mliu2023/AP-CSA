public class array{
public static void main(String[] args){
double[] scores = new double[1000];
for (int n = 0; n < 1000; n++){
  scores[n]=n;
}
int sum = 0;
for (int n = 0; n < 1000; n++){
  sum += scores[n];
}
double average=(double)sum/(double)1000;
System.out.println(average);
}
}

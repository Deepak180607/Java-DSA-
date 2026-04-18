package Ass1;

public class Q3 {
    public static void main(String [] args){
        char arr[] = {'c', 'a', 'r', 'b', 'o', 'n'};
        for(int a = 0; a < 6; a++){
            for(int b = 0; b < 6; b++){
                if( b == a) continue;
                for(int c = 0; c < 6; c++){
                    if( c == a || c == b) continue;
                    for(int d = 0; d < 6; d++){
                        if( d == a || d == b || d == c) continue;
                        for(int e = 0; e < 6; e++){
                            if( e == a || e == b || e == c || e == d) continue;
                            for(int f = 0; f < 6; f++){
                                if(f == a || f == b || f == c || f == d || f == e) continue;
                                    System.out.println("" + arr[a] + arr[b] + arr[c] + arr[d] + arr[e] + arr[f]);
                            }
                        }
                    }
                }
            }
        }
    }
}

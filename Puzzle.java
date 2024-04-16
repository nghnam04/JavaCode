/*
 Hãy cài đặt thuật toán kiểm tra xem một tổ hợp có đưa được về tổ hợp gốc hay không? Nếu N lẻ (N số ô hàng ngang và dọc) thì ta cần đưa tổ hợp về dạng mảng một chiều sau đó đếm số lần số lớn đứng trước số bé trong tổ hợp đó. Nếu số lần này không cùng tính chất chẵn lẻ với tổ hợp gốc thì tổ hợp đó không đưa về tổ hợp gốc được. 
Vậy tổ hợp gốc có số lần số lớn đứng trước số bé là bao nhiêu? 1,2,3,4,5,6,7,8  => 0 lần
Hãy cài đặt mã nguồn Java/C++ cho phép người dùng nhập N, sau đó nhập N dòng, mỗi dòng nhập N số phân tách bằng dấu cách. Số 0 sẽ đại diện cho ô trống. Giả sử rằng người dùng luôn nhập các số sao cho: (i) không trùng, (ii) từ 0 đến N*N - 1 và (iii) N lẻ
Hãy in ra câu trả lời No nếu không thể đưa tổ hợp vừa nhập về tổ hợp gốc. In ra Yes nếu ngược lại

 */
import java.util.*;
public class Puzzle {
           public static void main(String[] args) {
               int N;
               Scanner sc = new Scanner(System.in);
               N = sc.nextInt();
               int[][] arr = new int[N][N];
               int[] b_arr = new int[N * N];
       
               for (int i = 0; i < N; i++) {
                   for (int j = 0; j < N; j++) {
                       int x = sc.nextInt();
                       arr[i][j] = x;
                       b_arr[i * N + j] = x;
                   }
               }
       
               int count = 0;
               for (int i = 0; i < N * N; i++) {
                   for (int j = i + 1; j < N * N; j++) {
                       if (b_arr[i] > b_arr[j] && b_arr[j] > 0) {
                           count++;
                       }
                   }
               }
       
               if (count % 2 == 0)
                   System.out.println("Yes");
               else
                   System.out.println("No");
           }
       
       
}

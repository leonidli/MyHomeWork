public class TenLukEnd {

    public static void main(String[] args) {

        int[] num = {1, 0, 12, 30, 0, 4, 9, 0, 7, 0, 8, 5, 0};
        int[] numRes = zeroMax(num);

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i] + " " + numRes[i]);

        }
    }

    public static int[] zeroMax(int[] num) {

        int Res[] = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {
                int temp = 0;
                for (int j = i + 1; j < num.length; j++) {
                    if (num[j] % 2 == 1 && num[j] > temp) {
                        temp = num[j];
                        System.out.print("temp=" + temp);
                    }
                    num[i] = temp;
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            Res[i] = num[i];
            //       System.out.println(numsRes[i]);


        }return Res;

    }

}
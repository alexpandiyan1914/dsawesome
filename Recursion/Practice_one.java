public class Practice_one {

    static void recursion(int num) {
        if (num == 0) {
            System.out.println(0);
            return;
        }
         System.out.println(num);
        recursion(num - 1);
        System.out.println(num);
    }

        public static void main(String[] args) {
        recursion(5);

    }

}

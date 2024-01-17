public class Main {
    public static void main(String[] args) {
        System.out.println( canPack( 1,0,4) );
        System.out.println( canPack( 1,0,5) );
        System.out.println( canPack( 0,5,4) );
        System.out.println( canPack( 2,2,11) );
        System.out.println( canPack( -3,2,12) );
        System.out.println( canPack( 2,1,5) );
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ( bigCount < 0 || smallCount < 0 || goal < 0 ) {
            return false;

        } else if ( goal >= 5 && ( smallCount == 0 || smallCount == 1 ) ) {
            return goal <= ( bigCount*5 ) && goal % 5 == 0;

        } else if ( goal >= 5 && smallCount % 2 == 0 ) {
            return goal <= ( bigCount*5 + smallCount );

        } else if ( goal >= 5 && smallCount % 3 == 0 ) {
            return goal <= ( bigCount*5 + smallCount ) && ( goal - smallCount ) % 5 == 0;

        } else {
            return goal <= smallCount && bigCount == 0;
        }
    }
}

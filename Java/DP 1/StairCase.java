public class StairCase{
    public static long staircase(int n) {
        long[] storage = new long[n + 1];
        if (n == 0){
            return storage[0];
        }
        storage[1] = 1;
        if (n == 1){
            return storage[1];
        }
        storage[2] = 2;
        if (n == 2){
            return storage[2];
        }
        storage[3] = 4;
        if (n == 3){
            return storage[3];
        }
        for (int i = 4; i <= n; i++) {
            storage[i] = storage[i - 1] + storage[i - 2] + storage[i - 3];
        }
        return storage[n];
		//Your code goes here
	}
}
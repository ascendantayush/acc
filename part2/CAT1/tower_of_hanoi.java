class Solution {
    public int towerOfHanoi(int n, int from, int to, int aux) {

        // base case
        if (n == 0) {
            return 0;
        }

        int count = 0;

        // move n-1 disks from 'from' to 'aux'
        count += towerOfHanoi(n - 1, from, aux, to);

        // move nth disk from 'from' to 'to'
        System.out.printf(
            "move disk %d from rod %d to rod %d\n",
            n, from, to
        );
        count += 1;

        // move n-1 disks from 'aux' to 'to'
        count += towerOfHanoi(n - 1, aux, to, from);

        return count;
    }
}

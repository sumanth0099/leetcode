class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;

        for (int bill : bills) {
            if (bill == 5) {
                five++;  // Receive $5, no change required
            } else if (bill == 10) {
                if (five > 0) {  // Use one $5 to give change
                    five--;
                    ten++;
                } else {
                    return false;  // No $5 to give change
                }
            } else {  // bill == 20
                if (ten > 0 && five > 0) {  // Prefer giving $10 + $5 as change
                    ten--;
                    five--;
                } else if (five >= 3) {  // Otherwise, give three $5 as change
                    five -= 3;
                } else {
                    return false;  // Not enough bills to give change
                }
            }
        }
        return true;  // Successfully provided change for all customers
    }
}

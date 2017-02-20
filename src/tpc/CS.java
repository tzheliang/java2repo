package tpc;

import java.util.Comparator;

public class CS implements Comparator<Employee> {
    public int compare(Employee lhs, Employee rhs) {
        if (lhs.getFortnightPay() > rhs.getFortnightPay()) {
            return 1;
        } else if (lhs.getFortnightPay() < rhs.getFortnightPay()) {
            return -1;
        } else {
            return 0;
        }
    }
}

package com.lixin.stock.compares;

import java.time.LocalDate;
import java.util.Comparator;

public class TimeCompare implements Comparator<LocalDate> {

    @Override
    public int compare(LocalDate o1, LocalDate o2) {
        if (o1.isAfter(o2)) {
            return 1;
        } else if (o1.equals(o2)) {
            return 0;
        } else {
            return -1;
        }
    }
}

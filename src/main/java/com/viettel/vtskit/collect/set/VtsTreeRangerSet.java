package com.viettel.vtskit.collect.set;

import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;

import java.util.TreeMap;

public final class VtsTreeRangerSet {
    public static <C extends Comparable<?>> TreeRangeSet<C> create() {
        return TreeRangeSet.create();
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(RangeSet<C> rangeSet) {
        TreeRangeSet<C> result = create();
        result.addAll(rangeSet);
        return result;
    }
}

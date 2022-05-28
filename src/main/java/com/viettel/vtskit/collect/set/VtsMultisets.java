package com.viettel.vtskit.collect.set;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.TreeRangeSet;
import org.checkerframework.checker.nullness.qual.Nullable;

public class VtsMultisets {
    public static  <E extends @Nullable Object> HashMultiset<E> create() {
        return HashMultiset.create();
    }
}

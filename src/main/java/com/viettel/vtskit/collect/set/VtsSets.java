package com.viettel.vtskit.collect.set;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.List;
import java.util.Set;

public final class VtsSets {
    private static <E extends @Nullable Object> Sets.SetView<E> union(final Set<? extends E> set1, final Set<? extends E> set2){
        return Sets.union(set1 , set2);
    }

    private static <B> Set<List<B>> cartesianProduct(List<? extends Set<? extends B>> sets){
        return Sets.cartesianProduct(sets);
    }

    private static <E extends @Nullable Object> Sets.SetView<E> intersection(final Set<E> set1, final Set<?> set2){
        return Sets.intersection(set1, set2);
    }

    private static <E extends @Nullable Object> Sets.SetView<E> symmetricDifference(final Set<? extends E> set1, final Set<? extends E> set2){
        return Sets.symmetricDifference(set1, set2);
    }

    private static <E> Set<Set<E>> powerSet(Set<E> set){
        return Sets.powerSet(set);
    }
}

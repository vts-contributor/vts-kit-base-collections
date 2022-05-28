package com.viettel.vtskit.collect.list;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.List;

public final class VtsLists {
    private static <T extends @Nullable Object> List<List<T>> partition(List<T> list, int size){
        return Lists.partition(list, size);
    }

    private static <T extends @Nullable Object> List<T> reverse(List<T> list){
        return Lists.reverse(list);
    }

    private static ImmutableList<Character> charactersOf(String string){
        return Lists.charactersOf(string);
    }
}

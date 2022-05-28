package com.viettel.vtskit.collect.map;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.HashBiMap;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Map;

public final class VtsHashBiMap {
    public static <K extends @Nullable Object, V extends @Nullable Object> HashBiMap<K, V> create(
            Map<? extends K, ? extends V> map) {
        return HashBiMap.create();
    }
}

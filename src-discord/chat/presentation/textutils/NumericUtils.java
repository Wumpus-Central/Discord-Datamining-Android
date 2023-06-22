package com.discord.chat.presentation.textutils;

import bh.j;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import oj.v;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/discord/chat/presentation/textutils/NumericUtils;", "", "()V", "letters", "", "", "romanNumeralMap", "Ljava/util/TreeMap;", "", "toLetter", "number", "toRomanNumeral", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NumericUtils {
    public static final NumericUtils INSTANCE = new NumericUtils();
    private static final List<String> letters;
    private static final TreeMap<Long, String> romanNumeralMap;

    static {
        List z02;
        boolean z10;
        z02 = v.z0("abcdefghijklmnopqrstuvwxyz", new String[]{""}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : z02) {
            if (((String) obj).length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                arrayList.add(obj);
            }
        }
        letters = arrayList;
        TreeMap<Long, String> treeMap = new TreeMap<>();
        romanNumeralMap = treeMap;
        treeMap.put(1000L, "m");
        treeMap.put(900L, "cm");
        treeMap.put(500L, "d");
        treeMap.put(400L, "cm");
        treeMap.put(100L, "c");
        treeMap.put(90L, "xc");
        treeMap.put(50L, "l");
        treeMap.put(40L, "xl");
        treeMap.put(10L, "x");
        treeMap.put(9L, "ix");
        treeMap.put(5L, "v");
        treeMap.put(4L, "iv");
        treeMap.put(1L, "i");
    }

    private NumericUtils() {
    }

    public final String toLetter(long j10) {
        boolean z10;
        long d10;
        if (j10 >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException(("Number must be at least 1. Provided: " + j10).toString());
        } else if (j10 <= 26) {
            return letters.get(((int) j10) - 1);
        } else {
            long j11 = 26;
            long j12 = j10 / j11;
            d10 = j.d(j10 % j11, 1L);
            return toLetter(j12) + toLetter(d10);
        }
    }

    public final String toRomanNumeral(long j10) {
        boolean z10;
        if (j10 >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            TreeMap<Long, String> treeMap = romanNumeralMap;
            Long floorKey = treeMap.floorKey(Long.valueOf(j10));
            q.d(floorKey);
            long longValue = floorKey.longValue();
            if (j10 == longValue) {
                String str = treeMap.get(Long.valueOf(j10));
                q.d(str);
                q.f(str, "{\n            romanNumeralMap[number]!!\n        }");
                return str;
            }
            String str2 = treeMap.get(Long.valueOf(longValue));
            String romanNumeral = toRomanNumeral(j10 - longValue);
            return ((Object) str2) + romanNumeral;
        }
        throw new IllegalArgumentException(("Number must be at least 1. Provided: " + j10).toString());
    }
}

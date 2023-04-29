package com.discord.chat.presentation.textutils;

import com.facebook.react.views.text.TypefaceStyle;
import com.reactnativecommunity.webview.RNCWebViewManager;
import eg.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import ri.v;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/discord/chat/presentation/textutils/NumericUtils;", "", "()V", "letters", "", "", "romanNumeralMap", "Ljava/util/TreeMap;", "", "toLetter", "number", "toRomanNumeral", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NumericUtils {
    public static final NumericUtils INSTANCE = new NumericUtils();
    private static final List<String> letters;
    private static final TreeMap<Integer, String> romanNumeralMap;

    static {
        List z02;
        z02 = v.z0("abcdefghijklmnopqrstuvwxyz", new String[]{""}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        Iterator it = z02.iterator();
        while (true) {
            boolean z10 = true;
            if (it.hasNext()) {
                Object next = it.next();
                if (((String) next).length() != 0) {
                    z10 = false;
                }
                if (!z10) {
                    arrayList.add(next);
                }
            } else {
                letters = arrayList;
                TreeMap<Integer, String> treeMap = new TreeMap<>();
                romanNumeralMap = treeMap;
                treeMap.put(Integer.valueOf((int) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA), "m");
                treeMap.put(900, "cm");
                treeMap.put(500, "d");
                treeMap.put(Integer.valueOf((int) TypefaceStyle.NORMAL), "cm");
                treeMap.put(100, "c");
                treeMap.put(90, "xc");
                treeMap.put(50, "l");
                treeMap.put(40, "xl");
                treeMap.put(10, "x");
                treeMap.put(9, "ix");
                treeMap.put(5, "v");
                treeMap.put(4, "iv");
                treeMap.put(1, "i");
                return;
            }
        }
    }

    private NumericUtils() {
    }

    public final String toLetter(int i10) {
        boolean z10;
        int c10;
        if (i10 >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException(("Number must be at least 1. Provided: " + i10).toString());
        } else if (i10 <= 26) {
            return letters.get(i10 - 1);
        } else {
            int i11 = i10 / 26;
            c10 = j.c(i10 % 26, 1);
            return toLetter(i11) + toLetter(c10);
        }
    }

    public final String toRomanNumeral(int i10) {
        boolean z10 = true;
        if (i10 < 1) {
            z10 = false;
        }
        if (z10) {
            TreeMap<Integer, String> treeMap = romanNumeralMap;
            Integer floorKey = treeMap.floorKey(Integer.valueOf(i10));
            q.d(floorKey);
            int intValue = floorKey.intValue();
            if (i10 == intValue) {
                String str = treeMap.get(Integer.valueOf(i10));
                q.d(str);
                q.f(str, "{\n            romanNumeralMap[number]!!\n        }");
                return str;
            }
            String str2 = treeMap.get(Integer.valueOf(intValue));
            String romanNumeral = toRomanNumeral(i10 - intValue);
            return ((Object) str2) + romanNumeral;
        }
        throw new IllegalArgumentException(("Number must be at least 1. Provided: " + i10).toString());
    }
}

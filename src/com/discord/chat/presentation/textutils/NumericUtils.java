package com.discord.chat.presentation.textutils;

import com.facebook.react.views.text.TypefaceStyle;
import com.reactnativecommunity.webview.RNCWebViewManager;
import eg.C6322j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import p327ri.C12588v;

@Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m15073d2 = {"Lcom/discord/chat/presentation/textutils/NumericUtils;", "", "()V", "letters", "", "", "romanNumeralMap", "Ljava/util/TreeMap;", "", "toLetter", "number", "toRomanNumeral", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class NumericUtils {
    public static final NumericUtils INSTANCE = new NumericUtils();
    private static final List<String> letters;
    private static final TreeMap<Integer, String> romanNumeralMap;

    static {
        List z0;
        z0 = C12588v.m5660z0("abcdefghijklmnopqrstuvwxyz", new String[]{""}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        Iterator it = z0.iterator();
        while (true) {
            boolean z = true;
            if (it.hasNext()) {
                Object next = it.next();
                if (((String) next).length() != 0) {
                    z = false;
                }
                if (!z) {
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

    public final String toLetter(int i) {
        boolean z;
        int c;
        if (i >= 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Number must be at least 1. Provided: " + i).toString());
        } else if (i <= 26) {
            return letters.get(i - 1);
        } else {
            int i2 = i / 26;
            c = C6322j.m23961c(i % 26, 1);
            return toLetter(i2) + toLetter(c);
        }
    }

    public final String toRomanNumeral(int i) {
        boolean z = true;
        if (i < 1) {
            z = false;
        }
        if (z) {
            TreeMap<Integer, String> treeMap = romanNumeralMap;
            Integer floorKey = treeMap.floorKey(Integer.valueOf(i));
            C9677q.m14636d(floorKey);
            int intValue = floorKey.intValue();
            if (i == intValue) {
                String str = treeMap.get(Integer.valueOf(i));
                C9677q.m14636d(str);
                C9677q.m14634f(str, "{\n            romanNumeralMap[number]!!\n        }");
                return str;
            }
            String str2 = treeMap.get(Integer.valueOf(intValue));
            String romanNumeral = toRomanNumeral(i - intValue);
            return ((Object) str2) + romanNumeral;
        }
        throw new IllegalArgumentException(("Number must be at least 1. Provided: " + i).toString());
    }
}

package com.discord.misc.utilities.size;

import android.content.res.Resources;
import bg.C2362c;
import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\t\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00018G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005\"\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0005¨\u0006\u000b"}, m15073d2 = {"dpToPx", "", "", "getDpToPx", "(F)I", "(I)I", "pxToDp", "getPxToDp", "(I)F", "spToPx", "getSpToPx", "misc_utilities_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class SizeUtilsKt {
    public static final int getDpToPx(int i) {
        return getDpToPx(i);
    }

    public static final float getPxToDp(int i) {
        return i / Resources.getSystem().getDisplayMetrics().density;
    }

    public static final int getSpToPx(int i) {
        int a;
        a = C2362c.m34305a(i * Resources.getSystem().getDisplayMetrics().scaledDensity);
        return a;
    }

    public static final int getDpToPx(float f) {
        int a;
        a = C2362c.m34305a(f * Resources.getSystem().getDisplayMetrics().density);
        return a;
    }
}

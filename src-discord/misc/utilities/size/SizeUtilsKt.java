package com.discord.misc.utilities.size;

import android.content.res.Resources;
import kotlin.Metadata;
import yf.c;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\t\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00018G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005\"\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0005¨\u0006\u000b"}, d2 = {"dpToPx", "", "", "getDpToPx", "(F)I", "(I)I", "pxToDp", "getPxToDp", "(I)F", "spToPx", "getSpToPx", "misc_utilities_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class SizeUtilsKt {
    public static final int getDpToPx(int i10) {
        return getDpToPx(i10);
    }

    public static final float getPxToDp(int i10) {
        return i10 / Resources.getSystem().getDisplayMetrics().density;
    }

    public static final int getSpToPx(int i10) {
        int b10;
        b10 = c.b(i10 * Resources.getSystem().getDisplayMetrics().scaledDensity);
        return b10;
    }

    public static final int getDpToPx(float f10) {
        int b10;
        b10 = c.b(f10 * Resources.getSystem().getDisplayMetrics().density);
        return b10;
    }
}

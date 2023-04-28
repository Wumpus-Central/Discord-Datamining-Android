package p383v8;

import android.text.Spannable;

/* renamed from: v8.c */
/* loaded from: classes7.dex */
public final class C13454c {
    /* renamed from: a */
    public static void m3648a(Spannable spannable, Object obj, int i, int i2, int i3) {
        Object[] spans;
        for (Object obj2 : spannable.getSpans(i, i2, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i && spannable.getSpanEnd(obj2) == i2 && spannable.getSpanFlags(obj2) == i3) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i, i2, i3);
    }
}

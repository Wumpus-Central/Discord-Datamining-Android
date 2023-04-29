package com.discord.span.utilities;

import android.text.Spannable;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\u0002H\u0086\b¨\u0006\b"}, d2 = {"coverWithSpan", "", "Landroid/text/Spannable;", "what", "", "hasSpan", "", "T", "span_utilities_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SpannableExtensionsKt {
    public static final void coverWithSpan(Spannable spannable, Object what) {
        q.g(spannable, "<this>");
        q.g(what, "what");
        spannable.setSpan(what, 0, spannable.length(), 18);
    }

    public static final /* synthetic */ <T> boolean hasSpan(Spannable spannable) {
        q.g(spannable, "<this>");
        int length = spannable.length();
        q.m(4, "T");
        boolean z10 = false;
        Object[] spans = spannable.getSpans(0, length, Object.class);
        q.f(spans, "getSpans(0, length, T::class.java)");
        if (spans.length == 0) {
            z10 = true;
        }
        return !z10;
    }
}

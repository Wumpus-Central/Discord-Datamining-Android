package com.discord.span.utilities;

import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import ji.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001aC\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0005\"\u0004\u0018\u00010\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aM\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0005\"\u0004\u0018\u00010\u00012\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\r\u001a$\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0007H\u0086\bø\u0001\u0000\u001a$\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0007H\u0086\bø\u0001\u0000\u001a$\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0007H\u0086\bø\u0001\u0000\u001a$\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0007H\u0086\bø\u0001\u0000\u001a\n\u0010\u0013\u001a\u00020\u0012*\u00020\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Landroid/text/SpannableStringBuilder;", "", "span", "", "ensureNewline", "", "spans", "Lkotlin/Function1;", "action", "wrapIn", "(Landroid/text/SpannableStringBuilder;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Landroid/text/SpannableStringBuilder;", "", "priority", "(Landroid/text/SpannableStringBuilder;[Ljava/lang/Object;ILkotlin/jvm/functions/Function1;)Landroid/text/SpannableStringBuilder;", "bold", "italic", "underline", "strikeThrough", "", "debugSpans", "span_utilities_release"}, k = 2, mv = {1, 8, 0})

public final class SpannableStringBuilderExtensionsKt {
    public static final SpannableStringBuilder bold(SpannableStringBuilder spannableStringBuilder, Function1<? super SpannableStringBuilder, Unit> action) {
        q.g(spannableStringBuilder, "<this>");
        q.g(action, "action");
        Object[] objArr = {new StyleSpan(1)};
        int length = spannableStringBuilder.length();
        action.invoke(spannableStringBuilder);
        Object obj = objArr[0];
        if (obj != null) {
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public static final String debugSpans(SpannableStringBuilder spannableStringBuilder) {
        String c02;
        q.g(spannableStringBuilder, "<this>");
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
        q.f(spans, "getSpans(\n        0,\n   …Object::class.java,\n    )");
        c02 = f.c0(spans, null, null, null, 0, null, SpannableStringBuilderExtensionsKt$debugSpans$1.INSTANCE, 31, null);
        return c02;
    }

    public static final void ensureNewline(SpannableStringBuilder spannableStringBuilder, Object obj) {
        boolean z10;
        Character Y0;
        q.g(spannableStringBuilder, "<this>");
        if (spannableStringBuilder.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Y0 = x.Y0(spannableStringBuilder);
            if (Y0 == null || Y0.charValue() != '\n') {
                if (obj != null) {
                    Object[] objArr = {obj};
                    int length = spannableStringBuilder.length();
                    q.f(spannableStringBuilder.append('\n'), "append('\\n')");
                    Object obj2 = objArr[0];
                    if (obj2 != null) {
                        spannableStringBuilder.setSpan(obj2, length, spannableStringBuilder.length(), 33);
                        return;
                    }
                    return;
                }
                q.f(spannableStringBuilder.append('\n'), "append('\\n')");
            }
        }
    }

    public static  void ensureNewline$default(SpannableStringBuilder spannableStringBuilder, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        ensureNewline(spannableStringBuilder, obj);
    }

    public static final SpannableStringBuilder italic(SpannableStringBuilder spannableStringBuilder, Function1<? super SpannableStringBuilder, Unit> action) {
        q.g(spannableStringBuilder, "<this>");
        q.g(action, "action");
        Object[] objArr = {new StyleSpan(2)};
        int length = spannableStringBuilder.length();
        action.invoke(spannableStringBuilder);
        Object obj = objArr[0];
        if (obj != null) {
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder strikeThrough(SpannableStringBuilder spannableStringBuilder, Function1<? super SpannableStringBuilder, Unit> action) {
        q.g(spannableStringBuilder, "<this>");
        q.g(action, "action");
        Object[] objArr = {new StrikethroughSpan()};
        int length = spannableStringBuilder.length();
        action.invoke(spannableStringBuilder);
        Object obj = objArr[0];
        if (obj != null) {
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder underline(SpannableStringBuilder spannableStringBuilder, Function1<? super SpannableStringBuilder, Unit> action) {
        q.g(spannableStringBuilder, "<this>");
        q.g(action, "action");
        Object[] objArr = {new UnderlineSpan()};
        int length = spannableStringBuilder.length();
        action.invoke(spannableStringBuilder);
        Object obj = objArr[0];
        if (obj != null) {
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder wrapIn(SpannableStringBuilder spannableStringBuilder, Object[] spans, Function1<? super SpannableStringBuilder, Unit> action) {
        q.g(spannableStringBuilder, "<this>");
        q.g(spans, "spans");
        q.g(action, "action");
        int length = spannableStringBuilder.length();
        action.invoke(spannableStringBuilder);
        for (Object obj : spans) {
            if (obj != null) {
                spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 33);
            }
        }
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder wrapIn(SpannableStringBuilder spannableStringBuilder, Object[] spans, int i10, Function1<? super SpannableStringBuilder, Unit> action) {
        q.g(spannableStringBuilder, "<this>");
        q.g(spans, "spans");
        q.g(action, "action");
        int i11 = (i10 << 16) | 33;
        int length = spannableStringBuilder.length();
        action.invoke(spannableStringBuilder);
        for (Object obj : spans) {
            if (obj != null) {
                spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), i11);
            }
        }
        return spannableStringBuilder;
    }
}

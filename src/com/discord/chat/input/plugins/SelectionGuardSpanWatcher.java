package com.discord.chat.input.plugins;

import android.text.Selection;
import android.text.SpanWatcher;
import android.text.Spannable;
import com.discord.chat.input.spans.DCDNoSelectionSpan;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0002\u0010\nJ,\u0010\u000b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016J<\u0010\u0010\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0016J,\u0010\u0015\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016¨\u0006\u0016"}, m15073d2 = {"Lcom/discord/chat/input/plugins/SelectionGuardSpanWatcher;", "Landroid/text/SpanWatcher;", "()V", "checkSelections", "", "text", "Landroid/text/Spannable;", "selectionStart", "", "selectionEnd", "(Landroid/text/Spannable;Ljava/lang/Integer;Ljava/lang/Integer;)V", "onSpanAdded", "what", "", ViewProps.START, ViewProps.END, "onSpanChanged", "ostart", "oend", "nstart", "nend", "onSpanRemoved", "chat_input_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class SelectionGuardSpanWatcher implements SpanWatcher {
    private final void checkSelections(Spannable spannable, Integer num, Integer num2) {
        int i;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        if (!(num == null && num2 == null)) {
            boolean z3 = false;
            if (num != null) {
                i = num.intValue();
            } else if (num2 != null) {
                i = num2.intValue();
            } else {
                i = 0;
            }
            if (num2 != null) {
                i2 = num2.intValue();
            } else if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            Object[] spans = spannable.getSpans(i, i2, DCDNoSelectionSpan.class);
            C9971q.m14634f(spans, "getSpans(start, end, T::class.java)");
            DCDNoSelectionSpan[] dCDNoSelectionSpanArr = (DCDNoSelectionSpan[]) spans;
            if (dCDNoSelectionSpanArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (num != null) {
                    i3 = num.intValue();
                } else if (num2 != null) {
                    i3 = num2.intValue();
                } else {
                    i3 = 0;
                }
                boolean z4 = false;
                for (DCDNoSelectionSpan dCDNoSelectionSpan : dCDNoSelectionSpanArr) {
                    int spanEnd = spannable.getSpanEnd(dCDNoSelectionSpan);
                    int spanStart = spannable.getSpanStart(dCDNoSelectionSpan);
                    if (i3 > spanStart && i3 < spanEnd) {
                        if (spanEnd - i3 > i3 - spanStart) {
                            spanEnd = spanStart;
                        }
                        z4 = true;
                        i3 = spanEnd;
                    }
                }
                if (num == null || num.intValue() == i3) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!(num2 == null || num2.intValue() == i3)) {
                    z3 = true;
                }
                if (!z4) {
                    return;
                }
                if (z3 || z2) {
                    Selection.setSelection(spannable, i3);
                }
            }
        }
    }

    @Override // android.text.SpanWatcher
    public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if (spannable != null && (obj instanceof DCDNoSelectionSpan)) {
            checkSelections(spannable, Integer.valueOf(spannable.getSpanStart(Selection.SELECTION_START)), Integer.valueOf(spannable.getSpanEnd(Selection.SELECTION_END)));
        }
    }

    @Override // android.text.SpanWatcher
    public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        if (spannable != null) {
            if (C9971q.m14638b(obj, Selection.SELECTION_START)) {
                checkSelections(spannable, Integer.valueOf(i3), null);
            } else if (C9971q.m14638b(obj, Selection.SELECTION_END)) {
                checkSelections(spannable, null, Integer.valueOf(i3));
            }
        }
    }

    @Override // android.text.SpanWatcher
    public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
    }
}

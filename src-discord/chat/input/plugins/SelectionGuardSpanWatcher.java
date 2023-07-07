package com.discord.chat.input.plugins;

import android.text.Selection;
import android.text.SpanWatcher;
import android.text.Spannable;
import com.discord.chat.input.spans.DCDNoSelectionSpan;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0002\u0010\nJ,\u0010\u000b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016J<\u0010\u0010\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0016J,\u0010\u0015\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016¨\u0006\u0016"}, d2 = {"Lcom/discord/chat/input/plugins/SelectionGuardSpanWatcher;", "Landroid/text/SpanWatcher;", "()V", "checkSelections", "", "text", "Landroid/text/Spannable;", "selectionStart", "", "selectionEnd", "(Landroid/text/Spannable;Ljava/lang/Integer;Ljava/lang/Integer;)V", "onSpanAdded", "what", "", ViewProps.START, ViewProps.END, "onSpanChanged", "ostart", "oend", "nstart", "nend", "onSpanRemoved", "chat_input_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelectionGuardSpanWatcher implements SpanWatcher {
    private final void checkSelections(Spannable spannable, Integer num, Integer num2) {
        int i10;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        if (!(num == null && num2 == null)) {
            boolean z12 = false;
            if (num != null) {
                i10 = num.intValue();
            } else if (num2 != null) {
                i10 = num2.intValue();
            } else {
                i10 = 0;
            }
            if (num2 != null) {
                i11 = num2.intValue();
            } else if (num != null) {
                i11 = num.intValue();
            } else {
                i11 = 0;
            }
            Object[] spans = spannable.getSpans(i10, i11, DCDNoSelectionSpan.class);
            q.f(spans, "getSpans(start, end, T::class.java)");
            DCDNoSelectionSpan[] dCDNoSelectionSpanArr = (DCDNoSelectionSpan[]) spans;
            if (dCDNoSelectionSpanArr.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (num != null) {
                    i12 = num.intValue();
                } else if (num2 != null) {
                    i12 = num2.intValue();
                } else {
                    i12 = 0;
                }
                boolean z13 = false;
                for (DCDNoSelectionSpan dCDNoSelectionSpan : dCDNoSelectionSpanArr) {
                    int spanEnd = spannable.getSpanEnd(dCDNoSelectionSpan);
                    int spanStart = spannable.getSpanStart(dCDNoSelectionSpan);
                    if (i12 > spanStart && i12 < spanEnd) {
                        if (spanEnd - i12 > i12 - spanStart) {
                            spanEnd = spanStart;
                        }
                        z13 = true;
                        i12 = spanEnd;
                    }
                }
                if (num == null || num.intValue() == i12) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!(num2 == null || num2.intValue() == i12)) {
                    z12 = true;
                }
                if (!z13) {
                    return;
                }
                if (z12 || z11) {
                    Selection.setSelection(spannable, i12);
                }
            }
        }
    }

    @Override // android.text.SpanWatcher
    public void onSpanAdded(Spannable spannable, Object obj, int i10, int i11) {
        if (spannable != null && (obj instanceof DCDNoSelectionSpan)) {
            checkSelections(spannable, Integer.valueOf(spannable.getSpanStart(Selection.SELECTION_START)), Integer.valueOf(spannable.getSpanEnd(Selection.SELECTION_END)));
        }
    }

    @Override // android.text.SpanWatcher
    public void onSpanChanged(Spannable spannable, Object obj, int i10, int i11, int i12, int i13) {
        if (spannable != null) {
            if (q.b(obj, Selection.SELECTION_START)) {
                checkSelections(spannable, Integer.valueOf(i12), null);
            } else if (q.b(obj, Selection.SELECTION_END)) {
                checkSelections(spannable, null, Integer.valueOf(i12));
            }
        }
    }

    @Override // android.text.SpanWatcher
    public void onSpanRemoved(Spannable spannable, Object obj, int i10, int i11) {
    }
}

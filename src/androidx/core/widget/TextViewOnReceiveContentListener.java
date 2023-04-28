package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.AbstractC2702s0;
import androidx.core.view.ContentInfoCompat;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;

/* loaded from: classes.dex */
public final class TextViewOnReceiveContentListener implements AbstractC2702s0 {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.widget.TextViewOnReceiveContentListener$a */
    /* loaded from: classes.dex */
    public static final class C2780a {
        /* renamed from: a */
        static CharSequence m36768a(Context context, ClipData.Item item, int i) {
            if ((i & 1) == 0) {
                return item.coerceToStyledText(context);
            }
            CharSequence coerceToText = item.coerceToText(context);
            if (coerceToText instanceof Spanned) {
                return coerceToText.toString();
            }
            return coerceToText;
        }
    }

    /* renamed from: b */
    private static CharSequence m36770b(Context context, ClipData.Item item, int i) {
        return C2780a.m36768a(context, item, i);
    }

    /* renamed from: c */
    private static void m36769c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @Override // androidx.core.view.AbstractC2702s0
    /* renamed from: a */
    public ContentInfoCompat mo32330a(View view, ContentInfoCompat contentInfoCompat) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + contentInfoCompat);
        }
        if (contentInfoCompat.m37571g() == 2) {
            return contentInfoCompat;
        }
        ClipData c = contentInfoCompat.m37575c();
        int e = contentInfoCompat.m37573e();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < c.getItemCount(); i++) {
            CharSequence b = m36770b(context, c.getItemAt(i), e);
            if (b != null) {
                if (!z) {
                    m36769c(editable, b);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                    editable.insert(Selection.getSelectionEnd(editable), b);
                }
            }
        }
        return null;
    }
}

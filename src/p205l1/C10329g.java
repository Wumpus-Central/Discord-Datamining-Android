package p205l1;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C2863d;
import com.facebook.react.uimanager.ViewDefaults;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: l1.g */
/* loaded from: classes.dex */
final class C10329g implements TextWatcher {

    /* renamed from: k */
    private final EditText f22642k;

    /* renamed from: l */
    private final boolean f22643l;

    /* renamed from: m */
    private C2863d.AbstractC2867e f22644m;

    /* renamed from: n */
    private int f22645n = ViewDefaults.NUMBER_OF_LINES;

    /* renamed from: o */
    private int f22646o = 0;

    /* renamed from: p */
    private boolean f22647p = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l1.g$a */
    /* loaded from: classes.dex */
    public static class C10330a extends C2863d.AbstractC2867e {

        /* renamed from: a */
        private final Reference<EditText> f22648a;

        C10330a(EditText editText) {
            this.f22648a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.C2863d.AbstractC2867e
        /* renamed from: b */
        public void mo13601b() {
            super.mo13601b();
            C10329g.m13604c(this.f22648a.get(), 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10329g(EditText editText, boolean z) {
        this.f22642k = editText;
        this.f22643l = z;
    }

    /* renamed from: a */
    private C2863d.AbstractC2867e m13606a() {
        if (this.f22644m == null) {
            this.f22644m = new C10330a(this.f22642k);
        }
        return this.f22644m;
    }

    /* renamed from: c */
    static void m13604c(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C2863d.m36464b().m36451o(editableText);
            C10321d.m13628b(editableText, selectionStart, selectionEnd);
        }
    }

    /* renamed from: e */
    private boolean m13602e() {
        return !this.f22647p || (!this.f22643l && !C2863d.m36458h());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    /* renamed from: b */
    public boolean m13605b() {
        return this.f22647p;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: d */
    public void m13603d(boolean z) {
        if (this.f22647p != z) {
            if (this.f22644m != null) {
                C2863d.m36464b().m36446t(this.f22644m);
            }
            this.f22647p = z;
            if (z) {
                m13604c(this.f22642k, C2863d.m36464b().m36462d());
            }
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.f22642k.isInEditMode() && !m13602e() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int d = C2863d.m36464b().m36462d();
            if (d != 0) {
                if (d == 1) {
                    C2863d.m36464b().m36448r((Spannable) charSequence, i, i + i3, this.f22645n, this.f22646o);
                    return;
                } else if (d != 3) {
                    return;
                }
            }
            C2863d.m36464b().m36447s(m13606a());
        }
    }
}

package p205l1;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.C2863d;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: l1.d */
/* loaded from: classes.dex */
final class C10321d implements InputFilter {

    /* renamed from: a */
    private final TextView f22631a;

    /* renamed from: b */
    private C2863d.AbstractC2867e f22632b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l1.d$a */
    /* loaded from: classes.dex */
    public static class C10322a extends C2863d.AbstractC2867e {

        /* renamed from: a */
        private final Reference<TextView> f22633a;

        /* renamed from: b */
        private final Reference<C10321d> f22634b;

        C10322a(TextView textView, C10321d dVar) {
            this.f22633a = new WeakReference(textView);
            this.f22634b = new WeakReference(dVar);
        }

        /* renamed from: c */
        private boolean m13627c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.C2863d.AbstractC2867e
        /* renamed from: b */
        public void mo13601b() {
            super.mo13601b();
            TextView textView = this.f22633a.get();
            if (m13627c(textView, this.f22634b.get()) && textView.isAttachedToWindow()) {
                CharSequence o = C2863d.m36464b().m36451o(textView.getText());
                int selectionStart = Selection.getSelectionStart(o);
                int selectionEnd = Selection.getSelectionEnd(o);
                textView.setText(o);
                if (o instanceof Spannable) {
                    C10321d.m13628b((Spannable) o, selectionStart, selectionEnd);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10321d(TextView textView) {
        this.f22631a = textView;
    }

    /* renamed from: a */
    private C2863d.AbstractC2867e m13629a() {
        if (this.f22632b == null) {
            this.f22632b = new C10322a(this.f22631a, this);
        }
        return this.f22632b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m13628b(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.f22631a.isInEditMode()) {
            return charSequence;
        }
        int d = C2863d.m36464b().m36462d();
        if (d != 0) {
            boolean z = true;
            if (d == 1) {
                if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.f22631a.getText()) {
                    z = false;
                }
                if (!z || charSequence == null) {
                    return charSequence;
                }
                if (!(i == 0 && i2 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C2863d.m36464b().m36450p(charSequence, 0, charSequence.length());
            } else if (d != 3) {
                return charSequence;
            }
        }
        C2863d.m36464b().m36447s(m13629a());
        return charSequence;
    }
}

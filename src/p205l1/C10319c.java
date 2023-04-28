package p205l1;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.C2863d;

/* renamed from: l1.c */
/* loaded from: classes.dex */
final class C10319c extends InputConnectionWrapper {

    /* renamed from: a */
    private final TextView f22629a;

    /* renamed from: b */
    private final C10320a f22630b;

    /* renamed from: l1.c$a */
    /* loaded from: classes.dex */
    public static class C10320a {
        /* renamed from: a */
        public boolean m13631a(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
            return C2863d.m36461e(inputConnection, editable, i, i2, z);
        }

        /* renamed from: b */
        public void m13630b(EditorInfo editorInfo) {
            if (C2863d.m36458h()) {
                C2863d.m36464b().m36445u(editorInfo);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10319c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new C10320a());
    }

    /* renamed from: a */
    private Editable m13632a() {
        return this.f22629a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        if (this.f22630b.m13631a(this, m13632a(), i, i2, false) || super.deleteSurroundingText(i, i2)) {
            return true;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        if (this.f22630b.m13631a(this, m13632a(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2)) {
            return true;
        }
        return false;
    }

    C10319c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, C10320a aVar) {
        super(inputConnection, false);
        this.f22629a = textView;
        this.f22630b = aVar;
        aVar.m13630b(editorInfo);
    }
}

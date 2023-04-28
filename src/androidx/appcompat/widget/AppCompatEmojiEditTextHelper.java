package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import p052d.C6388j;
import p205l1.C10316a;

/* loaded from: classes.dex */
class AppCompatEmojiEditTextHelper {

    /* renamed from: a */
    private final EditText f1132a;

    /* renamed from: b */
    private final C10316a f1133b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppCompatEmojiEditTextHelper(EditText editText) {
        this.f1132a = editText;
        this.f1133b = new C10316a(editText, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public KeyListener m40499a(KeyListener keyListener) {
        if (m40498b(keyListener)) {
            return this.f1133b.m13640a(keyListener);
        }
        return keyListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m40498b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m40497c() {
        return this.f1133b.m13639b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Finally extract failed */
    /* renamed from: d */
    public void m40496d(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f1132a.getContext().obtainStyledAttributes(attributeSet, C6388j.f13266g0, i, 0);
        try {
            int i2 = C6388j.f13336u0;
            boolean z = true;
            if (obtainStyledAttributes.hasValue(i2)) {
                z = obtainStyledAttributes.getBoolean(i2, true);
            }
            obtainStyledAttributes.recycle();
            m40494f(z);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public InputConnection m40495e(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f1133b.m13638c(inputConnection, editorInfo);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m40494f(boolean z) {
        this.f1133b.m13637d(z);
    }
}

package p205l1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.C2863d;

/* renamed from: l1.e */
/* loaded from: classes.dex */
final class C10323e implements KeyListener {

    /* renamed from: a */
    private final KeyListener f22635a;

    /* renamed from: b */
    private final C10324a f22636b;

    /* renamed from: l1.e$a */
    /* loaded from: classes.dex */
    public static class C10324a {
        /* renamed from: a */
        public boolean m13626a(Editable editable, int i, KeyEvent keyEvent) {
            return C2863d.m36460f(editable, i, keyEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10323e(KeyListener keyListener) {
        this(keyListener, new C10324a());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i) {
        this.f22635a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f22635a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        if (this.f22636b.m13626a(editable, i, keyEvent) || this.f22635a.onKeyDown(view, editable, i, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f22635a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f22635a.onKeyUp(view, editable, i, keyEvent);
    }

    C10323e(KeyListener keyListener, C10324a aVar) {
        this.f22635a = keyListener;
        this.f22636b = aVar;
    }
}

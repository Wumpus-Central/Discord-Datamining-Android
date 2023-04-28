package p205l1;

import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.util.C2517g;
import com.facebook.react.uimanager.ViewDefaults;

/* renamed from: l1.a */
/* loaded from: classes.dex */
public final class C10316a {

    /* renamed from: a */
    private final C10317b f22621a;

    /* renamed from: b */
    private int f22622b = ViewDefaults.NUMBER_OF_LINES;

    /* renamed from: c */
    private int f22623c = 0;

    /* renamed from: l1.a$a */
    /* loaded from: classes.dex */
    private static class C0321a extends C10317b {

        /* renamed from: a */
        private final EditText f22624a;

        /* renamed from: b */
        private final C10329g f22625b;

        C0321a(EditText editText, boolean z) {
            this.f22624a = editText;
            C10329g gVar = new C10329g(editText, z);
            this.f22625b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(C10318b.getInstance());
        }

        @Override // p205l1.C10316a.C10317b
        /* renamed from: a */
        KeyListener mo13636a(KeyListener keyListener) {
            if (keyListener instanceof C10323e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return new C10323e(keyListener);
        }

        @Override // p205l1.C10316a.C10317b
        /* renamed from: b */
        boolean mo13635b() {
            return this.f22625b.m13605b();
        }

        @Override // p205l1.C10316a.C10317b
        /* renamed from: c */
        InputConnection mo13634c(InputConnection inputConnection, EditorInfo editorInfo) {
            if (inputConnection instanceof C10319c) {
                return inputConnection;
            }
            return new C10319c(this.f22624a, inputConnection, editorInfo);
        }

        @Override // p205l1.C10316a.C10317b
        /* renamed from: d */
        void mo13633d(boolean z) {
            this.f22625b.m13603d(z);
        }
    }

    /* renamed from: l1.a$b */
    /* loaded from: classes.dex */
    static class C10317b {
        C10317b() {
        }

        /* renamed from: a */
        KeyListener mo13636a(KeyListener keyListener) {
            throw null;
        }

        /* renamed from: b */
        boolean mo13635b() {
            throw null;
        }

        /* renamed from: c */
        InputConnection mo13634c(InputConnection inputConnection, EditorInfo editorInfo) {
            throw null;
        }

        /* renamed from: d */
        void mo13633d(boolean z) {
            throw null;
        }
    }

    public C10316a(EditText editText, boolean z) {
        C2517g.m37587h(editText, "editText cannot be null");
        this.f22621a = new C0321a(editText, z);
    }

    /* renamed from: a */
    public KeyListener m13640a(KeyListener keyListener) {
        return this.f22621a.mo13636a(keyListener);
    }

    /* renamed from: b */
    public boolean m13639b() {
        return this.f22621a.mo13635b();
    }

    /* renamed from: c */
    public InputConnection m13638c(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f22621a.mo13634c(inputConnection, editorInfo);
    }

    /* renamed from: d */
    public void m13637d(boolean z) {
        this.f22621a.mo13633d(z);
    }
}

package p205l1;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.C2889m;

/* renamed from: l1.b */
/* loaded from: classes.dex */
final class C10318b extends Editable.Factory {

    /* renamed from: a */
    private static final Object f22626a = new Object();

    /* renamed from: b */
    private static volatile Editable.Factory f22627b;

    /* renamed from: c */
    private static Class<?> f22628c;

    @SuppressLint({"PrivateApi"})
    private C10318b() {
        try {
            f22628c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C10318b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f22627b == null) {
            synchronized (f22626a) {
                if (f22627b == null) {
                    f22627b = new C10318b();
                }
            }
        }
        return f22627b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f22628c;
        if (cls != null) {
            return C2889m.m36370c(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}

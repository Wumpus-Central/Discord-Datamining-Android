package p315r6;

import android.util.Base64;
import p279p6.EnumC11574d;
import p315r6.C12411d;

/* renamed from: r6.o */
/* loaded from: classes7.dex */
public abstract class AbstractC12430o {

    /* renamed from: r6.o$a */
    /* loaded from: classes7.dex */
    public static abstract class AbstractC12431a {
        /* renamed from: a */
        public abstract AbstractC12430o mo6796a();

        /* renamed from: b */
        public abstract AbstractC12431a mo6795b(String str);

        /* renamed from: c */
        public abstract AbstractC12431a mo6794c(byte[] bArr);

        /* renamed from: d */
        public abstract AbstractC12431a mo6793d(EnumC11574d dVar);
    }

    /* renamed from: a */
    public static AbstractC12431a m6802a() {
        return new C12411d.C12413b().mo6793d(EnumC11574d.DEFAULT);
    }

    /* renamed from: b */
    public abstract String mo6801b();

    /* renamed from: c */
    public abstract byte[] mo6800c();

    /* renamed from: d */
    public abstract EnumC11574d mo6799d();

    /* renamed from: e */
    public boolean m6798e() {
        return mo6800c() != null;
    }

    /* renamed from: f */
    public AbstractC12430o m6797f(EnumC11574d dVar) {
        return m6802a().mo6795b(mo6801b()).mo6793d(dVar).mo6794c(mo6800c()).mo6796a();
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[3];
        objArr[0] = mo6801b();
        objArr[1] = mo6799d();
        if (mo6800c() == null) {
            str = "";
        } else {
            str = Base64.encodeToString(mo6800c(), 2);
        }
        objArr[2] = str;
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}

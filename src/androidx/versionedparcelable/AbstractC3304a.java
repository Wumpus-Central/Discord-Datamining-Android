package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.collection.C2094a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p392w1.AbstractC13726b;

/* renamed from: androidx.versionedparcelable.a */
/* loaded from: classes.dex */
public abstract class AbstractC3304a {

    /* renamed from: a */
    protected final C2094a<String, Method> f5277a;

    /* renamed from: b */
    protected final C2094a<String, Method> f5278b;

    /* renamed from: c */
    protected final C2094a<String, Class> f5279c;

    public AbstractC3304a(C2094a<String, Method> aVar, C2094a<String, Method> aVar2, C2094a<String, Class> aVar3) {
        this.f5277a = aVar;
        this.f5278b = aVar2;
        this.f5279c = aVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N */
    private void m34739N(AbstractC13726b bVar) {
        try {
            mo34719I(m34738c(bVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(bVar.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* renamed from: c */
    private Class m34738c(Class<? extends AbstractC13726b> cls) {
        Class cls2 = this.f5279c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f5279c.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: d */
    private Method m34737d(String str) {
        Method method = this.f5277a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC3304a.class.getClassLoader()).getDeclaredMethod("read", AbstractC3304a.class);
        this.f5277a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: e */
    private Method m34736e(Class cls) {
        Method method = this.f5278b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c = m34738c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c.getDeclaredMethod("write", cls, AbstractC3304a.class);
        this.f5278b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: A */
    protected abstract void mo34723A(byte[] bArr);

    /* renamed from: B */
    public void m34747B(byte[] bArr, int i) {
        mo34709w(i);
        mo34723A(bArr);
    }

    /* renamed from: C */
    protected abstract void mo34722C(CharSequence charSequence);

    /* renamed from: D */
    public void m34746D(CharSequence charSequence, int i) {
        mo34709w(i);
        mo34722C(charSequence);
    }

    /* renamed from: E */
    protected abstract void mo34721E(int i);

    /* renamed from: F */
    public void m34745F(int i, int i2) {
        mo34709w(i2);
        mo34721E(i);
    }

    /* renamed from: G */
    protected abstract void mo34720G(Parcelable parcelable);

    /* renamed from: H */
    public void m34744H(Parcelable parcelable, int i) {
        mo34709w(i);
        mo34720G(parcelable);
    }

    /* renamed from: I */
    protected abstract void mo34719I(String str);

    /* renamed from: J */
    public void m34743J(String str, int i) {
        mo34709w(i);
        mo34719I(str);
    }

    /* renamed from: K */
    protected <T extends AbstractC13726b> void m34742K(T t, AbstractC3304a aVar) {
        try {
            m34736e(t.getClass()).invoke(null, t, aVar);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L */
    public void m34741L(AbstractC13726b bVar) {
        if (bVar == null) {
            mo34719I(null);
            return;
        }
        m34739N(bVar);
        AbstractC3304a b = mo34717b();
        m34742K(bVar, b);
        b.mo34718a();
    }

    /* renamed from: M */
    public void m34740M(AbstractC13726b bVar, int i) {
        mo34709w(i);
        m34741L(bVar);
    }

    /* renamed from: a */
    protected abstract void mo34718a();

    /* renamed from: b */
    protected abstract AbstractC3304a mo34717b();

    /* renamed from: f */
    public boolean m34735f() {
        return false;
    }

    /* renamed from: g */
    protected abstract boolean mo34716g();

    /* renamed from: h */
    public boolean m34734h(boolean z, int i) {
        if (!mo34713m(i)) {
            return z;
        }
        return mo34716g();
    }

    /* renamed from: i */
    protected abstract byte[] mo34715i();

    /* renamed from: j */
    public byte[] m34733j(byte[] bArr, int i) {
        if (!mo34713m(i)) {
            return bArr;
        }
        return mo34715i();
    }

    /* renamed from: k */
    protected abstract CharSequence mo34714k();

    /* renamed from: l */
    public CharSequence m34732l(CharSequence charSequence, int i) {
        if (!mo34713m(i)) {
            return charSequence;
        }
        return mo34714k();
    }

    /* renamed from: m */
    protected abstract boolean mo34713m(int i);

    /* renamed from: n */
    protected <T extends AbstractC13726b> T m34731n(String str, AbstractC3304a aVar) {
        try {
            return (T) ((AbstractC13726b) m34737d(str).invoke(null, aVar));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* renamed from: o */
    protected abstract int mo34712o();

    /* renamed from: p */
    public int m34730p(int i, int i2) {
        if (!mo34713m(i2)) {
            return i;
        }
        return mo34712o();
    }

    /* renamed from: q */
    protected abstract <T extends Parcelable> T mo34711q();

    /* renamed from: r */
    public <T extends Parcelable> T m34729r(T t, int i) {
        if (!mo34713m(i)) {
            return t;
        }
        return (T) mo34711q();
    }

    /* renamed from: s */
    protected abstract String mo34710s();

    /* renamed from: t */
    public String m34728t(String str, int i) {
        if (!mo34713m(i)) {
            return str;
        }
        return mo34710s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public <T extends AbstractC13726b> T m34727u() {
        String s = mo34710s();
        if (s == null) {
            return null;
        }
        return (T) m34731n(s, mo34717b());
    }

    /* renamed from: v */
    public <T extends AbstractC13726b> T m34726v(T t, int i) {
        if (!mo34713m(i)) {
            return t;
        }
        return (T) m34727u();
    }

    /* renamed from: w */
    protected abstract void mo34709w(int i);

    /* renamed from: x */
    public void m34725x(boolean z, boolean z2) {
    }

    /* renamed from: y */
    protected abstract void mo34708y(boolean z);

    /* renamed from: z */
    public void m34724z(boolean z, int i) {
        mo34709w(i);
        mo34708y(z);
    }
}

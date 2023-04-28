package net.time4j;

import java.io.Serializable;
import p143hj.AbstractC8052f;
import p143hj.AbstractC8074m0;
import p143hj.AbstractC8080q;
import p143hj.C8087x;

/* renamed from: net.time4j.w0 */
/* loaded from: classes8.dex */
public final class C11037w0 extends AbstractC8052f implements AbstractC11032u, Serializable {

    /* renamed from: k */
    public static final C11037w0 f24520k = new C11037w0();
    private static final long serialVersionUID = -4981215347844372171L;

    private C11037w0() {
    }

    private Object readResolve() {
        return f24520k;
    }

    @Override // net.time4j.AbstractC11036w
    /* renamed from: a */
    public char mo11166a() {
        return 'Y';
    }

    @Override // p143hj.AbstractC8086w
    /* renamed from: b */
    public boolean mo11165b() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p143hj.AbstractC8052f
    /* renamed from: c */
    public <T extends AbstractC8080q<T>> AbstractC8074m0<T> mo11164c(C8087x<T> xVar) {
        if (xVar.m20657A(C10892f0.f24172x)) {
            return C10788a1.m12252P();
        }
        return null;
    }

    @Override // p143hj.AbstractC8086w
    public double getLength() {
        return EnumC10882f.f24151n.getLength();
    }

    public String toString() {
        return "WEEK_BASED_YEARS";
    }
}

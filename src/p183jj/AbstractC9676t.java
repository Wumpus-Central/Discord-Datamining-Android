package p183jj;

import net.time4j.p248tz.AbstractC11001k;
import p143hj.AbstractC8079p;
import p143hj.AbstractC8080q;
import p143hj.C8087x;
import p183jj.AbstractC9676t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: jj.t */
/* loaded from: classes8.dex */
public abstract class AbstractC9676t<T extends AbstractC9676t<T>> extends AbstractC8080q<T> {
    /* renamed from: F */
    abstract <E> E mo15650F();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public abstract void mo15649G(AbstractC8079p<?> pVar, int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public abstract void mo15648I(AbstractC8079p<?> pVar, Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public abstract void mo15647J(Object obj);

    /* renamed from: K */
    public T mo15655B(AbstractC8079p<Integer> pVar, int i) {
        mo15649G(pVar, i);
        return this;
    }

    /* renamed from: L */
    public <V> T mo15654D(AbstractC8079p<V> pVar, V v) {
        mo15648I(pVar, v);
        return this;
    }

    @Override // p143hj.AbstractC8080q, p143hj.AbstractC8077o
    /* renamed from: b */
    public <V> V mo11380b(AbstractC8079p<V> pVar) {
        return pVar.mo11059f();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof p183jj.AbstractC9676t
            r2 = 0
            if (r1 == 0) goto L_0x0057
            jj.t r7 = (p183jj.AbstractC9676t) r7
            java.util.Set r1 = r6.mo15628v()
            java.util.Set r3 = r7.mo15628v()
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 == r5) goto L_0x001e
            return r2
        L_0x001e:
            java.util.Iterator r1 = r1.iterator()
        L_0x0022:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0043
            java.lang.Object r4 = r1.next()
            hj.p r4 = (p143hj.AbstractC8079p) r4
            boolean r5 = r3.contains(r4)
            if (r5 == 0) goto L_0x0042
            java.lang.Object r5 = r6.mo11371r(r4)
            java.lang.Object r4 = r7.mo11371r(r4)
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0022
        L_0x0042:
            return r2
        L_0x0043:
            java.lang.Object r1 = r6.mo15650F()
            java.lang.Object r7 = r7.mo15650F()
            if (r1 != 0) goto L_0x0052
            if (r7 != 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r0 = r2
        L_0x0051:
            return r0
        L_0x0052:
            boolean r7 = r1.equals(r7)
            return r7
        L_0x0057:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p183jj.AbstractC9676t.equals(java.lang.Object):boolean");
    }

    @Override // p143hj.AbstractC8080q, p143hj.AbstractC8077o
    /* renamed from: f */
    public final boolean mo11376f() {
        if (mo11377e(EnumC9636b0.TIMEZONE_ID) || mo11377e(EnumC9636b0.TIMEZONE_OFFSET)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = mo15628v().hashCode();
        Object F = mo15650F();
        if (F != null) {
            return hashCode + (F.hashCode() * 31);
        }
        return hashCode;
    }

    @Override // p143hj.AbstractC8080q, p143hj.AbstractC8077o
    /* renamed from: k */
    public <V> V mo11373k(AbstractC8079p<V> pVar) {
        return pVar.mo11062T();
    }

    @Override // p143hj.AbstractC8080q, p143hj.AbstractC8077o
    /* renamed from: q */
    public final AbstractC11001k mo11372q() {
        Object obj;
        EnumC9636b0 b0Var = EnumC9636b0.TIMEZONE_ID;
        if (mo11377e(b0Var)) {
            obj = mo11371r(b0Var);
        } else {
            EnumC9636b0 b0Var2 = EnumC9636b0.TIMEZONE_OFFSET;
            if (mo11377e(b0Var2)) {
                obj = mo11371r(b0Var2);
            } else {
                obj = null;
            }
        }
        if (obj instanceof AbstractC11001k) {
            return (AbstractC11001k) AbstractC11001k.class.cast(obj);
        }
        return super.mo11372q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p143hj.AbstractC8080q
    /* renamed from: t */
    public final C8087x<T> mo11639t() {
        throw new UnsupportedOperationException("Parsed values do not have any chronology.");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append('{');
        boolean z = true;
        for (AbstractC8079p<?> pVar : mo15628v()) {
            if (z) {
                z = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(pVar.name());
            sb2.append('=');
            sb2.append(mo11371r(pVar));
        }
        sb2.append('}');
        Object F = mo15650F();
        if (F != null) {
            sb2.append(">>>result=");
            sb2.append(F);
        }
        return sb2.toString();
    }

    @Override // p143hj.AbstractC8080q
    /* renamed from: z */
    public <V> boolean mo15651z(AbstractC8079p<V> pVar, V v) {
        if (pVar != null) {
            return true;
        }
        throw new NullPointerException("Missing chronological element.");
    }
}

package p183jj;

import java.util.Set;
import p143hj.AbstractC8048d;
import p143hj.AbstractC8075n;
import p143hj.AbstractC8077o;
import p143hj.AbstractC8079p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: jj.y */
/* loaded from: classes8.dex */
public final class C9685y implements AbstractC9657h<Void> {

    /* renamed from: k */
    private final int f21539k;

    /* renamed from: l */
    private final AbstractC8075n<Character> f21540l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9685y(AbstractC8075n<Character> nVar, int i) {
        if (nVar == null) {
            throw new NullPointerException("Missing condition for unparseable chars.");
        } else if (i >= 1) {
            this.f21540l = nVar;
            this.f21539k = i;
        } else {
            throw new IllegalArgumentException("Must be positive: " + i);
        }
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: b */
    public AbstractC8079p<Void> mo15599b() {
        return null;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: c */
    public int mo15598c(AbstractC8077o oVar, Appendable appendable, AbstractC8048d dVar, Set<C9653g> set, boolean z) {
        return 0;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: d */
    public AbstractC9657h<Void> mo15597d(AbstractC8079p<Void> pVar) {
        return this;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: e */
    public void mo15596e(CharSequence charSequence, C9675s sVar, AbstractC8048d dVar, AbstractC9676t<?> tVar, boolean z) {
        int i;
        int i2;
        int f = sVar.m15664f();
        int length = charSequence.length();
        if (this.f21540l == null) {
            i = length - this.f21539k;
        } else {
            int i3 = f;
            for (int i4 = 0; i4 < this.f21539k && (i2 = i4 + f) < length && this.f21540l.test(Character.valueOf(charSequence.charAt(i2))); i4++) {
                i3++;
            }
            i = i3;
        }
        int min = Math.min(Math.max(i, 0), length);
        if (min > f) {
            sVar.m15658l(min);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9685y)) {
            return false;
        }
        C9685y yVar = (C9685y) obj;
        if (this.f21539k == yVar.f21539k) {
            AbstractC8075n<Character> nVar = this.f21540l;
            AbstractC8075n<Character> nVar2 = yVar.f21540l;
            if (nVar == null) {
                if (nVar2 == null) {
                    return true;
                }
            } else if (nVar.equals(nVar2)) {
                return true;
            }
        }
        return false;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: f */
    public boolean mo15595f() {
        return false;
    }

    @Override // p183jj.AbstractC9657h
    /* renamed from: g */
    public AbstractC9657h<Void> mo15594g(C9637c<?> cVar, AbstractC8048d dVar, int i) {
        return this;
    }

    public int hashCode() {
        AbstractC8075n<Character> nVar = this.f21540l;
        if (nVar == null) {
            return this.f21539k;
        }
        return nVar.hashCode() ^ (~this.f21539k);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(C9685y.class.getName());
        if (this.f21540l == null) {
            sb2.append("[keepRemainingChars=");
            sb2.append(this.f21539k);
        } else {
            sb2.append("[condition=");
            sb2.append(this.f21540l);
            sb2.append(", maxIterations=");
            sb2.append(this.f21539k);
        }
        sb2.append(']');
        return sb2.toString();
    }
}

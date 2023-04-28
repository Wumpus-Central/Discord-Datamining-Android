package net.time4j.p248tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import net.time4j.C10892f0;
import net.time4j.EnumC10809b0;
import net.time4j.EnumC11039x0;
import net.time4j.base.C10812b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.tz.model.h */
/* loaded from: classes8.dex */
public final class C11016h extends C11015g {
    private static final long serialVersionUID = -946839310332554772L;

    /* renamed from: p */
    private final transient byte f24489p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11016h(EnumC10809b0 b0Var, EnumC11039x0 x0Var, int i, EnumC11017i iVar, int i2) {
        super(b0Var, i, iVar, i2);
        this.f24489p = (byte) x0Var.m11158b();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, mo11227g());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11016h)) {
            return false;
        }
        C11016h hVar = (C11016h) obj;
        if (this.f24489p != hVar.f24489p || !super.m11228l(hVar)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // net.time4j.p248tz.model.AbstractC11012d
    /* renamed from: g */
    public int mo11227g() {
        return 122;
    }

    public int hashCode() {
        return (this.f24489p * 17) + (m11229k() * 37);
    }

    @Override // net.time4j.p248tz.model.C11015g
    /* renamed from: j */
    protected C10892f0 mo11226j(int i) {
        byte k = m11229k();
        int d = C10812b.m12212d(i, k);
        int c = C10812b.m12213c(i, k, d) - this.f24489p;
        if (c < 0) {
            c += 7;
        }
        return C10892f0.m11875L0(i, k, d - c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public byte m11225m() {
        return this.f24489p;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("LastDayOfWeekPattern:[month=");
        sb2.append((int) m11229k());
        sb2.append(",day-of-week=");
        sb2.append(EnumC11039x0.m11154f(this.f24489p));
        sb2.append(",day-overflow=");
        sb2.append(m11238c());
        sb2.append(",time-of-day=");
        sb2.append(m11235f());
        sb2.append(",offset-indicator=");
        sb2.append(m11237d());
        sb2.append(",dst-offset=");
        sb2.append(m11236e());
        sb2.append(']');
        return sb2.toString();
    }
}

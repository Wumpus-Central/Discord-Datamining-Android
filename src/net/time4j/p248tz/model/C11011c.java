package net.time4j.p248tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import net.time4j.C10892f0;
import net.time4j.EnumC10809b0;
import net.time4j.EnumC10882f;
import net.time4j.EnumC11039x0;
import net.time4j.base.C10812b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.tz.model.c */
/* loaded from: classes8.dex */
public final class C11011c extends C11015g {
    private static final long serialVersionUID = -7354650946442523175L;

    /* renamed from: p */
    private final transient byte f24480p;

    /* renamed from: q */
    private final transient byte f24481q;

    /* renamed from: r */
    private final transient boolean f24482r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11011c(EnumC10809b0 b0Var, int i, EnumC11039x0 x0Var, int i2, EnumC11017i iVar, int i3, boolean z) {
        super(b0Var, i2, iVar, i3);
        C10812b.m12215a(2000, b0Var.m12221b(), i);
        this.f24480p = (byte) i;
        this.f24481q = (byte) x0Var.m11158b();
        this.f24482r = z;
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
        if (!(obj instanceof C11011c)) {
            return false;
        }
        C11011c cVar = (C11011c) obj;
        if (this.f24480p == cVar.f24480p && this.f24481q == cVar.f24481q && this.f24482r == cVar.f24482r && super.m11228l(cVar)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // net.time4j.p248tz.model.AbstractC11012d
    /* renamed from: g */
    public int mo11227g() {
        return 121;
    }

    public int hashCode() {
        return this.f24480p + ((this.f24481q + (m11229k() * 37)) * 17) + (this.f24482r ? 1 : 0);
    }

    @Override // net.time4j.p248tz.model.C11015g
    /* renamed from: j */
    protected C10892f0 mo11226j(int i) {
        int i2;
        byte k = m11229k();
        int c = C10812b.m12213c(i, k, this.f24480p);
        C10892f0 L0 = C10892f0.m11875L0(i, k, this.f24480p);
        byte b = this.f24481q;
        if (c == b) {
            return L0;
        }
        int i3 = c - b;
        if (this.f24482r) {
            i3 = -i3;
            i2 = 1;
        } else {
            i2 = -1;
        }
        if (i3 < 0) {
            i3 += 7;
        }
        return (C10892f0) L0.m20683K(i3 * i2, EnumC10882f.f24155r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public int m11241m() {
        return this.f24480p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public byte m11240n() {
        return this.f24481q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean m11239o() {
        return this.f24482r;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("DayOfWeekInMonthPattern:[month=");
        sb2.append((int) m11229k());
        sb2.append(",dayOfMonth=");
        sb2.append((int) this.f24480p);
        sb2.append(",dayOfWeek=");
        sb2.append(EnumC11039x0.m11154f(this.f24481q));
        sb2.append(",day-overflow=");
        sb2.append(m11238c());
        sb2.append(",time-of-day=");
        sb2.append(m11235f());
        sb2.append(",offset-indicator=");
        sb2.append(m11237d());
        sb2.append(",dst-offset=");
        sb2.append(m11236e());
        sb2.append(",after=");
        sb2.append(this.f24482r);
        sb2.append(']');
        return sb2.toString();
    }
}

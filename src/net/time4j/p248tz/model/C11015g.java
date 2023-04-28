package net.time4j.p248tz.model;

import java.io.Serializable;
import net.time4j.C10892f0;
import net.time4j.EnumC10809b0;
import net.time4j.EnumC10882f;
import net.time4j.base.AbstractC10811a;
import net.time4j.base.C10812b;
import p161ij.AbstractC8633c;

@AbstractC8633c("iso8601")
/* renamed from: net.time4j.tz.model.g */
/* loaded from: classes8.dex */
public class C11015g extends AbstractC11012d implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: o */
    private final transient byte f24488o;

    /* JADX INFO: Access modifiers changed from: protected */
    public C11015g(EnumC10809b0 b0Var, int i, EnumC11017i iVar, int i2) {
        super(i, iVar, i2);
        this.f24488o = (byte) b0Var.m12221b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.p248tz.model.AbstractC11012d
    /* renamed from: a */
    public String mo11233a() {
        return "iso8601";
    }

    @Override // net.time4j.p248tz.model.AbstractC11012d
    /* renamed from: b */
    public final C10892f0 mo11232b(int i) {
        return (C10892f0) mo11226j(i).m20683K(m11238c(), EnumC10882f.f24155r);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.p248tz.model.AbstractC11012d
    /* renamed from: h */
    public int mo11231h(long j) {
        return C10812b.m12207i(C10812b.m12204l(j));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.p248tz.model.AbstractC11012d
    /* renamed from: i */
    public int mo11230i(AbstractC10811a aVar) {
        return aVar.mo11643m();
    }

    /* renamed from: j */
    protected C10892f0 mo11226j(int i) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public byte m11229k() {
        return this.f24488o;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public boolean m11228l(C11015g gVar) {
        if (m11235f().equals(gVar.m11235f()) && m11238c() == gVar.m11238c() && m11237d() == gVar.m11237d() && m11236e() == gVar.m11236e() && this.f24488o == gVar.f24488o) {
            return true;
        }
        return false;
    }
}

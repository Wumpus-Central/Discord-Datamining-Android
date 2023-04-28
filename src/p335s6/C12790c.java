package p335s6;

import android.content.Context;
import p040c7.AbstractC3770a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: s6.c */
/* loaded from: classes7.dex */
public final class C12790c extends AbstractC12797h {

    /* renamed from: a */
    private final Context f28715a;

    /* renamed from: b */
    private final AbstractC3770a f28716b;

    /* renamed from: c */
    private final AbstractC3770a f28717c;

    /* renamed from: d */
    private final String f28718d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12790c(Context context, AbstractC3770a aVar, AbstractC3770a aVar2, String str) {
        if (context != null) {
            this.f28715a = context;
            if (aVar != null) {
                this.f28716b = aVar;
                if (aVar2 != null) {
                    this.f28717c = aVar2;
                    if (str != null) {
                        this.f28718d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    @Override // p335s6.AbstractC12797h
    /* renamed from: b */
    public Context mo5465b() {
        return this.f28715a;
    }

    @Override // p335s6.AbstractC12797h
    /* renamed from: c */
    public String mo5464c() {
        return this.f28718d;
    }

    @Override // p335s6.AbstractC12797h
    /* renamed from: d */
    public AbstractC3770a mo5463d() {
        return this.f28717c;
    }

    @Override // p335s6.AbstractC12797h
    /* renamed from: e */
    public AbstractC3770a mo5462e() {
        return this.f28716b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12797h)) {
            return false;
        }
        AbstractC12797h hVar = (AbstractC12797h) obj;
        if (!this.f28715a.equals(hVar.mo5465b()) || !this.f28716b.equals(hVar.mo5462e()) || !this.f28717c.equals(hVar.mo5463d()) || !this.f28718d.equals(hVar.mo5464c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.f28715a.hashCode() ^ 1000003) * 1000003) ^ this.f28716b.hashCode()) * 1000003) ^ this.f28717c.hashCode()) * 1000003) ^ this.f28718d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f28715a + ", wallClock=" + this.f28716b + ", monotonicClock=" + this.f28717c + ", backendName=" + this.f28718d + "}";
    }
}

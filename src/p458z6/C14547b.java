package p458z6;

import java.util.Map;
import p040c7.AbstractC3770a;
import p279p6.EnumC11574d;
import p458z6.AbstractC14553f;

/* renamed from: z6.b */
/* loaded from: classes7.dex */
final class C14547b extends AbstractC14553f {

    /* renamed from: a */
    private final AbstractC3770a f32975a;

    /* renamed from: b */
    private final Map<EnumC11574d, AbstractC14553f.AbstractC14555b> f32976b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C14547b(AbstractC3770a aVar, Map<EnumC11574d, AbstractC14553f.AbstractC14555b> map) {
        if (aVar != null) {
            this.f32975a = aVar;
            if (map != null) {
                this.f32976b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    @Override // p458z6.AbstractC14553f
    /* renamed from: e */
    AbstractC3770a mo238e() {
        return this.f32975a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC14553f)) {
            return false;
        }
        AbstractC14553f fVar = (AbstractC14553f) obj;
        if (!this.f32975a.equals(fVar.mo238e()) || !this.f32976b.equals(fVar.mo235h())) {
            return false;
        }
        return true;
    }

    @Override // p458z6.AbstractC14553f
    /* renamed from: h */
    Map<EnumC11574d, AbstractC14553f.AbstractC14555b> mo235h() {
        return this.f32976b;
    }

    public int hashCode() {
        return ((this.f32975a.hashCode() ^ 1000003) * 1000003) ^ this.f32976b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f32975a + ", values=" + this.f32976b + "}";
    }
}

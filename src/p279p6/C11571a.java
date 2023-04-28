package p279p6;

/* renamed from: p6.a */
/* loaded from: classes7.dex */
final class C11571a<T> extends AbstractC11573c<T> {

    /* renamed from: a */
    private final Integer f25813a;

    /* renamed from: b */
    private final T f25814b;

    /* renamed from: c */
    private final EnumC11574d f25815c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11571a(Integer num, T t, EnumC11574d dVar) {
        this.f25813a = num;
        if (t != null) {
            this.f25814b = t;
            if (dVar != null) {
                this.f25815c = dVar;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    @Override // p279p6.AbstractC11573c
    /* renamed from: a */
    public Integer mo9323a() {
        return this.f25813a;
    }

    @Override // p279p6.AbstractC11573c
    /* renamed from: b */
    public T mo9322b() {
        return this.f25814b;
    }

    @Override // p279p6.AbstractC11573c
    /* renamed from: c */
    public EnumC11574d mo9321c() {
        return this.f25815c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC11573c)) {
            return false;
        }
        AbstractC11573c cVar = (AbstractC11573c) obj;
        Integer num = this.f25813a;
        if (num != null ? num.equals(cVar.mo9323a()) : cVar.mo9323a() == null) {
            if (this.f25814b.equals(cVar.mo9322b()) && this.f25815c.equals(cVar.mo9321c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        Integer num = this.f25813a;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        return ((((i ^ 1000003) * 1000003) ^ this.f25814b.hashCode()) * 1000003) ^ this.f25815c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f25813a + ", payload=" + this.f25814b + ", priority=" + this.f25815c + "}";
    }
}

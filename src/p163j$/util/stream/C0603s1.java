package p163j$.util.stream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.s1 */
/* loaded from: classes2.dex */
public class C0603s1 extends AbstractC0607t1 {

    /* renamed from: c */
    public final /* synthetic */ int f20746c;

    /* renamed from: d */
    private final Object f20747d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0603s1(AbstractC9319B0 b0, Object obj) {
        this(b0, obj, 0);
        this.f20746c = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0603s1(AbstractC9324C0 c0, Object obj, int i) {
        super(c0);
        this.f20746c = i;
        this.f20747d = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0603s1(AbstractC9324C0 c0, Object[] objArr) {
        this(c0, objArr, 1);
        this.f20746c = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0603s1(C0603s1 s1Var, AbstractC9319B0 b0, int i) {
        super(s1Var, b0, i);
        this.f20746c = 0;
        this.f20747d = s1Var.f20747d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0603s1(C0603s1 s1Var, AbstractC9324C0 c0, int i) {
        super(s1Var, c0, i);
        this.f20746c = 1;
        this.f20747d = (Object[]) s1Var.f20747d;
    }

    @Override // p163j$.util.stream.AbstractC0607t1
    /* renamed from: a */
    final void mo16251a() {
        switch (this.f20746c) {
            case 0:
                ((AbstractC9319B0) this.f20759a).mo16342f(this.f20760b, this.f20747d);
                return;
            default:
                this.f20759a.mo16320i((Object[]) this.f20747d, this.f20760b);
                return;
        }
    }

    @Override // p163j$.util.stream.AbstractC0607t1
    /* renamed from: b */
    final C0603s1 mo16250b(int i, int i2) {
        switch (this.f20746c) {
            case 0:
                return new C0603s1(this, ((AbstractC9319B0) this.f20759a).mo16321a(i), i2);
            default:
                return new C0603s1(this, this.f20759a.mo16321a(i), i2);
        }
    }
}

package p163j$.util.function;

/* renamed from: j$.util.function.t */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0504t implements Function {

    /* renamed from: a */
    public final /* synthetic */ int f20419a;

    /* renamed from: b */
    public final /* synthetic */ Function f20420b;

    /* renamed from: c */
    public final /* synthetic */ Function f20421c;

    public /* synthetic */ C0504t(Function function, Function function2, int i) {
        this.f20419a = i;
        this.f20420b = function;
        this.f20421c = function2;
    }

    @Override // p163j$.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        switch (this.f20419a) {
            case 0:
                return function.getClass();
            default:
                return function.getClass();
        }
    }

    @Override // p163j$.util.function.Function
    public final Object apply(Object obj) {
        int i = this.f20419a;
        Function function = this.f20421c;
        Function function2 = this.f20420b;
        switch (i) {
            case 0:
                return function.apply(function2.apply(obj));
            default:
                return function2.apply(function.apply(obj));
        }
    }

    @Override // p163j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        switch (this.f20419a) {
            case 0:
                return function.getClass();
            default:
                return function.getClass();
        }
    }
}

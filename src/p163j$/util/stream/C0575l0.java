package p163j$.util.stream;

import p163j$.util.function.Predicate;

/* renamed from: j$.util.stream.l0 */
/* loaded from: classes2.dex */
final class C0575l0 extends AbstractC0591p0 {

    /* renamed from: c */
    final /* synthetic */ EnumC0595q0 f20686c;

    /* renamed from: d */
    final /* synthetic */ Predicate f20687d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0575l0(Predicate predicate, EnumC0595q0 q0Var) {
        super(q0Var);
        this.f20686c = q0Var;
        this.f20687d = predicate;
    }

    @Override // p163j$.util.function.Consumer
    public final void accept(Object obj) {
        boolean z;
        boolean z2;
        if (!this.f20724a) {
            boolean test = this.f20687d.test(obj);
            EnumC0595q0 q0Var = this.f20686c;
            z = q0Var.f20729a;
            if (test == z) {
                this.f20724a = true;
                z2 = q0Var.f20730b;
                this.f20725b = z2;
            }
        }
    }
}

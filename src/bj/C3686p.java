package bj;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import p446yf.C14376a;

@Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\u001e\u0010\f\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\b¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016R/\u0010\f\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0013"}, m15073d2 = {"Lbj/p;", "T", "Lbj/x1;", "Lkotlin/reflect/KClass;", "", "key", "Lkotlinx/serialization/KSerializer;", "a", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "b", "()Lkotlin/jvm/functions/Function1;", "compute", "Lbj/r;", "Lbj/k;", "Lbj/r;", "classValue", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.p */
/* loaded from: classes8.dex */
final class C3686p<T> implements AbstractC3716x1<T> {

    /* renamed from: a */
    private final Function1<KClass<?>, KSerializer<T>> f6004a;

    /* renamed from: b */
    private final C3694r<C3666k<T>> f6005b = new C3694r<>();

    @Metadata(m15074d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m15073d2 = {"T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: bj.p$a */
    /* loaded from: classes8.dex */
    public static final class C3687a extends AbstractC9973s implements Function0<T> {

        /* renamed from: l */
        final /* synthetic */ KClass f6007l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3687a(KClass kClass) {
            super(0);
            this.f6007l = kClass;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return (T) new C3666k(C3686p.this.m33812b().invoke(this.f6007l));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3686p(Function1<? super KClass<?>, ? extends KSerializer<T>> compute) {
        C9971q.m14633g(compute, "compute");
        this.f6004a = compute;
    }

    @Override // bj.AbstractC3716x1
    /* renamed from: a */
    public KSerializer<T> mo33752a(KClass<Object> key) {
        C9971q.m14633g(key, "key");
        Object obj = this.f6005b.get(C14376a.m737b(key));
        C9971q.m14634f(obj, "get(key)");
        C3621a1 a1Var = (C3621a1) obj;
        T t = a1Var.f5916a.get();
        if (t == null) {
            t = (T) a1Var.m33963a(new C3687a(key));
        }
        return ((C3666k) t).f5983a;
    }

    /* renamed from: b */
    public final Function1<KClass<?>, KSerializer<T>> m33812b() {
        return this.f6004a;
    }
}

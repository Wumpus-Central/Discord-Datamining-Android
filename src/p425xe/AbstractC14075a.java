package p425xe;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9971q;
import p405we.C13869b;

@Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u000b"}, m15073d2 = {"Lxe/a;", "", "Lkotlin/Function0;", "Lwe/b;", "a", "Lkotlin/jvm/functions/Function0;", "controllerProvider", "()Lwe/b;", "controller", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "library_release"}, m15072k = 1, m15071mv = {1, 5, 1})
/* renamed from: xe.a */
/* loaded from: classes6.dex */
public abstract class AbstractC14075a {

    /* renamed from: a */
    private final Function0<C13869b> f31767a;

    public AbstractC14075a(Function0<C13869b> controllerProvider) {
        C9971q.m14633g(controllerProvider, "controllerProvider");
        this.f31767a = controllerProvider;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final C13869b m1764a() {
        return this.f31767a.invoke();
    }
}

package bj;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import p107fg.AbstractC7139c;
import p107fg.C7151j;
import p446yf.C14376a;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\f\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m15073d2 = {"Lbj/o0;", "Lkotlin/reflect/KType;", "", "other", "", "equals", "", "hashCode", "", "toString", "k", "Lkotlin/reflect/KType;", "origin", "", "Lfg/j;", "j", "()Ljava/util/List;", "arguments", "Lfg/c;", "d", "()Lfg/c;", "classifier", "b", "()Z", "isMarkedNullable", "<init>", "(Lkotlin/reflect/KType;)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.o0 */
/* loaded from: classes8.dex */
public final class C3684o0 implements KType {

    /* renamed from: k */
    private final KType f6003k;

    public C3684o0(KType origin) {
        C9971q.m14633g(origin, "origin");
        this.f6003k = origin;
    }

    @Override // kotlin.reflect.KType
    /* renamed from: b */
    public boolean mo14595b() {
        return this.f6003k.mo14595b();
    }

    @Override // kotlin.reflect.KType
    /* renamed from: d */
    public AbstractC7139c mo14594d() {
        return this.f6003k.mo14594d();
    }

    public boolean equals(Object obj) {
        KType kType;
        if (obj == null || !C9971q.m14638b(this.f6003k, obj)) {
            return false;
        }
        AbstractC7139c d = mo14594d();
        if (d instanceof KClass) {
            AbstractC7139c cVar = null;
            if (obj instanceof KType) {
                kType = (KType) obj;
            } else {
                kType = null;
            }
            if (kType != null) {
                cVar = kType.mo14594d();
            }
            if (cVar != null && (cVar instanceof KClass)) {
                return C9971q.m14638b(C14376a.m737b((KClass) d), C14376a.m737b((KClass) cVar));
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f6003k.hashCode();
    }

    @Override // kotlin.reflect.KType
    /* renamed from: j */
    public List<C7151j> mo14593j() {
        return this.f6003k.mo14593j();
    }

    public String toString() {
        return "KTypeWrapper: " + this.f6003k;
    }
}

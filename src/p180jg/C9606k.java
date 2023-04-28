package p180jg;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9906j;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m15073d2 = {"Ljg/k;", "Ljg/e;", "", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "c", "()Ljava/lang/Void;", "member", "", "Ljava/lang/reflect/Type;", "a", "()Ljava/util/List;", "parameterTypes", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "<init>", "()V", "kotlin-reflection"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: jg.k */
/* loaded from: classes8.dex */
public final class C9606k implements AbstractC9579e {

    /* renamed from: a */
    public static final C9606k f21281a = new C9606k();

    private C9606k() {
    }

    @Override // p180jg.AbstractC9579e
    /* renamed from: a */
    public List<Type> mo15932a() {
        List<Type> i;
        i = C9906j.m14820i();
        return i;
    }

    @Override // p180jg.AbstractC9579e
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Member mo15931b() {
        return (Member) m15930c();
    }

    /* renamed from: c */
    public Void m15930c() {
        return null;
    }

    @Override // p180jg.AbstractC9579e
    public Object call(Object[] args) {
        C9971q.m14633g(args, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // p180jg.AbstractC9579e
    public Type getReturnType() {
        Class TYPE = Void.TYPE;
        C9971q.m14634f(TYPE, "TYPE");
        return TYPE;
    }
}

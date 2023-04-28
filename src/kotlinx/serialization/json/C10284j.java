package kotlinx.serialization.json;

import dj.AbstractC6514c;
import dj.C6515d;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import p045cj.C4053m0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\n"}, m15073d2 = {"Lkotlinx/serialization/json/j;", "Lkotlinx/serialization/json/Json;", "", "g", "Lkotlinx/serialization/json/c;", "configuration", "Ldj/c;", "module", "<init>", "(Lkotlinx/serialization/json/c;Ldj/c;)V", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.json.j */
/* loaded from: classes8.dex */
public final class C10284j extends Json {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10284j(C10271c configuration, AbstractC6514c module) {
        super(configuration, module, null);
        C9971q.m14633g(configuration, "configuration");
        C9971q.m14633g(module, "module");
        m13696g();
    }

    /* renamed from: g */
    private final void m13696g() {
        if (!C9971q.m14638b(mo611a(), C6515d.m25386a())) {
            mo611a().mo25391a(new C4053m0(m13765e().m13732l(), m13765e().m13741c()));
        }
    }
}

package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a$\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\u0007"}, m15073d2 = {"Lkotlinx/serialization/json/Json;", "from", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonBuilder;", "", "builderAction", "a", "kotlinx-serialization-json"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: kotlinx.serialization.json.k */
/* loaded from: classes8.dex */
public final class C10285k {
    /* renamed from: a */
    public static final Json m13695a(Json from, Function1<? super JsonBuilder, Unit> builderAction) {
        C9971q.m14633g(from, "from");
        C9971q.m14633g(builderAction, "builderAction");
        JsonBuilder jsonBuilder = new JsonBuilder(from);
        builderAction.invoke(jsonBuilder);
        return new C10284j(jsonBuilder.m13758a(), jsonBuilder.m13757b());
    }

    /* renamed from: b */
    public static /* synthetic */ Json m13694b(Json json, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            json = Json.f22543d;
        }
        return m13695a(json, function1);
    }
}

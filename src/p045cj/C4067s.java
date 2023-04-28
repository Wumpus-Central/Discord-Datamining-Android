package p045cj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.json.Json;

@Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¨\u0006\u0006"}, m15073d2 = {"Lcj/k0;", "sb", "Lkotlinx/serialization/json/Json;", "json", "Lcj/h;", "a", "kotlinx-serialization-json"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: cj.s */
/* loaded from: classes8.dex */
public final class C4067s {
    /* renamed from: a */
    public static final C4040h m32890a(AbstractC4049k0 sb2, Json json) {
        C9971q.m14633g(sb2, "sb");
        C9971q.m14633g(json, "json");
        if (json.m13765e().m13735i()) {
            return new C4065r(sb2, json);
        }
        return new C4040h(sb2);
    }
}

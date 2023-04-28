package p045cj;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.json.AbstractC10283i;
import kotlinx.serialization.json.Json;
import p449yi.AbstractC14437h;

@Metadata(m15074d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a7\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m15073d2 = {"T", "Lkotlinx/serialization/json/Json;", "Lcj/k0;", "writer", "Lyi/h;", "serializer", "value", "", "a", "(Lkotlinx/serialization/json/Json;Lcj/k0;Lyi/h;Ljava/lang/Object;)V", "kotlinx-serialization-json"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: cj.e0 */
/* loaded from: classes8.dex */
public final class C4035e0 {
    /* renamed from: a */
    public static final <T> void m32982a(Json json, AbstractC4049k0 writer, AbstractC14437h<? super T> serializer, T t) {
        C9971q.m14633g(json, "<this>");
        C9971q.m14633g(writer, "writer");
        C9971q.m14633g(serializer, "serializer");
        new C4059o0(writer, json, EnumC4070t0.OBJ, new AbstractC10283i[EnumC4070t0.values().length]).mo13872r(serializer, t);
    }
}

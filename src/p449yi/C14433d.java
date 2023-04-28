package p449yi;

import bj.AbstractC3623b;
import bj.C3630c;
import kotlin.Metadata;
import kotlin.jvm.internal.C9951f0;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.encoding.AbstractC10248c;
import kotlinx.serialization.encoding.Encoder;
import nf.C11075i;

@Metadata(m15074d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a4\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007\u001a9\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m15073d2 = {"", "T", "Lbj/b;", "Lkotlinx/serialization/encoding/c;", "decoder", "", "klassName", "Lkotlinx/serialization/DeserializationStrategy;", "a", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lyi/h;", "b", "(Lbj/b;Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Lyi/h;", "kotlinx-serialization-core"}, m15072k = 2, m15071mv = {1, 8, 0})
/* renamed from: yi.d */
/* loaded from: classes8.dex */
public final class C14433d {
    /* renamed from: a */
    public static final <T> DeserializationStrategy<T> m613a(AbstractC3623b<T> bVar, AbstractC10248c decoder, String str) {
        C9971q.m14633g(bVar, "<this>");
        C9971q.m14633g(decoder, "decoder");
        DeserializationStrategy<T> c = bVar.mo13932c(decoder, str);
        if (c != null) {
            return c;
        }
        C3630c.m33943a(str, bVar.mo617e());
        throw new C11075i();
    }

    /* renamed from: b */
    public static final <T> AbstractC14437h<T> m612b(AbstractC3623b<T> bVar, Encoder encoder, T value) {
        C9971q.m14633g(bVar, "<this>");
        C9971q.m14633g(encoder, "encoder");
        C9971q.m14633g(value, "value");
        AbstractC14437h<T> d = bVar.mo13931d(encoder, value);
        if (d != null) {
            return d;
        }
        C3630c.m33942b(C9951f0.m14684b(value.getClass()), bVar.mo617e());
        throw new C11075i();
    }
}

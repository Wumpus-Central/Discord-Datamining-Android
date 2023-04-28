package bj;

import eg.C6884j;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.C9986a;
import kotlin.ranges.IntRange;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC10248c;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import p014aj.AbstractC1413e;
import p267of.C11289v;

@Metadata(m15074d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0014\b\u0003\u0010\u0005*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006B%\b\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b¢\u0006\u0004\b(\u0010)J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b8\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0014\u0010'\u001a\u00020$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&\u0082\u0001\u0002*+¨\u0006,"}, m15073d2 = {"Lbj/z0;", "Key", "Value", "Collection", "", "Builder", "Lbj/a;", "", "Lkotlinx/serialization/encoding/c;", "decoder", "builder", "", "startIndex", "size", "", "o", "(Lkotlinx/serialization/encoding/c;Ljava/util/Map;II)V", "index", "", "checkIndex", "p", "(Lkotlinx/serialization/encoding/c;ILjava/util/Map;Z)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/KSerializer;", "a", "Lkotlinx/serialization/KSerializer;", "m", "()Lkotlinx/serialization/KSerializer;", "keySerializer", "b", "n", "valueSerializer", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "Lbj/h0;", "Lbj/r0;", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.z0 */
/* loaded from: classes8.dex */
public abstract class AbstractC3722z0<Key, Value, Collection, Builder extends Map<Key, Value>> extends AbstractC3618a<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* renamed from: a */
    private final KSerializer<Key> f6059a;

    /* renamed from: b */
    private final KSerializer<Value> f6060b;

    private AbstractC3722z0(KSerializer<Key> kSerializer, KSerializer<Value> kSerializer2) {
        super(null);
        this.f6059a = kSerializer;
        this.f6060b = kSerializer2;
    }

    public /* synthetic */ AbstractC3722z0(KSerializer kSerializer, KSerializer kSerializer2, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer, kSerializer2);
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public abstract SerialDescriptor getDescriptor();

    /* renamed from: m */
    public final KSerializer<Key> m33738m() {
        return this.f6059a;
    }

    /* renamed from: n */
    public final KSerializer<Value> m33737n() {
        return this.f6060b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo33739g(AbstractC10248c decoder, Builder builder, int i, int i2) {
        boolean z;
        IntRange q;
        C9986a o;
        C9971q.m14633g(decoder, "decoder");
        C9971q.m14633g(builder, "builder");
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            q = C6884j.m23947q(0, i2 * 2);
            o = C6884j.m23949o(q, 2);
            int a = o.m14605a();
            int b = o.m14604b();
            int f = o.m14603f();
            if ((f > 0 && a <= b) || (f < 0 && b <= a)) {
                while (true) {
                    mo13775h(decoder, i + a, builder, false);
                    if (a != b) {
                        a += f;
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo13775h(AbstractC10248c decoder, int i, Builder builder, boolean z) {
        int i2;
        Object obj;
        Object i3;
        C9971q.m14633g(decoder, "decoder");
        C9971q.m14633g(builder, "builder");
        Object c = AbstractC10248c.C10249a.m13844c(decoder, getDescriptor(), i, this.f6059a, null, 8, null);
        boolean z2 = true;
        if (z) {
            i2 = decoder.mo13851o(getDescriptor());
            if (i2 != i + 1) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i + ", returned index for value: " + i2).toString());
            }
        } else {
            i2 = i + 1;
        }
        if (!builder.containsKey(c) || (this.f6060b.getDescriptor().mo13678g() instanceof AbstractC1413e)) {
            obj = AbstractC10248c.C10249a.m13844c(decoder, getDescriptor(), i2, this.f6060b, null, 8, null);
        } else {
            SerialDescriptor descriptor = getDescriptor();
            KSerializer<Value> kSerializer = this.f6060b;
            i3 = C11289v.m10250i(builder, c);
            obj = decoder.mo13847y(descriptor, i2, kSerializer, i3);
        }
        builder.put(c, obj);
    }

    @Override // p449yi.AbstractC14437h
    public void serialize(Encoder encoder, Collection collection) {
        C9971q.m14633g(encoder, "encoder");
        int e = mo13776e(collection);
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder h = encoder.mo13880h(descriptor, e);
        Iterator<Map.Entry<? extends Key, ? extends Value>> d = mo33777d(collection);
        int i = 0;
        while (d.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = d.next();
            Object key = next.getKey();
            Object value = next.getValue();
            int i2 = i + 1;
            h.mo13870t(getDescriptor(), i, m33738m(), key);
            h.mo13870t(getDescriptor(), i2, m33737n(), value);
            i = i2 + 1;
        }
        h.mo13884c(descriptor);
    }
}

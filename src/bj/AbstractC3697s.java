package bj;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractC10248c;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(m15074d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004B\u0017\b\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\b#\u0010$J#\u0010\t\u001a\u00020\b*\u00028\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H$¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00028\u00022\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00028\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0001\u0003%&'¨\u0006("}, m15073d2 = {"Lbj/s;", "Element", "Collection", "Builder", "Lbj/a;", "", "index", "element", "", "n", "(Ljava/lang/Object;ILjava/lang/Object;)V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/c;", "decoder", "builder", "startIndex", "size", "g", "(Lkotlinx/serialization/encoding/c;Ljava/lang/Object;II)V", "", "checkIndex", "h", "(Lkotlinx/serialization/encoding/c;ILjava/lang/Object;Z)V", "Lkotlinx/serialization/KSerializer;", "a", "Lkotlinx/serialization/KSerializer;", "elementSerializer", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "Lbj/t;", "Lbj/s1;", "Lbj/v1;", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.s */
/* loaded from: classes8.dex */
public abstract class AbstractC3697s<Element, Collection, Builder> extends AbstractC3618a<Element, Collection, Builder> {

    /* renamed from: a */
    private final KSerializer<Element> f6015a;

    private AbstractC3697s(KSerializer<Element> kSerializer) {
        super(null);
        this.f6015a = kSerializer;
    }

    public /* synthetic */ AbstractC3697s(KSerializer kSerializer, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer);
    }

    @Override // bj.AbstractC3618a
    /* renamed from: g */
    protected final void mo33739g(AbstractC10248c decoder, Builder builder, int i, int i2) {
        boolean z;
        C9971q.m14633g(decoder, "decoder");
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            for (int i3 = 0; i3 < i2; i3++) {
                mo13775h(decoder, i + i3, builder, false);
            }
            return;
        }
        throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
    }

    @Override // kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public abstract SerialDescriptor getDescriptor();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bj.AbstractC3618a
    /* renamed from: h */
    protected void mo13775h(AbstractC10248c decoder, int i, Builder builder, boolean z) {
        C9971q.m14633g(decoder, "decoder");
        mo33775n(builder, i, AbstractC10248c.C10249a.m13844c(decoder, getDescriptor(), i, this.f6015a, null, 8, null));
    }

    /* renamed from: n */
    protected abstract void mo33775n(Builder builder, int i, Element element);

    @Override // p449yi.AbstractC14437h
    public void serialize(Encoder encoder, Collection collection) {
        C9971q.m14633g(encoder, "encoder");
        int e = mo13776e(collection);
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder h = encoder.mo13880h(descriptor, e);
        Iterator<Element> d = mo33777d(collection);
        for (int i = 0; i < e; i++) {
            h.mo13870t(getDescriptor(), i, this.f6015a, d.next());
        }
        h.mo13884c(descriptor);
    }
}

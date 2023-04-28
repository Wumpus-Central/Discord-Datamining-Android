package bj;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.AbstractC10248c;
import kotlinx.serialization.encoding.Decoder;

@Metadata(m15074d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\t\b\u0004¢\u0006\u0004\b(\u0010)J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\b*\u00028\u0001H$¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r*\u00028\u0001H$¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00028\u0002H$¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\b*\u00028\u0002H$¢\u0006\u0004\b\u0012\u0010\fJ\u0013\u0010\u0013\u001a\u00028\u0001*\u00028\u0002H$¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00028\u0002*\u00028\u0001H$¢\u0006\u0004\b\u0015\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\u0017*\u00028\u00022\u0006\u0010\u0016\u001a\u00020\bH$¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00018\u0001H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010#\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u00022\b\b\u0002\u0010\"\u001a\u00020!H$¢\u0006\u0004\b#\u0010$J/\u0010&\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00022\u0006\u0010%\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH$¢\u0006\u0004\b&\u0010'\u0082\u0001\u0002*+¨\u0006,"}, m15073d2 = {"Lbj/a;", "Element", "Collection", "Builder", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/c;", "decoder", "builder", "", "j", "(Lkotlinx/serialization/encoding/c;Ljava/lang/Object;)I", "e", "(Ljava/lang/Object;)I", "", "d", "(Ljava/lang/Object;)Ljava/util/Iterator;", "a", "()Ljava/lang/Object;", "b", "l", "(Ljava/lang/Object;)Ljava/lang/Object;", "k", "size", "", "c", "(Ljava/lang/Object;I)V", "Lkotlinx/serialization/encoding/Decoder;", "previous", "f", "(Lkotlinx/serialization/encoding/Decoder;Ljava/lang/Object;)Ljava/lang/Object;", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "index", "", "checkIndex", "h", "(Lkotlinx/serialization/encoding/c;ILjava/lang/Object;Z)V", "startIndex", "g", "(Lkotlinx/serialization/encoding/c;Ljava/lang/Object;II)V", "<init>", "()V", "Lbj/s;", "Lbj/z0;", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.a */
/* loaded from: classes8.dex */
public abstract class AbstractC3618a<Element, Collection, Builder> implements KSerializer<Collection> {
    private AbstractC3618a() {
    }

    public /* synthetic */ AbstractC3618a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: i */
    public static /* synthetic */ void m33967i(AbstractC3618a aVar, AbstractC10248c cVar, int i, Object obj, boolean z, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 8) != 0) {
                z = true;
            }
            aVar.mo13775h(cVar, i, obj, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
    }

    /* renamed from: j */
    private final int m33966j(AbstractC10248c cVar, Builder builder) {
        int k = cVar.mo13854k(getDescriptor());
        mo33778c(builder, k);
        return k;
    }

    /* renamed from: a */
    protected abstract Builder mo33780a();

    /* renamed from: b */
    protected abstract int mo33779b(Builder builder);

    /* renamed from: c */
    protected abstract void mo33778c(Builder builder, int i);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Iterator<Element> mo33777d(Collection collection);

    @Override // kotlinx.serialization.DeserializationStrategy
    public Collection deserialize(Decoder decoder) {
        C9971q.m14633g(decoder, "decoder");
        return m33968f(decoder, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo13776e(Collection collection);

    /* renamed from: f */
    public final Collection m33968f(Decoder decoder, Collection collection) {
        Builder builder;
        C9971q.m14633g(decoder, "decoder");
        if (collection == null || (builder = mo13774k(collection)) == null) {
            builder = mo33780a();
        }
        int b = mo33779b(builder);
        AbstractC10248c b2 = decoder.mo13905b(getDescriptor());
        if (!b2.mo13850p()) {
            while (true) {
                int o = b2.mo13851o(getDescriptor());
                if (o == -1) {
                    break;
                }
                m33967i(this, b2, b + o, builder, false, 8, null);
            }
        } else {
            mo33739g(b2, builder, b, m33966j(b2, builder));
        }
        b2.mo13857c(getDescriptor());
        return mo33776l(builder);
    }

    /* renamed from: g */
    protected abstract void mo33739g(AbstractC10248c cVar, Builder builder, int i, int i2);

    /* renamed from: h */
    protected abstract void mo13775h(AbstractC10248c cVar, int i, Builder builder, boolean z);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public abstract Builder mo13774k(Collection collection);

    /* renamed from: l */
    protected abstract Collection mo33776l(Builder builder);
}

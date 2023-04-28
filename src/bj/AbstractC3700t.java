package bj;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlinx.serialization.KSerializer;

@Metadata(m15074d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002*\u0004\b\u0002\u0010\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0007\u001a\u00020\u0006*\u00028\u0001H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t*\u00028\u0001H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0010"}, m15073d2 = {"Lbj/t;", "E", "", "C", "B", "Lbj/s;", "", "p", "(Ljava/util/Collection;)I", "", "o", "(Ljava/util/Collection;)Ljava/util/Iterator;", "Lkotlinx/serialization/KSerializer;", "element", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.t */
/* loaded from: classes8.dex */
public abstract class AbstractC3700t<E, C extends Collection<? extends E>, B> extends AbstractC3697s<E, C, B> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3700t(KSerializer<E> element) {
        super(element, null);
        C9971q.m14633g(element, "element");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public Iterator<E> mo33777d(C c) {
        C9971q.m14633g(c, "<this>");
        return c.iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public int mo13776e(C c) {
        C9971q.m14633g(c, "<this>");
        return c.size();
    }
}

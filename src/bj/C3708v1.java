package bj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9897e;
import kotlin.jvm.internal.C9941b;
import kotlin.jvm.internal.C9971q;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(m15074d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\n\b\u0001\u0010\u0003*\u0004\u0018\u00018\u00002*\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00070\u0004B#\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00010%¢\u0006\u0004\b'\u0010(J\u0019\u0010\t\u001a\u00020\b*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014J\u001c\u0010\u000f\u001a\u00020\b*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014J)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0016\u001a\u00020\u0015*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00072\u0006\u0010\u0014\u001a\u00020\bH\u0014J3\u0010\u0019\u001a\u00020\u0015*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00072\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010$\u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006)"}, m15073d2 = {"Lbj/v1;", "", "ElementKlass", "Element", "Lbj/s;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "", "s", "([Ljava/lang/Object;)I", "", "r", "([Ljava/lang/Object;)Ljava/util/Iterator;", "o", "p", "v", "(Ljava/util/ArrayList;)[Ljava/lang/Object;", "u", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "size", "", "q", "index", "element", "t", "(Ljava/util/ArrayList;ILjava/lang/Object;)V", "Lkotlin/reflect/KClass;", "b", "Lkotlin/reflect/KClass;", "kClass", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/KSerializer;", "eSerializer", "<init>", "(Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: bj.v1 */
/* loaded from: classes8.dex */
public final class C3708v1<ElementKlass, Element extends ElementKlass> extends AbstractC3697s<Element, Element[], ArrayList<Element>> {

    /* renamed from: b */
    private final KClass<ElementKlass> f6029b;

    /* renamed from: c */
    private final SerialDescriptor f6030c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3708v1(KClass<ElementKlass> kClass, KSerializer<Element> eSerializer) {
        super(eSerializer, null);
        C9971q.m14633g(kClass, "kClass");
        C9971q.m14633g(eSerializer, "eSerializer");
        this.f6029b = kClass;
        this.f6030c = new C3634d(eSerializer.getDescriptor());
    }

    @Override // bj.AbstractC3697s, kotlinx.serialization.KSerializer, p449yi.AbstractC14437h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.f6030c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public ArrayList<Element> mo33780a() {
        return new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public int mo33779b(ArrayList<Element> arrayList) {
        C9971q.m14633g(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public void mo33778c(ArrayList<Element> arrayList, int i) {
        C9971q.m14633g(arrayList, "<this>");
        arrayList.ensureCapacity(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public Iterator<Element> mo33777d(Element[] elementArr) {
        C9971q.m14633g(elementArr, "<this>");
        return C9941b.m14688a(elementArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public int mo13776e(Element[] elementArr) {
        C9971q.m14633g(elementArr, "<this>");
        return elementArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public void mo33775n(ArrayList<Element> arrayList, int i, Element element) {
        C9971q.m14633g(arrayList, "<this>");
        arrayList.add(i, element);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public ArrayList<Element> mo13774k(Element[] elementArr) {
        List d;
        C9971q.m14633g(elementArr, "<this>");
        d = C9897e.m14991d(elementArr);
        return new ArrayList<>(d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public Element[] mo33776l(ArrayList<Element> arrayList) {
        C9971q.m14633g(arrayList, "<this>");
        return (Element[]) C3673l1.m33837n(arrayList, this.f6029b);
    }
}

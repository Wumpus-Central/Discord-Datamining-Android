package kotlinx.serialization.json;

import ag.AbstractC1385a;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.C9914r;
import kotlin.jvm.internal.C9957i;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import p163j$.lang.Iterable$CC;
import p163j$.util.Collection;
import p163j$.util.function.Consumer;
import p163j$.util.function.Predicate;
import p163j$.util.function.UnaryOperator;
import p449yi.AbstractC14435f;

@AbstractC14435f(with = C10269a.class)
@Metadata(m15074d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 $2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001$B\u0015\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\"\u0010#J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0001H\u0096\u0003J\u0017\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0096\u0001J\u0011\u0010\u000b\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\tH\u0096\u0003J\u0011\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0001H\u0096\u0001J\t\u0010\r\u001a\u00020\u0004H\u0096\u0001J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0096\u0003J\u0011\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0001H\u0096\u0001J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0096\u0001J\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\u0006\u0010\n\u001a\u00020\tH\u0096\u0001J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0096\u0001J\u0013\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0019\u001a\u00020\tH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, m15073d2 = {"Lkotlinx/serialization/json/JsonArray;", "Lkotlinx/serialization/json/JsonElement;", "", "element", "", "a", "", "elements", "containsAll", "", "index", "b", "g", "isEmpty", "", "iterator", "i", "", "listIterator", "fromIndex", "toIndex", "subList", "", "other", "equals", "hashCode", "", "toString", "k", "Ljava/util/List;", "content", "f", "()I", "size", "<init>", "(Ljava/util/List;)V", "Companion", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class JsonArray extends JsonElement implements List<JsonElement>, AbstractC1385a, p163j$.util.List {
    public static final Companion Companion = new Companion(null);

    /* renamed from: k */
    private final List<JsonElement> f22547k;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lkotlinx/serialization/json/JsonArray$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonArray;", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<JsonArray> serializer() {
            return C10269a.f22566a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public JsonArray(List<? extends JsonElement> content) {
        super(null);
        C9971q.m14633g(content, "content");
        this.f22547k = content;
    }

    /* renamed from: a */
    public boolean m13763a(JsonElement element) {
        C9971q.m14633g(element, "element");
        return this.f22547k.contains(element);
    }

    @Override // java.util.List, p163j$.util.List
    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, p163j$.util.List, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, p163j$.util.List
    public boolean addAll(int i, Collection<? extends JsonElement> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, p163j$.util.List, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public boolean addAll(Collection<? extends JsonElement> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public JsonElement get(int i) {
        return this.f22547k.get(i);
    }

    @Override // java.util.List, java.util.Collection, p163j$.util.List, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, p163j$.util.List, p163j$.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return false;
        }
        return m13763a((JsonElement) obj);
    }

    @Override // java.util.List, java.util.Collection, p163j$.util.List, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public boolean containsAll(Collection<? extends Object> elements) {
        C9971q.m14633g(elements, "elements");
        return this.f22547k.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection, p163j$.util.List, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public boolean equals(Object obj) {
        return C9971q.m14638b(this.f22547k, obj);
    }

    /* renamed from: f */
    public int m13761f() {
        return this.f22547k.size();
    }

    @Override // p163j$.util.Collection, p163j$.lang.AbstractC9165a
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.lang.Iterable
    public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    /* renamed from: g */
    public int m13760g(JsonElement element) {
        C9971q.m14633g(element, "element");
        return this.f22547k.indexOf(element);
    }

    @Override // java.util.List, java.util.Collection, p163j$.util.List, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public int hashCode() {
        return this.f22547k.hashCode();
    }

    /* renamed from: i */
    public int m13759i(JsonElement element) {
        C9971q.m14633g(element, "element");
        return this.f22547k.lastIndexOf(element);
    }

    @Override // java.util.List, p163j$.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return -1;
        }
        return m13760g((JsonElement) obj);
    }

    @Override // java.util.List, java.util.Collection, p163j$.util.List, p163j$.util.Collection
    public boolean isEmpty() {
        return this.f22547k.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, p163j$.util.List, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public Iterator<JsonElement> iterator() {
        return this.f22547k.iterator();
    }

    @Override // java.util.List, p163j$.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return -1;
        }
        return m13759i((JsonElement) obj);
    }

    @Override // java.util.List, p163j$.util.List
    public ListIterator<JsonElement> listIterator() {
        return this.f22547k.listIterator();
    }

    @Override // java.util.List, p163j$.util.List
    public ListIterator<JsonElement> listIterator(int i) {
        return this.f22547k.listIterator(i);
    }

    @Override // java.util.List, p163j$.util.List
    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, p163j$.util.List, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, p163j$.util.List, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p163j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.Collection
    public /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        return removeIf(Predicate.VivifiedWrapper.convert(predicate));
    }

    @Override // p163j$.util.List
    public void replaceAll(UnaryOperator<JsonElement> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* synthetic */ void replaceAll(java.util.function.UnaryOperator<JsonElement> unaryOperator) {
        replaceAll(UnaryOperator.VivifiedWrapper.convert(unaryOperator));
    }

    @Override // java.util.List, java.util.Collection, p163j$.util.List, p163j$.util.Collection, java.util.Set, p163j$.util.Set
    public boolean retainAll(java.util.Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, p163j$.util.List
    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, p163j$.util.List, p163j$.util.Collection
    public final /* bridge */ int size() {
        return m13761f();
    }

    @Override // java.util.List, p163j$.util.List
    public void sort(Comparator<? super JsonElement> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, p163j$.util.List
    public List<JsonElement> subList(int i, int i2) {
        return this.f22547k.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection, p163j$.util.List, p163j$.util.Collection
    public Object[] toArray() {
        return C9957i.m14662a(this);
    }

    @Override // java.util.List, java.util.Collection, p163j$.util.List, p163j$.util.Collection
    public <T> T[] toArray(T[] array) {
        C9971q.m14633g(array, "array");
        return (T[]) C9957i.m14661b(this, array);
    }

    public String toString() {
        String e0;
        e0 = C9914r.m14760e0(this.f22547k, ",", "[", "]", 0, null, null, 56, null);
        return e0;
    }
}

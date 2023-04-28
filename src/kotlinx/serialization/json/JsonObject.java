package kotlinx.serialization.json;

import ag.AbstractC1385a;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C9914r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import p045cj.C4066r0;
import p163j$.util.Map;
import p163j$.util.function.BiConsumer;
import p163j$.util.function.BiFunction;
import p163j$.util.function.Function;
import p449yi.AbstractC14435f;

@AbstractC14435f(with = C10292r.class)
@Metadata(m15074d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\b\u0007\b\u0007\u0018\u0000 $2\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002:\u0001$B\u001b\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\"\u0010#J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0011\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0001H\u0096\u0001J\u0013\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0003J\t\u0010\n\u001a\u00020\u0005H\u0096\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R&\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00150\u00148\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00148\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, m15073d2 = {"Lkotlinx/serialization/json/JsonObject;", "Lkotlinx/serialization/json/JsonElement;", "", "", "key", "", "a", "value", "b", "f", "isEmpty", "", "other", "equals", "", "hashCode", "toString", "k", "Ljava/util/Map;", "content", "", "", "g", "()Ljava/util/Set;", "entries", "i", "keys", "j", "()I", "size", "", "p", "()Ljava/util/Collection;", "values", "<init>", "(Ljava/util/Map;)V", "Companion", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class JsonObject extends JsonElement implements Map<String, JsonElement>, AbstractC1385a, p163j$.util.Map {
    public static final Companion Companion = new Companion(null);

    /* renamed from: k */
    private final Map<String, JsonElement> f22564k;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lkotlinx/serialization/json/JsonObject$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonObject;", "kotlinx-serialization-json"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<JsonObject> serializer() {
            return C10292r.f22600a;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m15073d2 = {"", "", "Lkotlinx/serialization/json/JsonElement;", "<name for destructuring parameter 0>", "", "a", "(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: kotlinx.serialization.json.JsonObject$a */
    /* loaded from: classes8.dex */
    static final class C10268a extends AbstractC9973s implements Function1<Map.Entry<? extends String, ? extends JsonElement>, CharSequence> {

        /* renamed from: k */
        public static final C10268a f22565k = new C10268a();

        C10268a() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(Map.Entry<String, ? extends JsonElement> entry) {
            C9971q.m14633g(entry, "<name for destructuring parameter 0>");
            StringBuilder sb2 = new StringBuilder();
            C4066r0.m32893c(sb2, entry.getKey());
            sb2.append(':');
            sb2.append((JsonElement) entry.getValue());
            String sb3 = sb2.toString();
            C9971q.m14634f(sb3, "StringBuilder().apply(builderAction).toString()");
            return sb3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public JsonObject(Map<String, ? extends JsonElement> content) {
        super(null);
        C9971q.m14633g(content, "content");
        this.f22564k = content;
    }

    /* renamed from: a */
    public boolean m13754a(String key) {
        C9971q.m14633g(key, "key");
        return this.f22564k.containsKey(key);
    }

    /* renamed from: b */
    public boolean m13753b(JsonElement value) {
        C9971q.m14633g(value, "value");
        return this.f22564k.containsValue(value);
    }

    @Override // java.util.Map, p163j$.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p163j$.util.Map
    public /* bridge */ /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.serialization.json.JsonElement, java.lang.Object] */
    @Override // java.util.Map
    public /* synthetic */ JsonElement compute(String str, java.util.function.BiFunction<? super String, ? super JsonElement, ? extends JsonElement> biFunction) {
        return compute(str, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // p163j$.util.Map
    public /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.serialization.json.JsonElement, java.lang.Object] */
    @Override // java.util.Map
    public /* synthetic */ JsonElement computeIfAbsent(String str, java.util.function.Function<? super String, ? extends JsonElement> function) {
        return computeIfAbsent(str, Function.VivifiedWrapper.convert(function));
    }

    @Override // p163j$.util.Map
    public /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.serialization.json.JsonElement, java.lang.Object] */
    @Override // java.util.Map
    public /* synthetic */ JsonElement computeIfPresent(String str, java.util.function.BiFunction<? super String, ? super JsonElement, ? extends JsonElement> biFunction) {
        return computeIfPresent(str, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, p163j$.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return m13754a((String) obj);
    }

    @Override // java.util.Map, p163j$.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return false;
        }
        return m13753b((JsonElement) obj);
    }

    @Override // java.util.Map, p163j$.util.Map
    public final /* bridge */ Set<Map.Entry<String, JsonElement>> entrySet() {
        return m13751g();
    }

    @Override // java.util.Map, p163j$.util.Map
    public boolean equals(Object obj) {
        return C9971q.m14638b(this.f22564k, obj);
    }

    /* renamed from: f */
    public JsonElement m13752f(String key) {
        C9971q.m14633g(key, "key");
        return this.f22564k.get(key);
    }

    @Override // p163j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public /* synthetic */ void forEach(java.util.function.BiConsumer<? super String, ? super JsonElement> biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    /* renamed from: g */
    public Set<Map.Entry<String, JsonElement>> m13751g() {
        return this.f22564k.entrySet();
    }

    @Override // java.util.Map, p163j$.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return m13752f((String) obj);
    }

    @Override // java.util.Map, p163j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return get(obj);
    }

    @Override // java.util.Map, p163j$.util.Map
    public int hashCode() {
        return this.f22564k.hashCode();
    }

    /* renamed from: i */
    public Set<String> m13750i() {
        return this.f22564k.keySet();
    }

    @Override // java.util.Map, p163j$.util.Map
    public boolean isEmpty() {
        return this.f22564k.isEmpty();
    }

    /* renamed from: j */
    public int m13749j() {
        return this.f22564k.size();
    }

    @Override // java.util.Map, p163j$.util.Map
    public final /* bridge */ Set<String> keySet() {
        return m13750i();
    }

    @Override // p163j$.util.Map
    public /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.serialization.json.JsonElement, java.lang.Object] */
    @Override // java.util.Map
    public /* synthetic */ JsonElement merge(String str, JsonElement jsonElement, java.util.function.BiFunction<? super JsonElement, ? super JsonElement, ? extends JsonElement> biFunction) {
        return merge(str, jsonElement, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    /* renamed from: p */
    public Collection<JsonElement> m13748p() {
        return this.f22564k.values();
    }

    @Override // java.util.Map, p163j$.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, p163j$.util.Map
    public void putAll(java.util.Map<? extends String, ? extends JsonElement> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, p163j$.util.Map
    public /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: r */
    public JsonElement remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, p163j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, p163j$.util.Map
    public /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, p163j$.util.Map
    public /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p163j$.util.Map
    public void replaceAll(BiFunction<? super String, ? super JsonElement, ? extends JsonElement> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ void replaceAll(java.util.function.BiFunction<? super String, ? super JsonElement, ? extends JsonElement> biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, p163j$.util.Map
    public final /* bridge */ int size() {
        return m13749j();
    }

    public String toString() {
        String e0;
        e0 = C9914r.m14760e0(this.f22564k.entrySet(), ",", "{", "}", 0, null, C10268a.f22565k, 24, null);
        return e0;
    }

    @Override // java.util.Map, p163j$.util.Map
    public final /* bridge */ Collection<JsonElement> values() {
        return m13748p();
    }
}

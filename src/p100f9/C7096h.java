package p100f9;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p030bc.C3452d;

/* renamed from: f9.h */
/* loaded from: classes5.dex */
public final class C7096h implements AbstractC7094f {

    /* renamed from: c */
    public static final C7096h f15479c = new C7096h(Collections.emptyMap());

    /* renamed from: a */
    private int f15480a;

    /* renamed from: b */
    private final Map<String, byte[]> f15481b;

    public C7096h() {
        this(Collections.emptyMap());
    }

    /* renamed from: c */
    private static void m23417c(HashMap<String, byte[]> hashMap, Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), m23413g(entry.getValue()));
        }
    }

    /* renamed from: d */
    private static Map<String, byte[]> m23416d(Map<String, byte[]> map, C7095g gVar) {
        HashMap hashMap = new HashMap(map);
        m23411i(hashMap, gVar.m23425c());
        m23417c(hashMap, gVar.m23426b());
        return hashMap;
    }

    /* renamed from: g */
    private static byte[] m23413g(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(C3452d.f5595c);
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    private static boolean m23412h(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i */
    private static void m23411i(HashMap<String, byte[]> hashMap, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            hashMap.remove(list.get(i));
        }
    }

    @Override // p100f9.AbstractC7094f
    /* renamed from: a */
    public final long mo23419a(String str, long j) {
        byte[] bArr = this.f15481b.get(str);
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return j;
    }

    @Override // p100f9.AbstractC7094f
    /* renamed from: b */
    public final String mo23418b(String str, String str2) {
        byte[] bArr = this.f15481b.get(str);
        if (bArr != null) {
            return new String(bArr, C3452d.f5595c);
        }
        return str2;
    }

    /* renamed from: e */
    public C7096h m23415e(C7095g gVar) {
        Map<String, byte[]> d = m23416d(this.f15481b, gVar);
        if (m23412h(this.f15481b, d)) {
            return this;
        }
        return new C7096h(d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7096h.class != obj.getClass()) {
            return false;
        }
        return m23412h(this.f15481b, ((C7096h) obj).f15481b);
    }

    /* renamed from: f */
    public Set<Map.Entry<String, byte[]>> m23414f() {
        return this.f15481b.entrySet();
    }

    public int hashCode() {
        if (this.f15480a == 0) {
            int i = 0;
            for (Map.Entry<String, byte[]> entry : this.f15481b.entrySet()) {
                i += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f15480a = i;
        }
        return this.f15480a;
    }

    public C7096h(Map<String, byte[]> map) {
        this.f15481b = Collections.unmodifiableMap(map);
    }
}

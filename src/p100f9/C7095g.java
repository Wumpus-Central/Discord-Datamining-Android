package p100f9;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p119g9.C7510a;

/* renamed from: f9.g */
/* loaded from: classes5.dex */
public class C7095g {

    /* renamed from: a */
    private final Map<String, Object> f15477a = new HashMap();

    /* renamed from: b */
    private final List<String> f15478b = new ArrayList();

    /* renamed from: a */
    private C7095g m23427a(String str, Object obj) {
        this.f15477a.put((String) C7510a.m22367e(str), C7510a.m22367e(obj));
        this.f15478b.remove(str);
        return this;
    }

    /* renamed from: g */
    public static C7095g m23421g(C7095g gVar, long j) {
        return gVar.m23423e("exo_len", j);
    }

    /* renamed from: h */
    public static C7095g m23420h(C7095g gVar, Uri uri) {
        if (uri == null) {
            return gVar.m23424d("exo_redir");
        }
        return gVar.m23422f("exo_redir", uri.toString());
    }

    /* renamed from: b */
    public Map<String, Object> m23426b() {
        HashMap hashMap = new HashMap(this.f15477a);
        for (Map.Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: c */
    public List<String> m23425c() {
        return Collections.unmodifiableList(new ArrayList(this.f15478b));
    }

    /* renamed from: d */
    public C7095g m23424d(String str) {
        this.f15478b.add(str);
        this.f15477a.remove(str);
        return this;
    }

    /* renamed from: e */
    public C7095g m23423e(String str, long j) {
        return m23427a(str, Long.valueOf(j));
    }

    /* renamed from: f */
    public C7095g m23422f(String str, String str2) {
        return m23427a(str, str2);
    }
}

package p440y8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p119g9.C7510a;
import p317r8.C12453b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y8.d */
/* loaded from: classes7.dex */
public final class C14315d {

    /* renamed from: a */
    public final String f32388a;

    /* renamed from: b */
    public final String f32389b;

    /* renamed from: c */
    public final boolean f32390c;

    /* renamed from: d */
    public final long f32391d;

    /* renamed from: e */
    public final long f32392e;

    /* renamed from: f */
    public final C14318g f32393f;

    /* renamed from: g */
    private final String[] f32394g;

    /* renamed from: h */
    public final String f32395h;

    /* renamed from: i */
    public final String f32396i;

    /* renamed from: j */
    public final C14315d f32397j;

    /* renamed from: k */
    private final HashMap<String, Integer> f32398k;

    /* renamed from: l */
    private final HashMap<String, Integer> f32399l;

    /* renamed from: m */
    private List<C14315d> f32400m;

    private C14315d(String str, String str2, long j, long j2, C14318g gVar, String[] strArr, String str3, String str4, C14315d dVar) {
        boolean z;
        this.f32388a = str;
        this.f32389b = str2;
        this.f32396i = str4;
        this.f32393f = gVar;
        this.f32394g = strArr;
        if (str2 != null) {
            z = true;
        } else {
            z = false;
        }
        this.f32390c = z;
        this.f32391d = j;
        this.f32392e = j2;
        this.f32395h = (String) C7510a.m22367e(str3);
        this.f32397j = dVar;
        this.f32398k = new HashMap<>();
        this.f32399l = new HashMap<>();
    }

    /* renamed from: b */
    private void m939b(Map<String, C14318g> map, C12453b.C0400b bVar, int i, int i2, int i3) {
        C14318g f = C14317f.m919f(this.f32393f, this.f32394g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.m6691e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.m6682n(spannableStringBuilder);
        }
        if (f != null) {
            C14317f.m924a(spannableStringBuilder, i, i2, f, this.f32397j, map, i3);
            if (f.m900j() != Float.MAX_VALUE && "p".equals(this.f32388a)) {
                bVar.m6684l((f.m900j() * (-90.0f)) / 100.0f);
            }
            bVar.m6681o(f.m898l());
        }
    }

    /* renamed from: c */
    public static C14315d m938c(String str, long j, long j2, C14318g gVar, String[] strArr, String str2, String str3, C14315d dVar) {
        return new C14315d(str, null, j, j2, gVar, strArr, str2, str3, dVar);
    }

    /* renamed from: d */
    public static C14315d m937d(String str) {
        return new C14315d(null, C14317f.m923b(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* renamed from: e */
    private static void m936e(SpannableStringBuilder spannableStringBuilder) {
        C14310a[] aVarArr;
        for (C14310a aVar : (C14310a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C14310a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
        }
        for (int i = 0; i < spannableStringBuilder.length(); i++) {
            if (spannableStringBuilder.charAt(i) == ' ') {
                int i2 = i + 1;
                int i3 = i2;
                while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                    i3++;
                }
                int i4 = i3 - i2;
                if (i4 > 0) {
                    spannableStringBuilder.delete(i, i4 + i);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
            if (spannableStringBuilder.charAt(i5) == '\n') {
                int i6 = i5 + 1;
                if (spannableStringBuilder.charAt(i6) == ' ') {
                    spannableStringBuilder.delete(i6, i5 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
            if (spannableStringBuilder.charAt(i7) == ' ') {
                int i8 = i7 + 1;
                if (spannableStringBuilder.charAt(i8) == '\n') {
                    spannableStringBuilder.delete(i7, i8);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
    }

    /* renamed from: i */
    private void m932i(TreeSet<Long> treeSet, boolean z) {
        boolean z2;
        boolean equals = "p".equals(this.f32388a);
        boolean equals2 = "div".equals(this.f32388a);
        if (z || equals || (equals2 && this.f32396i != null)) {
            long j = this.f32391d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f32392e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f32400m != null) {
            for (int i = 0; i < this.f32400m.size(); i++) {
                C14315d dVar = this.f32400m.get(i);
                if (z || equals) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                dVar.m932i(treeSet, z2);
            }
        }
    }

    /* renamed from: k */
    private static SpannableStringBuilder m930k(String str, Map<String, C12453b.C0400b> map) {
        if (!map.containsKey(str)) {
            C12453b.C0400b bVar = new C12453b.C0400b();
            bVar.m6682n(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) C7510a.m22367e(map.get(str).m6691e());
    }

    /* renamed from: n */
    private void m927n(long j, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f32395h)) {
            str = this.f32395h;
        }
        if (!m928m(j) || !"div".equals(this.f32388a) || this.f32396i == null) {
            for (int i = 0; i < m934g(); i++) {
                m935f(i).m927n(j, str, list);
            }
            return;
        }
        list.add(new Pair<>(str, this.f32396i));
    }

    /* renamed from: o */
    private void m926o(long j, Map<String, C14318g> map, Map<String, C14316e> map2, String str, Map<String, C12453b.C0400b> map3) {
        String str2;
        int i;
        if (m928m(j)) {
            if ("".equals(this.f32395h)) {
                str2 = str;
            } else {
                str2 = this.f32395h;
            }
            Iterator<Map.Entry<String, Integer>> it = this.f32399l.entrySet().iterator();
            while (true) {
                i = 0;
                if (it.hasNext()) {
                    Map.Entry<String, Integer> next = it.next();
                    String key = next.getKey();
                    if (this.f32398k.containsKey(key)) {
                        i = this.f32398k.get(key).intValue();
                    }
                    int intValue = next.getValue().intValue();
                    if (i != intValue) {
                        m939b(map, (C12453b.C0400b) C7510a.m22367e(map3.get(key)), i, intValue, ((C14316e) C7510a.m22367e(map2.get(str2))).f32410j);
                    }
                }
            }
            while (i < m934g()) {
                m935f(i).m926o(j, map, map2, str2, map3);
                i++;
            }
        }
    }

    /* renamed from: p */
    private void m925p(long j, boolean z, String str, Map<String, C12453b.C0400b> map) {
        boolean z2;
        this.f32398k.clear();
        this.f32399l.clear();
        if (!"metadata".equals(this.f32388a)) {
            if (!"".equals(this.f32395h)) {
                str = this.f32395h;
            }
            if (this.f32390c && z) {
                m930k(str, map).append((CharSequence) C7510a.m22367e(this.f32389b));
            } else if ("br".equals(this.f32388a) && z) {
                m930k(str, map).append('\n');
            } else if (m928m(j)) {
                for (Map.Entry<String, C12453b.C0400b> entry : map.entrySet()) {
                    this.f32398k.put(entry.getKey(), Integer.valueOf(((CharSequence) C7510a.m22367e(entry.getValue().m6691e())).length()));
                }
                boolean equals = "p".equals(this.f32388a);
                for (int i = 0; i < m934g(); i++) {
                    C14315d f = m935f(i);
                    if (z || equals) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    f.m925p(j, z2, str, map);
                }
                if (equals) {
                    C14317f.m922c(m930k(str, map));
                }
                for (Map.Entry<String, C12453b.C0400b> entry2 : map.entrySet()) {
                    this.f32399l.put(entry2.getKey(), Integer.valueOf(((CharSequence) C7510a.m22367e(entry2.getValue().m6691e())).length()));
                }
            }
        }
    }

    /* renamed from: a */
    public void m940a(C14315d dVar) {
        if (this.f32400m == null) {
            this.f32400m = new ArrayList();
        }
        this.f32400m.add(dVar);
    }

    /* renamed from: f */
    public C14315d m935f(int i) {
        List<C14315d> list = this.f32400m;
        if (list != null) {
            return list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: g */
    public int m934g() {
        List<C14315d> list = this.f32400m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: h */
    public List<C12453b> m933h(long j, Map<String, C14318g> map, Map<String, C14316e> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        m927n(j, this.f32395h, arrayList);
        TreeMap treeMap = new TreeMap();
        m925p(j, false, this.f32395h, treeMap);
        m926o(j, map, map2, this.f32395h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                C14316e eVar = (C14316e) C7510a.m22367e(map2.get(pair.first));
                arrayList2.add(new C12453b.C0400b().m6690f(decodeByteArray).m6686j(eVar.f32402b).m6685k(0).m6688h(eVar.f32403c, 0).m6687i(eVar.f32405e).m6683m(eVar.f32406f).m6689g(eVar.f32407g).m6679q(eVar.f32410j).m6695a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C14316e eVar2 = (C14316e) C7510a.m22367e(map2.get(entry.getKey()));
            C12453b.C0400b bVar = (C12453b.C0400b) entry.getValue();
            m936e((SpannableStringBuilder) C7510a.m22367e(bVar.m6691e()));
            bVar.m6688h(eVar2.f32403c, eVar2.f32404d);
            bVar.m6687i(eVar2.f32405e);
            bVar.m6686j(eVar2.f32402b);
            bVar.m6683m(eVar2.f32406f);
            bVar.m6680p(eVar2.f32409i, eVar2.f32408h);
            bVar.m6679q(eVar2.f32410j);
            arrayList2.add(bVar.m6695a());
        }
        return arrayList2;
    }

    /* renamed from: j */
    public long[] m931j() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        m932i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    /* renamed from: l */
    public String[] m929l() {
        return this.f32394g;
    }

    /* renamed from: m */
    public boolean m928m(long j) {
        long j2 = this.f32391d;
        return (j2 == -9223372036854775807L && this.f32392e == -9223372036854775807L) || (j2 <= j && this.f32392e == -9223372036854775807L) || ((j2 == -9223372036854775807L && j < this.f32392e) || (j2 <= j && j < this.f32392e));
    }
}

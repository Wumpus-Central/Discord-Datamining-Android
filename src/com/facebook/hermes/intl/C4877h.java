package com.facebook.hermes.intl;

import android.text.TextUtils;
import com.facebook.hermes.intl.C4881k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import p129h5.AbstractC7805b;
import p129h5.C7848j;

/* renamed from: com.facebook.hermes.intl.h */
/* loaded from: classes7.dex */
public class C4877h implements AbstractC7805b<Locale> {

    /* renamed from: a */
    private Locale f8068a;

    /* renamed from: b */
    private C4881k f8069b;

    /* renamed from: c */
    private boolean f8070c;

    private C4877h(Locale locale) {
        this.f8069b = null;
        this.f8070c = false;
        this.f8068a = locale;
    }

    /* renamed from: i */
    public static AbstractC7805b<Locale> m31575i() {
        return new C4877h(Locale.getDefault());
    }

    /* renamed from: j */
    public static AbstractC7805b<Locale> m31574j(String str) {
        return new C4877h(str);
    }

    /* renamed from: k */
    private void m31573k() {
        if (this.f8070c) {
            try {
                m31569o();
                this.f8070c = false;
            } catch (RuntimeException e) {
                throw new C7848j(e.getMessage());
            }
        }
    }

    /* renamed from: l */
    private void m31572l() {
        if (this.f8069b == null) {
            this.f8069b = C4874f.m31592f(this.f8068a.toLanguageTag());
        }
    }

    /* renamed from: o */
    private void m31569o() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuffer stringBuffer3 = new StringBuffer();
        StringBuffer stringBuffer4 = new StringBuffer();
        String str = this.f8069b.f8074a.f8081a;
        if (str != null && !str.isEmpty()) {
            stringBuffer2.append(this.f8069b.f8074a.f8081a);
        }
        String str2 = this.f8069b.f8074a.f8082b;
        if (str2 != null && !str2.isEmpty()) {
            stringBuffer3.append(this.f8069b.f8074a.f8082b);
        }
        String str3 = this.f8069b.f8074a.f8083c;
        if (str3 != null && !str3.isEmpty()) {
            stringBuffer4.append(this.f8069b.f8074a.f8083c);
        }
        C4874f.m31585m(stringBuffer2, stringBuffer3, stringBuffer4);
        if (stringBuffer2.length() > 0) {
            stringBuffer.append(stringBuffer2.toString());
        }
        if (stringBuffer3.length() > 0) {
            stringBuffer.append("-");
            stringBuffer.append(stringBuffer3.toString());
        }
        if (stringBuffer4.length() > 0) {
            stringBuffer.append("-");
            stringBuffer.append(C4874f.m31584n(stringBuffer4));
        }
        ArrayList<String> arrayList = this.f8069b.f8074a.f8084d;
        if (arrayList != null && !arrayList.isEmpty()) {
            stringBuffer.append("-");
            stringBuffer.append(TextUtils.join("-", this.f8069b.f8074a.f8084d));
        }
        TreeMap<Character, ArrayList<String>> treeMap = this.f8069b.f8079f;
        if (treeMap != null) {
            for (Map.Entry<Character, ArrayList<String>> entry : treeMap.entrySet()) {
                stringBuffer.append("-");
                stringBuffer.append(entry.getKey());
                stringBuffer.append("-");
                stringBuffer.append(TextUtils.join("-", entry.getValue()));
            }
        }
        C4881k kVar = this.f8069b;
        if (!(kVar.f8077d == null && kVar.f8078e == null)) {
            stringBuffer.append("-");
            stringBuffer.append('t');
            stringBuffer.append("-");
            StringBuffer stringBuffer5 = new StringBuffer();
            C4881k.C4882a aVar = this.f8069b.f8077d;
            if (aVar != null) {
                stringBuffer5.append(aVar.f8081a);
                if (this.f8069b.f8077d.f8082b != null) {
                    stringBuffer5.append("-");
                    stringBuffer5.append(this.f8069b.f8077d.f8082b);
                }
                if (this.f8069b.f8077d.f8083c != null) {
                    stringBuffer5.append("-");
                    stringBuffer5.append(this.f8069b.f8077d.f8083c);
                }
                ArrayList<String> arrayList2 = this.f8069b.f8077d.f8084d;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    stringBuffer5.append("-");
                    stringBuffer5.append(TextUtils.join("-", this.f8069b.f8077d.f8084d));
                }
            }
            TreeMap<String, ArrayList<String>> treeMap2 = this.f8069b.f8078e;
            if (treeMap2 != null) {
                for (Map.Entry<String, ArrayList<String>> entry2 : treeMap2.entrySet()) {
                    stringBuffer5.append("-" + entry2.getKey());
                    Iterator<String> it = entry2.getValue().iterator();
                    while (it.hasNext()) {
                        stringBuffer5.append("-" + it.next());
                    }
                }
                if (stringBuffer5.length() > 0 && stringBuffer5.charAt(0) == '-') {
                    stringBuffer5.deleteCharAt(0);
                }
            }
            stringBuffer.append(stringBuffer5.toString());
        }
        C4881k kVar2 = this.f8069b;
        if (!(kVar2.f8075b == null && kVar2.f8076c == null)) {
            stringBuffer.append("-");
            stringBuffer.append('u');
            stringBuffer.append("-");
            StringBuffer stringBuffer6 = new StringBuffer();
            ArrayList<CharSequence> arrayList3 = this.f8069b.f8075b;
            if (arrayList3 != null) {
                stringBuffer6.append(TextUtils.join("-", arrayList3));
            }
            TreeMap<String, ArrayList<String>> treeMap3 = this.f8069b.f8076c;
            if (treeMap3 != null) {
                for (Map.Entry<String, ArrayList<String>> entry3 : treeMap3.entrySet()) {
                    stringBuffer6.append("-" + entry3.getKey());
                    Iterator<String> it2 = entry3.getValue().iterator();
                    while (it2.hasNext()) {
                        stringBuffer6.append("-" + it2.next());
                    }
                }
            }
            if (stringBuffer6.length() > 0 && stringBuffer6.charAt(0) == '-') {
                stringBuffer6.deleteCharAt(0);
            }
            stringBuffer.append(stringBuffer6.toString());
        }
        if (this.f8069b.f8080g != null) {
            stringBuffer.append("-");
            stringBuffer.append('x');
            stringBuffer.append("-");
            stringBuffer.append(TextUtils.join("-", this.f8069b.f8080g));
        }
        try {
            this.f8068a = Locale.forLanguageTag(stringBuffer.toString());
            this.f8070c = false;
        } catch (RuntimeException e) {
            throw new C7848j(e.getMessage());
        }
    }

    @Override // p129h5.AbstractC7805b
    /* renamed from: a */
    public HashMap<String, String> mo21169a() {
        HashMap<String, String> hashMap = new HashMap<>();
        TreeMap<String, ArrayList<String>> treeMap = this.f8069b.f8076c;
        if (treeMap != null) {
            for (String str : treeMap.keySet()) {
                hashMap.put(str, TextUtils.join("-", this.f8069b.f8076c.get(str)));
            }
        }
        return hashMap;
    }

    @Override // p129h5.AbstractC7805b
    /* renamed from: b */
    public ArrayList<String> mo21168b(String str) {
        ArrayList<String> arrayList;
        m31573k();
        m31572l();
        TreeMap<String, ArrayList<String>> treeMap = this.f8069b.f8076c;
        if (treeMap == null || (arrayList = treeMap.get(str)) == null) {
            return new ArrayList<>();
        }
        return arrayList;
    }

    @Override // p129h5.AbstractC7805b
    /* renamed from: d */
    public AbstractC7805b<Locale> mo21166d() {
        m31573k();
        return new C4877h(this.f8068a);
    }

    @Override // p129h5.AbstractC7805b
    /* renamed from: e */
    public String mo21165e() {
        return mo21167c().toLanguageTag();
    }

    @Override // p129h5.AbstractC7805b
    /* renamed from: f */
    public void mo21164f(String str, ArrayList<String> arrayList) {
        m31573k();
        m31572l();
        C4881k kVar = this.f8069b;
        if (kVar.f8076c == null) {
            kVar.f8076c = new TreeMap<>();
        }
        if (!this.f8069b.f8076c.containsKey(str)) {
            this.f8069b.f8076c.put(str, new ArrayList<>());
        }
        this.f8069b.f8076c.get(str).clear();
        this.f8069b.f8076c.get(str).addAll(arrayList);
        this.f8070c = true;
    }

    @Override // p129h5.AbstractC7805b
    /* renamed from: g */
    public String mo21163g() {
        return mo21162h().toLanguageTag();
    }

    /* renamed from: m */
    public Locale mo21162h() {
        m31573k();
        return this.f8068a;
    }

    /* renamed from: n */
    public Locale mo21167c() {
        m31573k();
        m31572l();
        C4881k kVar = new C4881k();
        kVar.f8074a = this.f8069b.f8074a;
        return new C4877h(kVar).mo21162h();
    }

    private C4877h(String str) {
        this.f8068a = null;
        this.f8069b = null;
        this.f8070c = false;
        this.f8069b = C4874f.m31592f(str);
        m31569o();
    }

    private C4877h(C4881k kVar) {
        this.f8068a = null;
        this.f8070c = false;
        this.f8069b = kVar;
        m31569o();
    }
}

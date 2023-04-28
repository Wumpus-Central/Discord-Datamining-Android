package p129h5;

import android.icu.util.ULocale;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: h5.x */
/* loaded from: classes7.dex */
public class C7915x implements AbstractC7805b<ULocale> {

    /* renamed from: a */
    private ULocale f17023a;

    /* renamed from: b */
    private ULocale.Builder f17024b;

    /* renamed from: c */
    private boolean f17025c;

    private C7915x(ULocale uLocale) {
        this.f17024b = null;
        this.f17025c = false;
        this.f17023a = uLocale;
    }

    /* renamed from: i */
    public static AbstractC7805b<ULocale> m21161i() {
        ULocale.Category category;
        ULocale uLocale;
        category = ULocale.Category.FORMAT;
        uLocale = ULocale.getDefault(category);
        return new C7915x(uLocale);
    }

    /* renamed from: j */
    public static AbstractC7805b<ULocale> m21160j(String str) {
        return new C7915x(str);
    }

    /* renamed from: k */
    public static AbstractC7805b<ULocale> m21159k(ULocale uLocale) {
        return new C7915x(uLocale);
    }

    /* renamed from: l */
    private void m21158l() {
        ULocale build;
        if (this.f17025c) {
            try {
                build = this.f17024b.build();
                this.f17023a = build;
                this.f17025c = false;
            } catch (RuntimeException e) {
                throw new C7848j(e.getMessage());
            }
        }
    }

    @Override // p129h5.AbstractC7805b
    /* renamed from: a */
    public HashMap<String, String> mo21169a() {
        Iterator keywords;
        String keywordValue;
        m21158l();
        HashMap<String, String> hashMap = new HashMap<>();
        keywords = this.f17023a.getKeywords();
        if (keywords != null) {
            while (keywords.hasNext()) {
                String str = (String) keywords.next();
                String b = C7872n3.m21211b(str);
                keywordValue = this.f17023a.getKeywordValue(str);
                hashMap.put(b, keywordValue);
            }
        }
        return hashMap;
    }

    @Override // p129h5.AbstractC7805b
    /* renamed from: b */
    public ArrayList<String> mo21168b(String str) {
        String keywordValue;
        m21158l();
        String a = C7872n3.m21212a(str);
        ArrayList<String> arrayList = new ArrayList<>();
        keywordValue = this.f17023a.getKeywordValue(a);
        if (keywordValue != null && !keywordValue.isEmpty()) {
            Collections.addAll(arrayList, keywordValue.split("-|_"));
        }
        return arrayList;
    }

    @Override // p129h5.AbstractC7805b
    /* renamed from: d */
    public AbstractC7805b<ULocale> mo21166d() {
        m21158l();
        return new C7915x(this.f17023a);
    }

    @Override // p129h5.AbstractC7805b
    /* renamed from: e */
    public String mo21165e() {
        String languageTag;
        languageTag = mo21167c().toLanguageTag();
        return languageTag;
    }

    @Override // p129h5.AbstractC7805b
    /* renamed from: f */
    public void mo21164f(String str, ArrayList<String> arrayList) {
        ULocale.Builder locale;
        m21158l();
        if (this.f17024b == null) {
            locale = new ULocale.Builder().setLocale(this.f17023a);
            this.f17024b = locale;
        }
        try {
            this.f17024b.setUnicodeLocaleKeyword(str, TextUtils.join("-", arrayList));
            this.f17025c = true;
        } catch (RuntimeException e) {
            throw new C7848j(e.getMessage());
        }
    }

    @Override // p129h5.AbstractC7805b
    /* renamed from: g */
    public String mo21163g() {
        String languageTag;
        languageTag = mo21162h().toLanguageTag();
        return languageTag;
    }

    /* renamed from: m */
    public ULocale mo21162h() {
        m21158l();
        return this.f17023a;
    }

    /* renamed from: n */
    public ULocale mo21167c() {
        ULocale build;
        m21158l();
        ULocale.Builder builder = new ULocale.Builder();
        builder.setLocale(this.f17023a);
        builder.clearExtensions();
        build = builder.build();
        return build;
    }

    private C7915x(String str) {
        this.f17023a = null;
        this.f17024b = null;
        this.f17025c = false;
        ULocale.Builder builder = new ULocale.Builder();
        this.f17024b = builder;
        try {
            builder.setLanguageTag(str);
            this.f17025c = true;
        } catch (RuntimeException e) {
            throw new C7848j(e.getMessage());
        }
    }
}

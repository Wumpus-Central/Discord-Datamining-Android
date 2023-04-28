package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.SavedStateRegistry;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.lifecycle.u */
/* loaded from: classes.dex */
public final class C3052u {

    /* renamed from: e */
    private static final Class[] f4480e = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a */
    final Map<String, Object> f4481a;

    /* renamed from: b */
    final Map<String, SavedStateRegistry.AbstractC3154b> f4482b;

    /* renamed from: c */
    private final Map<String, Object> f4483c;

    /* renamed from: d */
    private final SavedStateRegistry.AbstractC3154b f4484d;

    /* renamed from: androidx.lifecycle.u$a */
    /* loaded from: classes.dex */
    class C3053a implements SavedStateRegistry.AbstractC3154b {
        C3053a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.AbstractC3154b
        /* renamed from: a */
        public Bundle mo35053a() {
            for (Map.Entry entry : new HashMap(C3052u.this.f4482b).entrySet()) {
                C3052u.this.m35745c((String) entry.getKey(), ((SavedStateRegistry.AbstractC3154b) entry.getValue()).mo35053a());
            }
            Set<String> keySet = C3052u.this.f4481a.keySet();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(keySet.size());
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
            for (String str : keySet) {
                arrayList.add(str);
                arrayList2.add(C3052u.this.f4481a.get(str));
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("keys", arrayList);
            bundle.putParcelableArrayList("values", arrayList2);
            return bundle;
        }
    }

    public C3052u(Map<String, Object> map) {
        this.f4482b = new HashMap();
        this.f4483c = new HashMap();
        this.f4484d = new C3053a();
        this.f4481a = new HashMap(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C3052u m35747a(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return new C3052u();
        }
        HashMap hashMap = new HashMap();
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                hashMap.put(str, bundle2.get(str));
            }
        }
        if (bundle == null) {
            return new C3052u(hashMap);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        for (int i = 0; i < parcelableArrayList.size(); i++) {
            hashMap.put((String) parcelableArrayList.get(i), parcelableArrayList2.get(i));
        }
        return new C3052u(hashMap);
    }

    /* renamed from: d */
    private static void m35744d(Object obj) {
        if (obj != null) {
            for (Class cls : f4480e) {
                if (cls.isInstance(obj)) {
                    return;
                }
            }
            throw new IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public SavedStateRegistry.AbstractC3154b m35746b() {
        return this.f4484d;
    }

    /* renamed from: c */
    public <T> void m35745c(String str, T t) {
        m35744d(t);
        MutableLiveData mutableLiveData = (MutableLiveData) this.f4483c.get(str);
        if (mutableLiveData != null) {
            mutableLiveData.mo35726o(t);
        } else {
            this.f4481a.put(str, t);
        }
    }

    public C3052u() {
        this.f4482b = new HashMap();
        this.f4483c = new HashMap();
        this.f4484d = new C3053a();
        this.f4481a = new HashMap();
    }
}

package p102fb;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fb.h */
/* loaded from: classes3.dex */
public class C7108h {

    /* renamed from: a */
    private final SimpleArrayMap<String, C7109i> f15499a = new SimpleArrayMap<>();

    /* renamed from: b */
    private final SimpleArrayMap<String, PropertyValuesHolder[]> f15500b = new SimpleArrayMap<>();

    /* renamed from: a */
    private static void m23386a(C7108h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.m23379h(objectAnimator.getPropertyName(), objectAnimator.getValues());
            hVar.m23378i(objectAnimator.getPropertyName(), C7109i.m23376b(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    /* renamed from: b */
    public static C7108h m23385b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m23384c(context, resourceId);
    }

    /* renamed from: c */
    public static C7108h m23384c(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m23383d(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m23383d(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    /* renamed from: d */
    private static C7108h m23383d(List<Animator> list) {
        C7108h hVar = new C7108h();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m23386a(hVar, list.get(i));
        }
        return hVar;
    }

    /* renamed from: e */
    public C7109i m23382e(String str) {
        if (m23380g(str)) {
            return this.f15499a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7108h)) {
            return false;
        }
        return this.f15499a.equals(((C7108h) obj).f15499a);
    }

    /* renamed from: f */
    public long m23381f() {
        int size = this.f15499a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C7109i n = this.f15499a.m39048n(i);
            j = Math.max(j, n.m23375c() + n.m23374d());
        }
        return j;
    }

    /* renamed from: g */
    public boolean m23380g(String str) {
        return this.f15499a.get(str) != null;
    }

    /* renamed from: h */
    public void m23379h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f15500b.put(str, propertyValuesHolderArr);
    }

    public int hashCode() {
        return this.f15499a.hashCode();
    }

    /* renamed from: i */
    public void m23378i(String str, C7109i iVar) {
        this.f15499a.put(str, iVar);
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f15499a + "}\n";
    }
}

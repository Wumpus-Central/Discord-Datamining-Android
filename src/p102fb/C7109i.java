package p102fb;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: fb.i */
/* loaded from: classes3.dex */
public class C7109i {

    /* renamed from: a */
    private long f15501a;

    /* renamed from: b */
    private long f15502b;

    /* renamed from: c */
    private TimeInterpolator f15503c;

    /* renamed from: d */
    private int f15504d;

    /* renamed from: e */
    private int f15505e;

    public C7109i(long j, long j2) {
        this.f15503c = null;
        this.f15504d = 0;
        this.f15505e = 1;
        this.f15501a = j;
        this.f15502b = j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C7109i m23376b(ValueAnimator valueAnimator) {
        C7109i iVar = new C7109i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m23372f(valueAnimator));
        iVar.f15504d = valueAnimator.getRepeatCount();
        iVar.f15505e = valueAnimator.getRepeatMode();
        return iVar;
    }

    /* renamed from: f */
    private static TimeInterpolator m23372f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return C7101a.f15487b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return C7101a.f15488c;
        }
        if (interpolator instanceof DecelerateInterpolator) {
            return C7101a.f15489d;
        }
        return interpolator;
    }

    /* renamed from: a */
    public void m23377a(Animator animator) {
        animator.setStartDelay(m23375c());
        animator.setDuration(m23374d());
        animator.setInterpolator(m23373e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(m23371g());
            valueAnimator.setRepeatMode(m23370h());
        }
    }

    /* renamed from: c */
    public long m23375c() {
        return this.f15501a;
    }

    /* renamed from: d */
    public long m23374d() {
        return this.f15502b;
    }

    /* renamed from: e */
    public TimeInterpolator m23373e() {
        TimeInterpolator timeInterpolator = this.f15503c;
        return timeInterpolator != null ? timeInterpolator : C7101a.f15487b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7109i)) {
            return false;
        }
        C7109i iVar = (C7109i) obj;
        if (m23375c() == iVar.m23375c() && m23374d() == iVar.m23374d() && m23371g() == iVar.m23371g() && m23370h() == iVar.m23370h()) {
            return m23373e().getClass().equals(iVar.m23373e().getClass());
        }
        return false;
    }

    /* renamed from: g */
    public int m23371g() {
        return this.f15504d;
    }

    /* renamed from: h */
    public int m23370h() {
        return this.f15505e;
    }

    public int hashCode() {
        return (((((((((int) (m23375c() ^ (m23375c() >>> 32))) * 31) + ((int) (m23374d() ^ (m23374d() >>> 32)))) * 31) + m23373e().getClass().hashCode()) * 31) + m23371g()) * 31) + m23370h();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + m23375c() + " duration: " + m23374d() + " interpolator: " + m23373e().getClass() + " repeatCount: " + m23371g() + " repeatMode: " + m23370h() + "}\n";
    }

    public C7109i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f15504d = 0;
        this.f15505e = 1;
        this.f15501a = j;
        this.f15502b = j2;
        this.f15503c = timeInterpolator;
    }
}

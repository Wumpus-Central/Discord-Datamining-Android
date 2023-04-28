package com.reactnativecommunity.slider;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.C1732v;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import java.net.URL;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import p163j$.util.Spliterator;

/* renamed from: com.reactnativecommunity.slider.a */
/* loaded from: classes6.dex */
public class C6134a extends C1732v {

    /* renamed from: s */
    private static int f12491s = 128;

    /* renamed from: k */
    private double f12492k = 0.0d;

    /* renamed from: l */
    private double f12493l = 0.0d;

    /* renamed from: m */
    private double f12494m = 0.0d;

    /* renamed from: n */
    private boolean f12495n = false;

    /* renamed from: o */
    private double f12496o = 0.0d;

    /* renamed from: p */
    private double f12497p = 0.0d;

    /* renamed from: q */
    private String f12498q;

    /* renamed from: r */
    private List<String> f12499r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.reactnativecommunity.slider.a$a */
    /* loaded from: classes6.dex */
    public class C0182a extends TimerTask {

        /* renamed from: k */
        final /* synthetic */ AccessibilityManager f12500k;

        /* renamed from: l */
        final /* synthetic */ AccessibilityEvent f12501l;

        C0182a(AccessibilityManager accessibilityManager, AccessibilityEvent accessibilityEvent) {
            this.f12500k = accessibilityManager;
            this.f12501l = accessibilityEvent;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f12500k.sendAccessibilityEvent(this.f12501l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.reactnativecommunity.slider.a$b */
    /* loaded from: classes6.dex */
    public class CallableC6135b implements Callable<BitmapDrawable> {

        /* renamed from: a */
        final /* synthetic */ String f12503a;

        CallableC6135b(String str) {
            this.f12503a = str;
        }

        /* renamed from: a */
        public BitmapDrawable call() {
            Bitmap bitmap;
            try {
                if (!this.f12503a.startsWith("http://") && !this.f12503a.startsWith("https://") && !this.f12503a.startsWith("file://") && !this.f12503a.startsWith("asset://") && !this.f12503a.startsWith("data:")) {
                    bitmap = BitmapFactory.decodeResource(C6134a.this.getResources(), C6134a.this.getResources().getIdentifier(this.f12503a, "drawable", C6134a.this.getContext().getPackageName()));
                    return new BitmapDrawable(C6134a.this.getResources(), bitmap);
                }
                bitmap = BitmapFactory.decodeStream(new URL(this.f12503a).openStream());
                return new BitmapDrawable(C6134a.this.getResources(), bitmap);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    public C6134a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setLayoutDirection(I18nUtil.getInstance().isRTL(context) ? 1 : 0);
        disableStateListAnimatorIfNeeded();
    }

    /* renamed from: a */
    private BitmapDrawable m26203a(String str) {
        try {
            return (BitmapDrawable) Executors.newSingleThreadExecutor().submit(new CallableC6135b(str)).get();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void disableStateListAnimatorIfNeeded() {
        if (Build.VERSION.SDK_INT < 26) {
            super.setStateListAnimator(null);
        }
    }

    private double getStepValue() {
        double d = this.f12496o;
        return d > 0.0d ? d : this.f12497p;
    }

    private int getTotalSteps() {
        return (int) Math.ceil((this.f12493l - this.f12492k) / getStepValue());
    }

    private void updateAll() {
        if (this.f12496o == 0.0d) {
            this.f12497p = (this.f12493l - this.f12492k) / f12491s;
        }
        setMax(getTotalSteps());
        updateValue();
    }

    private void updateValue() {
        double d = this.f12494m;
        double d2 = this.f12492k;
        setProgress((int) Math.round(((d - d2) / (this.f12493l - d2)) * getTotalSteps()));
    }

    @Override // android.view.View
    public void announceForAccessibility(CharSequence charSequence) {
        Context context = getContext();
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(Spliterator.SUBSIZED);
            obtain.setClassName(getClass().getName());
            obtain.setPackageName(context.getPackageName());
            obtain.getText().add(charSequence);
            new Timer().schedule(new C0182a(accessibilityManager, obtain), 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m26202b(boolean z) {
        this.f12495n = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m26201c() {
        return this.f12495n;
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 32768 || (accessibilityEvent.getEventType() == 4 && isAccessibilityFocused())) {
            setupAccessibility((int) this.f12494m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAccessibilityIncrements(List<String> list) {
        this.f12499r = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAccessibilityUnits(String str) {
        this.f12498q = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMaxValue(double d) {
        this.f12493l = d;
        updateAll();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMinValue(double d) {
        this.f12492k = d;
        updateAll();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStep(double d) {
        this.f12496o = d;
        updateAll();
    }

    public void setThumbImage(String str) {
        if (str != null) {
            setThumb(m26203a(str));
            setSplitTrack(false);
            return;
        }
        setThumb(getThumb());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setValue(double d) {
        this.f12494m = d;
        updateValue();
    }

    public void setupAccessibility(int i) {
        List<String> list;
        if (this.f12498q != null && (list = this.f12499r) != null && list.size() - 1 == ((int) this.f12493l)) {
            String str = this.f12499r.get(i);
            int length = this.f12498q.length();
            String str2 = this.f12498q;
            if (str != null && Integer.parseInt(str) == 1) {
                str2 = str2.substring(0, length - 1);
            }
            announceForAccessibility(String.format("%s %s", str, str2));
        }
    }

    public double toRealProgress(int i) {
        if (i == getMax()) {
            return this.f12493l;
        }
        return (i * getStepValue()) + this.f12492k;
    }
}

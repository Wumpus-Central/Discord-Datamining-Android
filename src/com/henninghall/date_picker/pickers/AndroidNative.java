package com.henninghall.date_picker.pickers;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import com.henninghall.date_picker.C5899l;
import com.henninghall.date_picker.pickers.AbstractC5907a;
import java.lang.reflect.Field;

/* loaded from: classes6.dex */
public class AndroidNative extends NumberPicker implements AbstractC5907a {

    /* renamed from: k */
    private AbstractC5907a.AbstractC0168a f11747k;

    /* renamed from: m */
    private AbstractC5907a.AbstractC5908b f11749m;

    /* renamed from: n */
    private boolean f11750n;

    /* renamed from: l */
    private int f11748l = 0;

    /* renamed from: o */
    private final Handler f11751o = new Handler();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.henninghall.date_picker.pickers.AndroidNative$a */
    /* loaded from: classes6.dex */
    public class RunnableC5900a implements Runnable {
        RunnableC5900a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidNative.this.f11750n = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.henninghall.date_picker.pickers.AndroidNative$b */
    /* loaded from: classes6.dex */
    public class RunnableC5901b implements Runnable {

        /* renamed from: k */
        final /* synthetic */ AndroidNative f11753k;

        /* renamed from: l */
        final /* synthetic */ boolean f11754l;

        /* renamed from: m */
        final /* synthetic */ boolean f11755m;

        RunnableC5901b(AndroidNative androidNative, boolean z, boolean z2) {
            this.f11753k = androidNative;
            this.f11754l = z;
            this.f11755m = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidNative.this.m26905l(this.f11753k, this.f11754l);
            if (this.f11755m) {
                AndroidNative.this.m26902o();
            }
        }
    }

    /* renamed from: com.henninghall.date_picker.pickers.AndroidNative$c */
    /* loaded from: classes6.dex */
    class C5902c implements NumberPicker.OnValueChangeListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC5907a f11757a;

        C5902c(AbstractC5907a aVar) {
            this.f11757a = aVar;
        }

        @Override // android.widget.NumberPicker.OnValueChangeListener
        public void onValueChange(NumberPicker numberPicker, int i, int i2) {
            if (AndroidNative.this.f11749m != null) {
                AndroidNative.this.f11749m.mo26892a(this.f11757a, i, i2);
            }
            if (AndroidNative.this.f11748l == 0) {
                AndroidNative.this.m26902o();
            }
        }
    }

    /* renamed from: com.henninghall.date_picker.pickers.AndroidNative$d */
    /* loaded from: classes6.dex */
    class C5903d implements NumberPicker.OnScrollListener {
        C5903d() {
        }

        @Override // android.widget.NumberPicker.OnScrollListener
        public void onScrollStateChange(NumberPicker numberPicker, int i) {
            AndroidNative.this.m26903n(i);
            AndroidNative.this.f11748l = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.henninghall.date_picker.pickers.AndroidNative$e */
    /* loaded from: classes6.dex */
    public class RunnableC5904e implements Runnable {
        RunnableC5904e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidNative.this.f11747k.mo25540a();
        }
    }

    public AndroidNative(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        if (r9 == false) goto L_0x0054;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r9 == false) goto L_0x0054;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
        if (r9 == false) goto L_0x0054;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
        setValue((r8 + r1) % getMaxValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
        if (r9 == false) goto L_0x0054;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m26905l(android.widget.NumberPicker r8, boolean r9) {
        /*
            r7 = this;
            java.lang.String r0 = "changeValueByOne"
            r1 = -1
            r2 = 1
            java.lang.Class r3 = r7.getClass()     // Catch: all -> 0x0026, InvocationTargetException -> 0x0028, IllegalAccessException -> 0x0033, IllegalArgumentException -> 0x003e, NoSuchMethodException -> 0x0049
            java.lang.Class r3 = r3.getSuperclass()     // Catch: all -> 0x0026, InvocationTargetException -> 0x0028, IllegalAccessException -> 0x0033, IllegalArgumentException -> 0x003e, NoSuchMethodException -> 0x0049
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: all -> 0x0026, InvocationTargetException -> 0x0028, IllegalAccessException -> 0x0033, IllegalArgumentException -> 0x003e, NoSuchMethodException -> 0x0049
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: all -> 0x0026, InvocationTargetException -> 0x0028, IllegalAccessException -> 0x0033, IllegalArgumentException -> 0x003e, NoSuchMethodException -> 0x0049
            r6 = 0
            r4[r6] = r5     // Catch: all -> 0x0026, InvocationTargetException -> 0x0028, IllegalAccessException -> 0x0033, IllegalArgumentException -> 0x003e, NoSuchMethodException -> 0x0049
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r0, r4)     // Catch: all -> 0x0026, InvocationTargetException -> 0x0028, IllegalAccessException -> 0x0033, IllegalArgumentException -> 0x003e, NoSuchMethodException -> 0x0049
            r3.setAccessible(r2)     // Catch: all -> 0x0026, InvocationTargetException -> 0x0028, IllegalAccessException -> 0x0033, IllegalArgumentException -> 0x003e, NoSuchMethodException -> 0x0049
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: all -> 0x0026, InvocationTargetException -> 0x0028, IllegalAccessException -> 0x0033, IllegalArgumentException -> 0x003e, NoSuchMethodException -> 0x0049
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r9)     // Catch: all -> 0x0026, InvocationTargetException -> 0x0028, IllegalAccessException -> 0x0033, IllegalArgumentException -> 0x003e, NoSuchMethodException -> 0x0049
            r4[r6] = r5     // Catch: all -> 0x0026, InvocationTargetException -> 0x0028, IllegalAccessException -> 0x0033, IllegalArgumentException -> 0x003e, NoSuchMethodException -> 0x0049
            r3.invoke(r8, r4)     // Catch: all -> 0x0026, InvocationTargetException -> 0x0028, IllegalAccessException -> 0x0033, IllegalArgumentException -> 0x003e, NoSuchMethodException -> 0x0049
            goto L_0x005d
        L_0x0026:
            r8 = move-exception
            goto L_0x005e
        L_0x0028:
            r8 = move-exception
            android.util.Log.w(r0, r8)     // Catch: all -> 0x0026
            int r8 = r7.getValue()
            if (r9 == 0) goto L_0x0054
            goto L_0x0053
        L_0x0033:
            r8 = move-exception
            android.util.Log.w(r0, r8)     // Catch: all -> 0x0026
            int r8 = r7.getValue()
            if (r9 == 0) goto L_0x0054
            goto L_0x0053
        L_0x003e:
            r8 = move-exception
            android.util.Log.w(r0, r8)     // Catch: all -> 0x0026
            int r8 = r7.getValue()
            if (r9 == 0) goto L_0x0054
            goto L_0x0053
        L_0x0049:
            r8 = move-exception
            android.util.Log.w(r0, r8)     // Catch: all -> 0x0026
            int r8 = r7.getValue()
            if (r9 == 0) goto L_0x0054
        L_0x0053:
            r1 = r2
        L_0x0054:
            int r8 = r8 + r1
            int r9 = r7.getMaxValue()
            int r8 = r8 % r9
            r7.setValue(r8)
        L_0x005d:
            return
        L_0x005e:
            int r0 = r7.getValue()
            if (r9 == 0) goto L_0x0065
            r1 = r2
        L_0x0065:
            int r0 = r0 + r1
            int r9 = r7.getMaxValue()
            int r0 = r0 % r9
            r7.setValue(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.henninghall.date_picker.pickers.AndroidNative.m26905l(android.widget.NumberPicker, boolean):void");
    }

    /* renamed from: m */
    private void m26904m(boolean z, int i, boolean z2) {
        this.f11751o.postDelayed(new RunnableC5901b(this, z, z2), i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m26903n(int i) {
        boolean z;
        if (this.f11748l == 0 || i != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            m26902o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m26902o() {
        this.f11751o.postDelayed(new RunnableC5904e(), 500L);
    }

    @Override // com.henninghall.date_picker.pickers.AbstractC5907a
    /* renamed from: a */
    public void mo26895a(int i, boolean z) {
        mo26894b(i);
    }

    @Override // com.henninghall.date_picker.pickers.AbstractC5907a
    /* renamed from: b */
    public void mo26894b(int i) {
        boolean z;
        boolean z2;
        int value = getValue();
        if (i != value) {
            int f = C5899l.m26920f(value, i, getMaxValue(), getWrapSelectorWheel());
            int abs = Math.abs(f);
            this.f11750n = true;
            this.f11751o.postDelayed(new RunnableC5900a(), abs * 100);
            for (int i2 = 0; i2 < abs; i2++) {
                if (f > 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i3 = i2 * 100;
                if (i2 == abs - 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                m26904m(z, i3, z2);
            }
        }
    }

    @Override // com.henninghall.date_picker.pickers.AbstractC5907a
    /* renamed from: c */
    public boolean mo26893c() {
        return this.f11748l == 2 || this.f11750n;
    }

    @Override // com.henninghall.date_picker.pickers.AbstractC5907a
    public View getView() {
        return this;
    }

    @Override // android.widget.NumberPicker, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11751o.removeCallbacksAndMessages(null);
    }

    @Override // com.henninghall.date_picker.pickers.AbstractC5907a
    public void setDividerHeight(int i) {
    }

    @Override // com.henninghall.date_picker.pickers.AbstractC5907a
    public void setItemPaddingHorizontal(int i) {
    }

    @Override // com.henninghall.date_picker.pickers.AbstractC5907a
    public void setOnValueChangeListenerInScrolling(AbstractC5907a.AbstractC5908b bVar) {
        this.f11749m = bVar;
    }

    @Override // com.henninghall.date_picker.pickers.AbstractC5907a
    public void setOnValueChangedListener(AbstractC5907a.AbstractC0168a aVar) {
        this.f11747k = aVar;
        super.setOnValueChangedListener(new C5902c(this));
        super.setOnScrollListener(new C5903d());
    }

    @Override // com.henninghall.date_picker.pickers.AbstractC5907a
    public void setShownCount(int i) {
    }

    @Override // com.henninghall.date_picker.pickers.AbstractC5907a
    public void setTextAlign(Paint.Align align) {
    }

    @Override // com.henninghall.date_picker.pickers.AbstractC5907a
    public void setTextColor(String str) {
        int parseColor = Color.parseColor(str);
        if (Build.VERSION.SDK_INT >= 29) {
            super.setTextColor(parseColor);
            return;
        }
        try {
            Field declaredField = getClass().getSuperclass().getDeclaredField("mSelectorWheelPaint");
            declaredField.setAccessible(true);
            ((Paint) declaredField.get(this)).setColor(parseColor);
        } catch (IllegalAccessException e) {
            Log.w("setSelectedTextColor", e);
        } catch (IllegalArgumentException e2) {
            Log.w("setSelectedTextColor", e2);
        } catch (NoSuchFieldException e3) {
            Log.w("setSelectedTextColor", e3);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof EditText) {
                ((EditText) childAt).setTextColor(parseColor);
            }
        }
        invalidate();
    }
}

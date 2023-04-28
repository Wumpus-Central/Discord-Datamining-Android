package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.core.view.C2733w0;
import com.facebook.react.uimanager.ViewDefaults;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import p052d.C6388j;
import p163j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.g0 */
/* loaded from: classes.dex */
public class C1667g0 {

    /* renamed from: l */
    private static final RectF f1332l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: m */
    private static ConcurrentHashMap<String, Method> f1333m = new ConcurrentHashMap<>();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: n */
    private static ConcurrentHashMap<String, Field> f1334n = new ConcurrentHashMap<>();

    /* renamed from: a */
    private int f1335a = 0;

    /* renamed from: b */
    private boolean f1336b = false;

    /* renamed from: c */
    private float f1337c = -1.0f;

    /* renamed from: d */
    private float f1338d = -1.0f;

    /* renamed from: e */
    private float f1339e = -1.0f;

    /* renamed from: f */
    private int[] f1340f = new int[0];

    /* renamed from: g */
    private boolean f1341g = false;

    /* renamed from: h */
    private TextPaint f1342h;

    /* renamed from: i */
    private final TextView f1343i;

    /* renamed from: j */
    private final Context f1344j;

    /* renamed from: k */
    private final C1670c f1345k;

    /* renamed from: androidx.appcompat.widget.g0$a */
    /* loaded from: classes.dex */
    private static class C1668a extends C1670c {
        C1668a() {
        }

        @Override // androidx.appcompat.widget.C1667g0.C1670c
        /* renamed from: a */
        void mo40215a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C1667g0.m40228n(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: androidx.appcompat.widget.g0$b */
    /* loaded from: classes.dex */
    private static class C1669b extends C1668a {
        C1669b() {
        }

        @Override // androidx.appcompat.widget.C1667g0.C1668a, androidx.appcompat.widget.C1667g0.C1670c
        /* renamed from: a */
        void mo40215a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // androidx.appcompat.widget.C1667g0.C1670c
        /* renamed from: b */
        boolean mo40214b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.g0$c */
    /* loaded from: classes.dex */
    public static class C1670c {
        C1670c() {
        }

        /* renamed from: a */
        void mo40215a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        /* renamed from: b */
        boolean mo40214b(TextView textView) {
            return ((Boolean) C1667g0.m40228n(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1667g0(TextView textView) {
        this.f1343i = textView;
        this.f1344j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1345k = new C1669b();
        } else {
            this.f1345k = new C1668a();
        }
    }

    /* renamed from: A */
    private void m40242A(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 > 0.0f) {
            this.f1335a = 1;
            this.f1338d = f;
            this.f1339e = f2;
            this.f1337c = f3;
            this.f1341g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }

    /* renamed from: b */
    private int[] m40240b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: c */
    private void m40239c() {
        this.f1335a = 0;
        this.f1338d = -1.0f;
        this.f1339e = -1.0f;
        this.f1337c = -1.0f;
        this.f1340f = new int[0];
        this.f1336b = false;
    }

    /* renamed from: e */
    private StaticLayout m40237e(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f1342h, i);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f1343i.getLineSpacingExtra(), this.f1343i.getLineSpacingMultiplier()).setIncludePad(this.f1343i.getIncludeFontPadding()).setBreakStrategy(this.f1343i.getBreakStrategy()).setHyphenationFrequency(this.f1343i.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = ViewDefaults.NUMBER_OF_LINES;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            this.f1345k.mo40215a(obtain, this.f1343i);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    /* renamed from: f */
    private int m40236f(RectF rectF) {
        int length = this.f1340f.length;
        if (length != 0) {
            int i = 1;
            int i2 = length - 1;
            int i3 = 0;
            while (i <= i2) {
                int i4 = (i + i2) / 2;
                if (m40217y(this.f1340f[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i;
                    i = i5;
                } else {
                    i3 = i4 - 1;
                    i2 = i3;
                }
            }
            return this.f1340f[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: l */
    private static Method m40230l(String str) {
        try {
            Method method = f1333m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1333m.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: n */
    static <T> T m40228n(Object obj, String str, T t) {
        try {
            return (T) m40230l(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    /* renamed from: t */
    private void m40222t(float f) {
        if (f != this.f1343i.getPaint().getTextSize()) {
            this.f1343i.getPaint().setTextSize(f);
            boolean isInLayout = this.f1343i.isInLayout();
            if (this.f1343i.getLayout() != null) {
                this.f1336b = false;
                try {
                    Method l = m40230l("nullLayouts");
                    if (l != null) {
                        l.invoke(this.f1343i, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.f1343i.requestLayout();
                } else {
                    this.f1343i.forceLayout();
                }
                this.f1343i.invalidate();
            }
        }
    }

    /* renamed from: v */
    private boolean m40220v() {
        if (!m40216z() || this.f1335a != 1) {
            this.f1336b = false;
        } else {
            if (!this.f1341g || this.f1340f.length == 0) {
                int floor = ((int) Math.floor((this.f1339e - this.f1338d) / this.f1337c)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.f1338d + (i * this.f1337c));
                }
                this.f1340f = m40240b(iArr);
            }
            this.f1336b = true;
        }
        return this.f1336b;
    }

    /* renamed from: w */
    private void m40219w(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f1340f = m40240b(iArr);
            m40218x();
        }
    }

    /* renamed from: x */
    private boolean m40218x() {
        int[] iArr;
        int length;
        boolean z;
        if (this.f1340f.length > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f1341g = z;
        if (z) {
            this.f1335a = 1;
            this.f1338d = iArr[0];
            this.f1339e = iArr[length - 1];
            this.f1337c = -1.0f;
        }
        return z;
    }

    /* renamed from: y */
    private boolean m40217y(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1343i.getText();
        TransformationMethod transformationMethod = this.f1343i.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f1343i)) == null)) {
            text = transformation;
        }
        int maxLines = this.f1343i.getMaxLines();
        m40229m(i);
        StaticLayout d = m40238d(text, (Layout.Alignment) m40228n(this.f1343i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        if ((maxLines == -1 || (d.getLineCount() <= maxLines && d.getLineEnd(d.getLineCount() - 1) == text.length())) && d.getHeight() <= rectF.bottom) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    private boolean m40216z() {
        return !(this.f1343i instanceof C1687k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m40241a() {
        int i;
        if (m40227o()) {
            if (this.f1336b) {
                if (this.f1343i.getMeasuredHeight() > 0 && this.f1343i.getMeasuredWidth() > 0) {
                    if (this.f1345k.mo40214b(this.f1343i)) {
                        i = 1048576;
                    } else {
                        i = (this.f1343i.getMeasuredWidth() - this.f1343i.getTotalPaddingLeft()) - this.f1343i.getTotalPaddingRight();
                    }
                    int height = (this.f1343i.getHeight() - this.f1343i.getCompoundPaddingBottom()) - this.f1343i.getCompoundPaddingTop();
                    if (i > 0 && height > 0) {
                        RectF rectF = f1332l;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = i;
                            rectF.bottom = height;
                            float f = m40236f(rectF);
                            if (f != this.f1343i.getTextSize()) {
                                m40221u(0, f);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f1336b = true;
        }
    }

    /* renamed from: d */
    StaticLayout m40238d(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        return m40237e(charSequence, alignment, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m40235g() {
        return Math.round(this.f1339e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m40234h() {
        return Math.round(this.f1338d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m40233i() {
        return Math.round(this.f1337c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int[] m40232j() {
        return this.f1340f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int m40231k() {
        return this.f1335a;
    }

    /* renamed from: m */
    void m40229m(int i) {
        TextPaint textPaint = this.f1342h;
        if (textPaint == null) {
            this.f1342h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1342h.set(this.f1343i.getPaint());
        this.f1342h.setTextSize(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean m40227o() {
        return m40216z() && this.f1335a != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m40226p(AttributeSet attributeSet, int i) {
        float f;
        float f2;
        float f3;
        int resourceId;
        Context context = this.f1344j;
        int[] iArr = C6388j.f13266g0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView = this.f1343i;
        C2733w0.m36994o0(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i, 0);
        int i2 = C6388j.f13291l0;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f1335a = obtainStyledAttributes.getInt(i2, 0);
        }
        int i3 = C6388j.f13286k0;
        if (obtainStyledAttributes.hasValue(i3)) {
            f = obtainStyledAttributes.getDimension(i3, -1.0f);
        } else {
            f = -1.0f;
        }
        int i4 = C6388j.f13276i0;
        if (obtainStyledAttributes.hasValue(i4)) {
            f2 = obtainStyledAttributes.getDimension(i4, -1.0f);
        } else {
            f2 = -1.0f;
        }
        int i5 = C6388j.f13271h0;
        if (obtainStyledAttributes.hasValue(i5)) {
            f3 = obtainStyledAttributes.getDimension(i5, -1.0f);
        } else {
            f3 = -1.0f;
        }
        int i6 = C6388j.f13281j0;
        if (obtainStyledAttributes.hasValue(i6) && (resourceId = obtainStyledAttributes.getResourceId(i6, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m40219w(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m40216z()) {
            this.f1335a = 0;
        } else if (this.f1335a == 1) {
            if (!this.f1341g) {
                DisplayMetrics displayMetrics = this.f1344j.getResources().getDisplayMetrics();
                if (f2 == -1.0f) {
                    f2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (f3 == -1.0f) {
                    f3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (f == -1.0f) {
                    f = 1.0f;
                }
                m40242A(f2, f3, f);
            }
            m40220v();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m40225q(int i, int i2, int i3, int i4) {
        if (m40216z()) {
            DisplayMetrics displayMetrics = this.f1344j.getResources().getDisplayMetrics();
            m40242A(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (m40220v()) {
                m40241a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m40224r(int[] iArr, int i) {
        if (m40216z()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1344j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f1340f = m40240b(iArr2);
                if (!m40218x()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1341g = false;
            }
            if (m40220v()) {
                m40241a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m40223s(int i) {
        if (!m40216z()) {
            return;
        }
        if (i == 0) {
            m40239c();
        } else if (i == 1) {
            DisplayMetrics displayMetrics = this.f1344j.getResources().getDisplayMetrics();
            m40242A(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m40220v()) {
                m40241a();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m40221u(int i, float f) {
        Resources resources;
        Context context = this.f1344j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        m40222t(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }
}

package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.core.content.res.C2379l;
import androidx.core.graphics.C2391d;
import com.facebook.react.views.image.ReactImageView;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.vectordrawable.graphics.drawable.e */
/* loaded from: classes.dex */
public class C3290e {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.e$a */
    /* loaded from: classes.dex */
    public static class C3291a implements TypeEvaluator<C2391d.C2393b[]> {

        /* renamed from: a */
        private C2391d.C2393b[] f5204a;

        C3291a() {
        }

        /* renamed from: a */
        public C2391d.C2393b[] evaluate(float f, C2391d.C2393b[] bVarArr, C2391d.C2393b[] bVarArr2) {
            if (C2391d.m37905b(bVarArr, bVarArr2)) {
                if (!C2391d.m37905b(this.f5204a, bVarArr)) {
                    this.f5204a = C2391d.m37901f(bVarArr);
                }
                for (int i = 0; i < bVarArr.length; i++) {
                    this.f5204a[i].m37893d(bVarArr[i], bVarArr2[i], f);
                }
                return this.f5204a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* renamed from: a */
    private static Animator m34811a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f) {
        return m34810b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.animation.Animator m34810b(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.C3290e.m34810b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* renamed from: c */
    private static Keyframe m34809c(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    /* renamed from: d */
    private static void m34808d(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((i2 - i) + 2);
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    /* renamed from: e */
    private static PropertyValuesHolder m34807e(TypedArray typedArray, int i, int i2, int i3, String str) {
        boolean z;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        C3292f fVar;
        int i6;
        int i7;
        int i8;
        PropertyValuesHolder propertyValuesHolder;
        float f;
        float f2;
        float f3;
        PropertyValuesHolder propertyValuesHolder2;
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i4 = peekValue.type;
        } else {
            i4 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i3);
        if (peekValue2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i5 = peekValue2.type;
        } else {
            i5 = 0;
        }
        if (i == 4) {
            if ((!z || !m34804h(i4)) && (!z2 || !m34804h(i5))) {
                i = 0;
            } else {
                i = 3;
            }
        }
        if (i == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        PropertyValuesHolder propertyValuesHolder3 = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            C2391d.C2393b[] d = C2391d.m37903d(string);
            C2391d.C2393b[] d2 = C2391d.m37903d(string2);
            if (d == null && d2 == null) {
                return null;
            }
            if (d != null) {
                C3291a aVar = new C3291a();
                if (d2 == null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofObject(str, aVar, d);
                } else if (C2391d.m37905b(d, d2)) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofObject(str, aVar, d, d2);
                } else {
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                return propertyValuesHolder2;
            } else if (d2 != null) {
                return PropertyValuesHolder.ofObject(str, new C3291a(), d2);
            } else {
                return null;
            }
        } else {
            if (i == 3) {
                fVar = C3292f.m34791a();
            } else {
                fVar = null;
            }
            if (z3) {
                if (z) {
                    if (i4 == 5) {
                        f2 = typedArray.getDimension(i2, 0.0f);
                    } else {
                        f2 = typedArray.getFloat(i2, 0.0f);
                    }
                    if (z2) {
                        if (i5 == 5) {
                            f3 = typedArray.getDimension(i3, 0.0f);
                        } else {
                            f3 = typedArray.getFloat(i3, 0.0f);
                        }
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(str, f2, f3);
                    } else {
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(str, f2);
                    }
                } else {
                    if (i5 == 5) {
                        f = typedArray.getDimension(i3, 0.0f);
                    } else {
                        f = typedArray.getFloat(i3, 0.0f);
                    }
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, f);
                }
                propertyValuesHolder3 = propertyValuesHolder;
            } else if (z) {
                if (i4 == 5) {
                    i7 = (int) typedArray.getDimension(i2, 0.0f);
                } else if (m34804h(i4)) {
                    i7 = typedArray.getColor(i2, 0);
                } else {
                    i7 = typedArray.getInt(i2, 0);
                }
                if (z2) {
                    if (i5 == 5) {
                        i8 = (int) typedArray.getDimension(i3, 0.0f);
                    } else if (m34804h(i5)) {
                        i8 = typedArray.getColor(i3, 0);
                    } else {
                        i8 = typedArray.getInt(i3, 0);
                    }
                    propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, i7, i8);
                } else {
                    propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, i7);
                }
            } else if (z2) {
                if (i5 == 5) {
                    i6 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (m34804h(i5)) {
                    i6 = typedArray.getColor(i3, 0);
                } else {
                    i6 = typedArray.getInt(i3, 0);
                }
                propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, i6);
            }
            if (propertyValuesHolder3 == null || fVar == null) {
                return propertyValuesHolder3;
            }
            propertyValuesHolder3.setEvaluator(fVar);
            return propertyValuesHolder3;
        }
    }

    /* renamed from: f */
    private static int m34806f(TypedArray typedArray, int i, int i2) {
        boolean z;
        int i3;
        int i4;
        TypedValue peekValue = typedArray.peekValue(i);
        boolean z2 = true;
        if (peekValue != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i3 = peekValue.type;
        } else {
            i3 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i2);
        if (peekValue2 == null) {
            z2 = false;
        }
        if (z2) {
            i4 = peekValue2.type;
        } else {
            i4 = 0;
        }
        if ((!z || !m34804h(i3)) && (!z2 || !m34804h(i4))) {
            return 0;
        }
        return 3;
    }

    /* renamed from: g */
    private static int m34805g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        boolean z;
        TypedArray k = C2379l.m37949k(resources, theme, attributeSet, C3284a.f5188j);
        int i = 0;
        TypedValue l = C2379l.m37948l(k, xmlPullParser, "value", 0);
        if (l != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && m34804h(l.type)) {
            i = 3;
        }
        k.recycle();
        return i;
    }

    /* renamed from: h */
    private static boolean m34804h(int i) {
        return i >= 28 && i <= 31;
    }

    /* renamed from: i */
    public static Animator m34803i(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, i);
        }
        return m34802j(context, context.getResources(), context.getTheme(), i);
    }

    /* renamed from: j */
    public static Animator m34802j(Context context, Resources resources, Resources.Theme theme, int i) {
        return m34801k(context, resources, theme, i, 1.0f);
    }

    /* renamed from: k */
    public static Animator m34801k(Context context, Resources resources, Resources.Theme theme, int i, float f) {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i);
                    return m34811a(context, resources, theme, xmlResourceParser, f);
                } catch (XmlPullParserException e) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                    notFoundException.initCause(e);
                    throw notFoundException;
                }
            } catch (IOException e2) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
                notFoundException2.initCause(e2);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    /* renamed from: l */
    private static ValueAnimator m34800l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray k = C2379l.m37949k(resources, theme, attributeSet, C3284a.f5185g);
        TypedArray k2 = C2379l.m37949k(resources, theme, attributeSet, C3284a.f5189k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m34795q(valueAnimator, k, k2, f, xmlPullParser);
        int h = C2379l.m37952h(k, xmlPullParser, "interpolator", 0, 0);
        if (h > 0) {
            valueAnimator.setInterpolator(C3289d.m34812a(context, h));
        }
        k.recycle();
        if (k2 != null) {
            k2.recycle();
        }
        return valueAnimator;
    }

    /* renamed from: m */
    private static Keyframe m34799m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) {
        boolean z;
        Keyframe keyframe;
        TypedArray k = C2379l.m37949k(resources, theme, attributeSet, C3284a.f5188j);
        float f = C2379l.m37954f(k, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue l = C2379l.m37948l(k, xmlPullParser, "value", 0);
        if (l != null) {
            z = true;
        } else {
            z = false;
        }
        if (i == 4) {
            if (!z || !m34804h(l.type)) {
                i = 0;
            } else {
                i = 3;
            }
        }
        if (z) {
            if (i == 0) {
                keyframe = Keyframe.ofFloat(f, C2379l.m37954f(k, xmlPullParser, "value", 0, 0.0f));
            } else if (i == 1 || i == 3) {
                keyframe = Keyframe.ofInt(f, C2379l.m37953g(k, xmlPullParser, "value", 0, 0));
            } else {
                keyframe = null;
            }
        } else if (i == 0) {
            keyframe = Keyframe.ofFloat(f);
        } else {
            keyframe = Keyframe.ofInt(f);
        }
        int h = C2379l.m37952h(k, xmlPullParser, "interpolator", 1, 0);
        if (h > 0) {
            keyframe.setInterpolator(C3289d.m34812a(context, h));
        }
        k.recycle();
        return keyframe;
    }

    /* renamed from: n */
    private static ObjectAnimator m34798n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m34800l(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    /* renamed from: o */
    private static PropertyValuesHolder m34797o(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i) {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            } else if (xmlPullParser.getName().equals("keyframe")) {
                if (i == 4) {
                    i = m34805g(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe m = m34799m(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i, xmlPullParser);
                if (m != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), m34809c(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, m34809c(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i2 = 0; i2 < size; i2++) {
                Keyframe keyframe3 = keyframeArr[i2];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i2 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i3 = size - 1;
                        if (i2 == i3) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i4 = i2;
                            for (int i5 = i2 + 1; i5 < i3 && keyframeArr[i5].getFraction() < 0.0f; i5++) {
                                i4 = i5;
                            }
                            m34808d(keyframeArr, keyframeArr[i4 + 1].getFraction() - keyframeArr[i2 - 1].getFraction(), i2, i4);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i == 3) {
                propertyValuesHolder.setEvaluator(C3292f.m34791a());
            }
        }
        return propertyValuesHolder;
    }

    /* renamed from: p */
    private static PropertyValuesHolder[] m34796p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        int i;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            } else if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    TypedArray k = C2379l.m37949k(resources, theme, attributeSet, C3284a.f5187i);
                    String i2 = C2379l.m37951i(k, xmlPullParser, "propertyName", 3);
                    int g = C2379l.m37953g(k, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder o = m34797o(context, resources, theme, xmlPullParser, i2, g);
                    if (o == null) {
                        o = m34807e(k, g, 0, 1, i2);
                    }
                    if (o != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(o);
                    }
                    k.recycle();
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i = 0; i < size; i++) {
                propertyValuesHolderArr[i] = (PropertyValuesHolder) arrayList.get(i);
            }
        }
        return propertyValuesHolderArr;
    }

    /* renamed from: q */
    private static void m34795q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long g = C2379l.m37953g(typedArray, xmlPullParser, "duration", 1, ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS);
        long g2 = C2379l.m37953g(typedArray, xmlPullParser, "startOffset", 2, 0);
        int g3 = C2379l.m37953g(typedArray, xmlPullParser, "valueType", 7, 4);
        if (C2379l.m37950j(xmlPullParser, "valueFrom") && C2379l.m37950j(xmlPullParser, "valueTo")) {
            if (g3 == 4) {
                g3 = m34806f(typedArray, 5, 6);
            }
            PropertyValuesHolder e = m34807e(typedArray, g3, 5, 6, "");
            if (e != null) {
                valueAnimator.setValues(e);
            }
        }
        valueAnimator.setDuration(g);
        valueAnimator.setStartDelay(g2);
        valueAnimator.setRepeatCount(C2379l.m37953g(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C2379l.m37953g(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            m34794r(valueAnimator, typedArray2, g3, f, xmlPullParser);
        }
    }

    /* renamed from: r */
    private static void m34794r(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String i2 = C2379l.m37951i(typedArray, xmlPullParser, "pathData", 1);
        if (i2 != null) {
            String i3 = C2379l.m37951i(typedArray, xmlPullParser, "propertyXName", 2);
            String i4 = C2379l.m37951i(typedArray, xmlPullParser, "propertyYName", 3);
            if (i != 2) {
            }
            if (i3 == null && i4 == null) {
                throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            m34793s(C2391d.m37902e(i2), objectAnimator, f * 0.5f, i3, i4);
            return;
        }
        objectAnimator.setPropertyName(C2379l.m37951i(typedArray, xmlPullParser, "propertyName", 0));
    }

    /* renamed from: s */
    private static void m34793s(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f2 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f3 = 0.0f;
        do {
            f3 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f3));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f3 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f4 = f3 / (min - 1);
        int i = 0;
        int i2 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f2 - ((Float) arrayList.get(i2)).floatValue(), fArr3, null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
            f2 += f4;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f2 > ((Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
        }
        if (str != null) {
            propertyValuesHolder2 = PropertyValuesHolder.ofFloat(str, fArr);
        } else {
            propertyValuesHolder2 = null;
        }
        if (str2 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str2, fArr2);
        }
        if (propertyValuesHolder2 == null) {
            objectAnimator.setValues(propertyValuesHolder);
        } else if (propertyValuesHolder == null) {
            objectAnimator.setValues(propertyValuesHolder2);
        } else {
            objectAnimator.setValues(propertyValuesHolder2, propertyValuesHolder);
        }
    }
}

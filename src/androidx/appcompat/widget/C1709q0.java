package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.AbstractC2409h;
import androidx.core.graphics.drawable.C2400a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p090f.C6978c;

/* renamed from: androidx.appcompat.widget.q0 */
/* loaded from: classes.dex */
public class C1709q0 {

    /* renamed from: a */
    private static final int[] f1457a = {16842912};

    /* renamed from: b */
    private static final int[] f1458b = new int[0];

    /* renamed from: c */
    public static final Rect f1459c = new Rect();

    /* renamed from: androidx.appcompat.widget.q0$a */
    /* loaded from: classes.dex */
    static class C1710a {

        /* renamed from: a */
        private static final boolean f1460a;

        /* renamed from: b */
        private static final Method f1461b;

        /* renamed from: c */
        private static final Field f1462c;

        /* renamed from: d */
        private static final Field f1463d;

        /* renamed from: e */
        private static final Field f1464e;

        /* renamed from: f */
        private static final Field f1465f;

        /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: NoSuchFieldException -> 0x003b, ClassNotFoundException -> 0x003f, NoSuchMethodException -> 0x0043
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: NoSuchFieldException -> 0x003b, ClassNotFoundException -> 0x003f, NoSuchMethodException -> 0x0043
                java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: NoSuchFieldException -> 0x003b, ClassNotFoundException -> 0x003f, NoSuchMethodException -> 0x0043
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: NoSuchFieldException -> 0x0035, ClassNotFoundException -> 0x0037, NoSuchMethodException -> 0x0039
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: NoSuchFieldException -> 0x002f, ClassNotFoundException -> 0x0031, NoSuchMethodException -> 0x0033
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: NoSuchMethodException | ClassNotFoundException | NoSuchFieldException -> 0x002d
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: NoSuchMethodException | ClassNotFoundException | NoSuchFieldException -> 0x0047
                r8 = r0
                goto L_0x0049
            L_0x002d:
                r7 = r1
                goto L_0x0047
            L_0x002f:
                r6 = r1
                goto L_0x0046
            L_0x0031:
                r6 = r1
                goto L_0x0046
            L_0x0033:
                r6 = r1
                goto L_0x0046
            L_0x0035:
                r5 = r1
                goto L_0x003d
            L_0x0037:
                r5 = r1
                goto L_0x0041
            L_0x0039:
                r5 = r1
                goto L_0x0045
            L_0x003b:
                r4 = r1
                r5 = r4
            L_0x003d:
                r6 = r5
                goto L_0x0046
            L_0x003f:
                r4 = r1
                r5 = r4
            L_0x0041:
                r6 = r5
                goto L_0x0046
            L_0x0043:
                r4 = r1
                r5 = r4
            L_0x0045:
                r6 = r5
            L_0x0046:
                r7 = r6
            L_0x0047:
                r3 = r1
                r8 = r2
            L_0x0049:
                if (r8 == 0) goto L_0x0058
                androidx.appcompat.widget.C1709q0.C1710a.f1461b = r4
                androidx.appcompat.widget.C1709q0.C1710a.f1462c = r5
                androidx.appcompat.widget.C1709q0.C1710a.f1463d = r6
                androidx.appcompat.widget.C1709q0.C1710a.f1464e = r7
                androidx.appcompat.widget.C1709q0.C1710a.f1465f = r3
                androidx.appcompat.widget.C1709q0.C1710a.f1460a = r0
                goto L_0x0064
            L_0x0058:
                androidx.appcompat.widget.C1709q0.C1710a.f1461b = r1
                androidx.appcompat.widget.C1709q0.C1710a.f1462c = r1
                androidx.appcompat.widget.C1709q0.C1710a.f1463d = r1
                androidx.appcompat.widget.C1709q0.C1710a.f1464e = r1
                androidx.appcompat.widget.C1709q0.C1710a.f1465f = r1
                androidx.appcompat.widget.C1709q0.C1710a.f1460a = r2
            L_0x0064:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C1709q0.C1710a.<clinit>():void");
        }

        /* renamed from: a */
        static Rect m40053a(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f1460a) {
                try {
                    Object invoke = f1461b.invoke(drawable, new Object[0]);
                    if (invoke != null) {
                        return new Rect(f1462c.getInt(invoke), f1463d.getInt(invoke), f1464e.getInt(invoke), f1465f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return C1709q0.f1459c;
        }
    }

    /* renamed from: androidx.appcompat.widget.q0$b */
    /* loaded from: classes.dex */
    static class C1711b {
        /* renamed from: a */
        static Insets m40052a(Drawable drawable) {
            Insets opticalInsets;
            opticalInsets = drawable.getOpticalInsets();
            return opticalInsets;
        }
    }

    /* renamed from: a */
    public static boolean m40058a(Drawable drawable) {
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!m40058a(drawable2)) {
                    return false;
                }
            }
            return true;
        } else if (drawable instanceof AbstractC2409h) {
            return m40058a(((AbstractC2409h) drawable).m37802a());
        } else {
            if (drawable instanceof C6978c) {
                return m40058a(((C6978c) drawable).m23750a());
            }
            if (drawable instanceof ScaleDrawable) {
                return m40058a(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m40057b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 && i < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            m40056c(drawable);
        }
    }

    /* renamed from: c */
    private static void m40056c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1457a);
        } else {
            drawable.setState(f1458b);
        }
        drawable.setState(state);
    }

    /* renamed from: d */
    public static Rect m40055d(Drawable drawable) {
        int i;
        int i2;
        int i3;
        int i4;
        if (Build.VERSION.SDK_INT < 29) {
            return C1710a.m40053a(C2400a.m37826q(drawable));
        }
        Insets a = C1711b.m40052a(drawable);
        i = a.left;
        i2 = a.top;
        i3 = a.right;
        i4 = a.bottom;
        return new Rect(i, i2, i3, i4);
    }

    /* renamed from: e */
    public static PorterDuff.Mode m40054e(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}

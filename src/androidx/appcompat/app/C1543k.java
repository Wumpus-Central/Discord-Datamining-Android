package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C1650d;
import androidx.appcompat.widget.C1660e;
import androidx.appcompat.widget.C1663f;
import androidx.appcompat.widget.C1666g;
import androidx.appcompat.widget.C1685j0;
import androidx.appcompat.widget.C1687k;
import androidx.appcompat.widget.C1689k1;
import androidx.appcompat.widget.C1693m;
import androidx.appcompat.widget.C1696n;
import androidx.appcompat.widget.C1699o;
import androidx.appcompat.widget.C1713r;
import androidx.appcompat.widget.C1716s;
import androidx.appcompat.widget.C1732v;
import androidx.appcompat.widget.C1736w;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.C2733w0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p052d.C6388j;
import p144i.C8096c;

/* renamed from: androidx.appcompat.app.k */
/* loaded from: classes.dex */
public class C1543k {

    /* renamed from: b */
    private static final Class<?>[] f808b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    private static final int[] f809c = {16843375};

    /* renamed from: d */
    private static final int[] f810d = {16844160};

    /* renamed from: e */
    private static final int[] f811e = {16844156};

    /* renamed from: f */
    private static final int[] f812f = {16844148};

    /* renamed from: g */
    private static final String[] f813g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h */
    private static final SimpleArrayMap<String, Constructor<? extends View>> f814h = new SimpleArrayMap<>();

    /* renamed from: a */
    private final Object[] f815a = new Object[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.k$a */
    /* loaded from: classes.dex */
    public static class View$OnClickListenerC1544a implements View.OnClickListener {

        /* renamed from: k */
        private final View f816k;

        /* renamed from: l */
        private final String f817l;

        /* renamed from: m */
        private Method f818m;

        /* renamed from: n */
        private Context f819n;

        public View$OnClickListenerC1544a(View view, String str) {
            this.f816k = view;
            this.f817l = str;
        }

        /* renamed from: a */
        private void m40783a(Context context) {
            int id2;
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f817l, View.class)) != null) {
                        this.f818m = method;
                        this.f819n = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    context = null;
                }
            }
            if (this.f816k.getId() == -1) {
                str = "";
            } else {
                str = " with id '" + this.f816k.getContext().getResources().getResourceEntryName(id2) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f817l + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f816k.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f818m == null) {
                m40783a(this.f816k.getContext());
            }
            try {
                this.f818m.invoke(this.f819n, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: a */
    private void m40800a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT <= 28) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f810d);
            if (obtainStyledAttributes.hasValue(0)) {
                C2733w0.m36988r0(view, obtainStyledAttributes.getBoolean(0, false));
            }
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f811e);
            if (obtainStyledAttributes2.hasValue(0)) {
                C2733w0.m36984t0(view, obtainStyledAttributes2.getString(0));
            }
            obtainStyledAttributes2.recycle();
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f812f);
            if (obtainStyledAttributes3.hasValue(0)) {
                C2733w0.m37052G0(view, obtainStyledAttributes3.getBoolean(0, false));
            }
            obtainStyledAttributes3.recycle();
        }
    }

    /* renamed from: b */
    private void m40799b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && C2733w0.m37035P(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f809c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new View$OnClickListenerC1544a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: s */
    private View m40787s(Context context, String str, String str2) {
        String str3;
        SimpleArrayMap<String, Constructor<? extends View>> simpleArrayMap = f814h;
        Constructor<? extends View> constructor = simpleArrayMap.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f808b);
            simpleArrayMap.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f815a);
    }

    /* renamed from: t */
    private View m40786t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f815a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return m40787s(context, str, null);
            }
            int i = 0;
            while (true) {
                String[] strArr = f813g;
                if (i >= strArr.length) {
                    return null;
                }
                View s = m40787s(context, str, strArr[i]);
                if (s != null) {
                    return s;
                }
                i++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f815a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    /* renamed from: u */
    private static Context m40785u(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6388j.f37824H3, 0, 0);
        if (z) {
            i = obtainStyledAttributes.getResourceId(C6388j.f37829I3, 0);
        } else {
            i = 0;
        }
        if (z2 && i == 0 && (i = obtainStyledAttributes.getResourceId(C6388j.f37834J3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        if (i == 0) {
            return context;
        }
        if (!(context instanceof C8096c) || ((C8096c) context).m20619c() != i) {
            return new C8096c(context, i);
        }
        return context;
    }

    /* renamed from: v */
    private void m40784v(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    /* renamed from: c */
    protected C1650d mo27429c(Context context, AttributeSet attributeSet) {
        return new C1650d(context, attributeSet);
    }

    /* renamed from: d */
    protected C1660e mo27428d(Context context, AttributeSet attributeSet) {
        return new C1660e(context, attributeSet);
    }

    /* renamed from: e */
    protected C1663f mo27427e(Context context, AttributeSet attributeSet) {
        return new C1663f(context, attributeSet);
    }

    /* renamed from: f */
    protected C1666g m40798f(Context context, AttributeSet attributeSet) {
        return new C1666g(context, attributeSet);
    }

    /* renamed from: g */
    protected C1687k m40797g(Context context, AttributeSet attributeSet) {
        return new C1687k(context, attributeSet);
    }

    /* renamed from: h */
    protected C1693m m40796h(Context context, AttributeSet attributeSet) {
        return new C1693m(context, attributeSet);
    }

    /* renamed from: i */
    protected C1696n m40795i(Context context, AttributeSet attributeSet) {
        return new C1696n(context, attributeSet);
    }

    /* renamed from: j */
    protected C1699o m40794j(Context context, AttributeSet attributeSet) {
        return new C1699o(context, attributeSet);
    }

    /* renamed from: k */
    protected C1713r mo27426k(Context context, AttributeSet attributeSet) {
        return new C1713r(context, attributeSet);
    }

    /* renamed from: l */
    protected C1716s m40793l(Context context, AttributeSet attributeSet) {
        return new C1716s(context, attributeSet);
    }

    /* renamed from: m */
    protected C1732v m40792m(Context context, AttributeSet attributeSet) {
        return new C1732v(context, attributeSet);
    }

    /* renamed from: n */
    protected C1736w m40791n(Context context, AttributeSet attributeSet) {
        return new C1736w(context, attributeSet);
    }

    /* renamed from: o */
    protected AppCompatTextView mo27425o(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* renamed from: p */
    protected C1685j0 m40790p(Context context, AttributeSet attributeSet) {
        return new C1685j0(context, attributeSet);
    }

    /* renamed from: q */
    protected View m40789q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final View m40788r(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context2;
        View view2;
        if (!z || view == null) {
            context2 = context;
        } else {
            context2 = view.getContext();
        }
        if (z2 || z3) {
            context2 = m40785u(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C1689k1.m40131b(context2);
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = '\r';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = m40793l(context2, attributeSet);
                m40784v(view2, str);
                break;
            case 1:
                view2 = m40798f(context2, attributeSet);
                m40784v(view2, str);
                break;
            case 2:
                view2 = m40794j(context2, attributeSet);
                m40784v(view2, str);
                break;
            case 3:
                view2 = mo27425o(context2, attributeSet);
                m40784v(view2, str);
                break;
            case 4:
                view2 = m40796h(context2, attributeSet);
                m40784v(view2, str);
                break;
            case 5:
                view2 = m40792m(context2, attributeSet);
                m40784v(view2, str);
                break;
            case 6:
                view2 = m40791n(context2, attributeSet);
                m40784v(view2, str);
                break;
            case 7:
                view2 = mo27426k(context2, attributeSet);
                m40784v(view2, str);
                break;
            case '\b':
                view2 = m40790p(context2, attributeSet);
                m40784v(view2, str);
                break;
            case '\t':
                view2 = m40795i(context2, attributeSet);
                m40784v(view2, str);
                break;
            case '\n':
                view2 = mo27429c(context2, attributeSet);
                m40784v(view2, str);
                break;
            case 11:
                view2 = mo27427e(context2, attributeSet);
                m40784v(view2, str);
                break;
            case '\f':
                view2 = m40797g(context2, attributeSet);
                m40784v(view2, str);
                break;
            case '\r':
                view2 = mo27428d(context2, attributeSet);
                m40784v(view2, str);
                break;
            default:
                view2 = m40789q(context2, str, attributeSet);
                break;
        }
        if (view2 == null && context != context2) {
            view2 = m40786t(context2, str, attributeSet);
        }
        if (view2 != null) {
            m40799b(view2, attributeSet);
            m40800a(context2, view2, attributeSet);
        }
        return view2;
    }
}

package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.widget.a */
/* loaded from: classes.dex */
public class C2141a {

    /* renamed from: a */
    String f2772a;

    /* renamed from: b */
    private EnumC2142b f2773b;

    /* renamed from: c */
    private int f2774c;

    /* renamed from: d */
    private float f2775d;

    /* renamed from: e */
    private String f2776e;

    /* renamed from: f */
    boolean f2777f;

    /* renamed from: g */
    private int f2778g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.widget.a$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0031a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2779a;

        static {
            int[] iArr = new int[EnumC2142b.values().length];
            f2779a = iArr;
            try {
                iArr[EnumC2142b.COLOR_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2779a[EnumC2142b.COLOR_DRAWABLE_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2779a[EnumC2142b.INT_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2779a[EnumC2142b.FLOAT_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2779a[EnumC2142b.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2779a[EnumC2142b.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2779a[EnumC2142b.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: androidx.constraintlayout.widget.a$b */
    /* loaded from: classes.dex */
    public enum EnumC2142b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public C2141a(String str, EnumC2142b bVar, Object obj) {
        this.f2772a = str;
        this.f2773b = bVar;
        m38763d(obj);
    }

    /* renamed from: a */
    public static HashMap<String, C2141a> m38766a(HashMap<String, C2141a> hashMap, View view) {
        HashMap<String, C2141a> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            C2141a aVar = hashMap.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    hashMap2.put(str, new C2141a(aVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    hashMap2.put(str, new C2141a(aVar, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        return hashMap2;
    }

    /* renamed from: b */
    public static void m38765b(Context context, XmlPullParser xmlPullParser, HashMap<String, C2141a> hashMap) {
        EnumC2142b bVar;
        Object string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C2148f.f35462B2);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        EnumC2142b bVar2 = null;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C2148f.f35468C2) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == C2148f.f35474D2) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                bVar2 = EnumC2142b.BOOLEAN_TYPE;
            } else {
                if (index == C2148f.f35486F2) {
                    bVar = EnumC2142b.COLOR_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == C2148f.f35480E2) {
                    bVar = EnumC2142b.COLOR_DRAWABLE_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == C2148f.f35510J2) {
                    bVar = EnumC2142b.DIMENSION_TYPE;
                    string = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == C2148f.f35492G2) {
                    bVar = EnumC2142b.DIMENSION_TYPE;
                    string = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == C2148f.f35498H2) {
                    bVar = EnumC2142b.FLOAT_TYPE;
                    string = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == C2148f.f35504I2) {
                    bVar = EnumC2142b.INT_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == C2148f.f35516K2) {
                    bVar = EnumC2142b.STRING_TYPE;
                    string = obtainStyledAttributes.getString(index);
                }
                bVar2 = bVar;
                obj = string;
            }
        }
        if (!(str == null || obj == null)) {
            hashMap.put(str, new C2141a(str, bVar2, obj));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    public static void m38764c(View view, HashMap<String, C2141a> hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            C2141a aVar = hashMap.get(str);
            String str2 = "set" + str;
            try {
                switch (C0031a.f2779a[aVar.f2773b.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f2778g));
                        break;
                    case 2:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f2778g);
                        method.invoke(view, colorDrawable);
                        break;
                    case 3:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f2774c));
                        break;
                    case 4:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(aVar.f2775d));
                        break;
                    case 5:
                        cls.getMethod(str2, CharSequence.class).invoke(view, aVar.f2776e);
                        break;
                    case 6:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f2777f));
                        break;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(aVar.f2775d));
                        break;
                }
            } catch (IllegalAccessException e) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                Log.e("TransitionLayout", e2.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls.getName());
                sb2.append(" must have a method ");
                sb2.append(str2);
                Log.e("TransitionLayout", sb2.toString());
            } catch (InvocationTargetException e3) {
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                e3.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public void m38763d(Object obj) {
        switch (C0031a.f2779a[this.f2773b.ordinal()]) {
            case 1:
            case 2:
                this.f2778g = ((Integer) obj).intValue();
                return;
            case 3:
                this.f2774c = ((Integer) obj).intValue();
                return;
            case 4:
                this.f2775d = ((Float) obj).floatValue();
                return;
            case 5:
                this.f2776e = (String) obj;
                return;
            case 6:
                this.f2777f = ((Boolean) obj).booleanValue();
                return;
            case 7:
                this.f2775d = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public C2141a(C2141a aVar, Object obj) {
        this.f2772a = aVar.f2772a;
        this.f2773b = aVar.f2773b;
        m38763d(obj);
    }
}

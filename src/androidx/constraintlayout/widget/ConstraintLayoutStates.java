package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class ConstraintLayoutStates {

    /* renamed from: a */
    private final ConstraintLayout f2680a;

    /* renamed from: b */
    ConstraintSet f2681b;

    /* renamed from: c */
    int f2682c = -1;

    /* renamed from: d */
    int f2683d = -1;

    /* renamed from: e */
    private SparseArray<C2134a> f2684e = new SparseArray<>();

    /* renamed from: f */
    private SparseArray<ConstraintSet> f2685f = new SparseArray<>();

    /* renamed from: g */
    private ConstraintsChangedListener f2686g = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.widget.ConstraintLayoutStates$a */
    /* loaded from: classes.dex */
    public static class C2134a {

        /* renamed from: a */
        int f2687a;

        /* renamed from: b */
        ArrayList<C2135b> f2688b = new ArrayList<>();

        /* renamed from: c */
        int f2689c;

        /* renamed from: d */
        ConstraintSet f2690d;

        public C2134a(Context context, XmlPullParser xmlPullParser) {
            this.f2689c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C2148f.f35482E4);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C2148f.f35488F4) {
                    this.f2687a = obtainStyledAttributes.getResourceId(index, this.f2687a);
                } else if (index == C2148f.f35494G4) {
                    this.f2689c = obtainStyledAttributes.getResourceId(index, this.f2689c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2689c);
                    context.getResources().getResourceName(this.f2689c);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.f2690d = constraintSet;
                        constraintSet.m38795f(context, this.f2689c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        void m38803a(C2135b bVar) {
            this.f2688b.add(bVar);
        }

        /* renamed from: b */
        public int m38802b(float f, float f2) {
            for (int i = 0; i < this.f2688b.size(); i++) {
                if (this.f2688b.get(i).m38801a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.widget.ConstraintLayoutStates$b */
    /* loaded from: classes.dex */
    public static class C2135b {

        /* renamed from: a */
        float f2691a;

        /* renamed from: b */
        float f2692b;

        /* renamed from: c */
        float f2693c;

        /* renamed from: d */
        float f2694d;

        /* renamed from: e */
        int f2695e;

        /* renamed from: f */
        ConstraintSet f2696f;

        public C2135b(Context context, XmlPullParser xmlPullParser) {
            this.f2691a = Float.NaN;
            this.f2692b = Float.NaN;
            this.f2693c = Float.NaN;
            this.f2694d = Float.NaN;
            this.f2695e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C2148f.f2817a5);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C2148f.f2824b5) {
                    this.f2695e = obtainStyledAttributes.getResourceId(index, this.f2695e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2695e);
                    context.getResources().getResourceName(this.f2695e);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.f2696f = constraintSet;
                        constraintSet.m38795f(context, this.f2695e);
                    }
                } else if (index == C2148f.f2831c5) {
                    this.f2694d = obtainStyledAttributes.getDimension(index, this.f2694d);
                } else if (index == C2148f.f2838d5) {
                    this.f2692b = obtainStyledAttributes.getDimension(index, this.f2692b);
                } else if (index == C2148f.f2845e5) {
                    this.f2693c = obtainStyledAttributes.getDimension(index, this.f2693c);
                } else if (index == C2148f.f2852f5) {
                    this.f2691a = obtainStyledAttributes.getDimension(index, this.f2691a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        boolean m38801a(float f, float f2) {
            if (!Float.isNaN(this.f2691a) && f < this.f2691a) {
                return false;
            }
            if (!Float.isNaN(this.f2692b) && f2 < this.f2692b) {
                return false;
            }
            if (!Float.isNaN(this.f2693c) && f > this.f2693c) {
                return false;
            }
            if (Float.isNaN(this.f2694d) || f2 <= this.f2694d) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConstraintLayoutStates(Context context, ConstraintLayout constraintLayout, int i) {
        this.f2680a = constraintLayout;
        m38807a(context, i);
    }

    /* renamed from: a */
    private void m38807a(Context context, int i) {
        char c;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            C2134a aVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (!(c == 0 || c == 1)) {
                        if (c == 2) {
                            aVar = new C2134a(context, xml);
                            this.f2684e.put(aVar.f2687a, aVar);
                        } else if (c == 3) {
                            C2135b bVar = new C2135b(context, xml);
                            if (aVar != null) {
                                aVar.m38803a(bVar);
                            }
                        } else if (c != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            m38806b(context, xml);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m38806b(Context context, XmlPullParser xmlPullParser) {
        int i;
        ConstraintSet constraintSet = new ConstraintSet();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if ("id".equals(xmlPullParser.getAttributeName(i2))) {
                String attributeValue = xmlPullParser.getAttributeValue(i2);
                if (attributeValue.contains("/")) {
                    i = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i = -1;
                }
                if (i == -1) {
                    if (attributeValue.length() > 1) {
                        i = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                constraintSet.m38787n(context, xmlPullParser);
                this.f2685f.put(i, constraintSet);
                return;
            }
        }
    }

    /* renamed from: c */
    public void m38805c(ConstraintsChangedListener constraintsChangedListener) {
        this.f2686g = constraintsChangedListener;
    }

    /* renamed from: d */
    public void m38804d(int i, float f, float f2) {
        ConstraintSet constraintSet;
        int i2;
        C2134a aVar;
        int b;
        ConstraintSet constraintSet2;
        int i3;
        int i4 = this.f2682c;
        if (i4 == i) {
            if (i == -1) {
                aVar = this.f2684e.valueAt(0);
            } else {
                aVar = this.f2684e.get(i4);
            }
            int i5 = this.f2683d;
            if ((i5 == -1 || !aVar.f2688b.get(i5).m38801a(f, f2)) && this.f2683d != (b = aVar.m38802b(f, f2))) {
                if (b == -1) {
                    constraintSet2 = this.f2681b;
                } else {
                    constraintSet2 = aVar.f2688b.get(b).f2696f;
                }
                if (b == -1) {
                    i3 = aVar.f2689c;
                } else {
                    i3 = aVar.f2688b.get(b).f2695e;
                }
                if (constraintSet2 != null) {
                    this.f2683d = b;
                    ConstraintsChangedListener constraintsChangedListener = this.f2686g;
                    if (constraintsChangedListener != null) {
                        constraintsChangedListener.m38767b(-1, i3);
                    }
                    constraintSet2.m38798c(this.f2680a);
                    ConstraintsChangedListener constraintsChangedListener2 = this.f2686g;
                    if (constraintsChangedListener2 != null) {
                        constraintsChangedListener2.m38768a(-1, i3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        this.f2682c = i;
        C2134a aVar2 = this.f2684e.get(i);
        int b2 = aVar2.m38802b(f, f2);
        if (b2 == -1) {
            constraintSet = aVar2.f2690d;
        } else {
            constraintSet = aVar2.f2688b.get(b2).f2696f;
        }
        if (b2 == -1) {
            i2 = aVar2.f2689c;
        } else {
            i2 = aVar2.f2688b.get(b2).f2695e;
        }
        if (constraintSet == null) {
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i + ", dim =" + f + ", " + f2);
            return;
        }
        this.f2683d = b2;
        ConstraintsChangedListener constraintsChangedListener3 = this.f2686g;
        if (constraintsChangedListener3 != null) {
            constraintsChangedListener3.m38767b(i, i2);
        }
        constraintSet.m38798c(this.f2680a);
        ConstraintsChangedListener constraintsChangedListener4 = this.f2686g;
        if (constraintsChangedListener4 != null) {
            constraintsChangedListener4.m38768a(i, i2);
        }
    }
}

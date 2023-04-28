package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.p018os.C2433a;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p002a1.C1239e;
import p163j$.util.Spliterator;

/* loaded from: classes.dex */
public class AccessibilityNodeInfoCompat {

    /* renamed from: d */
    private static int f3553d;

    /* renamed from: a */
    private final AccessibilityNodeInfo f3554a;

    /* renamed from: b */
    public int f3555b = -1;

    /* renamed from: c */
    private int f3556c = -1;

    /* renamed from: androidx.core.view.accessibility.AccessibilityNodeInfoCompat$a */
    /* loaded from: classes.dex */
    public static class C2556a {

        /* renamed from: G */
        public static final C2556a f35649G;

        /* renamed from: H */
        public static final C2556a f35650H;

        /* renamed from: I */
        public static final C2556a f35651I;

        /* renamed from: J */
        public static final C2556a f35652J;

        /* renamed from: K */
        public static final C2556a f35653K;

        /* renamed from: L */
        public static final C2556a f35654L;

        /* renamed from: M */
        public static final C2556a f35655M;

        /* renamed from: N */
        public static final C2556a f35656N;

        /* renamed from: O */
        public static final C2556a f35657O;

        /* renamed from: P */
        public static final C2556a f35658P;

        /* renamed from: Q */
        public static final C2556a f35659Q;

        /* renamed from: a */
        final Object f3579a;

        /* renamed from: b */
        private final int f3580b;

        /* renamed from: c */
        private final Class<? extends AccessibilityViewCommand.AbstractC2563a> f3581c;

        /* renamed from: d */
        protected final AccessibilityViewCommand f3582d;

        /* renamed from: e */
        public static final C2556a f3557e = new C2556a(1, null);

        /* renamed from: f */
        public static final C2556a f3558f = new C2556a(2, null);

        /* renamed from: g */
        public static final C2556a f3559g = new C2556a(4, null);

        /* renamed from: h */
        public static final C2556a f3560h = new C2556a(8, null);

        /* renamed from: i */
        public static final C2556a f3561i = new C2556a(16, null);

        /* renamed from: j */
        public static final C2556a f3562j = new C2556a(32, null);

        /* renamed from: k */
        public static final C2556a f3563k = new C2556a(64, null);

        /* renamed from: l */
        public static final C2556a f3564l = new C2556a(128, null);

        /* renamed from: m */
        public static final C2556a f3565m = new C2556a((int) Spliterator.NONNULL, (CharSequence) null, AccessibilityViewCommand.C2564b.class);

        /* renamed from: n */
        public static final C2556a f3566n = new C2556a(512, (CharSequence) null, AccessibilityViewCommand.C2564b.class);

        /* renamed from: o */
        public static final C2556a f3567o = new C2556a((int) Spliterator.IMMUTABLE, (CharSequence) null, AccessibilityViewCommand.C2565c.class);

        /* renamed from: p */
        public static final C2556a f3568p = new C2556a((int) RecyclerView.ItemAnimator.FLAG_MOVED, (CharSequence) null, AccessibilityViewCommand.C2565c.class);

        /* renamed from: q */
        public static final C2556a f3569q = new C2556a(4096, null);

        /* renamed from: r */
        public static final C2556a f3570r = new C2556a(8192, null);

        /* renamed from: s */
        public static final C2556a f3571s = new C2556a(Spliterator.SUBSIZED, null);

        /* renamed from: t */
        public static final C2556a f3572t = new C2556a(32768, null);

        /* renamed from: u */
        public static final C2556a f3573u = new C2556a(65536, null);

        /* renamed from: v */
        public static final C2556a f3574v = new C2556a(131072, (CharSequence) null, AccessibilityViewCommand.C2569g.class);

        /* renamed from: w */
        public static final C2556a f3575w = new C2556a(262144, null);

        /* renamed from: x */
        public static final C2556a f3576x = new C2556a(524288, null);

        /* renamed from: y */
        public static final C2556a f3577y = new C2556a(1048576, null);

        /* renamed from: z */
        public static final C2556a f3578z = new C2556a(2097152, (CharSequence) null, AccessibilityViewCommand.C2570h.class);

        /* renamed from: A */
        public static final C2556a f35643A = new C2556a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);

        /* renamed from: B */
        public static final C2556a f35644B = new C2556a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, AccessibilityViewCommand.C2567e.class);

        /* renamed from: C */
        public static final C2556a f35645C = new C2556a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);

        /* renamed from: D */
        public static final C2556a f35646D = new C2556a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);

        /* renamed from: E */
        public static final C2556a f35647E = new C2556a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);

        /* renamed from: F */
        public static final C2556a f35648F = new C2556a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction19 = null;
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
                accessibilityAction = accessibilityAction18;
            } else {
                accessibilityAction = null;
            }
            f35649G = new C2556a(accessibilityAction, 16908358, null, null, null);
            if (i >= 29) {
                accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction2 = accessibilityAction17;
            } else {
                accessibilityAction2 = null;
            }
            f35650H = new C2556a(accessibilityAction2, 16908359, null, null, null);
            if (i >= 29) {
                accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
                accessibilityAction3 = accessibilityAction16;
            } else {
                accessibilityAction3 = null;
            }
            f35651I = new C2556a(accessibilityAction3, 16908360, null, null, null);
            if (i >= 29) {
                accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction4 = accessibilityAction15;
            } else {
                accessibilityAction4 = null;
            }
            f35652J = new C2556a(accessibilityAction4, 16908361, null, null, null);
            f35653K = new C2556a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
            if (i >= 24) {
                accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
                accessibilityAction5 = accessibilityAction14;
            } else {
                accessibilityAction5 = null;
            }
            f35654L = new C2556a(accessibilityAction5, 16908349, null, null, AccessibilityViewCommand.C2568f.class);
            if (i >= 26) {
                accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
                accessibilityAction6 = accessibilityAction13;
            } else {
                accessibilityAction6 = null;
            }
            f35655M = new C2556a(accessibilityAction6, 16908354, null, null, AccessibilityViewCommand.C2566d.class);
            if (i >= 28) {
                accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
                accessibilityAction7 = accessibilityAction12;
            } else {
                accessibilityAction7 = null;
            }
            f35656N = new C2556a(accessibilityAction7, 16908356, null, null, null);
            if (i >= 28) {
                accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction8 = accessibilityAction11;
            } else {
                accessibilityAction8 = null;
            }
            f35657O = new C2556a(accessibilityAction8, 16908357, null, null, null);
            if (i >= 30) {
                accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
                accessibilityAction9 = accessibilityAction10;
            } else {
                accessibilityAction9 = null;
            }
            f35658P = new C2556a(accessibilityAction9, 16908362, null, null, null);
            if (i >= 30) {
                accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            }
            f35659Q = new C2556a(accessibilityAction19, 16908372, null, null, null);
        }

        public C2556a(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }

        /* renamed from: a */
        public C2556a m37338a(CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
            return new C2556a(null, this.f3580b, charSequence, accessibilityViewCommand, this.f3581c);
        }

        /* renamed from: b */
        public int m37337b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f3579a).getId();
        }

        /* renamed from: c */
        public CharSequence m37336c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f3579a).getLabel();
        }

        /* renamed from: d */
        public boolean m37335d(View view, Bundle bundle) {
            Exception e;
            String str;
            AccessibilityViewCommand.AbstractC2563a aVar;
            if (this.f3582d == null) {
                return false;
            }
            Class<? extends AccessibilityViewCommand.AbstractC2563a> cls = this.f3581c;
            AccessibilityViewCommand.AbstractC2563a aVar2 = null;
            if (cls != null) {
                try {
                    aVar = (AccessibilityViewCommand.AbstractC2563a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    aVar.m37326a(bundle);
                    aVar2 = aVar;
                } catch (Exception e3) {
                    e = e3;
                    aVar2 = aVar;
                    Class<? extends AccessibilityViewCommand.AbstractC2563a> cls2 = this.f3581c;
                    if (cls2 == null) {
                        str = "null";
                    } else {
                        str = cls2.getName();
                    }
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + str, e);
                    return this.f3582d.mo28572a(view, aVar2);
                }
            }
            return this.f3582d.mo28572a(view, aVar2);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C2556a)) {
                return false;
            }
            C2556a aVar = (C2556a) obj;
            Object obj2 = this.f3579a;
            if (obj2 == null) {
                if (aVar.f3579a != null) {
                    return false;
                }
                return true;
            } else if (!obj2.equals(aVar.f3579a)) {
                return false;
            } else {
                return true;
            }
        }

        public int hashCode() {
            Object obj = this.f3579a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public C2556a(int i, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
            this(null, i, charSequence, accessibilityViewCommand, null);
        }

        C2556a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private C2556a(int i, CharSequence charSequence, Class<? extends AccessibilityViewCommand.AbstractC2563a> cls) {
            this(null, i, charSequence, null, cls);
        }

        C2556a(Object obj, int i, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand, Class<? extends AccessibilityViewCommand.AbstractC2563a> cls) {
            this.f3580b = i;
            this.f3582d = accessibilityViewCommand;
            if (obj == null) {
                this.f3579a = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            } else {
                this.f3579a = obj;
            }
            this.f3581c = cls;
        }
    }

    /* renamed from: androidx.core.view.accessibility.AccessibilityNodeInfoCompat$b */
    /* loaded from: classes.dex */
    public static class C2557b {

        /* renamed from: a */
        final Object f3583a;

        C2557b(Object obj) {
            this.f3583a = obj;
        }

        /* renamed from: a */
        public static C2557b m37334a(int i, int i2, boolean z) {
            return new C2557b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
        }

        /* renamed from: b */
        public static C2557b m37333b(int i, int i2, boolean z, int i3) {
            return new C2557b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }
    }

    /* renamed from: androidx.core.view.accessibility.AccessibilityNodeInfoCompat$c */
    /* loaded from: classes.dex */
    public static class C2558c {

        /* renamed from: a */
        final Object f3584a;

        C2558c(Object obj) {
            this.f3584a = obj;
        }

        /* renamed from: a */
        public static C2558c m37332a(int i, int i2, int i3, int i4, boolean z) {
            return new C2558c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
        }

        /* renamed from: b */
        public static C2558c m37331b(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new C2558c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    /* renamed from: androidx.core.view.accessibility.AccessibilityNodeInfoCompat$d */
    /* loaded from: classes.dex */
    public static class C2559d {

        /* renamed from: a */
        final Object f3585a;

        C2559d(Object obj) {
            this.f3585a = obj;
        }

        /* renamed from: a */
        public static C2559d m37330a(int i, float f, float f2, float f3) {
            return new C2559d(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
        }
    }

    private AccessibilityNodeInfoCompat(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f3554a = accessibilityNodeInfo;
    }

    /* renamed from: I0 */
    public static AccessibilityNodeInfoCompat m37408I0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
    }

    /* renamed from: N */
    public static AccessibilityNodeInfoCompat m37403N() {
        return m37408I0(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: O */
    public static AccessibilityNodeInfoCompat m37402O(View view) {
        return m37408I0(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: P */
    public static AccessibilityNodeInfoCompat m37401P(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        return m37408I0(AccessibilityNodeInfo.obtain(accessibilityNodeInfoCompat.f3554a));
    }

    /* renamed from: T */
    private void m37397T(View view) {
        SparseArray<WeakReference<ClickableSpan>> v = m37348v(view);
        if (v != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < v.size(); i++) {
                if (v.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                v.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    /* renamed from: V */
    private void m37395V(int i, boolean z) {
        Bundle s = m37354s();
        if (s != null) {
            int i2 = s.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            s.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    /* renamed from: e */
    private void m37382e(ClickableSpan clickableSpan, Spanned spanned, int i) {
        m37376h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m37376h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m37376h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m37376h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    /* renamed from: g */
    private void m37378g() {
        this.f3554a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f3554a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f3554a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f3554a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    /* renamed from: h */
    private List<Integer> m37376h(String str) {
        ArrayList<Integer> integerArrayList = this.f3554a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f3554a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: j */
    private static String m37372j(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case Spliterator.NONNULL /* 256 */:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case Spliterator.IMMUTABLE /* 1024 */:
                return "ACTION_NEXT_HTML_ELEMENT";
            case RecyclerView.ItemAnimator.FLAG_MOVED /* 2048 */:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case Spliterator.SUBSIZED /* 16384 */:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908372:
                return "ACTION_IME_ENTER";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    /* renamed from: l */
    private boolean m37368l(int i) {
        Bundle s = m37354s();
        if (s != null && (s.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public static ClickableSpan[] m37358q(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: t */
    private SparseArray<WeakReference<ClickableSpan>> m37352t(View view) {
        SparseArray<WeakReference<ClickableSpan>> v = m37348v(view);
        if (v != null) {
            return v;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(C1239e.f35045W, sparseArray);
        return sparseArray;
    }

    /* renamed from: v */
    private SparseArray<WeakReference<ClickableSpan>> m37348v(View view) {
        return (SparseArray) view.getTag(C1239e.f35045W);
    }

    /* renamed from: y */
    private boolean m37342y() {
        return !m37376h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: z */
    private int m37340z(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals(sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f3553d;
        f3553d = i2 + 1;
        return i2;
    }

    /* renamed from: A */
    public boolean m37425A() {
        return this.f3554a.isAccessibilityFocused();
    }

    /* renamed from: A0 */
    public void m37424A0(View view) {
        this.f3556c = -1;
        this.f3554a.setSource(view);
    }

    /* renamed from: B */
    public boolean m37423B() {
        return this.f3554a.isCheckable();
    }

    /* renamed from: B0 */
    public void m37422B0(View view, int i) {
        this.f3556c = i;
        this.f3554a.setSource(view, i);
    }

    /* renamed from: C */
    public boolean m37421C() {
        return this.f3554a.isChecked();
    }

    /* renamed from: C0 */
    public void m37420C0(CharSequence charSequence) {
        if (C2433a.m37750a()) {
            this.f3554a.setStateDescription(charSequence);
        } else {
            this.f3554a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* renamed from: D */
    public boolean m37419D() {
        return this.f3554a.isClickable();
    }

    /* renamed from: D0 */
    public void m37418D0(CharSequence charSequence) {
        this.f3554a.setText(charSequence);
    }

    /* renamed from: E */
    public boolean m37417E() {
        return this.f3554a.isEnabled();
    }

    /* renamed from: E0 */
    public void m37416E0(View view) {
        this.f3554a.setTraversalAfter(view);
    }

    /* renamed from: F */
    public boolean m37415F() {
        return this.f3554a.isFocusable();
    }

    /* renamed from: F0 */
    public void m37414F0(String str) {
        this.f3554a.setViewIdResourceName(str);
    }

    /* renamed from: G */
    public boolean m37413G() {
        return this.f3554a.isFocused();
    }

    /* renamed from: G0 */
    public void m37412G0(boolean z) {
        this.f3554a.setVisibleToUser(z);
    }

    /* renamed from: H */
    public boolean m37411H() {
        return this.f3554a.isLongClickable();
    }

    /* renamed from: H0 */
    public AccessibilityNodeInfo m37410H0() {
        return this.f3554a;
    }

    /* renamed from: I */
    public boolean m37409I() {
        return this.f3554a.isPassword();
    }

    /* renamed from: J */
    public boolean m37407J() {
        return this.f3554a.isScrollable();
    }

    /* renamed from: K */
    public boolean m37406K() {
        return this.f3554a.isSelected();
    }

    /* renamed from: L */
    public boolean m37405L() {
        boolean isShowingHintText;
        if (Build.VERSION.SDK_INT < 26) {
            return m37368l(4);
        }
        isShowingHintText = this.f3554a.isShowingHintText();
        return isShowingHintText;
    }

    /* renamed from: M */
    public boolean m37404M() {
        return this.f3554a.isVisibleToUser();
    }

    /* renamed from: Q */
    public boolean m37400Q(int i, Bundle bundle) {
        return this.f3554a.performAction(i, bundle);
    }

    /* renamed from: R */
    public void m37399R() {
        this.f3554a.recycle();
    }

    /* renamed from: S */
    public boolean m37398S(C2556a aVar) {
        return this.f3554a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f3579a);
    }

    /* renamed from: U */
    public void m37396U(boolean z) {
        this.f3554a.setAccessibilityFocused(z);
    }

    @Deprecated
    /* renamed from: W */
    public void m37394W(Rect rect) {
        this.f3554a.setBoundsInParent(rect);
    }

    /* renamed from: X */
    public void m37393X(Rect rect) {
        this.f3554a.setBoundsInScreen(rect);
    }

    /* renamed from: Y */
    public void m37392Y(boolean z) {
        this.f3554a.setCheckable(z);
    }

    /* renamed from: Z */
    public void m37391Z(boolean z) {
        this.f3554a.setChecked(z);
    }

    /* renamed from: a */
    public void m37390a(int i) {
        this.f3554a.addAction(i);
    }

    /* renamed from: a0 */
    public void m37389a0(CharSequence charSequence) {
        this.f3554a.setClassName(charSequence);
    }

    /* renamed from: b */
    public void m37388b(C2556a aVar) {
        this.f3554a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f3579a);
    }

    /* renamed from: b0 */
    public void m37387b0(boolean z) {
        this.f3554a.setClickable(z);
    }

    /* renamed from: c */
    public void m37386c(View view) {
        this.f3554a.addChild(view);
    }

    /* renamed from: c0 */
    public void m37385c0(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3554a;
        if (obj == null) {
            collectionInfo = null;
        } else {
            collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((C2557b) obj).f3583a;
        }
        accessibilityNodeInfo.setCollectionInfo(collectionInfo);
    }

    /* renamed from: d */
    public void m37384d(View view, int i) {
        this.f3554a.addChild(view, i);
    }

    /* renamed from: d0 */
    public void m37383d0(Object obj) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3554a;
        if (obj == null) {
            collectionItemInfo = null;
        } else {
            collectionItemInfo = (AccessibilityNodeInfo.CollectionItemInfo) ((C2558c) obj).f3584a;
        }
        accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
    }

    /* renamed from: e0 */
    public void m37381e0(CharSequence charSequence) {
        this.f3554a.setContentDescription(charSequence);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessibilityNodeInfoCompat)) {
            return false;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3554a;
        if (accessibilityNodeInfo == null) {
            if (accessibilityNodeInfoCompat.f3554a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(accessibilityNodeInfoCompat.f3554a)) {
            return false;
        }
        if (this.f3556c == accessibilityNodeInfoCompat.f3556c && this.f3555b == accessibilityNodeInfoCompat.f3555b) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m37380f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            m37378g();
            m37397T(view);
            ClickableSpan[] q = m37358q(charSequence);
            if (q != null && q.length > 0) {
                m37354s().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C1239e.f20a);
                SparseArray<WeakReference<ClickableSpan>> t = m37352t(view);
                for (int i = 0; i < q.length; i++) {
                    int z = m37340z(q[i], t);
                    t.put(z, new WeakReference<>(q[i]));
                    m37382e(q[i], (Spanned) charSequence, z);
                }
            }
        }
    }

    /* renamed from: f0 */
    public void m37379f0(boolean z) {
        this.f3554a.setEnabled(z);
    }

    /* renamed from: g0 */
    public void m37377g0(CharSequence charSequence) {
        this.f3554a.setError(charSequence);
    }

    /* renamed from: h0 */
    public void m37375h0(boolean z) {
        this.f3554a.setFocusable(z);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3554a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public List<C2556a> m37374i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f3554a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C2556a(actionList.get(i)));
        }
        return arrayList;
    }

    /* renamed from: i0 */
    public void m37373i0(boolean z) {
        this.f3554a.setFocused(z);
    }

    /* renamed from: j0 */
    public void m37371j0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3554a.setHeading(z);
        } else {
            m37395V(2, z);
        }
    }

    /* renamed from: k */
    public int m37370k() {
        return this.f3554a.getActions();
    }

    /* renamed from: k0 */
    public void m37369k0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3554a.setHintText(charSequence);
        } else {
            this.f3554a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: l0 */
    public void m37367l0(boolean z) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f3554a.setImportantForAccessibility(z);
        }
    }

    @Deprecated
    /* renamed from: m */
    public void m37366m(Rect rect) {
        this.f3554a.getBoundsInParent(rect);
    }

    /* renamed from: m0 */
    public void m37365m0(View view) {
        this.f3554a.setLabelFor(view);
    }

    /* renamed from: n */
    public void m37364n(Rect rect) {
        this.f3554a.getBoundsInScreen(rect);
    }

    /* renamed from: n0 */
    public void m37363n0(View view) {
        this.f3554a.setLabeledBy(view);
    }

    /* renamed from: o */
    public int m37362o() {
        return this.f3554a.getChildCount();
    }

    /* renamed from: o0 */
    public void m37361o0(int i) {
        this.f3554a.setMaxTextLength(i);
    }

    /* renamed from: p */
    public CharSequence m37360p() {
        return this.f3554a.getClassName();
    }

    /* renamed from: p0 */
    public void m37359p0(int i) {
        this.f3554a.setMovementGranularities(i);
    }

    /* renamed from: q0 */
    public void m37357q0(CharSequence charSequence) {
        this.f3554a.setPackageName(charSequence);
    }

    /* renamed from: r */
    public CharSequence m37356r() {
        return this.f3554a.getContentDescription();
    }

    /* renamed from: r0 */
    public void m37355r0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3554a.setPaneTitle(charSequence);
        } else {
            this.f3554a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: s */
    public Bundle m37354s() {
        return this.f3554a.getExtras();
    }

    /* renamed from: s0 */
    public void m37353s0(View view) {
        this.f3555b = -1;
        this.f3554a.setParent(view);
    }

    /* renamed from: t0 */
    public void m37351t0(View view, int i) {
        this.f3555b = i;
        this.f3554a.setParent(view, i);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        m37366m(rect);
        sb2.append("; boundsInParent: " + rect);
        m37364n(rect);
        sb2.append("; boundsInScreen: " + rect);
        sb2.append("; packageName: ");
        sb2.append(m37350u());
        sb2.append("; className: ");
        sb2.append(m37360p());
        sb2.append("; text: ");
        sb2.append(m37346w());
        sb2.append("; contentDescription: ");
        sb2.append(m37356r());
        sb2.append("; viewId: ");
        sb2.append(m37344x());
        sb2.append("; checkable: ");
        sb2.append(m37423B());
        sb2.append("; checked: ");
        sb2.append(m37421C());
        sb2.append("; focusable: ");
        sb2.append(m37415F());
        sb2.append("; focused: ");
        sb2.append(m37413G());
        sb2.append("; selected: ");
        sb2.append(m37406K());
        sb2.append("; clickable: ");
        sb2.append(m37419D());
        sb2.append("; longClickable: ");
        sb2.append(m37411H());
        sb2.append("; enabled: ");
        sb2.append(m37417E());
        sb2.append("; password: ");
        sb2.append(m37409I());
        sb2.append("; scrollable: " + m37407J());
        sb2.append("; [");
        List<C2556a> i = m37374i();
        for (int i2 = 0; i2 < i.size(); i2++) {
            C2556a aVar = i.get(i2);
            String j = m37372j(aVar.m37337b());
            if (j.equals("ACTION_UNKNOWN") && aVar.m37336c() != null) {
                j = aVar.m37336c().toString();
            }
            sb2.append(j);
            if (i2 != i.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* renamed from: u */
    public CharSequence m37350u() {
        return this.f3554a.getPackageName();
    }

    /* renamed from: u0 */
    public void m37349u0(C2559d dVar) {
        this.f3554a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) dVar.f3585a);
    }

    /* renamed from: v0 */
    public void m37347v0(CharSequence charSequence) {
        this.f3554a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    /* renamed from: w */
    public CharSequence m37346w() {
        if (!m37342y()) {
            return this.f3554a.getText();
        }
        List<Integer> h = m37376h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> h2 = m37376h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> h3 = m37376h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> h4 = m37376h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f3554a.getText(), 0, this.f3554a.getText().length()));
        for (int i = 0; i < h.size(); i++) {
            spannableString.setSpan(new C2571a(h4.get(i).intValue(), this, m37354s().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), h.get(i).intValue(), h2.get(i).intValue(), h3.get(i).intValue());
        }
        return spannableString;
    }

    /* renamed from: w0 */
    public void m37345w0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3554a.setScreenReaderFocusable(z);
        } else {
            m37395V(1, z);
        }
    }

    /* renamed from: x */
    public String m37344x() {
        return this.f3554a.getViewIdResourceName();
    }

    /* renamed from: x0 */
    public void m37343x0(boolean z) {
        this.f3554a.setScrollable(z);
    }

    /* renamed from: y0 */
    public void m37341y0(boolean z) {
        this.f3554a.setSelected(z);
    }

    /* renamed from: z0 */
    public void m37339z0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3554a.setShowingHintText(z);
        } else {
            m37395V(4, z);
        }
    }
}

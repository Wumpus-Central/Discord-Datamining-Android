package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.C2733w0;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p052d.C6379a;
import p052d.C6382d;
import p052d.C6384f;
import p052d.C6385g;
import p052d.C6386h;
import p052d.C6388j;
import p111g1.AbstractC7389a;
import p125h1.AbstractC7736a;
import p144i.AbstractC8095b;
import p163j$.util.Spliterator;

/* loaded from: classes.dex */
public class SearchView extends C1733v0 implements AbstractC8095b {

    /* renamed from: z0 */
    static final C1620n f1183z0;

    /* renamed from: A */
    private final View f35215A;

    /* renamed from: B */
    private final View f35216B;

    /* renamed from: C */
    private final View f35217C;

    /* renamed from: D */
    final ImageView f35218D;

    /* renamed from: E */
    final ImageView f35219E;

    /* renamed from: F */
    final ImageView f35220F;

    /* renamed from: G */
    final ImageView f35221G;

    /* renamed from: H */
    private final View f35222H;

    /* renamed from: I */
    private C1623p f35223I;

    /* renamed from: J */
    private Rect f35224J;

    /* renamed from: K */
    private Rect f35225K;

    /* renamed from: L */
    private int[] f35226L;

    /* renamed from: M */
    private int[] f35227M;

    /* renamed from: N */
    private final ImageView f35228N;

    /* renamed from: O */
    private final Drawable f35229O;

    /* renamed from: P */
    private final int f35230P;

    /* renamed from: Q */
    private final int f35231Q;

    /* renamed from: R */
    private final Intent f35232R;

    /* renamed from: S */
    private final Intent f35233S;

    /* renamed from: T */
    private final CharSequence f35234T;

    /* renamed from: U */
    private AbstractC1618l f35235U;

    /* renamed from: V */
    private AbstractC1617k f35236V;

    /* renamed from: W */
    View.OnFocusChangeListener f35237W;

    /* renamed from: a0 */
    private View.OnClickListener f1184a0;

    /* renamed from: b0 */
    private boolean f1185b0;

    /* renamed from: c0 */
    private boolean f1186c0;

    /* renamed from: d0 */
    AbstractC7389a f1187d0;

    /* renamed from: e0 */
    private boolean f1188e0;

    /* renamed from: f0 */
    private CharSequence f1189f0;

    /* renamed from: g0 */
    private boolean f1190g0;

    /* renamed from: h0 */
    private boolean f1191h0;

    /* renamed from: i0 */
    private int f1192i0;

    /* renamed from: j0 */
    private boolean f1193j0;

    /* renamed from: k0 */
    private CharSequence f1194k0;

    /* renamed from: l0 */
    private CharSequence f1195l0;

    /* renamed from: m0 */
    private boolean f1196m0;

    /* renamed from: n0 */
    private int f1197n0;

    /* renamed from: o0 */
    SearchableInfo f1198o0;

    /* renamed from: p0 */
    private Bundle f1199p0;

    /* renamed from: q0 */
    private final Runnable f1200q0;

    /* renamed from: r0 */
    private Runnable f1201r0;

    /* renamed from: s0 */
    private final WeakHashMap<String, Drawable.ConstantState> f1202s0;

    /* renamed from: t0 */
    private final View.OnClickListener f1203t0;

    /* renamed from: u0 */
    View.OnKeyListener f1204u0;

    /* renamed from: v0 */
    private final TextView.OnEditorActionListener f1205v0;

    /* renamed from: w0 */
    private final AdapterView.OnItemClickListener f1206w0;

    /* renamed from: x0 */
    private final AdapterView.OnItemSelectedListener f1207x0;

    /* renamed from: y0 */
    private TextWatcher f1208y0;

    /* renamed from: z */
    final SearchAutoComplete f1209z;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends C1650d {

        /* renamed from: o */
        private int f1210o;

        /* renamed from: p */
        private SearchView f1211p;

        /* renamed from: q */
        private boolean f1212q;

        /* renamed from: r */
        final Runnable f1213r;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        /* loaded from: classes.dex */
        class RunnableC1606a implements Runnable {
            RunnableC1606a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.m40396d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C6379a.f13110p);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return Spliterator.NONNULL;
            }
            if (i >= 600) {
                return 192;
            }
            if (i < 640 || i2 < 480) {
                return 160;
            }
            return 192;
        }

        /* renamed from: b */
        void m40398b() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f1183z0.m40393c(this);
        }

        /* renamed from: c */
        boolean m40397c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* renamed from: d */
        void m40396d() {
            if (this.f1212q) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1212q = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f1210o <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.C1650d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1212q) {
                removeCallbacks(this.f1213r);
                post(this.f1213r);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f1211p.m40412X();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1211p.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f1211p.hasFocus() && getVisibility() == 0) {
                this.f1212q = true;
                if (SearchView.m40425K(getContext())) {
                    m40398b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f1212q = false;
                removeCallbacks(this.f1213r);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f1212q = false;
                removeCallbacks(this.f1213r);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f1212q = true;
            }
        }

        void setSearchView(SearchView searchView) {
            this.f1211p = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f1210o = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1213r = new RunnableC1606a();
            this.f1210o = getThreshold();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    /* loaded from: classes.dex */
    class C1607a implements TextWatcher {
        C1607a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.m40413W(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    /* loaded from: classes.dex */
    class RunnableC1608b implements Runnable {
        RunnableC1608b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.m40406d0();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    /* loaded from: classes.dex */
    class RunnableC1609c implements Runnable {
        RunnableC1609c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC7389a aVar = SearchView.this.f1187d0;
            if (aVar instanceof View$OnClickListenerC1678h1) {
                aVar.mo22754a(null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    /* loaded from: classes.dex */
    class View$OnFocusChangeListenerC1610d implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerC1610d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f35237W;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    /* loaded from: classes.dex */
    class View$OnLayoutChangeListenerC1611e implements View.OnLayoutChangeListener {
        View$OnLayoutChangeListenerC1611e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.m40399z();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    /* loaded from: classes.dex */
    class View$OnClickListenerC1612f implements View.OnClickListener {
        View$OnClickListenerC1612f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f35218D) {
                searchView.m40416T();
            } else if (view == searchView.f35220F) {
                searchView.m40420P();
            } else if (view == searchView.f35219E) {
                searchView.m40415U();
            } else if (view == searchView.f35221G) {
                searchView.m40411Y();
            } else if (view == searchView.f1209z) {
                searchView.m40430F();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    /* loaded from: classes.dex */
    class View$OnKeyListenerC1613g implements View.OnKeyListener {
        View$OnKeyListenerC1613g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1198o0 == null) {
                return false;
            }
            if (searchView.f1209z.isPopupShowing() && SearchView.this.f1209z.getListSelection() != -1) {
                return SearchView.this.m40414V(view, i, keyEvent);
            }
            if (SearchView.this.f1209z.m40397c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.m40422N(0, null, searchView2.f1209z.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    /* loaded from: classes.dex */
    class C1614h implements TextView.OnEditorActionListener {
        C1614h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.m40415U();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    /* loaded from: classes.dex */
    class C1615i implements AdapterView.OnItemClickListener {
        C1615i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.m40419Q(i, 0, null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    /* loaded from: classes.dex */
    class C1616j implements AdapterView.OnItemSelectedListener {
        C1616j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.m40418R(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    /* loaded from: classes.dex */
    public interface AbstractC1617k {
        /* renamed from: a */
        boolean mo25963a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    /* loaded from: classes.dex */
    public interface AbstractC1618l {
        /* renamed from: a */
        boolean mo25938a(String str);

        /* renamed from: b */
        boolean mo25937b(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    /* loaded from: classes.dex */
    public interface AbstractC1619m {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.SearchView$n */
    /* loaded from: classes.dex */
    public static class C1620n {

        /* renamed from: a */
        private Method f1225a;

        /* renamed from: b */
        private Method f1226b;

        /* renamed from: c */
        private Method f1227c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        C1620n() {
            this.f1225a = null;
            this.f1226b = null;
            this.f1227c = null;
            m40392d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1225a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1226b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1227c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: d */
        private static void m40392d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* renamed from: a */
        void m40395a(AutoCompleteTextView autoCompleteTextView) {
            m40392d();
            Method method = this.f1226b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: b */
        void m40394b(AutoCompleteTextView autoCompleteTextView) {
            m40392d();
            Method method = this.f1225a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: c */
        void m40393c(AutoCompleteTextView autoCompleteTextView) {
            m40392d();
            Method method = this.f1227c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.SearchView$o */
    /* loaded from: classes.dex */
    public static class C1621o extends AbstractC7736a {
        public static final Parcelable.Creator<C1621o> CREATOR = new C1622a();

        /* renamed from: m */
        boolean f1228m;

        /* renamed from: androidx.appcompat.widget.SearchView$o$a */
        /* loaded from: classes.dex */
        class C1622a implements Parcelable.ClassLoaderCreator<C1621o> {
            C1622a() {
            }

            /* renamed from: a */
            public C1621o createFromParcel(Parcel parcel) {
                return new C1621o(parcel, null);
            }

            /* renamed from: b */
            public C1621o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1621o(parcel, classLoader);
            }

            /* renamed from: c */
            public C1621o[] newArray(int i) {
                return new C1621o[i];
            }
        }

        C1621o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1228m + "}";
        }

        @Override // p125h1.AbstractC7736a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f1228m));
        }

        public C1621o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1228m = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    /* loaded from: classes.dex */
    private static class C1623p extends TouchDelegate {

        /* renamed from: a */
        private final View f1229a;

        /* renamed from: e */
        private final int f1233e;

        /* renamed from: f */
        private boolean f1234f;

        /* renamed from: b */
        private final Rect f1230b = new Rect();

        /* renamed from: d */
        private final Rect f1232d = new Rect();

        /* renamed from: c */
        private final Rect f1231c = new Rect();

        public C1623p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1233e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            m40388a(rect, rect2);
            this.f1229a = view;
        }

        /* renamed from: a */
        public void m40388a(Rect rect, Rect rect2) {
            this.f1230b.set(rect);
            this.f1232d.set(rect);
            Rect rect3 = this.f1232d;
            int i = this.f1233e;
            rect3.inset(-i, -i);
            this.f1231c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f1234f;
                    if (z2 && !this.f1232d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.f1234f;
                        this.f1234f = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else {
                if (this.f1230b.contains(x, y)) {
                    this.f1234f = true;
                    z = true;
                }
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            if (!z || this.f1231c.contains(x, y)) {
                Rect rect = this.f1231c;
                motionEvent.setLocation(x - rect.left, y - rect.top);
            } else {
                motionEvent.setLocation(this.f1229a.getWidth() / 2, this.f1229a.getHeight() / 2);
            }
            return this.f1229a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f1183z0 = Build.VERSION.SDK_INT < 29 ? new C1620n() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    /* renamed from: A */
    private Intent m40435A(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1195l0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1199p0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1198o0.getSearchActivity());
        return intent;
    }

    /* renamed from: B */
    private Intent m40434B(Cursor cursor, int i, String str) {
        int i2;
        Uri uri;
        String n;
        try {
            String n2 = View$OnClickListenerC1678h1.m40191n(cursor, "suggest_intent_action");
            if (n2 == null) {
                n2 = this.f1198o0.getSuggestIntentAction();
            }
            if (n2 == null) {
                n2 = "android.intent.action.SEARCH";
            }
            String n3 = View$OnClickListenerC1678h1.m40191n(cursor, "suggest_intent_data");
            if (n3 == null) {
                n3 = this.f1198o0.getSuggestIntentData();
            }
            if (!(n3 == null || (n = View$OnClickListenerC1678h1.m40191n(cursor, "suggest_intent_data_id")) == null)) {
                n3 = n3 + "/" + Uri.encode(n);
            }
            if (n3 == null) {
                uri = null;
            } else {
                uri = Uri.parse(n3);
            }
            return m40435A(n2, uri, View$OnClickListenerC1678h1.m40191n(cursor, "suggest_intent_extra_data"), View$OnClickListenerC1678h1.m40191n(cursor, "suggest_intent_query"), i, str);
        } catch (RuntimeException e) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e);
            return null;
        }
    }

    /* renamed from: C */
    private Intent m40433C(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1199p0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        } else {
            i = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: D */
    private Intent m40432D(Intent intent, SearchableInfo searchableInfo) {
        String str;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", str);
        return intent2;
    }

    /* renamed from: E */
    private void m40431E() {
        this.f1209z.dismissDropDown();
    }

    /* renamed from: G */
    private void m40429G(View view, Rect rect) {
        view.getLocationInWindow(this.f35226L);
        getLocationInWindow(this.f35227M);
        int[] iArr = this.f35226L;
        int i = iArr[1];
        int[] iArr2 = this.f35227M;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* renamed from: H */
    private CharSequence m40428H(CharSequence charSequence) {
        if (!this.f1185b0 || this.f35229O == null) {
            return charSequence;
        }
        int textSize = (int) (this.f1209z.getTextSize() * 1.25d);
        this.f35229O.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f35229O), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: I */
    private boolean m40427I() {
        Intent intent;
        SearchableInfo searchableInfo = this.f1198o0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        if (this.f1198o0.getVoiceSearchLaunchWebSearch()) {
            intent = this.f35232R;
        } else if (this.f1198o0.getVoiceSearchLaunchRecognizer()) {
            intent = this.f35233S;
        } else {
            intent = null;
        }
        if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: K */
    static boolean m40425K(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: L */
    private boolean m40424L() {
        return (this.f1188e0 || this.f1193j0) && !m40426J();
    }

    /* renamed from: M */
    private void m40423M(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e) {
                Log.e("SearchView", "Failed launch activity: " + intent, e);
            }
        }
    }

    /* renamed from: O */
    private boolean m40421O(int i, int i2, String str) {
        Cursor c = this.f1187d0.mo22752c();
        if (c == null || !c.moveToPosition(i)) {
            return false;
        }
        m40423M(m40434B(c, i2, str));
        return true;
    }

    /* renamed from: Z */
    private void m40410Z() {
        post(this.f1200q0);
    }

    /* renamed from: a0 */
    private void m40409a0(int i) {
        Editable text = this.f1209z.getText();
        Cursor c = this.f1187d0.mo22752c();
        if (c != null) {
            if (c.moveToPosition(i)) {
                CharSequence convertToString = this.f1187d0.convertToString(c);
                if (convertToString != null) {
                    setQuery(convertToString);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    /* renamed from: c0 */
    private void m40407c0() {
        int[] iArr;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1209z.getText());
        int i = 0;
        if (!z2 && (!this.f1185b0 || this.f1196m0)) {
            z = false;
        }
        ImageView imageView = this.f35220F;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f35220F.getDrawable();
        if (drawable != null) {
            if (z2) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    /* renamed from: e0 */
    private void m40405e0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1209z;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m40428H(queryHint));
    }

    /* renamed from: f0 */
    private void m40404f0() {
        this.f1209z.setThreshold(this.f1198o0.getSuggestThreshold());
        this.f1209z.setImeOptions(this.f1198o0.getImeOptions());
        int inputType = this.f1198o0.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1198o0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f1209z.setInputType(inputType);
        AbstractC7389a aVar = this.f1187d0;
        if (aVar != null) {
            aVar.mo22754a(null);
        }
        if (this.f1198o0.getSuggestAuthority() != null) {
            View$OnClickListenerC1678h1 h1Var = new View$OnClickListenerC1678h1(getContext(), this, this.f1198o0, this.f1202s0);
            this.f1187d0 = h1Var;
            this.f1209z.setAdapter(h1Var);
            View$OnClickListenerC1678h1 h1Var2 = (View$OnClickListenerC1678h1) this.f1187d0;
            if (this.f1190g0) {
                i = 2;
            }
            h1Var2.m40182w(i);
        }
    }

    /* renamed from: g0 */
    private void m40403g0() {
        int i;
        if (!m40424L() || !(this.f35219E.getVisibility() == 0 || this.f35221G.getVisibility() == 0)) {
            i = 8;
        } else {
            i = 0;
        }
        this.f35217C.setVisibility(i);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C6382d.f13136g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C6382d.f13137h);
    }

    /* renamed from: h0 */
    private void m40402h0(boolean z) {
        int i;
        if (!this.f1188e0 || !m40424L() || !hasFocus() || (!z && this.f1193j0)) {
            i = 8;
        } else {
            i = 0;
        }
        this.f35219E.setVisibility(i);
    }

    /* renamed from: i0 */
    private void m40401i0(boolean z) {
        int i;
        int i2;
        this.f1186c0 = z;
        int i3 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        boolean z2 = !TextUtils.isEmpty(this.f1209z.getText());
        this.f35218D.setVisibility(i);
        m40402h0(z2);
        View view = this.f35215A;
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
        if (this.f35228N.getDrawable() == null || this.f1185b0) {
            i3 = 8;
        }
        this.f35228N.setVisibility(i3);
        m40407c0();
        m40400j0(!z2);
        m40403g0();
    }

    /* renamed from: j0 */
    private void m40400j0(boolean z) {
        int i = 8;
        if (this.f1193j0 && !m40426J() && z) {
            this.f35219E.setVisibility(8);
            i = 0;
        }
        this.f35221G.setVisibility(i);
    }

    private void setQuery(CharSequence charSequence) {
        int i;
        this.f1209z.setText(charSequence);
        SearchAutoComplete searchAutoComplete = this.f1209z;
        if (TextUtils.isEmpty(charSequence)) {
            i = 0;
        } else {
            i = charSequence.length();
        }
        searchAutoComplete.setSelection(i);
    }

    /* renamed from: F */
    void m40430F() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1209z.refreshAutoCompleteResults();
            return;
        }
        C1620n nVar = f1183z0;
        nVar.m40394b(this.f1209z);
        nVar.m40395a(this.f1209z);
    }

    /* renamed from: J */
    public boolean m40426J() {
        return this.f1186c0;
    }

    /* renamed from: N */
    void m40422N(int i, String str, String str2) {
        getContext().startActivity(m40435A("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    /* renamed from: P */
    void m40420P() {
        if (!TextUtils.isEmpty(this.f1209z.getText())) {
            this.f1209z.setText("");
            this.f1209z.requestFocus();
            this.f1209z.setImeVisibility(true);
        } else if (this.f1185b0) {
            AbstractC1617k kVar = this.f35236V;
            if (kVar == null || !kVar.mo25963a()) {
                clearFocus();
                m40401i0(true);
            }
        }
    }

    /* renamed from: Q */
    boolean m40419Q(int i, int i2, String str) {
        m40421O(i, 0, null);
        this.f1209z.setImeVisibility(false);
        m40431E();
        return true;
    }

    /* renamed from: R */
    boolean m40418R(int i) {
        m40409a0(i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public void m40417S(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: T */
    void m40416T() {
        m40401i0(false);
        this.f1209z.requestFocus();
        this.f1209z.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1184a0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: U */
    void m40415U() {
        Editable text = this.f1209z.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            AbstractC1618l lVar = this.f35235U;
            if (lVar == null || !lVar.mo25937b(text.toString())) {
                if (this.f1198o0 != null) {
                    m40422N(0, null, text.toString());
                }
                this.f1209z.setImeVisibility(false);
                m40431E();
            }
        }
    }

    /* renamed from: V */
    boolean m40414V(View view, int i, KeyEvent keyEvent) {
        int i2;
        if (this.f1198o0 != null && this.f1187d0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return m40419Q(this.f1209z.getListSelection(), 0, null);
            }
            if (i == 21 || i == 22) {
                if (i == 21) {
                    i2 = 0;
                } else {
                    i2 = this.f1209z.length();
                }
                this.f1209z.setSelection(i2);
                this.f1209z.setListSelection(0);
                this.f1209z.clearListSelection();
                this.f1209z.m40398b();
                return true;
            } else if (i == 19) {
                this.f1209z.getListSelection();
                return false;
            }
        }
        return false;
    }

    /* renamed from: W */
    void m40413W(CharSequence charSequence) {
        Editable text = this.f1209z.getText();
        this.f1195l0 = text;
        boolean z = !TextUtils.isEmpty(text);
        m40402h0(z);
        m40400j0(!z);
        m40407c0();
        m40403g0();
        if (this.f35235U != null && !TextUtils.equals(charSequence, this.f1194k0)) {
            this.f35235U.mo25938a(charSequence.toString());
        }
        this.f1194k0 = charSequence.toString();
    }

    /* renamed from: X */
    void m40412X() {
        m40401i0(m40426J());
        m40410Z();
        if (this.f1209z.hasFocus()) {
            m40430F();
        }
    }

    /* renamed from: Y */
    void m40411Y() {
        SearchableInfo searchableInfo = this.f1198o0;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(m40432D(this.f35232R, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(m40433C(this.f35233S, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* renamed from: b0 */
    public void m40408b0(CharSequence charSequence, boolean z) {
        this.f1209z.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1209z;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1195l0 = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            m40415U();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f1191h0 = true;
        super.clearFocus();
        this.f1209z.clearFocus();
        this.f1209z.setImeVisibility(false);
        this.f1191h0 = false;
    }

    /* renamed from: d0 */
    void m40406d0() {
        int[] iArr;
        if (this.f1209z.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.f35216B.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f35217C.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f1209z.getImeOptions();
    }

    public int getInputType() {
        return this.f1209z.getInputType();
    }

    public int getMaxWidth() {
        return this.f1192i0;
    }

    public CharSequence getQuery() {
        return this.f1209z.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1189f0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1198o0;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.f35234T;
        }
        return getContext().getText(this.f1198o0.getHintId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f35231Q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f35230P;
    }

    public AbstractC7389a getSuggestionsAdapter() {
        return this.f1187d0;
    }

    @Override // p144i.AbstractC8095b
    public void onActionViewCollapsed() {
        m40408b0("", false);
        clearFocus();
        m40401i0(true);
        this.f1209z.setImeOptions(this.f1197n0);
        this.f1196m0 = false;
    }

    @Override // p144i.AbstractC8095b
    public void onActionViewExpanded() {
        if (!this.f1196m0) {
            this.f1196m0 = true;
            int imeOptions = this.f1209z.getImeOptions();
            this.f1197n0 = imeOptions;
            this.f1209z.setImeOptions(imeOptions | 33554432);
            this.f1209z.setText("");
            setIconified(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f1200q0);
        post(this.f1201r0);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C1733v0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m40429G(this.f1209z, this.f35224J);
            Rect rect = this.f35225K;
            Rect rect2 = this.f35224J;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C1623p pVar = this.f35223I;
            if (pVar == null) {
                C1623p pVar2 = new C1623p(this.f35225K, this.f35224J, this.f1209z);
                this.f35223I = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.m40388a(this.f35225K, this.f35224J);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C1733v0, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        if (m40426J()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.f1192i0;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f1192i0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.f1192i0) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1621o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1621o oVar = (C1621o) parcelable;
        super.onRestoreInstanceState(oVar.m21547a());
        m40401i0(oVar.f1228m);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C1621o oVar = new C1621o(super.onSaveInstanceState());
        oVar.f1228m = m40426J();
        return oVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m40410Z();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (this.f1191h0 || !isFocusable()) {
            return false;
        }
        if (m40426J()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f1209z.requestFocus(i, rect);
        if (requestFocus) {
            m40401i0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1199p0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m40420P();
        } else {
            m40416T();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f1185b0 != z) {
            this.f1185b0 = z;
            m40401i0(z);
            m40405e0();
        }
    }

    public void setImeOptions(int i) {
        this.f1209z.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f1209z.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f1192i0 = i;
        requestLayout();
    }

    public void setOnCloseListener(AbstractC1617k kVar) {
        this.f35236V = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f35237W = onFocusChangeListener;
    }

    public void setOnQueryTextListener(AbstractC1618l lVar) {
        this.f35235U = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1184a0 = onClickListener;
    }

    public void setOnSuggestionListener(AbstractC1619m mVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1189f0 = charSequence;
        m40405e0();
    }

    public void setQueryRefinementEnabled(boolean z) {
        int i;
        this.f1190g0 = z;
        AbstractC7389a aVar = this.f1187d0;
        if (aVar instanceof View$OnClickListenerC1678h1) {
            View$OnClickListenerC1678h1 h1Var = (View$OnClickListenerC1678h1) aVar;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            h1Var.m40182w(i);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1198o0 = searchableInfo;
        if (searchableInfo != null) {
            m40404f0();
            m40405e0();
        }
        boolean I = m40427I();
        this.f1193j0 = I;
        if (I) {
            this.f1209z.setPrivateImeOptions("nm");
        }
        m40401i0(m40426J());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f1188e0 = z;
        m40401i0(m40426J());
    }

    public void setSuggestionsAdapter(AbstractC7389a aVar) {
        this.f1187d0 = aVar;
        this.f1209z.setAdapter(aVar);
    }

    /* renamed from: z */
    void m40399z() {
        int i;
        int i2;
        if (this.f35222H.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f35216B.getPaddingLeft();
            Rect rect = new Rect();
            boolean b = C1735v1.m39981b(this);
            if (this.f1185b0) {
                i = resources.getDimensionPixelSize(C6382d.f13134e) + resources.getDimensionPixelSize(C6382d.f13135f);
            } else {
                i = 0;
            }
            this.f1209z.getDropDownBackground().getPadding(rect);
            if (b) {
                i2 = -rect.left;
            } else {
                i2 = paddingLeft - (rect.left + i);
            }
            this.f1209z.setDropDownHorizontalOffset(i2);
            this.f1209z.setDropDownWidth((((this.f35222H.getWidth() + rect.left) + rect.right) + i) - paddingLeft);
        }
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6379a.f37743I);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35224J = new Rect();
        this.f35225K = new Rect();
        this.f35226L = new int[2];
        this.f35227M = new int[2];
        this.f1200q0 = new RunnableC1608b();
        this.f1201r0 = new RunnableC1609c();
        this.f1202s0 = new WeakHashMap<>();
        View$OnClickListenerC1612f fVar = new View$OnClickListenerC1612f();
        this.f1203t0 = fVar;
        this.f1204u0 = new View$OnKeyListenerC1613g();
        C1614h hVar = new C1614h();
        this.f1205v0 = hVar;
        C1615i iVar = new C1615i();
        this.f1206w0 = iVar;
        C1616j jVar = new C1616j();
        this.f1207x0 = jVar;
        this.f1208y0 = new C1607a();
        int[] iArr = C6388j.f13263f2;
        C1698n1 v = C1698n1.m40105v(context, attributeSet, iArr, i, 0);
        C2733w0.m36994o0(this, context, iArr, attributeSet, v.m40109r(), i, 0);
        LayoutInflater.from(context).inflate(v.m40113n(C6388j.f13313p2, C6385g.f13214r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C6384f.f37772D);
        this.f1209z = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f35215A = findViewById(C6384f.f13196z);
        View findViewById = findViewById(C6384f.f37771C);
        this.f35216B = findViewById;
        View findViewById2 = findViewById(C6384f.f37778J);
        this.f35217C = findViewById2;
        ImageView imageView = (ImageView) findViewById(C6384f.f13194x);
        this.f35218D = imageView;
        ImageView imageView2 = (ImageView) findViewById(C6384f.f37769A);
        this.f35219E = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C6384f.f13195y);
        this.f35220F = imageView3;
        ImageView imageView4 = (ImageView) findViewById(C6384f.f37773E);
        this.f35221G = imageView4;
        ImageView imageView5 = (ImageView) findViewById(C6384f.f37770B);
        this.f35228N = imageView5;
        C2733w0.m36982u0(findViewById, v.m40120g(C6388j.f13318q2));
        C2733w0.m36982u0(findViewById2, v.m40120g(C6388j.f13338u2));
        int i2 = C6388j.f13333t2;
        imageView.setImageDrawable(v.m40120g(i2));
        imageView2.setImageDrawable(v.m40120g(C6388j.f13303n2));
        imageView3.setImageDrawable(v.m40120g(C6388j.f13288k2));
        imageView4.setImageDrawable(v.m40120g(C6388j.f13348w2));
        imageView5.setImageDrawable(v.m40120g(i2));
        this.f35229O = v.m40120g(C6388j.f13328s2);
        C1715r1.m40049a(imageView, getResources().getString(C6386h.f13230n));
        this.f35230P = v.m40113n(C6388j.f13343v2, C6385g.f13213q);
        this.f35231Q = v.m40113n(C6388j.f13293l2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f1208y0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f1204u0);
        searchAutoComplete.setOnFocusChangeListener(new View$OnFocusChangeListenerC1610d());
        setIconifiedByDefault(v.m40126a(C6388j.f13308o2, true));
        int f = v.m40121f(C6388j.f13273h2, -1);
        if (f != -1) {
            setMaxWidth(f);
        }
        this.f35234T = v.m40111p(C6388j.f13298m2);
        this.f1189f0 = v.m40111p(C6388j.f13323r2);
        int k = v.m40116k(C6388j.f13283j2, -1);
        if (k != -1) {
            setImeOptions(k);
        }
        int k2 = v.m40116k(C6388j.f13278i2, -1);
        if (k2 != -1) {
            setInputType(k2);
        }
        setFocusable(v.m40126a(C6388j.f13268g2, true));
        v.m40104w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f35232R = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f35233S = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f35222H = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC1611e());
        }
        m40401i0(this.f1185b0);
        m40405e0();
    }
}

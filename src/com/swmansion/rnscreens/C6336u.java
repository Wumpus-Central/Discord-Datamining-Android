package com.swmansion.rnscreens;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActivityC1510b;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.views.text.ReactTypefaceUtils;
import com.swmansion.rnscreens.C6338v;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J0\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0014J\u0006\u0010\u0011\u001a\u00020\u0006J\b\u0010\u0012\u001a\u00020\u0006H\u0014J\b\u0010\u0013\u001a\u00020\u0006H\u0014J\u0006\u0010\u0014\u001a\u00020\u0006J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u000bJ\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000bJ\u0006\u0010\u0019\u001a\u00020\u0006J\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u000bJ\u0010\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u001e\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002J\u0010\u0010 \u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002J\u000e\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!J\u000e\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u000bJ\u000e\u0010&\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u000bJ\u000e\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\tJ\u0017\u0010)\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b)\u0010*J\u000e\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\tJ\u000e\u0010.\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\tJ\u000e\u00100\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\tJ\u000e\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u00020\tJ\u000e\u00104\u001a\u00020\u00062\u0006\u00103\u001a\u00020\tJ\u0010\u00106\u001a\u00020\u00062\b\u00105\u001a\u0004\u0018\u00010\u0002R$\u0010;\u001a\u0012\u0012\u0004\u0012\u00020\u001607j\b\u0012\u0004\u0012\u00020\u0016`88\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0017\u0010@\u001a\u00020<8\u0006¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\b>\u0010?R\u0018\u0010C\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010F\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010I\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010K\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010ER\u0018\u0010M\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010ER\u0016\u0010O\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010NR\u0016\u0010Q\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010HR\u0018\u0010R\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010BR\u0016\u0010U\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010TR\u0016\u0010Y\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010TR\u0016\u0010[\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010TR\u0016\u0010]\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010TR\u0016\u0010_\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010TR\u0016\u0010a\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010TR\u0016\u0010c\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010HR\u0016\u0010e\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010TR\u0014\u0010g\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010HR\u0014\u0010i\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010HR\u0014\u0010l\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010kR\u0016\u0010p\u001a\u0004\u0018\u00010m8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0016\u0010t\u001a\u0004\u0018\u00010q8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u0016\u0010x\u001a\u0004\u0018\u00010u8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0013\u0010|\u001a\u0004\u0018\u00010y8F¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0011\u0010\u007f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b}\u0010~¨\u0006\u0084\u0001"}, m15073d2 = {"Lcom/swmansion/rnscreens/u;", "Landroid/view/ViewGroup;", "", "eventName", "Lcom/facebook/react/bridge/WritableMap;", "eventContent", "", "j", "f", "", "changed", "", "l", "t", "r", "b", ViewProps.ON_LAYOUT, "c", "onAttachedToWindow", "onDetachedFromWindow", "g", "index", "Lcom/swmansion/rnscreens/v;", "d", "i", "h", "child", "title", "setTitle", "titleFontFamily", "setTitleFontFamily", "fontWeightString", "setTitleFontWeight", "", "titleFontSize", "setTitleFontSize", ViewProps.COLOR, "setTitleColor", "setTintColor", "topInsetEnabled", "setTopInsetEnabled", "setBackgroundColor", "(Ljava/lang/Integer;)V", "hideShadow", "setHideShadow", "hideBackButton", "setHideBackButton", ViewProps.HIDDEN, "setHidden", "translucent", "setTranslucent", "backButtonInCustomView", "setBackButtonInCustomView", "direction", "setDirection", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "k", "Ljava/util/ArrayList;", "mConfigSubviews", "Lcom/swmansion/rnscreens/d;", "Lcom/swmansion/rnscreens/d;", "getToolbar", "()Lcom/swmansion/rnscreens/d;", "toolbar", "m", "Ljava/lang/Integer;", "headerTopInset", "n", "Ljava/lang/String;", "mTitle", "o", "I", "mTitleColor", "p", "mTitleFontFamily", "q", "mDirection", "F", "mTitleFontSize", "s", "mTitleFontWeight", "mBackgroundColor", "u", "Z", "mIsHidden", "v", "mIsBackButtonHidden", "w", "mIsShadowHidden", "x", "mDestroyed", "y", "mBackButtonInCustomView", "z", "mIsTopInsetEnabled", "A", "mIsTranslucent", "B", "mTintColor", "C", "mIsAttachedToWindow", "D", "mDefaultStartInset", "E", "mDefaultStartInsetWithNavigation", "Landroid/view/View$OnClickListener;", "Landroid/view/View$OnClickListener;", "mBackClickListener", "Lcom/swmansion/rnscreens/j;", "getScreen", "()Lcom/swmansion/rnscreens/j;", "screen", "Lcom/swmansion/rnscreens/r;", "getScreenStack", "()Lcom/swmansion/rnscreens/r;", "screenStack", "Landroid/widget/TextView;", "getTitleTextView", "()Landroid/widget/TextView;", "titleTextView", "Lcom/swmansion/rnscreens/s;", "getScreenFragment", "()Lcom/swmansion/rnscreens/s;", "screenFragment", "getConfigSubviewsCount", "()I", "configSubviewsCount", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: com.swmansion.rnscreens.u */
/* loaded from: classes8.dex */
public final class C6336u extends ViewGroup {

    /* renamed from: A */
    private boolean f37683A;

    /* renamed from: B */
    private int f37684B;

    /* renamed from: C */
    private boolean f37685C;

    /* renamed from: D */
    private final int f37686D;

    /* renamed from: E */
    private final int f37687E;

    /* renamed from: l */
    private final C6288d f12892l;

    /* renamed from: m */
    private Integer f12893m;

    /* renamed from: n */
    private String f12894n;

    /* renamed from: o */
    private int f12895o;

    /* renamed from: p */
    private String f12896p;

    /* renamed from: q */
    private String f12897q;

    /* renamed from: r */
    private float f12898r;

    /* renamed from: s */
    private int f12899s;

    /* renamed from: t */
    private Integer f12900t;

    /* renamed from: u */
    private boolean f12901u;

    /* renamed from: v */
    private boolean f12902v;

    /* renamed from: w */
    private boolean f12903w;

    /* renamed from: x */
    private boolean f12904x;

    /* renamed from: y */
    private boolean f12905y;

    /* renamed from: k */
    private final ArrayList<C6338v> f12891k = new ArrayList<>(3);

    /* renamed from: z */
    private boolean f12906z = true;

    /* renamed from: F */
    private final View.OnClickListener f37688F = new View.OnClickListener() { // from class: com.swmansion.rnscreens.t
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C6336u.m25827e(C6336u.this, view);
        }
    };

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: com.swmansion.rnscreens.u$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C6337a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12907a;

        static {
            int[] iArr = new int[C6338v.EnumC6339a.values().length];
            try {
                iArr[C6338v.EnumC6339a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C6338v.EnumC6339a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C6338v.EnumC6339a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f12907a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6336u(Context context) {
        super(context);
        C9971q.m14633g(context, "context");
        setVisibility(8);
        C6288d dVar = new C6288d(context, this);
        this.f12892l = dVar;
        this.f37686D = dVar.getContentInsetStart();
        this.f37687E = dVar.getContentInsetStartWithNavigation();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C6296h.f12763a, typedValue, true)) {
            dVar.setBackgroundColor(typedValue.data);
        }
        dVar.setClipChildren(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m25827e(C6336u this$0, View view) {
        C9971q.m14633g(this$0, "this$0");
        C6331s screenFragment = this$0.getScreenFragment();
        if (screenFragment != null) {
            C6327r screenStack = this$0.getScreenStack();
            if (screenStack != null && C9971q.m14638b(screenStack.getRootScreen(), screenFragment.m25884q())) {
                Fragment parentFragment = screenFragment.getParentFragment();
                if (parentFragment instanceof C6331s) {
                    C6331s sVar = (C6331s) parentFragment;
                    if (sVar.m25884q().getNativeBackButtonDismissalEnabled()) {
                        sVar.dismiss();
                    } else {
                        sVar.m25893h();
                    }
                }
            } else if (screenFragment.m25884q().getNativeBackButtonDismissalEnabled()) {
                screenFragment.dismiss();
            } else {
                screenFragment.m25893h();
            }
        }
    }

    /* renamed from: f */
    private final void m25826f() {
        if (getParent() != null && !this.f12904x) {
            m25825g();
        }
    }

    private final C6308j getScreen() {
        ViewParent parent = getParent();
        if (parent instanceof C6308j) {
            return (C6308j) parent;
        }
        return null;
    }

    private final C6327r getScreenStack() {
        C6308j screen = getScreen();
        C6316l<?> container = screen != null ? screen.getContainer() : null;
        if (container instanceof C6327r) {
            return (C6327r) container;
        }
        return null;
    }

    private final TextView getTitleTextView() {
        int childCount = this.f12892l.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f12892l.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (C9971q.m14638b(textView.getText(), this.f12892l.getTitle())) {
                    return textView;
                }
            }
        }
        return null;
    }

    /* renamed from: j */
    private final void m25822j(String str, WritableMap writableMap) {
        Context context = getContext();
        C9971q.m14635e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        RCTEventEmitter rCTEventEmitter = (RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class);
        if (rCTEventEmitter != null) {
            rCTEventEmitter.receiveEvent(getId(), str, writableMap);
        }
    }

    /* renamed from: b */
    public final void m25830b(C6338v child, int i) {
        C9971q.m14633g(child, "child");
        this.f12891k.add(i, child);
        m25826f();
    }

    /* renamed from: c */
    public final void m25829c() {
        this.f12904x = true;
    }

    /* renamed from: d */
    public final C6338v m25828d(int i) {
        C6338v vVar = this.f12891k.get(i);
        C9971q.m14634f(vVar, "mConfigSubviews[index]");
        return vVar;
    }

    /* renamed from: g */
    public final void m25825g() {
        boolean z;
        FragmentActivity fragmentActivity;
        boolean z2;
        boolean z3;
        ImageView imageView;
        Drawable navigationIcon;
        int i;
        C6331s screenFragment;
        C6331s screenFragment2;
        ReactContext reactContext;
        C6327r screenStack = getScreenStack();
        if (screenStack == null || C9971q.m14638b(screenStack.getTopScreen(), getParent())) {
            z = true;
        } else {
            z = false;
        }
        if (this.f37685C && z && !this.f12904x) {
            C6331s screenFragment3 = getScreenFragment();
            if (screenFragment3 != null) {
                fragmentActivity = screenFragment3.getActivity();
            } else {
                fragmentActivity = null;
            }
            ActivityC1510b bVar = (ActivityC1510b) fragmentActivity;
            if (bVar != null) {
                String str = this.f12897q;
                if (str != null) {
                    if (C9971q.m14638b(str, "rtl")) {
                        this.f12892l.setLayoutDirection(1);
                    } else if (C9971q.m14638b(this.f12897q, "ltr")) {
                        this.f12892l.setLayoutDirection(0);
                    }
                }
                C6308j screen = getScreen();
                if (screen != null) {
                    if (getContext() instanceof ReactContext) {
                        Context context = getContext();
                        C9971q.m14635e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                        reactContext = (ReactContext) context;
                    } else {
                        C6319n fragment = screen.getFragment();
                        if (fragment != null) {
                            reactContext = fragment.m25877z();
                        } else {
                            reactContext = null;
                        }
                    }
                    C6343z.f12923a.m25799v(screen, bVar, reactContext);
                }
                if (!this.f12901u) {
                    if (this.f12892l.getParent() == null && (screenFragment = getScreenFragment()) != null) {
                        screenFragment.m25839H(this.f12892l);
                    }
                    if (this.f12906z) {
                        Integer num = this.f12893m;
                        C6288d dVar = this.f12892l;
                        if (num != null) {
                            i = num.intValue();
                        } else {
                            i = 0;
                        }
                        dVar.setPadding(0, i, 0, 0);
                    } else if (this.f12892l.getPaddingTop() > 0) {
                        this.f12892l.setPadding(0, 0, 0, 0);
                    }
                    bVar.setSupportActionBar(this.f12892l);
                    ActionBar supportActionBar = bVar.getSupportActionBar();
                    if (supportActionBar != null) {
                        C9971q.m14634f(supportActionBar, "requireNotNull(activity.supportActionBar)");
                        this.f12892l.setContentInsetStartWithNavigation(this.f37687E);
                        C6288d dVar2 = this.f12892l;
                        int i2 = this.f37686D;
                        dVar2.m40376J(i2, i2);
                        C6331s screenFragment4 = getScreenFragment();
                        if (screenFragment4 == null || !screenFragment4.m25844C()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (!z2 || this.f12902v) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        supportActionBar.mo40734s(z3);
                        this.f12892l.setNavigationOnClickListener(this.f37688F);
                        C6331s screenFragment5 = getScreenFragment();
                        if (screenFragment5 != null) {
                            screenFragment5.m25838I(this.f12903w);
                        }
                        C6331s screenFragment6 = getScreenFragment();
                        if (screenFragment6 != null) {
                            screenFragment6.m25837J(this.f37683A);
                        }
                        supportActionBar.mo40730w(this.f12894n);
                        if (TextUtils.isEmpty(this.f12894n)) {
                            this.f12892l.setContentInsetStartWithNavigation(0);
                        }
                        TextView titleTextView = getTitleTextView();
                        int i3 = this.f12895o;
                        if (i3 != 0) {
                            this.f12892l.setTitleTextColor(i3);
                        }
                        if (titleTextView != null) {
                            String str2 = this.f12896p;
                            if (str2 != null || this.f12899s > 0) {
                                Typeface applyStyles = ReactTypefaceUtils.applyStyles(null, 0, this.f12899s, str2, getContext().getAssets());
                                C9971q.m14634f(applyStyles, "applyStyles(\n           ….assets\n                )");
                                titleTextView.setTypeface(applyStyles);
                            }
                            float f = this.f12898r;
                            if (f > 0.0f) {
                                titleTextView.setTextSize(f);
                            }
                        }
                        Integer num2 = this.f12900t;
                        if (num2 != null) {
                            this.f12892l.setBackgroundColor(num2.intValue());
                        }
                        if (!(this.f37684B == 0 || (navigationIcon = this.f12892l.getNavigationIcon()) == null)) {
                            navigationIcon.setColorFilter(this.f37684B, PorterDuff.Mode.SRC_ATOP);
                        }
                        for (int childCount = this.f12892l.getChildCount() - 1; -1 < childCount; childCount--) {
                            if (this.f12892l.getChildAt(childCount) instanceof C6338v) {
                                this.f12892l.removeViewAt(childCount);
                            }
                        }
                        int size = this.f12891k.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            C6338v vVar = this.f12891k.get(i4);
                            C9971q.m14634f(vVar, "mConfigSubviews[i]");
                            C6338v vVar2 = vVar;
                            C6338v.EnumC6339a type = vVar2.getType();
                            if (type == C6338v.EnumC6339a.BACK) {
                                View childAt = vVar2.getChildAt(0);
                                if (childAt instanceof ImageView) {
                                    imageView = (ImageView) childAt;
                                } else {
                                    imageView = null;
                                }
                                if (imageView != null) {
                                    supportActionBar.mo40732u(imageView.getDrawable());
                                } else {
                                    throw new JSApplicationIllegalArgumentException("Back button header config view should have Image as first child");
                                }
                            } else {
                                Toolbar.C1629e eVar = new Toolbar.C1629e(-2, -1);
                                int i5 = C6337a.f12907a[type.ordinal()];
                                if (i5 == 1) {
                                    if (!this.f12905y) {
                                        this.f12892l.setNavigationIcon((Drawable) null);
                                    }
                                    this.f12892l.setTitle((CharSequence) null);
                                    eVar.f658a = 8388611;
                                } else if (i5 == 2) {
                                    eVar.f658a = 8388613;
                                } else if (i5 == 3) {
                                    ((ViewGroup.MarginLayoutParams) eVar).width = -1;
                                    eVar.f658a = 1;
                                    this.f12892l.setTitle((CharSequence) null);
                                }
                                vVar2.setLayoutParams(eVar);
                                this.f12892l.addView(vVar2);
                            }
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else if (this.f12892l.getParent() != null && (screenFragment2 = getScreenFragment()) != null) {
                    screenFragment2.m25841F();
                }
            }
        }
    }

    public final int getConfigSubviewsCount() {
        return this.f12891k.size();
    }

    public final C6331s getScreenFragment() {
        ViewParent parent = getParent();
        if (!(parent instanceof C6308j)) {
            return null;
        }
        C6319n fragment = ((C6308j) parent).getFragment();
        if (fragment instanceof C6331s) {
            return (C6331s) fragment;
        }
        return null;
    }

    public final C6288d getToolbar() {
        return this.f12892l;
    }

    /* renamed from: h */
    public final void m25824h() {
        this.f12891k.clear();
        m25826f();
    }

    /* renamed from: i */
    public final void m25823i(int i) {
        this.f12891k.remove(i);
        m25826f();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37685C = true;
        m25822j("onAttached", null);
        if (this.f12893m == null) {
            this.f12893m = Integer.valueOf(getRootWindowInsets().getSystemWindowInsetTop());
        }
        m25825g();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f37685C = false;
        m25822j("onDetached", null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void setBackButtonInCustomView(boolean z) {
        this.f12905y = z;
    }

    public final void setBackgroundColor(Integer num) {
        this.f12900t = num;
    }

    public final void setDirection(String str) {
        this.f12897q = str;
    }

    public final void setHidden(boolean z) {
        this.f12901u = z;
    }

    public final void setHideBackButton(boolean z) {
        this.f12902v = z;
    }

    public final void setHideShadow(boolean z) {
        this.f12903w = z;
    }

    public final void setTintColor(int i) {
        this.f37684B = i;
    }

    public final void setTitle(String str) {
        this.f12894n = str;
    }

    public final void setTitleColor(int i) {
        this.f12895o = i;
    }

    public final void setTitleFontFamily(String str) {
        this.f12896p = str;
    }

    public final void setTitleFontSize(float f) {
        this.f12898r = f;
    }

    public final void setTitleFontWeight(String str) {
        this.f12899s = ReactTypefaceUtils.parseFontWeight(str);
    }

    public final void setTopInsetEnabled(boolean z) {
        this.f12906z = z;
    }

    public final void setTranslucent(boolean z) {
        this.f37683A = z;
    }
}

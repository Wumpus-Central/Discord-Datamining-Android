package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11088q;
import p163j$.util.Spliterator;

@Metadata(m15074d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002WXB\u0011\u0012\b\u0010T\u001a\u0004\u0018\u00010S¢\u0006\u0004\bU\u0010VJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u001a\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J\u0006\u0010\u0014\u001a\u00020\u0002J\b\u0010\u0015\u001a\u00020\u0002H\u0014R\"\u0010\u001c\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010*\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010-\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R$\u00100\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010%\u001a\u0004\b.\u0010'\"\u0004\b/\u0010)R$\u00103\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010%\u001a\u0004\b1\u0010'\"\u0004\b2\u0010)R\"\u0010:\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010A\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010E\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010<\u001a\u0004\bC\u0010>\"\u0004\bD\u0010@R\"\u0010H\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010<\u001a\u0004\bF\u0010>\"\u0004\bG\u0010@R\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010N\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010<R\u0016\u0010R\u001a\u0004\u0018\u00010O8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006Y"}, m15073d2 = {"Lcom/swmansion/rnscreens/h0;", "Lcom/facebook/react/views/view/ReactViewGroup;", "", "t", "Landroidx/appcompat/widget/SearchView;", "searchView", "setSearchViewListeners", "", "newText", "m", "", "hasFocus", "k", "j", "l", "n", "eventName", "Lcom/facebook/react/bridge/WritableMap;", "eventContent", "p", "o", "onAttachedToWindow", "Lcom/swmansion/rnscreens/h0$b;", "Lcom/swmansion/rnscreens/h0$b;", "getInputType", "()Lcom/swmansion/rnscreens/h0$b;", "setInputType", "(Lcom/swmansion/rnscreens/h0$b;)V", "inputType", "Lcom/swmansion/rnscreens/h0$a;", "Lcom/swmansion/rnscreens/h0$a;", "getAutoCapitalize", "()Lcom/swmansion/rnscreens/h0$a;", "setAutoCapitalize", "(Lcom/swmansion/rnscreens/h0$a;)V", "autoCapitalize", "", "Ljava/lang/Integer;", "getTextColor", "()Ljava/lang/Integer;", "setTextColor", "(Ljava/lang/Integer;)V", "textColor", "getTintColor", "setTintColor", "tintColor", "getHeaderIconColor", "setHeaderIconColor", "headerIconColor", "getHintTextColor", "setHintTextColor", "hintTextColor", "q", "Ljava/lang/String;", "getPlaceholder", "()Ljava/lang/String;", "setPlaceholder", "(Ljava/lang/String;)V", ReactTextInputShadowNode.PROP_PLACEHOLDER, "r", "Z", "getShouldOverrideBackButton", "()Z", "setShouldOverrideBackButton", "(Z)V", "shouldOverrideBackButton", "s", "getAutoFocus", "setAutoFocus", "autoFocus", "getShouldShowHintSearchIcon", "setShouldShowHintSearchIcon", "shouldShowHintSearchIcon", "Lcom/swmansion/rnscreens/i0;", "u", "Lcom/swmansion/rnscreens/i0;", "mSearchViewFormatter", "v", "mAreListenersSet", "Lcom/swmansion/rnscreens/s;", "getScreenStackFragment", "()Lcom/swmansion/rnscreens/s;", "screenStackFragment", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "a", "b", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
@SuppressLint({"ViewConstructor"})
/* renamed from: com.swmansion.rnscreens.h0 */
/* loaded from: classes8.dex */
public final class C6297h0 extends ReactViewGroup {

    /* renamed from: m */
    private Integer f12766m;

    /* renamed from: n */
    private Integer f12767n;

    /* renamed from: o */
    private Integer f12768o;

    /* renamed from: p */
    private Integer f12769p;

    /* renamed from: s */
    private boolean f12772s;

    /* renamed from: u */
    private C6307i0 f12774u;

    /* renamed from: v */
    private boolean f12775v;

    /* renamed from: k */
    private EnumC6299b f12764k = EnumC6299b.f12781k;

    /* renamed from: l */
    private EnumC6298a f12765l = EnumC6298a.NONE;

    /* renamed from: q */
    private String f12770q = "";

    /* renamed from: r */
    private boolean f12771r = true;

    /* renamed from: t */
    private boolean f12773t = true;

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m15073d2 = {"Lcom/swmansion/rnscreens/h0$a;", "", "<init>", "(Ljava/lang/String;I)V", "k", "l", "m", "n", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.h0$a */
    /* loaded from: classes8.dex */
    public enum EnumC6298a {
        NONE,
        WORDS,
        SENTENCES,
        CHARACTERS
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m15073d2 = {"Lcom/swmansion/rnscreens/h0$b;", "", "Lcom/swmansion/rnscreens/h0$a;", "capitalize", "", "b", "<init>", "(Ljava/lang/String;I)V", "k", "l", "m", "n", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.h0$b */
    /* loaded from: classes8.dex */
    public static final class EnumC6299b extends Enum<EnumC6299b> {

        /* renamed from: k */
        public static final EnumC6299b f12781k = new C6302d("TEXT", 0);

        /* renamed from: l */
        public static final EnumC6299b f12782l = new C6301c("PHONE", 1);

        /* renamed from: m */
        public static final EnumC6299b f12783m = new C0185b("NUMBER", 2);

        /* renamed from: n */
        public static final EnumC6299b f12784n = new C6300a("EMAIL", 3);

        /* renamed from: o */
        private static final /* synthetic */ EnumC6299b[] f12785o = m25941a();

        @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m15073d2 = {"Lcom/swmansion/rnscreens/h0$b$a;", "Lcom/swmansion/rnscreens/h0$b;", "Lcom/swmansion/rnscreens/h0$a;", "capitalize", "", "b", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
        /* renamed from: com.swmansion.rnscreens.h0$b$a */
        /* loaded from: classes8.dex */
        static final class C6300a extends EnumC6299b {
            C6300a(String str, int i) {
                super(str, i, null);
            }

            @Override // com.swmansion.rnscreens.C6297h0.EnumC6299b
            /* renamed from: b */
            public int mo25940b(EnumC6298a capitalize) {
                C9971q.m14633g(capitalize, "capitalize");
                return 32;
            }
        }

        @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m15073d2 = {"Lcom/swmansion/rnscreens/h0$b$b;", "Lcom/swmansion/rnscreens/h0$b;", "Lcom/swmansion/rnscreens/h0$a;", "capitalize", "", "b", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
        /* renamed from: com.swmansion.rnscreens.h0$b$b */
        /* loaded from: classes8.dex */
        static final class C0185b extends EnumC6299b {
            C0185b(String str, int i) {
                super(str, i, null);
            }

            @Override // com.swmansion.rnscreens.C6297h0.EnumC6299b
            /* renamed from: b */
            public int mo25940b(EnumC6298a capitalize) {
                C9971q.m14633g(capitalize, "capitalize");
                return 2;
            }
        }

        @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m15073d2 = {"Lcom/swmansion/rnscreens/h0$b$c;", "Lcom/swmansion/rnscreens/h0$b;", "Lcom/swmansion/rnscreens/h0$a;", "capitalize", "", "b", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
        /* renamed from: com.swmansion.rnscreens.h0$b$c */
        /* loaded from: classes8.dex */
        static final class C6301c extends EnumC6299b {
            C6301c(String str, int i) {
                super(str, i, null);
            }

            @Override // com.swmansion.rnscreens.C6297h0.EnumC6299b
            /* renamed from: b */
            public int mo25940b(EnumC6298a capitalize) {
                C9971q.m14633g(capitalize, "capitalize");
                return 3;
            }
        }

        @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m15073d2 = {"Lcom/swmansion/rnscreens/h0$b$d;", "Lcom/swmansion/rnscreens/h0$b;", "Lcom/swmansion/rnscreens/h0$a;", "capitalize", "", "b", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
        /* renamed from: com.swmansion.rnscreens.h0$b$d */
        /* loaded from: classes8.dex */
        static final class C6302d extends EnumC6299b {

            @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
            /* renamed from: com.swmansion.rnscreens.h0$b$d$a */
            /* loaded from: classes8.dex */
            public /* synthetic */ class C6303a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f12786a;

                static {
                    int[] iArr = new int[EnumC6298a.values().length];
                    try {
                        iArr[EnumC6298a.NONE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnumC6298a.WORDS.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnumC6298a.SENTENCES.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[EnumC6298a.CHARACTERS.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f12786a = iArr;
                }
            }

            C6302d(String str, int i) {
                super(str, i, null);
            }

            @Override // com.swmansion.rnscreens.C6297h0.EnumC6299b
            /* renamed from: b */
            public int mo25940b(EnumC6298a capitalize) {
                C9971q.m14633g(capitalize, "capitalize");
                int i = C6303a.f12786a[capitalize.ordinal()];
                if (i == 1) {
                    return 1;
                }
                if (i == 2) {
                    return 8192;
                }
                if (i == 3) {
                    return Spliterator.SUBSIZED;
                }
                if (i == 4) {
                    return 4096;
                }
                throw new C11088q();
            }
        }

        private EnumC6299b(String str, int i) {
        }

        public /* synthetic */ EnumC6299b(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        /* renamed from: a */
        private static final /* synthetic */ EnumC6299b[] m25941a() {
            return new EnumC6299b[]{f12781k, f12782l, f12783m, f12784n};
        }

        public static EnumC6299b valueOf(String str) {
            return (EnumC6299b) Enum.valueOf(EnumC6299b.class, str);
        }

        public static EnumC6299b[] values() {
            return (EnumC6299b[]) f12785o.clone();
        }

        /* renamed from: b */
        public abstract int mo25940b(EnumC6298a aVar);
    }

    @Metadata(m15074d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m15073d2 = {"Lcom/swmansion/rnscreens/c;", "newSearchView", "", "a", "(Lcom/swmansion/rnscreens/c;)V"}, m15072k = 3, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.h0$c */
    /* loaded from: classes8.dex */
    static final class C6304c extends AbstractC9973s implements Function1<C6285c, Unit> {
        C6304c() {
            super(1);
        }

        /* renamed from: a */
        public final void m25939a(C6285c newSearchView) {
            C6331s screenStackFragment;
            C6285c D;
            C9971q.m14633g(newSearchView, "newSearchView");
            if (C6297h0.this.f12774u == null) {
                C6297h0.this.f12774u = new C6307i0(newSearchView);
            }
            C6297h0.this.m25943t();
            if (C6297h0.this.getAutoFocus() && (screenStackFragment = C6297h0.this.getScreenStackFragment()) != null && (D = screenStackFragment.m25843D()) != null) {
                D.m25971o0();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C6285c cVar) {
            m25939a(cVar);
            return Unit.f22042a;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, m15073d2 = {"com/swmansion/rnscreens/h0$d", "Landroidx/appcompat/widget/SearchView$l;", "", "newText", "", "a", "query", "b", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.h0$d */
    /* loaded from: classes8.dex */
    public static final class C6305d implements SearchView.AbstractC1618l {
        C6305d() {
        }

        @Override // androidx.appcompat.widget.SearchView.AbstractC1618l
        /* renamed from: a */
        public boolean mo25938a(String str) {
            C6297h0.this.m25950m(str);
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.AbstractC1618l
        /* renamed from: b */
        public boolean mo25937b(String str) {
            C6297h0.this.m25949n(str);
            return true;
        }
    }

    public C6297h0(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6331s getScreenStackFragment() {
        C6336u config;
        ViewParent parent = getParent();
        if (!(parent instanceof C6338v) || (config = ((C6338v) parent).getConfig()) == null) {
            return null;
        }
        return config.getScreenFragment();
    }

    /* renamed from: j */
    private final void m25953j() {
        m25947p("onClose", null);
    }

    /* renamed from: k */
    private final void m25952k(boolean z) {
        String str;
        if (z) {
            str = "onFocus";
        } else {
            str = "onBlur";
        }
        m25947p(str, null);
    }

    /* renamed from: l */
    private final void m25951l() {
        m25947p("onOpen", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public final void m25950m(String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("text", str);
        m25947p("onChangeText", createMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final void m25949n(String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("text", str);
        m25947p("onSearchButtonPress", createMap);
    }

    /* renamed from: p */
    private final void m25947p(String str, WritableMap writableMap) {
        Context context = getContext();
        C9971q.m14635e(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        RCTEventEmitter rCTEventEmitter = (RCTEventEmitter) ((ReactContext) context).getJSModule(RCTEventEmitter.class);
        if (rCTEventEmitter != null) {
            rCTEventEmitter.receiveEvent(getId(), str, writableMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m25946q(C6297h0 this$0, View view, boolean z) {
        C9971q.m14633g(this$0, "this$0");
        this$0.m25952k(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final boolean m25945r(C6297h0 this$0) {
        C9971q.m14633g(this$0, "this$0");
        this$0.m25953j();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m25944s(C6297h0 this$0, View view) {
        C9971q.m14633g(this$0, "this$0");
        this$0.m25951l();
    }

    private final void setSearchViewListeners(SearchView searchView) {
        searchView.setOnQueryTextListener(new C6305d());
        searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.swmansion.rnscreens.e0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                C6297h0.m25946q(C6297h0.this, view, z);
            }
        });
        searchView.setOnCloseListener(new SearchView.AbstractC1617k() { // from class: com.swmansion.rnscreens.f0
            @Override // androidx.appcompat.widget.SearchView.AbstractC1617k
            /* renamed from: a */
            public final boolean mo25963a() {
                boolean r;
                r = C6297h0.m25945r(C6297h0.this);
                return r;
            }
        });
        searchView.setOnSearchClickListener(new View.OnClickListener() { // from class: com.swmansion.rnscreens.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6297h0.m25944s(C6297h0.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public final void m25943t() {
        C6285c cVar;
        C6331s screenStackFragment = getScreenStackFragment();
        if (screenStackFragment != null) {
            cVar = screenStackFragment.m25843D();
        } else {
            cVar = null;
        }
        if (cVar != null) {
            if (!this.f12775v) {
                setSearchViewListeners(cVar);
                this.f12775v = true;
            }
            cVar.setInputType(this.f12764k.mo25940b(this.f12765l));
            C6307i0 i0Var = this.f12774u;
            if (i0Var != null) {
                i0Var.m25929h(this.f12766m);
            }
            C6307i0 i0Var2 = this.f12774u;
            if (i0Var2 != null) {
                i0Var2.m25928i(this.f12767n);
            }
            C6307i0 i0Var3 = this.f12774u;
            if (i0Var3 != null) {
                i0Var3.m25932e(this.f12768o);
            }
            C6307i0 i0Var4 = this.f12774u;
            if (i0Var4 != null) {
                i0Var4.m25931f(this.f12769p);
            }
            C6307i0 i0Var5 = this.f12774u;
            if (i0Var5 != null) {
                i0Var5.m25930g(this.f12770q, this.f12773t);
            }
            cVar.setOverrideBackAction(this.f12771r);
        }
    }

    public final EnumC6298a getAutoCapitalize() {
        return this.f12765l;
    }

    public final boolean getAutoFocus() {
        return this.f12772s;
    }

    public final Integer getHeaderIconColor() {
        return this.f12768o;
    }

    public final Integer getHintTextColor() {
        return this.f12769p;
    }

    public final EnumC6299b getInputType() {
        return this.f12764k;
    }

    public final String getPlaceholder() {
        return this.f12770q;
    }

    public final boolean getShouldOverrideBackButton() {
        return this.f12771r;
    }

    public final boolean getShouldShowHintSearchIcon() {
        return this.f12773t;
    }

    public final Integer getTextColor() {
        return this.f12766m;
    }

    public final Integer getTintColor() {
        return this.f12767n;
    }

    /* renamed from: o */
    public final void m25948o() {
        m25943t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C6331s screenStackFragment = getScreenStackFragment();
        if (screenStackFragment != null) {
            screenStackFragment.m25840G(new C6304c());
        }
    }

    public final void setAutoCapitalize(EnumC6298a aVar) {
        C9971q.m14633g(aVar, "<set-?>");
        this.f12765l = aVar;
    }

    public final void setAutoFocus(boolean z) {
        this.f12772s = z;
    }

    public final void setHeaderIconColor(Integer num) {
        this.f12768o = num;
    }

    public final void setHintTextColor(Integer num) {
        this.f12769p = num;
    }

    public final void setInputType(EnumC6299b bVar) {
        C9971q.m14633g(bVar, "<set-?>");
        this.f12764k = bVar;
    }

    public final void setPlaceholder(String str) {
        C9971q.m14633g(str, "<set-?>");
        this.f12770q = str;
    }

    public final void setShouldOverrideBackButton(boolean z) {
        this.f12771r = z;
    }

    public final void setShouldShowHintSearchIcon(boolean z) {
        this.f12773t = z;
    }

    public final void setTextColor(Integer num) {
        this.f12766m = num;
    }

    public final void setTintColor(Integer num) {
        this.f12767n = num;
    }
}

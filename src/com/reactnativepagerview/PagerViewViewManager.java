package com.reactnativepagerview;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.C3313f;
import bf.C3484a;
import bf.C3485b;
import bf.C3487c;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b,\u0010-J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\"\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\tH\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0018\u0010\u0019\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0016H\u0007J\u0018\u0010\u001a\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u000bH\u0007J\u0018\u0010\u001b\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0007J\u0019\u0010\u001c\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u000bH\u0087\u0002J\u0018\u0010\u001d\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0007J\u0018\u0010\u001e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0007J \u0010!\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030 0\u001fH\u0016J$\u0010&\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u00032\b\u0010%\u001a\u0004\u0018\u00010$H\u0016J\u0018\u0010(\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u000bH\u0007R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+¨\u00060"}, m15073d2 = {"Lcom/reactnativepagerview/PagerViewViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/reactnativepagerview/a;", "", "getName", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "createViewInstance", "host", "Landroid/view/View;", "child", "", "index", "", "addView", "parent", "getChildCount", "getChildAt", "view", "removeView", "removeAllViews", "removeViewAt", "", "needsCustomLayoutForChildren", "value", "setScrollEnabled", "setInitialPage", "setOrientation", "set", "setOverScrollMode", "setLayoutDirection", "", "", "getExportedCustomDirectEventTypeConstants", "root", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "receiveCommand", ViewProps.MARGIN, "setPageMargin", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "eventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "<init>", "()V", "Companion", "a", "react-native-pager-view_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class PagerViewViewManager extends ViewGroupManager<C6220a> {
    private static final String COMMAND_SET_PAGE = "setPage";
    private static final String COMMAND_SET_PAGE_WITHOUT_ANIMATION = "setPageWithoutAnimation";
    private static final String COMMAND_SET_SCROLL_ENABLED = "setScrollEnabledImperatively";
    public static final C6218a Companion = new C6218a(null);
    private EventDispatcher eventDispatcher;

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, m15073d2 = {"Lcom/reactnativepagerview/PagerViewViewManager$a;", "", "", "COMMAND_SET_PAGE", "Ljava/lang/String;", "COMMAND_SET_PAGE_WITHOUT_ANIMATION", "COMMAND_SET_SCROLL_ENABLED", "<init>", "()V", "react-native-pager-view_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.reactnativepagerview.PagerViewViewManager$a */
    /* loaded from: classes6.dex */
    public static final class C6218a {
        private C6218a() {
        }

        public /* synthetic */ C6218a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m15074d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\f"}, m15073d2 = {"com/reactnativepagerview/PagerViewViewManager$b", "Landroidx/viewpager2/widget/f$i;", "", ViewProps.POSITION, "", "positionOffset", "positionOffsetPixels", "", "b", "c", "state", "a", "react-native-pager-view_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.reactnativepagerview.PagerViewViewManager$b */
    /* loaded from: classes6.dex */
    public static final class C6219b extends C3313f.AbstractC3321i {

        /* renamed from: b */
        final /* synthetic */ C6220a f12642b;

        C6219b(C6220a aVar) {
            this.f12642b = aVar;
        }

        @Override // androidx.viewpager2.widget.C3313f.AbstractC3321i
        /* renamed from: a */
        public void mo26100a(int i) {
            String str;
            super.mo26100a(i);
            if (i == 0) {
                str = "idle";
            } else if (i == 1) {
                str = "dragging";
            } else if (i == 2) {
                str = "settling";
            } else {
                throw new IllegalStateException("Unsupported pageScrollState");
            }
            EventDispatcher eventDispatcher = PagerViewViewManager.this.eventDispatcher;
            if (eventDispatcher == null) {
                C9971q.m14615y("eventDispatcher");
                eventDispatcher = null;
            }
            eventDispatcher.dispatchEvent(new C3485b(this.f12642b.getId(), str));
        }

        @Override // androidx.viewpager2.widget.C3313f.AbstractC3321i
        /* renamed from: b */
        public void mo26099b(int i, float f, int i2) {
            super.mo26099b(i, f, i2);
            EventDispatcher eventDispatcher = PagerViewViewManager.this.eventDispatcher;
            if (eventDispatcher == null) {
                C9971q.m14615y("eventDispatcher");
                eventDispatcher = null;
            }
            eventDispatcher.dispatchEvent(new C3484a(this.f12642b.getId(), i, f));
        }

        @Override // androidx.viewpager2.widget.C3313f.AbstractC3321i
        /* renamed from: c */
        public void mo26098c(int i) {
            super.mo26098c(i);
            EventDispatcher eventDispatcher = PagerViewViewManager.this.eventDispatcher;
            if (eventDispatcher == null) {
                C9971q.m14615y("eventDispatcher");
                eventDispatcher = null;
            }
            eventDispatcher.dispatchEvent(new C3487c(this.f12642b.getId(), i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createViewInstance$lambda$0(C3313f vp, PagerViewViewManager this$0, C6220a host) {
        C9971q.m14633g(vp, "$vp");
        C9971q.m14633g(this$0, "this$0");
        C9971q.m14633g(host, "$host");
        vp.m34672g(new C6219b(host));
        EventDispatcher eventDispatcher = this$0.eventDispatcher;
        if (eventDispatcher == null) {
            C9971q.m14615y("eventDispatcher");
            eventDispatcher = null;
        }
        eventDispatcher.dispatchEvent(new C3487c(host.getId(), vp.getCurrentItem()));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        Map<String, Map<String, String>> of = MapBuilder.m30829of("topPageScroll", MapBuilder.m30831of("registrationName", "onPageScroll"), "topPageScrollStateChanged", MapBuilder.m30831of("registrationName", "onPageScrollStateChanged"), "topPageSelected", MapBuilder.m30831of("registrationName", "onPageSelected"));
        C9971q.m14634f(of, "of(\n                Page…Name\", \"onPageSelected\"))");
        return of;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCViewPager";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.IViewManagerWithChildren
    public boolean needsCustomLayoutForChildren() {
        return C6226g.f12655a.m26087h();
    }

    @ReactProp(defaultInt = -1, name = "offscreenPageLimit")
    public final void set(C6220a host, int i) {
        C9971q.m14633g(host, "host");
        C6226g.f12655a.m26077r(host, i);
    }

    @ReactProp(defaultInt = 0, name = "initialPage")
    public final void setInitialPage(C6220a host, int i) {
        C9971q.m14633g(host, "host");
        C6226g.f12655a.m26080o(host, i);
    }

    @ReactProp(name = ViewProps.LAYOUT_DIRECTION)
    public final void setLayoutDirection(C6220a host, String value) {
        C9971q.m14633g(host, "host");
        C9971q.m14633g(value, "value");
        C6226g.f12655a.m26078q(host, value);
    }

    @ReactProp(name = "orientation")
    public final void setOrientation(C6220a host, String value) {
        C9971q.m14633g(host, "host");
        C9971q.m14633g(value, "value");
        C6226g.f12655a.m26076s(host, value);
    }

    @ReactProp(name = "overScrollMode")
    public final void setOverScrollMode(C6220a host, String value) {
        C9971q.m14633g(host, "host");
        C9971q.m14633g(value, "value");
        C6226g.f12655a.m26075t(host, value);
    }

    @ReactProp(defaultInt = 0, name = "pageMargin")
    public final void setPageMargin(C6220a host, int i) {
        C9971q.m14633g(host, "host");
        C6226g.f12655a.m26074u(host, i);
    }

    @ReactProp(defaultBoolean = true, name = "scrollEnabled")
    public final void setScrollEnabled(C6220a host, boolean z) {
        C9971q.m14633g(host, "host");
        C6226g.f12655a.m26072w(host, z);
    }

    public void addView(C6220a host, View view, int i) {
        C9971q.m14633g(host, "host");
        C6226g.f12655a.m26091d(host, view, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public C6220a createViewInstance(ThemedReactContext reactContext) {
        C9971q.m14633g(reactContext, "reactContext");
        final C6220a aVar = new C6220a(reactContext);
        aVar.setId(View.generateViewId());
        aVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        aVar.setSaveEnabled(false);
        final C3313f fVar = new C3313f(reactContext);
        fVar.setAdapter(new C6227h());
        fVar.setSaveEnabled(false);
        NativeModule nativeModule = reactContext.getNativeModule(UIManagerModule.class);
        C9971q.m14636d(nativeModule);
        EventDispatcher eventDispatcher = ((UIManagerModule) nativeModule).getEventDispatcher();
        C9971q.m14634f(eventDispatcher, "reactContext.getNativeMo…s.java)!!.eventDispatcher");
        this.eventDispatcher = eventDispatcher;
        fVar.post(new Runnable() { // from class: com.reactnativepagerview.c
            @Override // java.lang.Runnable
            public final void run() {
                PagerViewViewManager.createViewInstance$lambda$0(C3313f.this, this, aVar);
            }
        });
        aVar.addView(fVar);
        return aVar;
    }

    public View getChildAt(C6220a parent, int i) {
        C9971q.m14633g(parent, "parent");
        return C6226g.f12655a.m26090e(parent, i);
    }

    public int getChildCount(C6220a parent) {
        C9971q.m14633g(parent, "parent");
        return C6226g.f12655a.m26089f(parent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
        if (r11.equals(com.reactnativepagerview.PagerViewViewManager.COMMAND_SET_PAGE) != false) goto L_0x0060;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
        if (r11.equals(com.reactnativepagerview.PagerViewViewManager.COMMAND_SET_PAGE_WITHOUT_ANIMATION) != false) goto L_0x0060;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
        kotlin.jvm.internal.C9971q.m14636d(r12);
        r12 = r12.getInt(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
        if (r2 == null) goto L_0x0078;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
        if (r2.intValue() <= 0) goto L_0x0078;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
        if (r12 < 0) goto L_0x0078;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
        if (r12 >= r2.intValue()) goto L_0x0078;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
        if (r4 == false) goto L_?;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
        r0.m26081n(r1, r12, kotlin.jvm.internal.C9971q.m14638b(r11, com.reactnativepagerview.PagerViewViewManager.COMMAND_SET_PAGE));
        r11 = r9.eventDispatcher;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
        if (r11 != null) goto L_0x008c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
        kotlin.jvm.internal.C9971q.m14615y("eventDispatcher");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        r3 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
        r3.dispatchEvent(new bf.C3487c(r10.getId(), r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0099, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void receiveCommand(com.reactnativepagerview.C6220a r10, java.lang.String r11, com.facebook.react.bridge.ReadableArray r12) {
        /*
            r9 = this;
            java.lang.String r0 = "root"
            kotlin.jvm.internal.C9971q.m14633g(r10, r0)
            super.receiveCommand(r10, r11, r12)
            com.reactnativepagerview.g r0 = com.reactnativepagerview.C6226g.f12655a
            androidx.viewpager2.widget.f r1 = r0.m26088g(r10)
            p059d6.C6399a.m25622c(r1)
            p059d6.C6399a.m25622c(r12)
            androidx.recyclerview.widget.RecyclerView$Adapter r2 = r1.getAdapter()
            r3 = 0
            if (r2 == 0) goto L_0x0024
            int r2 = r2.getItemCount()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0025
        L_0x0024:
            r2 = r3
        L_0x0025:
            r4 = 1
            r5 = 0
            if (r11 == 0) goto L_0x009a
            int r6 = r11.hashCode()
            r7 = -445763635(0xffffffffe56e2fcd, float:-7.030031E22)
            java.lang.String r8 = "setPage"
            if (r6 == r7) goto L_0x0058
            r7 = 1747675147(0x682b680b, float:3.2377757E24)
            if (r6 == r7) goto L_0x0045
            r7 = 1984860689(0x764e9211, float:1.0474372E33)
            if (r6 != r7) goto L_0x009a
            boolean r6 = r11.equals(r8)
            if (r6 == 0) goto L_0x009a
            goto L_0x0060
        L_0x0045:
            java.lang.String r10 = "setScrollEnabledImperatively"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x009a
            kotlin.jvm.internal.C9971q.m14636d(r12)
            boolean r10 = r12.getBoolean(r5)
            r1.setUserInputEnabled(r10)
            goto L_0x0099
        L_0x0058:
            java.lang.String r6 = "setPageWithoutAnimation"
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L_0x009a
        L_0x0060:
            kotlin.jvm.internal.C9971q.m14636d(r12)
            int r12 = r12.getInt(r5)
            if (r2 == 0) goto L_0x0078
            int r6 = r2.intValue()
            if (r6 <= 0) goto L_0x0078
            if (r12 < 0) goto L_0x0078
            int r2 = r2.intValue()
            if (r12 >= r2) goto L_0x0078
            goto L_0x0079
        L_0x0078:
            r4 = r5
        L_0x0079:
            if (r4 == 0) goto L_0x0099
            boolean r11 = kotlin.jvm.internal.C9971q.m14638b(r11, r8)
            r0.m26081n(r1, r12, r11)
            com.facebook.react.uimanager.events.EventDispatcher r11 = r9.eventDispatcher
            if (r11 != 0) goto L_0x008c
            java.lang.String r11 = "eventDispatcher"
            kotlin.jvm.internal.C9971q.m14615y(r11)
            goto L_0x008d
        L_0x008c:
            r3 = r11
        L_0x008d:
            bf.c r11 = new bf.c
            int r10 = r10.getId()
            r11.<init>(r10, r12)
            r3.dispatchEvent(r11)
        L_0x0099:
            return
        L_0x009a:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            kotlin.jvm.internal.k0 r12 = kotlin.jvm.internal.C9962k0.f22091a
            r12 = 2
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r5] = r11
            java.lang.Class<com.reactnativepagerview.PagerViewViewManager> r11 = com.reactnativepagerview.PagerViewViewManager.class
            java.lang.String r11 = r11.getSimpleName()
            r0[r4] = r11
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r0, r12)
            java.lang.String r12 = "Unsupported command %d received by %s."
            java.lang.String r11 = java.lang.String.format(r12, r11)
            java.lang.String r12 = "format(format, *args)"
            kotlin.jvm.internal.C9971q.m14634f(r11, r12)
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativepagerview.PagerViewViewManager.receiveCommand(com.reactnativepagerview.a, java.lang.String, com.facebook.react.bridge.ReadableArray):void");
    }

    public void removeAllViews(C6220a parent) {
        C9971q.m14633g(parent, "parent");
        C6226g.f12655a.m26084k(parent);
    }

    public void removeView(C6220a parent, View view) {
        C9971q.m14633g(parent, "parent");
        C9971q.m14633g(view, "view");
        C6226g.f12655a.m26083l(parent, view);
    }

    public void removeViewAt(C6220a parent, int i) {
        C9971q.m14633g(parent, "parent");
        C6226g.f12655a.m26082m(parent, i);
    }
}

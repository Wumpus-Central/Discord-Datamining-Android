package com.discord.safearea;

import androidx.core.graphics.Insets;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.reactevents.ReactEvents;
import com.discord.safearea.events.OnSafeAreaInsetsDidChangeData;
import com.discord.safearea.extensions.ImmersiveMode;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.th3rdwave.safeareacontext.DCDSafeAreaUtils;
import com.th3rdwave.safeareacontext.EdgeInsets;
import com.th3rdwave.safeareacontext.Rect;
import com.th3rdwave.safeareacontext.SafeAreaProvider;
import java.util.Map;
import jg.x;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0014J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\u0014\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\"\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u0002H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/discord/safearea/SafeAreaProviderManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/th3rdwave/safeareacontext/SafeAreaProvider;", "()V", "changeData", "Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;", "dimensions", "Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;", "imeInsets", "Landroidx/core/graphics/Insets;", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "safeAreaEdgeInsets", "Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;", "addEventEmitters", "", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "view", "createViewInstance", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "handleInsetsChanged", "Companion", "SafeAreaProviderDimensions", "safe_area_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SafeAreaProviderManager extends ViewGroupManager<SafeAreaProvider> {
    public static final Companion Companion = new Companion(null);
    private static final OnSafeAreaInsetsDidChangeData DEFAULT_CHANGE_DATA;
    private static final float DEFAULT_IME_INSETS_BOTTOM = 0.0f;
    private static final DCDSafeAreaUtils.SafeAreaEdgeInsets DEFAULT_SAFE_AREA_INSETS;
    private SafeAreaProviderDimensions dimensions;
    private Insets imeInsets;
    private final ReactEvents reactEvents = new ReactEvents(x.a("onSafeAreaInsetsDidChange", f0.b(OnSafeAreaInsetsDidChangeData.class)));
    private OnSafeAreaInsetsDidChangeData changeData = DEFAULT_CHANGE_DATA;
    private DCDSafeAreaUtils.SafeAreaEdgeInsets safeAreaEdgeInsets = DEFAULT_SAFE_AREA_INSETS;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/discord/safearea/SafeAreaProviderManager$Companion;", "", "()V", "DEFAULT_CHANGE_DATA", "Lcom/discord/safearea/events/OnSafeAreaInsetsDidChangeData;", "DEFAULT_IME_INSETS_BOTTOM", "", "DEFAULT_SAFE_AREA_INSETS", "Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;", "safe_area_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\f\u001a\u00020\u0006HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;", "", "safeAreaProvider", "Lcom/th3rdwave/safeareacontext/SafeAreaProvider;", "(Lcom/th3rdwave/safeareacontext/SafeAreaProvider;)V", "height", "", "width", "(II)V", "getHeight", "()I", "getWidth", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "safe_area_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class SafeAreaProviderDimensions {
        private final int height;
        private final int width;

        public SafeAreaProviderDimensions(int i10, int i11) {
            this.height = i10;
            this.width = i11;
        }

        public static /* synthetic */ SafeAreaProviderDimensions copy$default(SafeAreaProviderDimensions safeAreaProviderDimensions, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = safeAreaProviderDimensions.height;
            }
            if ((i12 & 2) != 0) {
                i11 = safeAreaProviderDimensions.width;
            }
            return safeAreaProviderDimensions.copy(i10, i11);
        }

        public final int component1() {
            return this.height;
        }

        public final int component2() {
            return this.width;
        }

        public final SafeAreaProviderDimensions copy(int i10, int i11) {
            return new SafeAreaProviderDimensions(i10, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SafeAreaProviderDimensions)) {
                return false;
            }
            SafeAreaProviderDimensions safeAreaProviderDimensions = (SafeAreaProviderDimensions) obj;
            return this.height == safeAreaProviderDimensions.height && this.width == safeAreaProviderDimensions.width;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return (this.height * 31) + this.width;
        }

        public String toString() {
            int i10 = this.height;
            int i11 = this.width;
            return "SafeAreaProviderDimensions(height=" + i10 + ", width=" + i11 + ")";
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public SafeAreaProviderDimensions(SafeAreaProvider safeAreaProvider) {
            this(safeAreaProvider.getRootView().getHeight(), safeAreaProvider.getRootView().getWidth());
            q.g(safeAreaProvider, "safeAreaProvider");
        }
    }

    static {
        DCDSafeAreaUtils.SafeAreaEdgeInsets safeAreaEdgeInsets = new DCDSafeAreaUtils.SafeAreaEdgeInsets(0.0f, 0.0f, 0.0f, 0.0f);
        DEFAULT_SAFE_AREA_INSETS = safeAreaEdgeInsets;
        DEFAULT_CHANGE_DATA = new OnSafeAreaInsetsDidChangeData(safeAreaEdgeInsets.d(), safeAreaEdgeInsets.a(), safeAreaEdgeInsets.b(), safeAreaEdgeInsets.c(), 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleInsetsChanged(DCDSafeAreaUtils.SafeAreaEdgeInsets safeAreaEdgeInsets, Insets insets, SafeAreaProvider safeAreaProvider) {
        float f10;
        float d10 = safeAreaEdgeInsets.d();
        float a10 = safeAreaEdgeInsets.a();
        float b10 = safeAreaEdgeInsets.b();
        float c10 = safeAreaEdgeInsets.c();
        if (insets != null) {
            f10 = SizeUtilsKt.getPxToDp(insets.f3308d);
        } else {
            f10 = 0.0f;
        }
        OnSafeAreaInsetsDidChangeData onSafeAreaInsetsDidChangeData = new OnSafeAreaInsetsDidChangeData(d10, a10, b10, c10, f10);
        SafeAreaProviderDimensions safeAreaProviderDimensions = new SafeAreaProviderDimensions(safeAreaProvider);
        if (!q.b(this.dimensions, safeAreaProviderDimensions)) {
            this.changeData = DEFAULT_CHANGE_DATA;
            this.dimensions = safeAreaProviderDimensions;
        }
        OnSafeAreaInsetsDidChangeData onSafeAreaInsetsDidChangeData2 = new OnSafeAreaInsetsDidChangeData(Math.max(onSafeAreaInsetsDidChangeData.getTop(), this.changeData.getTop()), Math.max(onSafeAreaInsetsDidChangeData.getBottom(), this.changeData.getBottom()), Math.max(onSafeAreaInsetsDidChangeData.getLeft(), this.changeData.getLeft()), Math.max(onSafeAreaInsetsDidChangeData.getRight(), this.changeData.getRight()), onSafeAreaInsetsDidChangeData.getImeInsetsBottom());
        this.changeData = onSafeAreaInsetsDidChangeData2;
        this.reactEvents.emitEvent(safeAreaProvider, onSafeAreaInsetsDidChangeData2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return this.reactEvents.exportEventConstants();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DCDSafeArea";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void addEventEmitters(ThemedReactContext reactContext, final SafeAreaProvider view) {
        q.g(reactContext, "reactContext");
        q.g(view, "view");
        DCDSafeAreaUtils dCDSafeAreaUtils = DCDSafeAreaUtils.f13427a;
        view.setOnInsetsChangeListener(new SafeAreaProvider.a() { // from class: com.discord.safearea.SafeAreaProviderManager$addEventEmitters$$inlined$setOnInsetsChangeListener$1
            @Override // com.th3rdwave.safeareacontext.SafeAreaProvider.a
            public final void onInsetsChange(SafeAreaProvider safeAreaProvider, EdgeInsets insets, Rect rect) {
                DCDSafeAreaUtils.SafeAreaEdgeInsets d10;
                Insets insets2;
                DCDSafeAreaUtils dCDSafeAreaUtils2 = DCDSafeAreaUtils.f13427a;
                q.f(insets, "insets");
                d10 = dCDSafeAreaUtils2.d(insets);
                SafeAreaProviderManager safeAreaProviderManager = SafeAreaProviderManager.this;
                insets2 = safeAreaProviderManager.imeInsets;
                safeAreaProviderManager.handleInsetsChanged(d10, insets2, view);
            }
        });
        ImmersiveMode.INSTANCE.addRootViewInsetUpdateCallback(new SafeAreaProviderManager$addEventEmitters$2(this, view));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public SafeAreaProvider createViewInstance(ThemedReactContext reactContext) {
        q.g(reactContext, "reactContext");
        return new SafeAreaProvider(reactContext);
    }
}

package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001#B\u0011\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J0\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0014R\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006$"}, m15073d2 = {"Lcom/swmansion/rnscreens/v;", "Lcom/facebook/react/views/view/ReactViewGroup;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "", "changed", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, ViewProps.ON_LAYOUT, "k", "I", "mReactWidth", "l", "mReactHeight", "Lcom/swmansion/rnscreens/v$a;", "m", "Lcom/swmansion/rnscreens/v$a;", "getType", "()Lcom/swmansion/rnscreens/v$a;", "setType", "(Lcom/swmansion/rnscreens/v$a;)V", "type", "Lcom/swmansion/rnscreens/u;", "getConfig", "()Lcom/swmansion/rnscreens/u;", "config", "Lcom/facebook/react/bridge/ReactContext;", "context", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "a", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
@SuppressLint({"ViewConstructor"})
/* renamed from: com.swmansion.rnscreens.v */
/* loaded from: classes8.dex */
public final class C6338v extends ReactViewGroup {

    /* renamed from: k */
    private int f12908k;

    /* renamed from: l */
    private int f12909l;

    /* renamed from: m */
    private EnumC6339a f12910m = EnumC6339a.RIGHT;

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m15073d2 = {"Lcom/swmansion/rnscreens/v$a;", "", "<init>", "(Ljava/lang/String;I)V", "k", "l", "m", "n", "o", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.v$a */
    /* loaded from: classes8.dex */
    public enum EnumC6339a {
        LEFT,
        CENTER,
        RIGHT,
        BACK,
        SEARCH_BAR
    }

    public C6338v(ReactContext reactContext) {
        super(reactContext);
    }

    public final C6336u getConfig() {
        ViewParent parent = getParent();
        C6288d dVar = parent instanceof C6288d ? (C6288d) parent : null;
        if (dVar != null) {
            return dVar.getConfig();
        }
        return null;
    }

    public final EnumC6339a getType() {
        return this.f12910m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    protected void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) {
            this.f12908k = View.MeasureSpec.getSize(i);
            this.f12909l = View.MeasureSpec.getSize(i2);
            ViewParent parent = getParent();
            if (parent != null) {
                forceLayout();
                ((View) parent).requestLayout();
            }
        }
        setMeasuredDimension(this.f12908k, this.f12909l);
    }

    public final void setType(EnumC6339a aVar) {
        C9971q.m14633g(aVar, "<set-?>");
        this.f12910m = aVar;
    }
}

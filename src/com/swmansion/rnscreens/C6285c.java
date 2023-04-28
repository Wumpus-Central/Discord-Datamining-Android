package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import androidx.activity.AbstractC1486b;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import com.facebook.react.uimanager.ViewDefaults;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0014J\b\u0010\n\u001a\u00020\u0002H\u0014R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006&"}, m15073d2 = {"Lcom/swmansion/rnscreens/c;", "Landroidx/appcompat/widget/SearchView;", "", "o0", "Landroidx/appcompat/widget/SearchView$k;", "listener", "setOnCloseListener", "Landroid/view/View$OnClickListener;", "setOnSearchClickListener", "onAttachedToWindow", "onDetachedFromWindow", "A0", "Landroidx/appcompat/widget/SearchView$k;", "mCustomOnCloseListener", "B0", "Landroid/view/View$OnClickListener;", "mCustomOnSearchClickedListener", "Landroidx/activity/b;", "C0", "Landroidx/activity/b;", "mOnBackPressedCallback", "Lcom/swmansion/rnscreens/f;", "D0", "Lcom/swmansion/rnscreens/f;", "backPressOverrider", "", "value", "getOverrideBackAction", "()Z", "setOverrideBackAction", "(Z)V", "overrideBackAction", "Landroid/content/Context;", "context", "Landroidx/fragment/app/Fragment;", "fragment", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/Fragment;)V", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: com.swmansion.rnscreens.c */
/* loaded from: classes8.dex */
public final class C6285c extends SearchView {

    /* renamed from: A0 */
    private SearchView.AbstractC1617k f37674A0;

    /* renamed from: B0 */
    private View.OnClickListener f37675B0;

    /* renamed from: C0 */
    private AbstractC1486b f37676C0;

    /* renamed from: D0 */
    private final C6292f f37677D0;

    @Metadata(m15074d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m15073d2 = {"com/swmansion/rnscreens/c$a", "Landroidx/activity/b;", "", "b", "react-native-screens_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.c$a */
    /* loaded from: classes8.dex */
    public static final class C6286a extends AbstractC1486b {
        C6286a() {
            super(true);
        }

        @Override // androidx.activity.AbstractC1486b
        /* renamed from: b */
        public void mo25970b() {
            C6285c.this.setIconified(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6285c(Context context, Fragment fragment) {
        super(context);
        C9971q.m14633g(context, "context");
        C9971q.m14633g(fragment, "fragment");
        C6286a aVar = new C6286a();
        this.f37676C0 = aVar;
        this.f37677D0 = new C6292f(fragment, aVar);
        super.setOnSearchClickListener(new View.OnClickListener() { // from class: com.swmansion.rnscreens.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6285c.m25973m0(C6285c.this, view);
            }
        });
        super.setOnCloseListener(new SearchView.AbstractC1617k() { // from class: com.swmansion.rnscreens.b
            @Override // androidx.appcompat.widget.SearchView.AbstractC1617k
            /* renamed from: a */
            public final boolean mo25963a() {
                boolean n0;
                n0 = C6285c.m25972n0(C6285c.this);
                return n0;
            }
        });
        setMaxWidth(ViewDefaults.NUMBER_OF_LINES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public static final void m25973m0(C6285c this$0, View view) {
        C9971q.m14633g(this$0, "this$0");
        View.OnClickListener onClickListener = this$0.f37675B0;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        this$0.f37677D0.m25966b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public static final boolean m25972n0(C6285c this$0) {
        boolean z;
        C9971q.m14633g(this$0, "this$0");
        SearchView.AbstractC1617k kVar = this$0.f37674A0;
        if (kVar != null) {
            z = kVar.mo25963a();
        } else {
            z = false;
        }
        this$0.f37677D0.m25965c();
        return z;
    }

    public final boolean getOverrideBackAction() {
        return this.f37677D0.m25967a();
    }

    /* renamed from: o0 */
    public final void m25971o0() {
        setIconified(false);
        requestFocusFromTouch();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!m40426J()) {
            this.f37677D0.m25966b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.SearchView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f37677D0.m25965c();
    }

    @Override // androidx.appcompat.widget.SearchView
    public void setOnCloseListener(SearchView.AbstractC1617k kVar) {
        this.f37674A0 = kVar;
    }

    @Override // androidx.appcompat.widget.SearchView
    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f37675B0 = onClickListener;
    }

    public final void setOverrideBackAction(boolean z) {
        this.f37677D0.m25964d(z);
    }
}

package com.reactnativepagerview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, m15073d2 = {"Lcom/reactnativepagerview/i;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/FrameLayout;", "a", "()Landroid/widget/FrameLayout;", "container", "<init>", "(Landroid/widget/FrameLayout;)V", "react-native-pager-view_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* renamed from: com.reactnativepagerview.i */
/* loaded from: classes6.dex */
public final class C6228i extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public static final C6229a f12657a = new C6229a(null);

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, m15073d2 = {"Lcom/reactnativepagerview/i$a;", "", "Landroid/view/ViewGroup;", "parent", "Lcom/reactnativepagerview/i;", "a", "<init>", "()V", "react-native-pager-view_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.reactnativepagerview.i$a */
    /* loaded from: classes6.dex */
    public static final class C6229a {
        private C6229a() {
        }

        public /* synthetic */ C6229a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C6228i m26063a(ViewGroup parent) {
            C9971q.m14633g(parent, "parent");
            FrameLayout frameLayout = new FrameLayout(parent.getContext());
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.setSaveEnabled(false);
            return new C6228i(frameLayout, null);
        }
    }

    private C6228i(FrameLayout frameLayout) {
        super(frameLayout);
    }

    public /* synthetic */ C6228i(FrameLayout frameLayout, DefaultConstructorMarker defaultConstructorMarker) {
        this(frameLayout);
    }

    /* renamed from: a */
    public final FrameLayout m26064a() {
        View view = this.itemView;
        C9971q.m14635e(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        return (FrameLayout) view;
    }
}

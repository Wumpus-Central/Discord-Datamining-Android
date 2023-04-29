package com.discord.recycler_view.scroller;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.recycler_view.utils.LayoutManagerUtilsKt;
import com.discord.recycler_view.utils.RecyclerViewExtensionsKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002JN\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00162\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00162\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u0016JB\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u0016H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/discord/recycler_view/scroller/Scroller;", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "(Landroidx/recyclerview/widget/RecyclerView;)V", "currentSearch", "Ljava/lang/Runnable;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "cancel", "", "doScrollToPosition", ViewProps.POSITION, "", "targetAlignment", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment;", "scrollToPosition", "animate", "", "onStart", "Lkotlin/Function0;", "onComplete", "onScrollProgress", "search", "TargetAlignment", "recycler_view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Scroller {
    private Runnable currentSearch;
    private final RecyclerView recyclerView;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment;", "", "()V", "Anywhere", "Center", "Top", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment$Anywhere;", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment$Center;", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment$Top;", "recycler_view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static abstract class TargetAlignment {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment$Anywhere;", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment;", "()V", "recycler_view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Anywhere extends TargetAlignment {
            public static final Anywhere INSTANCE = new Anywhere();

            private Anywhere() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment$Center;", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment;", "()V", "recycler_view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Center extends TargetAlignment {
            public static final Center INSTANCE = new Center();

            private Center() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment$Top;", "Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment;", "offsetPx", "", "(I)V", "getOffsetPx", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "recycler_view_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Top extends TargetAlignment {
            private final int offsetPx;

            public Top(int i10) {
                super(null);
                this.offsetPx = i10;
            }

            public static /* synthetic */ Top copy$default(Top top, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = top.offsetPx;
                }
                return top.copy(i10);
            }

            public final int component1() {
                return this.offsetPx;
            }

            public final Top copy(int i10) {
                return new Top(i10);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Top) && this.offsetPx == ((Top) obj).offsetPx;
            }

            public final int getOffsetPx() {
                return this.offsetPx;
            }

            public int hashCode() {
                return this.offsetPx;
            }

            public String toString() {
                int i10 = this.offsetPx;
                return "Top(offsetPx=" + i10 + ")";
            }
        }

        private TargetAlignment() {
        }

        public /* synthetic */ TargetAlignment(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Scroller(RecyclerView recyclerView) {
        q.g(recyclerView, "recyclerView");
        this.recyclerView = recyclerView;
        recyclerView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.discord.recycler_view.scroller.Scroller.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                Scroller.this.cancel();
            }
        });
    }

    private final void doScrollToPosition(int i10, TargetAlignment targetAlignment) {
        if (targetAlignment instanceof TargetAlignment.Anywhere) {
            this.recyclerView.scrollToPosition(i10);
        } else if (targetAlignment instanceof TargetAlignment.Center) {
            RecyclerViewExtensionsKt.scrollToCenter(this.recyclerView, i10);
        } else if (targetAlignment instanceof TargetAlignment.Top) {
            RecyclerViewExtensionsKt.scrollToTop(this.recyclerView, i10, ((TargetAlignment.Top) targetAlignment).getOffsetPx());
        }
    }

    private final LinearLayoutManager getLayoutManager() {
        RecyclerView.LayoutManager layoutManager = this.recyclerView.getLayoutManager();
        q.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        return (LinearLayoutManager) layoutManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void scrollToPosition$default(Scroller scroller, int i10, TargetAlignment targetAlignment, boolean z10, Function0 function0, Function0 function02, Function0 function03, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            function0 = Scroller$scrollToPosition$1.INSTANCE;
        }
        if ((i11 & 16) != 0) {
            function02 = Scroller$scrollToPosition$2.INSTANCE;
        }
        if ((i11 & 32) != 0) {
            function03 = Scroller$scrollToPosition$3.INSTANCE;
        }
        scroller.scrollToPosition(i10, targetAlignment, z10, function0, function02, function03);
    }

    private final void search(final int i10, final TargetAlignment targetAlignment, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03) {
        Boolean isPositionVisible = LayoutManagerUtilsKt.isPositionVisible(getLayoutManager(), i10);
        if (isPositionVisible != null && !isPositionVisible.booleanValue()) {
            doScrollToPosition(i10, targetAlignment);
            function03.invoke();
            Runnable aVar = new Runnable() { // from class: com.discord.recycler_view.scroller.a
                @Override // java.lang.Runnable
                public final void run() {
                    Scroller.search$lambda$0(Scroller.this, i10, targetAlignment, function0, function02, function03);
                }
            };
            this.currentSearch = aVar;
            this.recyclerView.post(aVar);
        } else if (targetAlignment instanceof TargetAlignment.Top) {
            doScrollToPosition(i10, targetAlignment);
            function03.invoke();
            function02.invoke();
        } else {
            function02.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void search$lambda$0(Scroller this$0, int i10, TargetAlignment targetAlignment, Function0 onStart, Function0 onComplete, Function0 onScrollProgress) {
        q.g(this$0, "this$0");
        q.g(targetAlignment, "$targetAlignment");
        q.g(onStart, "$onStart");
        q.g(onComplete, "$onComplete");
        q.g(onScrollProgress, "$onScrollProgress");
        this$0.search(i10, targetAlignment, onStart, onComplete, onScrollProgress);
    }

    public final void cancel() {
        Runnable runnable = this.currentSearch;
        if (runnable != null) {
            this.recyclerView.removeCallbacks(runnable);
            this.currentSearch = null;
        }
    }

    public final void scrollToPosition(int i10, TargetAlignment targetAlignment, boolean z10, Function0<Unit> onStart, Function0<Unit> onComplete, Function0<Unit> onScrollProgress) {
        q.g(targetAlignment, "targetAlignment");
        q.g(onStart, "onStart");
        q.g(onComplete, "onComplete");
        q.g(onScrollProgress, "onScrollProgress");
        cancel();
        onStart.invoke();
        if (z10) {
            RecyclerViewExtensionsKt.scrollToPositionAnimated(this.recyclerView, i10, targetAlignment, new Scroller$scrollToPosition$4(onScrollProgress, onComplete));
        } else {
            search(i10, targetAlignment, onStart, onComplete, onScrollProgress);
        }
    }
}

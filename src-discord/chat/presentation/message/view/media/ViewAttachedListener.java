package com.discord.chat.presentation.message.view.media;

import android.view.View;
import android.view.ViewTreeObserver;
import com.discord.chat.R;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;
import nf.n;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\b\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/discord/chat/presentation/message/view/media/ViewAttachedListener;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "", "onViewAttachedToWindow", "onViewDetachedFromWindow", "Landroid/view/View;", "Lkotlin/Function1;", "", "viewAttached", "Lkotlin/jvm/functions/Function1;", "viewScrolling", "", "isAttachedDelay", "J", "Ljava/lang/Runnable;", "isAttachedRunnable", "Ljava/lang/Runnable;", "Lcom/discord/chat/presentation/message/view/media/ViewScrollStateListener;", "scrollStateListener$delegate", "Lkotlin/Lazy;", "getScrollStateListener", "()Lcom/discord/chat/presentation/message/view/media/ViewScrollStateListener;", "scrollStateListener", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class ViewAttachedListener implements View.OnAttachStateChangeListener {
    private final long isAttachedDelay;
    private Runnable isAttachedRunnable;
    private final Lazy scrollStateListener$delegate;
    private final View view;
    private final Function1<Boolean, Unit> viewAttached;
    private final Function1<Boolean, Unit> viewScrolling;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.discord.chat.presentation.message.view.media.ViewAttachedListener$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    static final class AnonymousClass1 extends s implements Function1<Boolean, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f22036a;
        }

        public final void invoke(boolean z10) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewAttachedListener(View view, Function1<? super Boolean, Unit> viewAttached, Function1<? super Boolean, Unit> viewScrolling) {
        Lazy a10;
        q.g(view, "view");
        q.g(viewAttached, "viewAttached");
        q.g(viewScrolling, "viewScrolling");
        this.view = view;
        this.viewAttached = viewAttached;
        this.viewScrolling = viewScrolling;
        this.isAttachedDelay = view.getResources().getInteger(R.integer.material_motion_duration_short_1);
        this.isAttachedRunnable = new Runnable() { // from class: com.discord.chat.presentation.message.view.media.a
            @Override // java.lang.Runnable
            public final void run() {
                ViewAttachedListener.isAttachedRunnable$lambda$0(ViewAttachedListener.this);
            }
        };
        a10 = n.a(new ViewAttachedListener$scrollStateListener$2(this));
        this.scrollStateListener$delegate = a10;
    }

    private final ViewScrollStateListener getScrollStateListener() {
        return (ViewScrollStateListener) this.scrollStateListener$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void isAttachedRunnable$lambda$0(ViewAttachedListener this$0) {
        q.g(this$0, "this$0");
        this$0.viewAttached.invoke(Boolean.TRUE);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        q.g(view, "view");
        view.postDelayed(this.isAttachedRunnable, this.isAttachedDelay);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnScrollChangedListener(getScrollStateListener());
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        q.g(view, "view");
        view.removeCallbacks(this.isAttachedRunnable);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            ViewScrollStateListener scrollStateListener = getScrollStateListener();
            scrollStateListener.reset();
            viewTreeObserver.removeOnScrollChangedListener(scrollStateListener);
        }
        this.viewAttached.invoke(Boolean.FALSE);
    }

    public /* synthetic */ ViewAttachedListener(View view, Function1 function1, Function1 function12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, function1, (i10 & 4) != 0 ? AnonymousClass1.INSTANCE : function12);
    }
}

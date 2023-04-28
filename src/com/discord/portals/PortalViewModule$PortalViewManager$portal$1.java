package com.discord.portals;

import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9636e;
import kotlin.coroutines.jvm.internal.AbstractC9643k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C9840j;
import kotlinx.coroutines.C9926t0;
import kotlinx.coroutines.C9946y0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import nf.C10848t;
import tf.C12962d;

@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9636e(m14702c = "com.discord.portals.PortalViewModule$PortalViewManager$portal$1", m14701f = "PortalViewModule.kt", m14700l = {37}, m14699m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PortalViewModule$PortalViewManager$portal$1 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ double $portal;
    final /* synthetic */ FrameLayout $portalView;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
    @AbstractC9636e(m14702c = "com.discord.portals.PortalViewModule$PortalViewManager$portal$1$1", m14701f = "PortalViewModule.kt", m14700l = {38}, m14699m = "invokeSuspend")
    /* renamed from: com.discord.portals.PortalViewModule$PortalViewManager$portal$1$1 */
    /* loaded from: classes3.dex */
    public static final class C35801 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C35801(Continuation<? super C35801> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C35801(continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C35801) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = C12962d.m4646d();
            int i = this.label;
            if (i == 0) {
                C10848t.m10930b(obj);
                this.label = 1;
                if (C9926t0.m13992a(50L, this) == d) {
                    return d;
                }
            } else if (i == 1) {
                C10848t.m10930b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.f25780a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortalViewModule$PortalViewManager$portal$1(double d, FrameLayout frameLayout, Continuation<? super PortalViewModule$PortalViewManager$portal$1> continuation) {
        super(2, continuation);
        this.$portal = d;
        this.$portalView = frameLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PortalViewModule$PortalViewManager$portal$1(this.$portal, this.$portalView, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PortalViewModule$PortalViewManager$portal$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Object invokeSuspend(Object obj) {
        Object d;
        d = C12962d.m4646d();
        int i = this.label;
        if (i == 0) {
            C10848t.m10930b(obj);
            CoroutineDispatcher a = C9946y0.m13947a();
            C35801 r1 = new C35801(null);
            this.label = 1;
            if (C9840j.m14192g(a, r1, this) == d) {
                return d;
            }
        } else if (i == 1) {
            C10848t.m10930b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        PortalViewContextManager.INSTANCE.registerView(this.$portal, this.$portalView);
        return Unit.f25780a;
    }
}

package com.discord.portals;

import android.widget.FrameLayout;
import jf.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.a1;
import kotlinx.coroutines.j;
import kotlinx.coroutines.v0;
import pf.d;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.portals.PortalViewModule$PortalViewManager$setPortal$1", f = "PortalViewModule.kt", l = {46}, m = "invokeSuspend")

final class PortalViewModule$PortalViewManager$setPortal$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final  double $portal;
    final  FrameLayout $portalView;
    int label;

    
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.discord.portals.PortalViewModule$PortalViewManager$setPortal$1$1", f = "PortalViewModule.kt", l = {47}, m = "invokeSuspend")
    
    
    public static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override 
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f21036a);
        }

        @Override 
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = d.d();
            int i10 = this.label;
            if (i10 == 0) {
                t.b(obj);
                this.label = 1;
                if (v0.a(50L, this) == d10) {
                    return d10;
                }
            } else if (i10 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.f21036a;
        }
    }

    
    
    public PortalViewModule$PortalViewManager$setPortal$1(double d10, FrameLayout frameLayout, Continuation<? super PortalViewModule$PortalViewManager$setPortal$1> continuation) {
        super(2, continuation);
        this.$portal = d10;
        this.$portalView = frameLayout;
    }

    @Override 
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PortalViewModule$PortalViewManager$setPortal$1(this.$portal, this.$portalView, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PortalViewModule$PortalViewManager$setPortal$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f21036a);
    }

    @Override 
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = d.d();
        int i10 = this.label;
        if (i10 == 0) {
            t.b(obj);
            CoroutineDispatcher a10 = a1.a();
            AnonymousClass1 r12 = new AnonymousClass1(null);
            this.label = 1;
            if (j.g(a10, r12, this) == d10) {
                return d10;
            }
        } else if (i10 == 1) {
            t.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        PortalViewContextManager.INSTANCE.registerView(this.$portal, this.$portalView);
        return Unit.f21036a;
    }
}

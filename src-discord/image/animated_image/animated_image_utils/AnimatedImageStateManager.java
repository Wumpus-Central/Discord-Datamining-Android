package com.discord.image.animated_image.animated_image_utils;

import com.discord.misc.utilities.queue.WorkerQueue;
import com.discord.misc.utilities.threading.ThreadUtilsKt;
import com.facebook.react.modules.appstate.AppStateModule;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u001f*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001fB_\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0015\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0015\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0003H\u0007J\u001a\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007J\b\u0010\u000f\u001a\u00020\u0003H\u0007J\b\u0010\u0010\u001a\u00020\u0006H\u0007R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001c¨\u0006 "}, d2 = {"Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;", "T", "", "", AppStateModule.APP_STATE_ACTIVE, "updateWorker", "", "reload", "config", "onTryFetch", "(Ljava/lang/Object;)V", "reset", "animatedImageLoaded", "animate", "onFetchFinished", "onDetachedFromWindow", "onAttachedToWindow", "Lkotlin/Function0;", "handlePlay", "Lkotlin/jvm/functions/Function0;", "handlePause", "Lkotlin/Function1;", "handleSetPlaceholder", "Lkotlin/jvm/functions/Function1;", "handleConfigIsValid", "handleFetchAnimatedImage", "animatedImageConfig", "Ljava/lang/Object;", "Z", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "animated_image_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class AnimatedImageStateManager<T> {
    public static final Companion Companion = new Companion(null);
    private static final WorkerQueue<AnimatedImageStateManager<?>> workerQueue = new WorkerQueue<>(false, 1, null);
    private T animatedImageConfig;
    private boolean animatedImageLoaded;
    private final Function1<T, Boolean> handleConfigIsValid;
    private final Function1<T, Unit> handleFetchAnimatedImage;
    private final Function0<Unit> handlePause;
    private final Function0<Unit> handlePlay;
    private final Function1<T, Unit> handleSetPlaceholder;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager$Companion;", "", "()V", "workerQueue", "Lcom/discord/misc/utilities/queue/WorkerQueue;", "Lcom/discord/image/animated_image/animated_image_utils/AnimatedImageStateManager;", "animated_image_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnimatedImageStateManager(Function0<Unit> handlePlay, Function0<Unit> handlePause, Function1<? super T, Unit> handleSetPlaceholder, Function1<? super T, Boolean> handleConfigIsValid, Function1<? super T, Unit> handleFetchAnimatedImage) {
        q.g(handlePlay, "handlePlay");
        q.g(handlePause, "handlePause");
        q.g(handleSetPlaceholder, "handleSetPlaceholder");
        q.g(handleConfigIsValid, "handleConfigIsValid");
        q.g(handleFetchAnimatedImage, "handleFetchAnimatedImage");
        this.handlePlay = handlePlay;
        this.handlePause = handlePause;
        this.handleSetPlaceholder = handleSetPlaceholder;
        this.handleConfigIsValid = handleConfigIsValid;
        this.handleFetchAnimatedImage = handleFetchAnimatedImage;
    }

    public static /* synthetic */ boolean onFetchFinished$default(AnimatedImageStateManager animatedImageStateManager, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        return animatedImageStateManager.onFetchFinished(z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reload() {
        T t10 = this.animatedImageConfig;
        if (t10 == null) {
            updateWorker(false);
        } else {
            onTryFetch(t10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean updateWorker(boolean z10) {
        return workerQueue.updateWorker(this, z10, AnimatedImageStateManager$updateWorker$1.INSTANCE);
    }

    public final void onAttachedToWindow() {
        if (ThreadUtilsKt.isOnMainThread()) {
            this.handlePlay.invoke();
            reload();
            return;
        }
        Thread currentThread = Thread.currentThread();
        throw new IllegalStateException(("Expected to be on android main thread. Current: " + currentThread).toString());
    }

    public final boolean onDetachedFromWindow() {
        if (ThreadUtilsKt.isOnMainThread()) {
            this.handlePause.invoke();
            return updateWorker(false);
        }
        Thread currentThread = Thread.currentThread();
        throw new IllegalStateException(("Expected to be on android main thread. Current: " + currentThread).toString());
    }

    public final boolean onFetchFinished(boolean z10, boolean z11) {
        if (ThreadUtilsKt.isOnMainThread()) {
            this.animatedImageLoaded = z10;
            if (z11) {
                this.handlePlay.invoke();
            }
            return updateWorker(false);
        }
        Thread currentThread = Thread.currentThread();
        throw new IllegalStateException(("Expected to be on android main thread. Current: " + currentThread).toString());
    }

    public final void onTryFetch(T t10) {
        if (!ThreadUtilsKt.isOnMainThread()) {
            Thread currentThread = Thread.currentThread();
            throw new IllegalStateException(("Expected to be on android main thread. Current: " + currentThread).toString());
        } else if (!q.b(this.animatedImageConfig, t10) || !this.animatedImageLoaded) {
            this.animatedImageConfig = t10;
            this.animatedImageLoaded = false;
            this.handleSetPlaceholder.invoke(t10);
            if (!((Boolean) this.handleConfigIsValid.invoke(t10)).booleanValue()) {
                updateWorker(false);
            } else if (updateWorker(true)) {
                this.handleFetchAnimatedImage.invoke(t10);
            }
        } else {
            updateWorker(false);
        }
    }

    public final boolean reset() {
        if (ThreadUtilsKt.isOnMainThread()) {
            this.animatedImageConfig = null;
            this.animatedImageLoaded = false;
            return updateWorker(false);
        }
        Thread currentThread = Thread.currentThread();
        throw new IllegalStateException(("Expected to be on android main thread. Current: " + currentThread).toString());
    }
}

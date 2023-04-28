package com.discord.sticker.sticker_types;

import android.content.Context;
import com.discord.file_downloader.DownloadState;
import com.discord.file_downloader.FileDownloader;
import com.discord.image.animated_image.animated_image_utils.AnimatedImageStateManager;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.rlottie.RLottieDrawable;
import com.discord.sticker.sticker_types.RLottieImageView;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9931e;
import kotlin.coroutines.jvm.internal.AbstractC9938k;
import kotlin.coroutines.jvm.internal.C9928b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9971q;
import kotlinx.coroutines.AbstractC10034f2;
import kotlinx.coroutines.C10129j;
import kotlinx.coroutines.C10230y0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import nf.C11093t;
import tf.C13080d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9931e(m14702c = "com.discord.sticker.sticker_types.RLottieImageView$fetchSticker$1", m14701f = "RLottieImageView.kt", m14700l = {73, 82}, m14699m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class RLottieImageView$fetchSticker$1 extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RLottieImageView.Config $config;
    int label;
    final /* synthetic */ RLottieImageView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
    @AbstractC9931e(m14702c = "com.discord.sticker.sticker_types.RLottieImageView$fetchSticker$1$1", m14701f = "RLottieImageView.kt", m14700l = {}, m14699m = "invokeSuspend")
    /* renamed from: com.discord.sticker.sticker_types.RLottieImageView$fetchSticker$1$1 */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass1 extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ RLottieImageView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RLottieImageView rLottieImageView, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = rLottieImageView;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
        public final Object invokeSuspend(Object obj) {
            C13080d.m4646d();
            if (this.label == 0) {
                C11093t.m10930b(obj);
                this.this$0.clearAnimation();
                return Unit.f22042a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RLottieImageView$fetchSticker$1(RLottieImageView rLottieImageView, RLottieImageView.Config config, Continuation<? super RLottieImageView$fetchSticker$1> continuation) {
        super(2, continuation);
        this.this$0 = rLottieImageView;
        this.$config = config;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RLottieImageView$fetchSticker$1(this.this$0, this.$config, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RLottieImageView$fetchSticker$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
    public final Object invokeSuspend(Object obj) {
        Object d;
        d = C13080d.m4646d();
        int i = this.label;
        if (i == 0) {
            C11093t.m10930b(obj);
            AbstractC10034f2 c = C10230y0.m13945c();
            AnonymousClass1 r1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (C10129j.m14192g(c, r1, this) == d) {
                return d;
            }
        } else if (i == 1) {
            C11093t.m10930b(obj);
        } else if (i == 2) {
            C11093t.m10930b(obj);
            return Unit.f22042a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        FileDownloader fileDownloader = FileDownloader.INSTANCE;
        Context context = this.this$0.getContext();
        C9971q.m14634f(context, "context");
        String url = this.$config.getUrl();
        String asset = this.$config.getAsset();
        Flow downloadFile$default = FileDownloader.downloadFile$default(fileDownloader, context, url, asset + ".json", new File(this.this$0.getContext().getCacheDir(), "stickers"), false, 16, null);
        final RLottieImageView rLottieImageView = this.this$0;
        final RLottieImageView.Config config = this.$config;
        FlowCollector flowCollector = new FlowCollector() { // from class: com.discord.sticker.sticker_types.RLottieImageView$fetchSticker$1.2

            /* JADX INFO: Access modifiers changed from: package-private */
            @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
            @AbstractC9931e(m14702c = "com.discord.sticker.sticker_types.RLottieImageView$fetchSticker$1$2$1", m14701f = "RLottieImageView.kt", m14700l = {}, m14699m = "invokeSuspend")
            /* renamed from: com.discord.sticker.sticker_types.RLottieImageView$fetchSticker$1$2$1 */
            /* loaded from: classes7.dex */
            public static final class AnonymousClass1 extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
                final /* synthetic */ RLottieImageView.Config $config;
                final /* synthetic */ DownloadState $downloadState;
                int label;
                final /* synthetic */ RLottieImageView this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(RLottieImageView rLottieImageView, DownloadState downloadState, RLottieImageView.Config config, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = rLottieImageView;
                    this.$downloadState = downloadState;
                    this.$config = config;
                }

                @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$downloadState, this.$config, continuation);
                }

                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
                }

                @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
                public final Object invokeSuspend(Object obj) {
                    RLottieDrawable.PlaybackMode playbackMode;
                    AnimatedImageStateManager animatedImageStateManager;
                    C13080d.m4646d();
                    if (this.label == 0) {
                        C11093t.m10930b(obj);
                        this.this$0.setImageDrawable(null);
                        RLottieImageView rLottieImageView = this.this$0;
                        Context context = rLottieImageView.getContext();
                        C9971q.m14634f(context, "context");
                        File file = ((DownloadState.Completed) this.$downloadState).getFile();
                        int dpToPx = SizeUtilsKt.getDpToPx(this.$config.getWidthDp());
                        int dpToPx2 = SizeUtilsKt.getDpToPx(this.$config.getHeightDp());
                        if (this.$config.getRenderMode() == 0) {
                            playbackMode = RLottieDrawable.PlaybackMode.LOOP;
                        } else {
                            playbackMode = RLottieDrawable.PlaybackMode.FREEZE;
                        }
                        rLottieImageView.setAnimation(context, file, dpToPx, dpToPx2, playbackMode);
                        this.this$0.setBackground(null);
                        animatedImageStateManager = this.this$0.rLottieStateManager;
                        return C9928b.m14706a(animatedImageStateManager.onFetchFinished(true, this.$config.getAnimate()));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
            @AbstractC9931e(m14702c = "com.discord.sticker.sticker_types.RLottieImageView$fetchSticker$1$2$2", m14701f = "RLottieImageView.kt", m14700l = {}, m14699m = "invokeSuspend")
            /* renamed from: com.discord.sticker.sticker_types.RLottieImageView$fetchSticker$1$2$2 */
            /* loaded from: classes7.dex */
            public static final class C01092 extends AbstractC9938k implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
                int label;
                final /* synthetic */ RLottieImageView this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01092(RLottieImageView rLottieImageView, Continuation<? super C01092> continuation) {
                    super(2, continuation);
                    this.this$0 = rLottieImageView;
                }

                @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C01092(this.this$0, continuation);
                }

                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                    return ((C01092) create(coroutineScope, continuation)).invokeSuspend(Unit.f22042a);
                }

                @Override // kotlin.coroutines.jvm.internal.AbstractC9927a
                public final Object invokeSuspend(Object obj) {
                    AnimatedImageStateManager animatedImageStateManager;
                    C13080d.m4646d();
                    if (this.label == 0) {
                        C11093t.m10930b(obj);
                        animatedImageStateManager = this.this$0.rLottieStateManager;
                        return C9928b.m14706a(AnimatedImageStateManager.onFetchFinished$default(animatedImageStateManager, false, false, 2, null));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit((DownloadState) obj2, (Continuation<? super Unit>) continuation);
            }

            public final Object emit(DownloadState downloadState, Continuation<? super Unit> continuation) {
                Object d2;
                Object d3;
                if (downloadState instanceof DownloadState.Completed) {
                    Object g = C10129j.m14192g(C10230y0.m13945c(), new AnonymousClass1(RLottieImageView.this, downloadState, config, null), continuation);
                    d3 = C13080d.m4646d();
                    return g == d3 ? g : Unit.f22042a;
                } else if (!(downloadState instanceof DownloadState.Failure)) {
                    return Unit.f22042a;
                } else {
                    Object g2 = C10129j.m14192g(C10230y0.m13945c(), new C01092(RLottieImageView.this, null), continuation);
                    d2 = C13080d.m4646d();
                    return g2 == d2 ? g2 : Unit.f22042a;
                }
            }
        };
        this.label = 2;
        if (downloadFile$default.collect(flowCollector, this) == d) {
            return d;
        }
        return Unit.f22042a;
    }
}

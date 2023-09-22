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
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.b1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.i2;
import kotlinx.coroutines.j;
import pf.t;
import vf.d;


@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.sticker.sticker_types.RLottieImageView$fetchSticker$1", f = "RLottieImageView.kt", l = {73, 82}, m = "invokeSuspend")

public final class RLottieImageView$fetchSticker$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final  RLottieImageView.Config $config;
    int label;
    final  RLottieImageView this$0;

    
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.discord.sticker.sticker_types.RLottieImageView$fetchSticker$1$1", f = "RLottieImageView.kt", l = {}, m = "invokeSuspend")
    
    
    public static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final  RLottieImageView this$0;

        
        AnonymousClass1(RLottieImageView rLottieImageView, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = rLottieImageView;
        }

        @Override 
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f21600a);
        }

        @Override 
        public final Object invokeSuspend(Object obj) {
            d.d();
            if (this.label == 0) {
                t.b(obj);
                this.this$0.clearAnimation();
                return Unit.f21600a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    
    
    public RLottieImageView$fetchSticker$1(RLottieImageView rLottieImageView, RLottieImageView.Config config, Continuation<? super RLottieImageView$fetchSticker$1> continuation) {
        super(2, continuation);
        this.this$0 = rLottieImageView;
        this.$config = config;
    }

    @Override 
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RLottieImageView$fetchSticker$1(this.this$0, this.$config, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RLottieImageView$fetchSticker$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f21600a);
    }

    @Override 
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = d.d();
        int i10 = this.label;
        if (i10 == 0) {
            t.b(obj);
            i2 c10 = b1.c();
            AnonymousClass1 r12 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (j.g(c10, r12, this) == d10) {
                return d10;
            }
        } else if (i10 == 1) {
            t.b(obj);
        } else if (i10 == 2) {
            t.b(obj);
            return Unit.f21600a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        FileDownloader fileDownloader = FileDownloader.INSTANCE;
        Context context = this.this$0.getContext();
        q.g(context, "context");
        String url = this.$config.getUrl();
        String asset = this.$config.getAsset();
        Flow downloadFile$default = FileDownloader.downloadFile$default(fileDownloader, context, url, asset + ".json", new File(this.this$0.getContext().getCacheDir(), "stickers"), false, 16, null);
        final RLottieImageView rLottieImageView = this.this$0;
        final RLottieImageView.Config config = this.$config;
        FlowCollector flowCollector = new FlowCollector() { 

            
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @e(c = "com.discord.sticker.sticker_types.RLottieImageView$fetchSticker$1$2$1", f = "RLottieImageView.kt", l = {}, m = "invokeSuspend")
            
            
            public static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
                final  RLottieImageView.Config $config;
                final  DownloadState $downloadState;
                int label;
                final  RLottieImageView this$0;

                
                AnonymousClass1(RLottieImageView rLottieImageView, DownloadState downloadState, RLottieImageView.Config config, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = rLottieImageView;
                    this.$downloadState = downloadState;
                    this.$config = config;
                }

                @Override 
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$downloadState, this.$config, continuation);
                }

                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f21600a);
                }

                @Override 
                public final Object invokeSuspend(Object obj) {
                    RLottieDrawable.PlaybackMode playbackMode;
                    AnimatedImageStateManager animatedImageStateManager;
                    d.d();
                    if (this.label == 0) {
                        t.b(obj);
                        this.this$0.setImageDrawable(null);
                        RLottieImageView rLottieImageView = this.this$0;
                        Context context = rLottieImageView.getContext();
                        q.g(context, "context");
                        File file = ((DownloadState.Completed) this.$downloadState).getFile();
                        int dpToPx = SizeUtilsKt.getDpToPx(this.$config.getWidthDp());
                        int dpToPx2 = SizeUtilsKt.getDpToPx(this.$config.getHeightDp());
                        int renderMode = this.$config.getRenderMode();
                        if (renderMode == 0) {
                            playbackMode = RLottieDrawable.PlaybackMode.LOOP;
                        } else if (renderMode != 1) {
                            playbackMode = RLottieDrawable.PlaybackMode.ONCE;
                        } else {
                            playbackMode = RLottieDrawable.PlaybackMode.FREEZE;
                        }
                        rLottieImageView.setAnimation(context, file, dpToPx, dpToPx2, playbackMode);
                        this.this$0.setBackground(null);
                        animatedImageStateManager = this.this$0.rLottieStateManager;
                        return b.a(animatedImageStateManager.onFetchFinished(true, this.$config.getAnimate()));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @e(c = "com.discord.sticker.sticker_types.RLottieImageView$fetchSticker$1$2$2", f = "RLottieImageView.kt", l = {}, m = "invokeSuspend")
            
            
            public static final class C01082 extends k implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
                int label;
                final  RLottieImageView this$0;

                
                C01082(RLottieImageView rLottieImageView, Continuation<? super C01082> continuation) {
                    super(2, continuation);
                    this.this$0 = rLottieImageView;
                }

                @Override 
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C01082(this.this$0, continuation);
                }

                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                    return ((C01082) create(coroutineScope, continuation)).invokeSuspend(Unit.f21600a);
                }

                @Override 
                public final Object invokeSuspend(Object obj) {
                    AnimatedImageStateManager animatedImageStateManager;
                    d.d();
                    if (this.label == 0) {
                        t.b(obj);
                        animatedImageStateManager = this.this$0.rLottieStateManager;
                        return b.a(AnimatedImageStateManager.onFetchFinished$default(animatedImageStateManager, false, false, 2, null));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override 
            public   Object emit(Object obj2, Continuation continuation) {
                return emit((DownloadState) obj2, (Continuation<? super Unit>) continuation);
            }

            public final Object emit(DownloadState downloadState, Continuation<? super Unit> continuation) {
                Object d11;
                Object d12;
                if (downloadState instanceof DownloadState.Completed) {
                    Object g10 = j.g(b1.c(), new AnonymousClass1(RLottieImageView.this, downloadState, config, null), continuation);
                    d12 = d.d();
                    return g10 == d12 ? g10 : Unit.f21600a;
                } else if (!(downloadState instanceof DownloadState.Failure)) {
                    return Unit.f21600a;
                } else {
                    Object g11 = j.g(b1.c(), new C01082(RLottieImageView.this, null), continuation);
                    d11 = d.d();
                    return g11 == d11 ? g11 : Unit.f21600a;
                }
            }
        };
        this.label = 2;
        if (downloadFile$default.collect(flowCollector, this) == d10) {
            return d10;
        }
        return Unit.f21600a;
    }
}

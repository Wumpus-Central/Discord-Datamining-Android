package com.discord.image.animated_image.apng;

import android.content.Context;
import com.discord.file_downloader.DownloadState;
import com.discord.file_downloader.FileDownloader;
import com.discord.image.animated_image.animated_image_utils.AnimatedImageStateManager;
import com.discord.image.animated_image.apng.APNGView;
import com.linecorp.apng.ApngDrawable;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import pf.t;
import vf.d;


@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.image.animated_image.apng.APNGView$fetchAPNG$1", f = "APNGView.kt", l = {83}, m = "invokeSuspend")

public final class APNGView$fetchAPNG$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final  APNGView.Config $config;
    int label;
    final  APNGView this$0;

    
    
    public APNGView$fetchAPNG$1(APNGView aPNGView, APNGView.Config config, Continuation<? super APNGView$fetchAPNG$1> continuation) {
        super(2, continuation);
        this.this$0 = aPNGView;
        this.$config = config;
    }

    @Override 
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new APNGView$fetchAPNG$1(this.this$0, this.$config, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((APNGView$fetchAPNG$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f21600a);
    }

    @Override 
    public final Object invokeSuspend(Object obj) {
        Object d10;
        String filename;
        d10 = d.d();
        int i10 = this.label;
        if (i10 == 0) {
            t.b(obj);
            FileDownloader fileDownloader = FileDownloader.INSTANCE;
            Context context = this.this$0.getContext();
            q.g(context, "context");
            String url = this.$config.getUrl();
            filename = APNGView.Companion.getFilename(this.$config.getUrl());
            Flow downloadFile$default = FileDownloader.downloadFile$default(fileDownloader, context, url, filename, new File(this.this$0.getContext().getCacheDir(), this.$config.getCacheDirectory()), false, 16, null);
            AnonymousClass1 r12 = new AnonymousClass1(this.this$0, this.$config);
            this.label = 1;
            if (downloadFile$default.collect(r12, this) == d10) {
                return d10;
            }
        } else if (i10 == 1) {
            t.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f21600a;
    }

    
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "downloadState", "Lcom/discord/file_downloader/DownloadState;", "emit", "(Lcom/discord/file_downloader/DownloadState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    
    
    public static final class AnonymousClass1<T> implements FlowCollector {
        final  APNGView.Config $config;
        final  APNGView this$0;

        
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @e(c = "com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$1", f = "APNGView.kt", l = {}, m = "invokeSuspend")
        
        
        public static final class C01061 extends k implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            final  APNGView.Config $config;
            final  ApngDrawable $drawable;
            int label;
            final  APNGView this$0;

            
            C01061(APNGView aPNGView, ApngDrawable apngDrawable, APNGView.Config config, Continuation<? super C01061> continuation) {
                super(2, continuation);
                this.this$0 = aPNGView;
                this.$drawable = apngDrawable;
                this.$config = config;
            }

            @Override 
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C01061(this.this$0, this.$drawable, this.$config, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                return ((C01061) create(coroutineScope, continuation)).invokeSuspend(Unit.f21600a);
            }

            @Override 
            public final Object invokeSuspend(Object obj) {
                AnimatedImageStateManager animatedImageStateManager;
                d.d();
                if (this.label == 0) {
                    t.b(obj);
                    this.this$0.setImageDrawable(null);
                    this.this$0.setImageDrawable(this.$drawable);
                    this.this$0.setBackground(null);
                    animatedImageStateManager = this.this$0.apngStateManager;
                    return b.a(animatedImageStateManager.onFetchFinished(true, this.$config.getAnimate()));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @e(c = "com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$2", f = "APNGView.kt", l = {}, m = "invokeSuspend")
        
        
        public static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            int label;
            final  APNGView this$0;

            
            AnonymousClass2(APNGView aPNGView, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = aPNGView;
            }

            @Override 
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f21600a);
            }

            @Override 
            public final Object invokeSuspend(Object obj) {
                AnimatedImageStateManager animatedImageStateManager;
                d.d();
                if (this.label == 0) {
                    t.b(obj);
                    animatedImageStateManager = this.this$0.apngStateManager;
                    return b.a(AnimatedImageStateManager.onFetchFinished$default(animatedImageStateManager, false, false, 2, null));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @e(c = "com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$3", f = "APNGView.kt", l = {}, m = "invokeSuspend")
        
        
        public static final class AnonymousClass3 extends k implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            int label;
            final  APNGView this$0;

            
            AnonymousClass3(APNGView aPNGView, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = aPNGView;
            }

            @Override 
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.f21600a);
            }

            @Override 
            public final Object invokeSuspend(Object obj) {
                AnimatedImageStateManager animatedImageStateManager;
                d.d();
                if (this.label == 0) {
                    t.b(obj);
                    animatedImageStateManager = this.this$0.apngStateManager;
                    return b.a(AnimatedImageStateManager.onFetchFinished$default(animatedImageStateManager, false, false, 2, null));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        AnonymousClass1(APNGView aPNGView, APNGView.Config config) {
            this.this$0 = aPNGView;
            this.$config = config;
        }

        
        
        
        
        public final java.lang.Object emit(com.discord.file_downloader.DownloadState r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
            
            throw new UnsupportedOperationException("Method not decompiled: com.discord.image.animated_image.apng.APNGView$fetchAPNG$1.AnonymousClass1.emit(com.discord.file_downloader.DownloadState, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override 
        public   Object emit(Object obj, Continuation continuation) {
            return emit((DownloadState) obj, (Continuation<? super Unit>) continuation);
        }
    }
}

package com.discord.image.animated_image.apng;

import android.content.Context;
import com.discord.file_downloader.DownloadState;
import com.discord.file_downloader.FileDownloader;
import com.discord.image.animated_image.animated_image_utils.AnimatedImageStateManager;
import com.discord.image.animated_image.apng.APNGView;
import com.linecorp.apng.ApngDrawable;
import java.io.File;
import kg.t;
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
import qg.d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.discord.image.animated_image.apng.APNGView$fetchAPNG$1", f = "APNGView.kt", l = {82}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class APNGView$fetchAPNG$1 extends k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ APNGView.Config $config;
    int label;
    final /* synthetic */ APNGView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public APNGView$fetchAPNG$1(APNGView aPNGView, APNGView.Config config, Continuation<? super APNGView$fetchAPNG$1> continuation) {
        super(2, continuation);
        this.this$0 = aPNGView;
        this.$config = config;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new APNGView$fetchAPNG$1(this.this$0, this.$config, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((APNGView$fetchAPNG$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f22113a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        String filename;
        d10 = d.d();
        int i10 = this.label;
        if (i10 == 0) {
            t.b(obj);
            FileDownloader fileDownloader = FileDownloader.INSTANCE;
            Context context = this.this$0.getContext();
            q.f(context, "context");
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
        return Unit.f22113a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "downloadState", "Lcom/discord/file_downloader/DownloadState;", "emit", "(Lcom/discord/file_downloader/DownloadState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ APNGView.Config $config;
        final /* synthetic */ APNGView this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @e(c = "com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$1", f = "APNGView.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes7.dex */
        public static final class C01161 extends k implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            final /* synthetic */ APNGView.Config $config;
            final /* synthetic */ ApngDrawable $drawable;
            int label;
            final /* synthetic */ APNGView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01161(APNGView aPNGView, ApngDrawable apngDrawable, APNGView.Config config, Continuation<? super C01161> continuation) {
                super(2, continuation);
                this.this$0 = aPNGView;
                this.$drawable = apngDrawable;
                this.$config = config;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C01161(this.this$0, this.$drawable, this.$config, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                return ((C01161) create(coroutineScope, continuation)).invokeSuspend(Unit.f22113a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
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

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @e(c = "com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$2", f = "APNGView.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$2  reason: invalid class name */
        /* loaded from: classes7.dex */
        public static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            int label;
            final /* synthetic */ APNGView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(APNGView aPNGView, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = aPNGView;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f22113a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
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

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @e(c = "com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$3", f = "APNGView.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$3  reason: invalid class name */
        /* loaded from: classes7.dex */
        public static final class AnonymousClass3 extends k implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            int label;
            final /* synthetic */ APNGView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(APNGView aPNGView, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = aPNGView;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.f22113a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
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

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008a A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(com.discord.file_downloader.DownloadState r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
            /*
                r13 = this;
                boolean r0 = r15 instanceof com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$emit$1
                if (r0 == 0) goto L_0x0013
                r0 = r15
                com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$emit$1 r0 = (com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.label = r1
                goto L_0x0018
            L_0x0013:
                com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$emit$1 r0 = new com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$emit$1
                r0.<init>(r13, r15)
            L_0x0018:
                java.lang.Object r15 = r0.result
                java.lang.Object r1 = qg.b.d()
                int r2 = r0.label
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L_0x0045
                if (r2 == r5) goto L_0x003d
                if (r2 == r4) goto L_0x0039
                if (r2 != r3) goto L_0x0031
                kg.t.b(r15)
                goto L_0x00a3
            L_0x0031:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r15)
                throw r14
            L_0x0039:
                kg.t.b(r15)
                goto L_0x00a6
            L_0x003d:
                java.lang.Object r14 = r0.L$0
                com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1 r14 = (com.discord.image.animated_image.apng.APNGView$fetchAPNG$1.AnonymousClass1) r14
                kg.t.b(r15)     // Catch: Exception -> 0x0075
                goto L_0x00a6
            L_0x0045:
                kg.t.b(r15)
                boolean r15 = r14 instanceof com.discord.file_downloader.DownloadState.Completed
                if (r15 == 0) goto L_0x008b
                com.linecorp.apng.ApngDrawable$b r7 = com.linecorp.apng.ApngDrawable.C     // Catch: Exception -> 0x0074
                com.discord.file_downloader.DownloadState$Completed r14 = (com.discord.file_downloader.DownloadState.Completed) r14     // Catch: Exception -> 0x0074
                java.io.File r8 = r14.getFile()     // Catch: Exception -> 0x0074
                r9 = 0
                r10 = 0
                r11 = 6
                r12 = 0
                com.linecorp.apng.ApngDrawable r14 = com.linecorp.apng.ApngDrawable.b.c(r7, r8, r9, r10, r11, r12)     // Catch: Exception -> 0x0074
                kotlinx.coroutines.f2 r15 = kotlinx.coroutines.y0.c()     // Catch: Exception -> 0x0074
                com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$1 r2 = new com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$1     // Catch: Exception -> 0x0074
                com.discord.image.animated_image.apng.APNGView r3 = r13.this$0     // Catch: Exception -> 0x0074
                com.discord.image.animated_image.apng.APNGView$Config r7 = r13.$config     // Catch: Exception -> 0x0074
                r2.<init>(r3, r14, r7, r6)     // Catch: Exception -> 0x0074
                r0.L$0 = r13     // Catch: Exception -> 0x0074
                r0.label = r5     // Catch: Exception -> 0x0074
                java.lang.Object r14 = kotlinx.coroutines.j.g(r15, r2, r0)     // Catch: Exception -> 0x0074
                if (r14 != r1) goto L_0x00a6
                return r1
            L_0x0074:
                r14 = r13
            L_0x0075:
                kotlinx.coroutines.f2 r15 = kotlinx.coroutines.y0.c()
                com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$2 r2 = new com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$2
                com.discord.image.animated_image.apng.APNGView r14 = r14.this$0
                r2.<init>(r14, r6)
                r0.L$0 = r6
                r0.label = r4
                java.lang.Object r14 = kotlinx.coroutines.j.g(r15, r2, r0)
                if (r14 != r1) goto L_0x00a6
                return r1
            L_0x008b:
                boolean r14 = r14 instanceof com.discord.file_downloader.DownloadState.Failure
                if (r14 == 0) goto L_0x00a6
                kotlinx.coroutines.f2 r14 = kotlinx.coroutines.y0.c()
                com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$3 r15 = new com.discord.image.animated_image.apng.APNGView$fetchAPNG$1$1$3
                com.discord.image.animated_image.apng.APNGView r2 = r13.this$0
                r15.<init>(r2, r6)
                r0.label = r3
                java.lang.Object r14 = kotlinx.coroutines.j.g(r14, r15, r0)
                if (r14 != r1) goto L_0x00a3
                return r1
            L_0x00a3:
                kotlin.Unit r14 = kotlin.Unit.f22113a
                return r14
            L_0x00a6:
                kotlin.Unit r14 = kotlin.Unit.f22113a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.discord.image.animated_image.apng.APNGView$fetchAPNG$1.AnonymousClass1.emit(com.discord.file_downloader.DownloadState, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((DownloadState) obj, (Continuation<? super Unit>) continuation);
        }
    }
}

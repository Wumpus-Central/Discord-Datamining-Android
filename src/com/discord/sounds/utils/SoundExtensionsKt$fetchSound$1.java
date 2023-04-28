package com.discord.sounds.utils;

import android.content.Context;
import com.discord.file_downloader.DownloadState;
import com.discord.file_downloader.FileDownloader;
import com.discord.logging.Log;
import com.discord.sounds.SoundManager;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC9636e;
import kotlin.coroutines.jvm.internal.AbstractC9643k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import nf.C10848t;
import tf.C12962d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
@AbstractC9636e(m14702c = "com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1", m14701f = "SoundExtensions.kt", m14700l = {42}, m14699m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class SoundExtensionsKt$fetchSound$1 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $fileName;
    final /* synthetic */ int $key;
    final /* synthetic */ File $soundDirectory;
    final /* synthetic */ SoundManager $soundManager;
    final /* synthetic */ Function1<Integer, Unit> $soundResIdPrepared;
    final /* synthetic */ String $url;
    final /* synthetic */ int $usage;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SoundExtensionsKt$fetchSound$1(Context context, String str, String str2, File file, SoundManager soundManager, int i, int i2, Function1<? super Integer, Unit> function1, Continuation<? super SoundExtensionsKt$fetchSound$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$url = str;
        this.$fileName = str2;
        this.$soundDirectory = file;
        this.$soundManager = soundManager;
        this.$key = i;
        this.$usage = i2;
        this.$soundResIdPrepared = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SoundExtensionsKt$fetchSound$1(this.$context, this.$url, this.$fileName, this.$soundDirectory, this.$soundManager, this.$key, this.$usage, this.$soundResIdPrepared, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SoundExtensionsKt$fetchSound$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
    public final Object invokeSuspend(Object obj) {
        Object d;
        d = C12962d.m4646d();
        int i = this.label;
        if (i == 0) {
            C10848t.m10930b(obj);
            Flow downloadFile$default = FileDownloader.downloadFile$default(FileDownloader.INSTANCE, this.$context, this.$url, this.$fileName, this.$soundDirectory, false, 16, null);
            C36931 r1 = new C36931(this.$soundManager, this.$key, this.$usage, this.$soundResIdPrepared);
            this.label = 1;
            if (downloadFile$default.collect(r1, this) == d) {
                return d;
            }
        } else if (i == 1) {
            C10848t.m10930b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f25780a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m15074d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m15073d2 = {"<anonymous>", "", "downloadState", "Lcom/discord/file_downloader/DownloadState;", "emit", "(Lcom/discord/file_downloader/DownloadState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* renamed from: com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1 */
    /* loaded from: classes7.dex */
    public static final class C36931<T> implements FlowCollector {
        final /* synthetic */ int $key;
        final /* synthetic */ SoundManager $soundManager;
        final /* synthetic */ Function1<Integer, Unit> $soundResIdPrepared;
        final /* synthetic */ int $usage;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
        @AbstractC9636e(m14702c = "com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$1", m14701f = "SoundExtensions.kt", m14700l = {}, m14699m = "invokeSuspend")
        /* renamed from: com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$1 */
        /* loaded from: classes7.dex */
        public static final class C36941 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ DownloadState $downloadState;
            final /* synthetic */ int $key;
            final /* synthetic */ SoundManager $soundManager;
            final /* synthetic */ Function1<Integer, Unit> $soundResIdPrepared;
            final /* synthetic */ int $usage;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C36941(SoundManager soundManager, int i, int i2, DownloadState downloadState, Function1<? super Integer, Unit> function1, Continuation<? super C36941> continuation) {
                super(2, continuation);
                this.$soundManager = soundManager;
                this.$key = i;
                this.$usage = i2;
                this.$downloadState = downloadState;
                this.$soundResIdPrepared = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C36941(this.$soundManager, this.$key, this.$usage, this.$downloadState, this.$soundResIdPrepared, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C36941) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
            public final Object invokeSuspend(Object obj) {
                C12962d.m4646d();
                if (this.label == 0) {
                    C10848t.m10930b(obj);
                    this.$soundManager.prepare(this.$key, this.$usage, null, ((DownloadState.Completed) this.$downloadState).getFile().getAbsolutePath(), this.$soundResIdPrepared);
                    return Unit.f25780a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
        @AbstractC9636e(m14702c = "com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$2", m14701f = "SoundExtensions.kt", m14700l = {}, m14699m = "invokeSuspend")
        /* renamed from: com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$2 */
        /* loaded from: classes7.dex */
        public static final class C36952 extends AbstractC9643k implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: $e */
            final /* synthetic */ Exception f9497$e;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C36952(Exception exc, Continuation<? super C36952> continuation) {
                super(2, continuation);
                this.f9497$e = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C36952(this.f9497$e, continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C36952) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
            public final Object invokeSuspend(Object obj) {
                C12962d.m4646d();
                if (this.label == 0) {
                    C10848t.m10930b(obj);
                    Log.INSTANCE.m32175w(SoundManager.Companion.getLogTag(), "Failed to download sound.", this.f9497$e);
                    return Unit.f25780a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m15074d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, m15073d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m15072k = 3, m15071mv = {1, 8, 0})
        @AbstractC9636e(m14702c = "com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$3", m14701f = "SoundExtensions.kt", m14700l = {}, m14699m = "invokeSuspend")
        /* renamed from: com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$3 */
        /* loaded from: classes7.dex */
        public static final class C36963 extends AbstractC9643k implements Function2<CoroutineScope, Continuation, Object> {
            int label;

            C36963(Continuation<? super C36963> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C36963(continuation);
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C36963) create(coroutineScope, continuation)).invokeSuspend(Unit.f25780a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC9632a
            public final Object invokeSuspend(Object obj) {
                C12962d.m4646d();
                if (this.label == 0) {
                    C10848t.m10930b(obj);
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C36931(SoundManager soundManager, int i, int i2, Function1<? super Integer, Unit> function1) {
            this.$soundManager = soundManager;
            this.$key = i;
            this.$usage = i2;
            this.$soundResIdPrepared = function1;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:2|(2:4|(9:6|8|34|(1:(1:(1:(2:13|32)(2:14|15))(3:16|27|28))(4:17|33|27|28))(2:19|(5:21|(1:23)|33|27|28)(2:29|(1:31)(1:32)))|18|24|(1:26)|27|28))|7|8|34|(0)(0)|18|24|(0)|27|28) */
        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007e A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(com.discord.file_downloader.DownloadState r17, kotlin.coroutines.Continuation<? super kotlin.Unit> r18) {
            /*
                r16 = this;
                r1 = r16
                r0 = r18
                boolean r2 = r0 instanceof com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$emit$1
                if (r2 == 0) goto L_0x0017
                r2 = r0
                com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$emit$1 r2 = (com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$emit$1) r2
                int r3 = r2.label
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = r3 & r4
                if (r5 == 0) goto L_0x0017
                int r3 = r3 - r4
                r2.label = r3
                goto L_0x001c
            L_0x0017:
                com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$emit$1 r2 = new com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$emit$1
                r2.<init>(r1, r0)
            L_0x001c:
                java.lang.Object r0 = r2.result
                java.lang.Object r3 = tf.C12956b.m4650d()
                int r4 = r2.label
                r5 = 0
                r6 = 3
                r7 = 2
                r8 = 1
                if (r4 == 0) goto L_0x0046
                if (r4 == r8) goto L_0x0040
                if (r4 == r7) goto L_0x003c
                if (r4 != r6) goto L_0x0034
                nf.C10848t.m10930b(r0)
                goto L_0x0094
            L_0x0034:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x003c:
                nf.C10848t.m10930b(r0)
                goto L_0x007f
            L_0x0040:
                nf.C10848t.m10930b(r0)     // Catch: Exception -> 0x0044
                goto L_0x007f
            L_0x0044:
                r0 = move-exception
                goto L_0x006d
            L_0x0046:
                nf.C10848t.m10930b(r0)
                r0 = r17
                boolean r4 = r0 instanceof com.discord.file_downloader.DownloadState.Completed
                if (r4 == 0) goto L_0x0082
                kotlinx.coroutines.f2 r4 = kotlinx.coroutines.C9946y0.m13945c()     // Catch: Exception -> 0x0044
                com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$1 r6 = new com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$1     // Catch: Exception -> 0x0044
                com.discord.sounds.SoundManager r10 = r1.$soundManager     // Catch: Exception -> 0x0044
                int r11 = r1.$key     // Catch: Exception -> 0x0044
                int r12 = r1.$usage     // Catch: Exception -> 0x0044
                kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> r14 = r1.$soundResIdPrepared     // Catch: Exception -> 0x0044
                r15 = 0
                r9 = r6
                r13 = r17
                r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch: Exception -> 0x0044
                r2.label = r8     // Catch: Exception -> 0x0044
                java.lang.Object r0 = kotlinx.coroutines.C9840j.m14192g(r4, r6, r2)     // Catch: Exception -> 0x0044
                if (r0 != r3) goto L_0x007f
                return r3
            L_0x006d:
                kotlinx.coroutines.f2 r4 = kotlinx.coroutines.C9946y0.m13945c()
                com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$2 r6 = new com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$2
                r6.<init>(r0, r5)
                r2.label = r7
                java.lang.Object r0 = kotlinx.coroutines.C9840j.m14192g(r4, r6, r2)
                if (r0 != r3) goto L_0x007f
                return r3
            L_0x007f:
                kotlin.Unit r0 = kotlin.Unit.f25780a
                return r0
            L_0x0082:
                kotlinx.coroutines.f2 r0 = kotlinx.coroutines.C9946y0.m13945c()
                com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$3 r4 = new com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$3
                r4.<init>(r5)
                r2.label = r6
                java.lang.Object r0 = kotlinx.coroutines.C9840j.m14192g(r0, r4, r2)
                if (r0 != r3) goto L_0x0094
                return r3
            L_0x0094:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1.C36931.emit(com.discord.file_downloader.DownloadState, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((DownloadState) obj, (Continuation<? super Unit>) continuation);
        }
    }
}

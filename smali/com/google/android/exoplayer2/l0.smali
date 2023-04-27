.class public final synthetic Lcom/google/android/exoplayer2/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/google/android/exoplayer2/m0;

.field public final synthetic l:Lcc/i0$b;

.field public final synthetic m:Li8/u$a;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/exoplayer2/m0;Lcc/i0$b;Li8/u$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/l0;->k:Lcom/google/android/exoplayer2/m0;

    iput-object p2, p0, Lcom/google/android/exoplayer2/l0;->l:Lcc/i0$b;

    iput-object p3, p0, Lcom/google/android/exoplayer2/l0;->m:Li8/u$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/exoplayer2/l0;->k:Lcom/google/android/exoplayer2/m0;

    iget-object v1, p0, Lcom/google/android/exoplayer2/l0;->l:Lcc/i0$b;

    iget-object v2, p0, Lcom/google/android/exoplayer2/l0;->m:Li8/u$a;

    invoke-static {v0, v1, v2}, Lcom/google/android/exoplayer2/m0;->a(Lcom/google/android/exoplayer2/m0;Lcc/i0$b;Li8/u$a;)V

    return-void
.end method

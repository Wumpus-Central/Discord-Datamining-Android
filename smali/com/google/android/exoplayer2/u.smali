.class public final synthetic Lcom/google/android/exoplayer2/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/google/android/exoplayer2/d0;

.field public final synthetic l:Lcom/google/android/exoplayer2/g0$e;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/exoplayer2/d0;Lcom/google/android/exoplayer2/g0$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/u;->k:Lcom/google/android/exoplayer2/d0;

    iput-object p2, p0, Lcom/google/android/exoplayer2/u;->l:Lcom/google/android/exoplayer2/g0$e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/u;->k:Lcom/google/android/exoplayer2/d0;

    iget-object v1, p0, Lcom/google/android/exoplayer2/u;->l:Lcom/google/android/exoplayer2/g0$e;

    invoke-static {v0, v1}, Lcom/google/android/exoplayer2/d0;->u0(Lcom/google/android/exoplayer2/d0;Lcom/google/android/exoplayer2/g0$e;)V

    return-void
.end method

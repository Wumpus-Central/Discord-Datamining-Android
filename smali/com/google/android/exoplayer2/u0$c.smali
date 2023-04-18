.class final Lcom/google/android/exoplayer2/u0$c;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/exoplayer2/u0;


# direct methods
.method private constructor <init>(Lcom/google/android/exoplayer2/u0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/exoplayer2/u0$c;->a:Lcom/google/android/exoplayer2/u0;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/exoplayer2/u0;Lcom/google/android/exoplayer2/u0$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/u0$c;-><init>(Lcom/google/android/exoplayer2/u0;)V

    return-void
.end method

.method public static synthetic a(Lcom/google/android/exoplayer2/u0;)V
    .locals 0

    invoke-static {p0}, Lcom/google/android/exoplayer2/u0$c;->b(Lcom/google/android/exoplayer2/u0;)V

    return-void
.end method

.method private static synthetic b(Lcom/google/android/exoplayer2/u0;)V
    .locals 0

    invoke-static {p0}, Lcom/google/android/exoplayer2/u0;->b(Lcom/google/android/exoplayer2/u0;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/exoplayer2/u0$c;->a:Lcom/google/android/exoplayer2/u0;

    invoke-static {p1}, Lcom/google/android/exoplayer2/u0;->a(Lcom/google/android/exoplayer2/u0;)Landroid/os/Handler;

    move-result-object p1

    iget-object p2, p0, Lcom/google/android/exoplayer2/u0$c;->a:Lcom/google/android/exoplayer2/u0;

    new-instance v0, Lcom/google/android/exoplayer2/v0;

    invoke-direct {v0, p2}, Lcom/google/android/exoplayer2/v0;-><init>(Lcom/google/android/exoplayer2/u0;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

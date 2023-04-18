.class public final synthetic Lo8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo8/a;->k:Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lo8/a;->k:Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;

    invoke-static {v0}, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;->D(Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource;)V

    return-void
.end method

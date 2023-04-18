.class public final synthetic Lqe/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Landroid/media/MediaCodecInfo;


# direct methods
.method public synthetic constructor <init>(Landroid/media/MediaCodecInfo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqe/b;->a:Landroid/media/MediaCodecInfo;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lqe/b;->a:Landroid/media/MediaCodecInfo;

    invoke-static {v0}, Lqe/c;->a(Landroid/media/MediaCodecInfo;)Landroid/media/MediaCodec;

    move-result-object v0

    return-object v0
.end method

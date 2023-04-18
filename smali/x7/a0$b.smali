.class public final Lx7/a0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/k$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx7/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/media/MediaCodec;)Lx7/k;
    .locals 2

    new-instance v0, Lx7/a0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lx7/a0;-><init>(Landroid/media/MediaCodec;Lx7/a0$a;)V

    return-object v0
.end method

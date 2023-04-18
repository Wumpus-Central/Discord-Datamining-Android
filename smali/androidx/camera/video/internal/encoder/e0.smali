.class public final synthetic Landroidx/camera/video/internal/encoder/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/c$c;


# instance fields
.field public final synthetic a:Landroidx/camera/video/internal/encoder/a0$d;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/video/internal/encoder/a0$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/video/internal/encoder/e0;->a:Landroidx/camera/video/internal/encoder/a0$d;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/e0;->a:Landroidx/camera/video/internal/encoder/a0$d;

    invoke-static {v0, p1}, Landroidx/camera/video/internal/encoder/a0$d;->o(Landroidx/camera/video/internal/encoder/a0$d;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.class Li0/o0$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li0/o0;->B0(Li0/o0$i;ILjava/lang/Throwable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly/c<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Li0/o0;


# direct methods
.method constructor <init>(Li0/o0;)V
    .locals 0

    iput-object p1, p0, Li0/o0$e;->a:Li0/o0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Li0/o0$e;->b(Ljava/lang/Void;)V

    return-void
.end method

.method public b(Ljava/lang/Void;)V
    .locals 0

    iget-object p1, p0, Li0/o0$e;->a:Li0/o0;

    iget-object p1, p1, Li0/o0;->z:Landroidx/camera/video/internal/encoder/a0;

    invoke-virtual {p1}, Landroidx/camera/video/internal/encoder/a0;->U()V

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    const-string v0, "Recorder"

    .line 2
    .line 3
    const-string v1, "The source didn\'t become non-streaming with error."

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Landroidx/camera/core/r1;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    const-class p1, Lm0/c;

    .line 9
    .line 10
    invoke-static {p1}, Lm0/d;->a(Ljava/lang/Class;)Lw/f2;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, Li0/o0$e;->a:Li0/o0;

    .line 17
    .line 18
    iget-object p1, p1, Li0/o0;->z:Landroidx/camera/video/internal/encoder/a0;

    .line 19
    .line 20
    invoke-virtual {p1}, Landroidx/camera/video/internal/encoder/a0;->U()V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

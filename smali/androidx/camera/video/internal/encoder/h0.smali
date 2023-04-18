.class public final synthetic Landroidx/camera/video/internal/encoder/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lw/a2$a;

.field public final synthetic l:Lk0/j$a;


# direct methods
.method public synthetic constructor <init>(Lw/a2$a;Lk0/j$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/video/internal/encoder/h0;->k:Lw/a2$a;

    iput-object p2, p0, Landroidx/camera/video/internal/encoder/h0;->l:Lk0/j$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/h0;->k:Lw/a2$a;

    iget-object v1, p0, Landroidx/camera/video/internal/encoder/h0;->l:Lk0/j$a;

    invoke-static {v0, v1}, Landroidx/camera/video/internal/encoder/a0$d;->l(Lw/a2$a;Lk0/j$a;)V

    return-void
.end method

.class public final synthetic Landroidx/camera/core/t1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/camera/core/u1;

.field public final synthetic l:Lw/m1$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/u1;Lw/m1$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/t1;->k:Landroidx/camera/core/u1;

    iput-object p2, p0, Landroidx/camera/core/t1;->l:Lw/m1$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/t1;->k:Landroidx/camera/core/u1;

    iget-object v1, p0, Landroidx/camera/core/t1;->l:Lw/m1$a;

    invoke-static {v0, v1}, Landroidx/camera/core/u1;->i(Landroidx/camera/core/u1;Lw/m1$a;)V

    return-void
.end method

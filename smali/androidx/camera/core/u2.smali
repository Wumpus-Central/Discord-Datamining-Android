.class public final synthetic Landroidx/camera/core/u2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/camera/core/v2$h;

.field public final synthetic l:Landroidx/camera/core/v2$g;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/v2$h;Landroidx/camera/core/v2$g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/u2;->k:Landroidx/camera/core/v2$h;

    iput-object p2, p0, Landroidx/camera/core/u2;->l:Landroidx/camera/core/v2$g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/u2;->k:Landroidx/camera/core/v2$h;

    iget-object v1, p0, Landroidx/camera/core/u2;->l:Landroidx/camera/core/v2$g;

    invoke-static {v0, v1}, Landroidx/camera/core/v2;->c(Landroidx/camera/core/v2$h;Landroidx/camera/core/v2$g;)V

    return-void
.end method

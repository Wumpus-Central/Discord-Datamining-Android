.class public final synthetic Landroidx/camera/core/z1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/camera/core/a2$d;

.field public final synthetic l:Landroidx/camera/core/v2;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/a2$d;Landroidx/camera/core/v2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/z1;->k:Landroidx/camera/core/a2$d;

    iput-object p2, p0, Landroidx/camera/core/z1;->l:Landroidx/camera/core/v2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/z1;->k:Landroidx/camera/core/a2$d;

    iget-object v1, p0, Landroidx/camera/core/z1;->l:Landroidx/camera/core/v2;

    invoke-static {v0, v1}, Landroidx/camera/core/a2;->L(Landroidx/camera/core/a2$d;Landroidx/camera/core/v2;)V

    return-void
.end method

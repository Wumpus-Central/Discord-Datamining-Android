.class public final synthetic Landroidx/camera/core/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lz/o;

.field public final synthetic l:Landroidx/camera/core/e0;


# direct methods
.method public synthetic constructor <init>(Lz/o;Landroidx/camera/core/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/a1;->k:Lz/o;

    iput-object p2, p0, Landroidx/camera/core/a1;->l:Landroidx/camera/core/e0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/a1;->k:Lz/o;

    iget-object v1, p0, Landroidx/camera/core/a1;->l:Landroidx/camera/core/e0;

    invoke-static {v0, v1}, Landroidx/camera/core/g1;->U(Lz/o;Landroidx/camera/core/e0;)V

    return-void
.end method

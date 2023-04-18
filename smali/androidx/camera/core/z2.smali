.class public final synthetic Landroidx/camera/core/z2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/camera/core/b3;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/b3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/z2;->k:Landroidx/camera/core/b3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/z2;->k:Landroidx/camera/core/b3;

    invoke-static {v0}, Landroidx/camera/core/b3;->M(Landroidx/camera/core/b3;)V

    return-void
.end method

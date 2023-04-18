.class public final synthetic Landroidx/camera/core/f2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/camera/core/g2;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/g2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/f2;->k:Landroidx/camera/core/g2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/f2;->k:Landroidx/camera/core/g2;

    invoke-static {v0}, Landroidx/camera/core/g2;->p(Landroidx/camera/core/g2;)V

    return-void
.end method

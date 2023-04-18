.class public final synthetic Landroidx/camera/core/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/camera/core/j2;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/j2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/c1;->k:Landroidx/camera/core/j2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/c1;->k:Landroidx/camera/core/j2;

    invoke-virtual {v0}, Landroidx/camera/core/j2;->k()V

    return-void
.end method

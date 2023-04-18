.class public final synthetic Landroidx/camera/view/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/camera/view/t;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/view/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/view/p;->k:Landroidx/camera/view/t;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/view/p;->k:Landroidx/camera/view/t;

    invoke-virtual {v0}, Landroidx/camera/view/t;->o()V

    return-void
.end method

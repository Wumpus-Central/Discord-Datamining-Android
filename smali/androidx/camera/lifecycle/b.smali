.class public final synthetic Landroidx/camera/lifecycle/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/arch/core/util/Function;


# instance fields
.field public final synthetic a:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/lifecycle/b;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/camera/lifecycle/b;->a:Landroid/content/Context;

    check-cast p1, Landroidx/camera/core/z;

    invoke-static {v0, p1}, Landroidx/camera/lifecycle/e;->d(Landroid/content/Context;Landroidx/camera/core/z;)Landroidx/camera/lifecycle/e;

    move-result-object p1

    return-object p1
.end method

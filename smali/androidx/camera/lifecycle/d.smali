.class public final synthetic Landroidx/camera/lifecycle/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/a;


# instance fields
.field public final synthetic a:Landroidx/camera/core/z;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/lifecycle/d;->a:Landroidx/camera/core/z;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lfc/b;
    .locals 1

    iget-object v0, p0, Landroidx/camera/lifecycle/d;->a:Landroidx/camera/core/z;

    check-cast p1, Ljava/lang/Void;

    invoke-static {v0, p1}, Landroidx/camera/lifecycle/e;->b(Landroidx/camera/core/z;Ljava/lang/Void;)Lfc/b;

    move-result-object p1

    return-object p1
.end method

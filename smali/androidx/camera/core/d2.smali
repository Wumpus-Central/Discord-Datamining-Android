.class public final synthetic Landroidx/camera/core/d2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Landroidx/camera/core/c2$b;

.field public final synthetic l:Lw/m1$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/c2$b;Lw/m1$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/d2;->k:Landroidx/camera/core/c2$b;

    iput-object p2, p0, Landroidx/camera/core/d2;->l:Lw/m1$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/d2;->k:Landroidx/camera/core/c2$b;

    iget-object v1, p0, Landroidx/camera/core/d2;->l:Lw/m1$a;

    invoke-static {v0, v1}, Landroidx/camera/core/c2$b;->b(Landroidx/camera/core/c2$b;Lw/m1$a;)V

    return-void
.end method

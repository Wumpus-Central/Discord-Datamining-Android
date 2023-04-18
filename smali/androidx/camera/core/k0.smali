.class public final synthetic Landroidx/camera/core/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/k2$c;


# instance fields
.field public final synthetic a:Landroidx/camera/core/m0;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lw/e1;

.field public final synthetic d:Landroid/util/Size;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/m0;Ljava/lang/String;Lw/e1;Landroid/util/Size;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/k0;->a:Landroidx/camera/core/m0;

    iput-object p2, p0, Landroidx/camera/core/k0;->b:Ljava/lang/String;

    iput-object p3, p0, Landroidx/camera/core/k0;->c:Lw/e1;

    iput-object p4, p0, Landroidx/camera/core/k0;->d:Landroid/util/Size;

    return-void
.end method


# virtual methods
.method public final a(Lw/k2;Lw/k2$e;)V
    .locals 6

    iget-object v0, p0, Landroidx/camera/core/k0;->a:Landroidx/camera/core/m0;

    iget-object v1, p0, Landroidx/camera/core/k0;->b:Ljava/lang/String;

    iget-object v2, p0, Landroidx/camera/core/k0;->c:Lw/e1;

    iget-object v3, p0, Landroidx/camera/core/k0;->d:Landroid/util/Size;

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Landroidx/camera/core/m0;->L(Landroidx/camera/core/m0;Ljava/lang/String;Lw/e1;Landroid/util/Size;Lw/k2;Lw/k2$e;)V

    return-void
.end method

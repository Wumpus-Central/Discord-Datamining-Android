.class public final synthetic Landroidx/camera/core/y1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/k2$c;


# instance fields
.field public final synthetic a:Landroidx/camera/core/a2;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lw/e2;

.field public final synthetic d:Landroid/util/Size;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/a2;Ljava/lang/String;Lw/e2;Landroid/util/Size;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/y1;->a:Landroidx/camera/core/a2;

    iput-object p2, p0, Landroidx/camera/core/y1;->b:Ljava/lang/String;

    iput-object p3, p0, Landroidx/camera/core/y1;->c:Lw/e2;

    iput-object p4, p0, Landroidx/camera/core/y1;->d:Landroid/util/Size;

    return-void
.end method


# virtual methods
.method public final a(Lw/k2;Lw/k2$e;)V
    .locals 6

    iget-object v0, p0, Landroidx/camera/core/y1;->a:Landroidx/camera/core/a2;

    iget-object v1, p0, Landroidx/camera/core/y1;->b:Ljava/lang/String;

    iget-object v2, p0, Landroidx/camera/core/y1;->c:Lw/e2;

    iget-object v3, p0, Landroidx/camera/core/y1;->d:Landroid/util/Size;

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Landroidx/camera/core/a2;->K(Landroidx/camera/core/a2;Ljava/lang/String;Lw/e2;Landroid/util/Size;Lw/k2;Lw/k2$e;)V

    return-void
.end method

.class public final synthetic Li0/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/video/internal/encoder/j$a;


# instance fields
.field public final synthetic a:Li0/o0;

.field public final synthetic b:Landroidx/camera/core/v2;


# direct methods
.method public synthetic constructor <init>(Li0/o0;Landroidx/camera/core/v2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li0/e0;->a:Li0/o0;

    iput-object p2, p0, Li0/e0;->b:Landroidx/camera/core/v2;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/Surface;)V
    .locals 2

    iget-object v0, p0, Li0/e0;->a:Li0/o0;

    iget-object v1, p0, Li0/e0;->b:Landroidx/camera/core/v2;

    invoke-static {v0, v1, p1}, Li0/o0;->g(Li0/o0;Landroidx/camera/core/v2;Landroid/view/Surface;)V

    return-void
.end method

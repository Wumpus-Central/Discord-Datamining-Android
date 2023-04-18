.class Landroidx/camera/core/v2$b;
.super Lw/w0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/core/v2;-><init>(Landroid/util/Size;Lw/g0;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Landroidx/camera/core/v2;


# direct methods
.method constructor <init>(Landroidx/camera/core/v2;Landroid/util/Size;I)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/v2$b;->m:Landroidx/camera/core/v2;

    invoke-direct {p0, p2, p3}, Lw/w0;-><init>(Landroid/util/Size;I)V

    return-void
.end method


# virtual methods
.method protected n()Lfc/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfc/b<",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/v2$b;->m:Landroidx/camera/core/v2;

    iget-object v0, v0, Landroidx/camera/core/v2;->d:Lfc/b;

    return-object v0
.end method

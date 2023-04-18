.class public final synthetic Landroidx/camera/extensions/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/z;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lw/d1;


# direct methods
.method public synthetic constructor <init>(ILw/d1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/camera/extensions/c;->b:I

    iput-object p2, p0, Landroidx/camera/extensions/c;->c:Lw/d1;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/camera/core/r;Landroid/content/Context;)Lw/w;
    .locals 2

    iget v0, p0, Landroidx/camera/extensions/c;->b:I

    iget-object v1, p0, Landroidx/camera/extensions/c;->c:Lw/d1;

    invoke-static {v0, v1, p1, p2}, Landroidx/camera/extensions/d;->a(ILw/d1;Landroidx/camera/core/r;Landroid/content/Context;)Lw/w;

    move-result-object p1

    return-object p1
.end method

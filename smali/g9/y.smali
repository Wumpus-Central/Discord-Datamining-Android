.class public final synthetic Lg9/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lg9/a0$a;

.field public final synthetic l:Landroid/view/Surface;


# direct methods
.method public synthetic constructor <init>(Lg9/a0$a;Landroid/view/Surface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/y;->k:Lg9/a0$a;

    iput-object p2, p0, Lg9/y;->l:Landroid/view/Surface;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lg9/y;->k:Lg9/a0$a;

    iget-object v1, p0, Lg9/y;->l:Landroid/view/Surface;

    invoke-static {v0, v1}, Lg9/a0$a;->d(Lg9/a0$a;Landroid/view/Surface;)V

    return-void
.end method

.class public final synthetic Lf1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf1/f$c;


# instance fields
.field public final synthetic a:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/e;->a:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final a(Lf1/k;ILandroid/os/Bundle;)Z
    .locals 1

    iget-object v0, p0, Lf1/e;->a:Landroid/view/View;

    invoke-static {v0, p1, p2, p3}, Lf1/f;->a(Landroid/view/View;Lf1/k;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

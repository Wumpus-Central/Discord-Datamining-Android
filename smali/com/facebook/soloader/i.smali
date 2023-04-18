.class public final Lcom/facebook/soloader/i;
.super Lcom/facebook/soloader/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/soloader/i$c;,
        Lcom/facebook/soloader/i$b;
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/facebook/soloader/r;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected t(B)Lcom/facebook/soloader/r$g;
    .locals 0

    new-instance p1, Lcom/facebook/soloader/i$b;

    invoke-direct {p1, p0, p0}, Lcom/facebook/soloader/i$b;-><init>(Lcom/facebook/soloader/i;Lcom/facebook/soloader/r;)V

    return-object p1
.end method

.class public final synthetic Lse/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/q;


# instance fields
.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lse/d;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public synthetic a()Lw/d1;
    .locals 1

    invoke-static {p0}, Landroidx/camera/core/p;->a(Landroidx/camera/core/q;)Lw/d1;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/util/List;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lse/d;->b:Ljava/lang/String;

    invoke-static {v0, p1}, Lse/e;->a(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

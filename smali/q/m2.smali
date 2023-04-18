.class public final synthetic Lq/m2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/arch/core/util/Function;


# instance fields
.field public final synthetic a:Lq/p2;


# direct methods
.method public synthetic constructor <init>(Lq/p2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/m2;->a:Lq/p2;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lq/m2;->a:Lq/p2;

    check-cast p1, Ljava/lang/Void;

    invoke-static {v0, p1}, Lq/p2;->k(Lq/p2;Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

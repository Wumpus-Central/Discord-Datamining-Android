.class public final synthetic Lq/s2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/a;


# instance fields
.field public final synthetic a:Lq/x2;

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lq/x2;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/s2;->a:Lq/x2;

    iput-object p2, p0, Lq/s2;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lfc/b;
    .locals 2

    iget-object v0, p0, Lq/s2;->a:Lq/x2;

    iget-object v1, p0, Lq/s2;->b:Ljava/util/List;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, v1, p1}, Lq/x2;->y(Lq/x2;Ljava/util/List;Ljava/util/List;)Lfc/b;

    move-result-object p1

    return-object p1
.end method

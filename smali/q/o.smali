.class public final synthetic Lq/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/a;


# instance fields
.field public final synthetic a:Lq/w;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Lq/w;Ljava/util/List;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/o;->a:Lq/w;

    iput-object p2, p0, Lq/o;->b:Ljava/util/List;

    iput p3, p0, Lq/o;->c:I

    iput p4, p0, Lq/o;->d:I

    iput p5, p0, Lq/o;->e:I

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Lfc/b;
    .locals 6

    iget-object v0, p0, Lq/o;->a:Lq/w;

    iget-object v1, p0, Lq/o;->b:Ljava/util/List;

    iget v2, p0, Lq/o;->c:I

    iget v3, p0, Lq/o;->d:I

    iget v4, p0, Lq/o;->e:I

    move-object v5, p1

    check-cast v5, Ljava/lang/Void;

    invoke-static/range {v0 .. v5}, Lq/w;->p(Lq/w;Ljava/util/List;IIILjava/lang/Void;)Lfc/b;

    move-result-object p1

    return-object p1
.end method

.class public final synthetic Le7/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf9/q$a;


# instance fields
.field public final synthetic a:Le7/e1$a;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:F


# direct methods
.method public synthetic constructor <init>(Le7/e1$a;IIIF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/b0;->a:Le7/e1$a;

    iput p2, p0, Le7/b0;->b:I

    iput p3, p0, Le7/b0;->c:I

    iput p4, p0, Le7/b0;->d:I

    iput p5, p0, Le7/b0;->e:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, Le7/b0;->a:Le7/e1$a;

    iget v1, p0, Le7/b0;->b:I

    iget v2, p0, Le7/b0;->c:I

    iget v3, p0, Le7/b0;->d:I

    iget v4, p0, Le7/b0;->e:F

    move-object v5, p1

    check-cast v5, Le7/e1;

    invoke-static/range {v0 .. v5}, Le7/d1;->N(Le7/e1$a;IIIFLe7/e1;)V

    return-void
.end method

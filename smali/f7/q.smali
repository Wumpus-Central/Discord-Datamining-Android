.class public final synthetic Lf7/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lf7/r$a;

.field public final synthetic l:I

.field public final synthetic m:J

.field public final synthetic n:J


# direct methods
.method public synthetic constructor <init>(Lf7/r$a;IJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf7/q;->k:Lf7/r$a;

    iput p2, p0, Lf7/q;->l:I

    iput-wide p3, p0, Lf7/q;->m:J

    iput-wide p5, p0, Lf7/q;->n:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lf7/q;->k:Lf7/r$a;

    iget v1, p0, Lf7/q;->l:I

    iget-wide v2, p0, Lf7/q;->m:J

    iget-wide v4, p0, Lf7/q;->n:J

    invoke-static/range {v0 .. v5}, Lf7/r$a;->h(Lf7/r$a;IJJ)V

    return-void
.end method

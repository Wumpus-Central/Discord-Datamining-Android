.class public final synthetic Lf7/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lf7/r$a;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:J

.field public final synthetic n:J


# direct methods
.method public synthetic constructor <init>(Lf7/r$a;Ljava/lang/String;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf7/o;->k:Lf7/r$a;

    iput-object p2, p0, Lf7/o;->l:Ljava/lang/String;

    iput-wide p3, p0, Lf7/o;->m:J

    iput-wide p5, p0, Lf7/o;->n:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lf7/o;->k:Lf7/r$a;

    iget-object v1, p0, Lf7/o;->l:Ljava/lang/String;

    iget-wide v2, p0, Lf7/o;->m:J

    iget-wide v4, p0, Lf7/o;->n:J

    invoke-static/range {v0 .. v5}, Lf7/r$a;->e(Lf7/r$a;Ljava/lang/String;JJ)V

    return-void
.end method
